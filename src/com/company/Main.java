package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {


    public static void main(String[] args) throws InterruptedException, ParseException {
        // write your code here

        String animTime = "2016-08-02 10:00:00";
        System.out.println("例子如下:");
        System.out.println(animTime);
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            animTime = scanner.nextLine().trim();
            Init.init();
            ArrayList<HashMap<String, String>> userList = Init.getUserList();
            String[] GoodsList = {
                    /*薄杯-蓝色70B:*/"df2821374050167994,df160715p2821374,1",
                    /*薄杯-蓝色75B:*/"df2821374582151662,df160715p2821374,1",
                    "df2817606066292230,df160715p2817606,1",
                    /*黑色:*/"df138114543218864667,df160715p2341539,1",
                    /*酒红色:*/"df138114543218867541,df160715p2341539,1",
                    /*玫红:*/"df93514460153698823,df160715p2021158,1",
/*樱花粉:*/"df93514460153707548,df160715p2021158,1",
/*浅蓝:*/"df93514460153709913,df160715p2021158,1",
/*柠檬黄:*/"df93514460153701692,df160715p2021158,1",
                    /*黑色:*/"df68113903712483543,df160715p411218,1",
/*蓝色:*/"df68113903712481723,df160715p411218,1",
/*玫红:*/"df68113921130421766,df160715p411218,1",
                    /*蓝色:*/"df93514230553971149,df160715p1379292,1",
/*玫红色:*/"df93514230553972944,df160715p1379292,1",

            };
            for (int i = 0; i < userList.size(); i++) {
                new AddCartThread(animTime, GoodsList, userList.get(i)).run();
            }
        }

    }
}
