package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;


public class Main {


    public static void main(String[] args) throws InterruptedException, ParseException {
        // write your code here

        String animTime = "2016-07-30 21:00:00";
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