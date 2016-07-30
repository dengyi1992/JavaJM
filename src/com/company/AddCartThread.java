package com.company;


import com.JSON.JSONObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import static com.company.ConstantValue.ADDCARTURL;

/**
 * Created by dg on 2016/7/30.
 */
public class AddCartThread extends Thread {
    private String startTime="2016-07-30 14:09:00";
    private String items;
    private HashMap<String, String> headers;

    public AddCartThread(String startTime, String items, HashMap<String, String> headers) {
        this.startTime = startTime;
        this.items = items;
        this.headers = headers;
    }

    @Override
    public void run() {

        try {
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date parse = df.parse(this.startTime);
            System.out.println("当前时间:"+df.format(System.currentTimeMillis()));
            System.out.println("开始时间:"+df.format(parse));
            while (parse.getTime()>System.currentTimeMillis()){
//                System.out.println(df.format(System.currentTimeMillis()));
                Thread.sleep(50);
            }
            System.out.println("开始网络请求"+items);
            String result = HttpUtils.doGetWithHeaders(ADDCARTURL + "df2856829095061221,df160728p2856829,1", this.headers);
//            String message = jsonObject.getString("message");
            System.out.println(result);

        } catch (ParseException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
