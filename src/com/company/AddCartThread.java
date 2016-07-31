package com.company;


import com.JSON.JSONObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static com.company.ConstantValue.ADDCARTURL;

/**
 * Created by dg on 2016/7/30.
 * 至少得两秒钟才可以加入购物车
 */
public class AddCartThread extends Thread {
    private String startTime="2016-07-31 21:00:00";
    private List<String> items;
    private HashMap<String, String> headers;

    public AddCartThread(String startTime, String[] items, HashMap<String, String> headers) {
        this.startTime = startTime;
        this.headers = headers;
        this.items = Arrays.asList(items);
        Collections.shuffle(this.items);
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
            for (int i = 0; i < items.size(); i++) {
                String result = HttpUtils.doGetWithHeaders(ADDCARTURL + items.get(i), this.headers);
                System.out.println(result);
                Thread.sleep(2000);
            }

        } catch (ParseException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
