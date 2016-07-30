package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {


    public static void main(String[] args) throws InterruptedException, ParseException {
        // write your code here

        String animTime = "2016-07-30 21:00:00";
        System.out.println("例子如下:");
        System.out.println(animTime);
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            animTime=scanner.nextLine().trim();
            Init.init();
            ArrayList<HashMap<String, String>> userList = Init.getUserList();
            String[] GoodsList={
                    "df2854829060345587,df160727p2854829,1",
                    "df2854829131469803,df160727p2854829,1"
            };
//        HashMap<String, String> stringStringHashMap = userList.get(0);
            for (int i = 0; i < userList.size(); i++) {
                new AddCartThread(animTime,GoodsList, userList.get(i)).run();
            }
        }

    }
}
