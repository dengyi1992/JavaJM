package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {


    public static void main(String[] args) throws InterruptedException, ParseException {
        // write your code here

        String animTime = "2016-08-01 21:00:00";
        System.out.println("例子如下:");
        System.out.println(animTime);
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            animTime = scanner.nextLine().trim();
            Init.init();
            ArrayList<HashMap<String, String>> userList = Init.getUserList();
            String[] GoodsList = {
                    /*70B文胸+配裤:*/"df326114446175082190,df160715p1948129,1",
/*75B文胸+配裤:*/"df326114446175081993,df160715p1948129,1",

/*M:*/"df206714337478122513,df160718p1626936,1",

/*M:*/"df378014560434414824,df160717p2388900,1",

/*S:*/"df378014604518018455,df160715p2539567,1",
/*M:*/"df378014604518012630,df160715p2539567,1",

/*A-013-20寸红色:*/"df2816642029805326,df160715p2816642,1",
/*A-013-20寸紫色:*/"df2816642175897882,df160715p2816642,1",
/*A-013-20寸绿色:*/"df2816642269154204,df160715p2816642,1",
/*A-013-20寸玫红色:*/"df2816642372316123,df160715p2816642,1",
/*A-013-20寸黑色:*/"df2816642430475555,df160715p2816642,1",
/*A-013-20寸香槟:*/"df2816642571664260,df160715p2816642,1"
            };
            for (int i = 0; i < userList.size(); i++) {
                new AddCartThread(animTime, GoodsList, userList.get(i)).run();
            }
        }

    }
}
