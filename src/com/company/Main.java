package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {


    public static void main(String[] args) throws InterruptedException, ParseException {
        // write your code here

        String animTime = "2016-07-31 21:00:00";
        System.out.println("例子如下:");
        System.out.println(animTime);
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            animTime=scanner.nextLine().trim();
            Init.init();
            ArrayList<HashMap<String, String>> userList = Init.getUserList();
            String[] GoodsList={
                    "df2812162095523149,df160714p2812162,1",
                    "df17814640590457955,df160714p2681918,1",
                    "df164014611479768974,df160713p2573713,1",
                    "df2786337151485606,df160715p2786337,1",
                    "df2821502041732977,df160715p2821502,1",
                    "df138114586281778177,df160715p2469943,1",
                    "df2818447011257664,df160715p2818447,1",
                    "df356314465343717943,df160716p2064461,1",
                    "df106914374573079522,df160718p1718974,1"
//                    "df2856825130989058,df160728p2856825,1"

            };
//        HashMap<String, String> stringStringHashMap = userList.get(0);
            for (int i = 0; i < userList.size(); i++) {
                new AddCartThread(animTime,GoodsList, userList.get(i)).run();
            }
        }

    }
}
