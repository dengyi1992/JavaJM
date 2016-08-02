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
                    /*M:*/"df2813432132086586,df160714p2813432,1",
                    /*S:*/"df2813432027183754,df160714p2813432,1",
                    /*S:*/"df112314609630848799,df160715p2561398,1",
                    /*M:*/"df112314609630843935,df160715p2561398,1",
                    /*M:*/"df154314222498644959,df160714p1347020,1",
                    /*L:*/"df154314222498647091,df160714p1347020,1"};
            for (int i = 0; i < userList.size(); i++) {
                new AddCartThread(animTime, GoodsList, userList.get(i)).run();
            }
        }

    }
}
