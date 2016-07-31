package com.company;


import com.JSON.JSONObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dg on 2016/7/29.
 */
public class HttpUtils {
    public interface CallBack {
        void onRequestComplete(String result);
    }

    public static String DoPost(String posturl, String postjson) {

        try {
            //创建连接
            URL url = new URL(posturl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setRequestMethod("POST");
            connection.setUseCaches(false);
            connection.setInstanceFollowRedirects(true);

            //connection.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
            connection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");

            connection.connect();

            //POST请求
            DataOutputStream out = new DataOutputStream(connection.getOutputStream());
//            JSONObject obj = new JSONObject();
            JSONObject jsonObject = new JSONObject(postjson);
//            obj.put("orderId", "4444444444444"); // 订单号

//            SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//            System.out.println(sf.format(new Date()));
//            obj.put("compTime",sf.format(new Date())); // 投诉时间

//            obj.put("comperAddress", "我是一个兵"); // 投诉人地址

            //System.out.println(obj.toString());

            //out.writeBytes(obj.toString());//这个中文会乱码
            out.write(jsonObject.toString().getBytes("UTF-8"));//这样可以处理中文乱码问题
            out.flush();
            out.close();

            //读取响应
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    connection.getInputStream()));
            String lines;
            StringBuffer sb = new StringBuffer("");
            while ((lines = reader.readLine()) != null) {
                lines = new String(lines.getBytes(), "utf-8");
                sb.append(lines);
            }
            reader.close();
            // 断开连接
            connection.disconnect();
            return sb.toString();
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    public static void doPostAsy(String posturl, String postjson, CallBack callBack) {
        new Thread() {
            public void run() {
                String s = DoPost(posturl, postjson);
                if (callBack != null) {
                    callBack.onRequestComplete(s);
                }
            }
        }.start();
    }


    /**
     * 向指定URL发送GET方法的请求
     *
     * @param url 发送请求的URL
     * @return URL 所代表远程资源的响应结果
     */
    public static synchronized String doGet(String url) {
        String result = "";
        BufferedReader in = null;
        try {
            URL realUrl = new URL(url);
            // 打开和URL之间的连接
            URLConnection connection = realUrl.openConnection();
            // 设置通用的请求属性
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 建立实际的连接
            connection.connect();
            // 获取所有响应头字段
            Map<String, List<String>> map = connection.getHeaderFields();
            // 遍历所有的响应头字段
//            for (String key : map.keySet()) {
//                System.out.println(key + "--->" + map.get(key));
//            }
            // 定义 BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(
                    connection.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("发送GET请求出现异常！" + e);
            e.printStackTrace();
        }
        // 使用finally块来关闭输入流
        finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return result;
    }

    /**
     * @param url
     * @param headers
     * @return
     */
    public static synchronized String doGetWithHeaders(String url, HashMap<String, String> headers) {
        String result = "";
        BufferedReader in = null;
        try {
            URL realUrl = new URL(url);
            // 打开和URL之间的连接
            URLConnection connection = realUrl.openConnection();
            // 设置通用的请求属性
            connection.setRequestProperty("X-DevTools-Emulate-Network-Conditions-Client-Id", headers.get("X-DevTools-Emulate-Network-Conditions-Client-Id"));
            connection.setRequestProperty("X-Requested-With", headers.get("X-Requested-With"));
            connection.setRequestProperty("User-Agent", headers.get("User-Agent"));
            connection.setRequestProperty("Referer", headers.get("Referer"));
            connection.setRequestProperty("Accept-Encoding", headers.get("Accept-Encoding"));
            connection.setRequestProperty("Accept-Language", headers.get("Accept-Language"));
            connection.setRequestProperty("Cookie", headers.get("Cookie"));
            connection.setRequestProperty("Accept", headers.get("Accept"));
            // 建立实际的连接
            connection.connect();
            // 获取所有响应头字段
            Map<String, List<String>> map = connection.getHeaderFields();
            // 遍历所有的响应头字段
//            for (String key : map.keySet()) {
//                System.out.println(key + "--->" + map.get(key));
//            }
            // 定义 BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(
                    connection.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("发送GET请求出现异常！" + e);
            e.printStackTrace();
        }
        // 使用finally块来关闭输入流
        finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return result;
    }


}
