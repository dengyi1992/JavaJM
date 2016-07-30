package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;


public class Main {


    public static void main(String[] args) throws InterruptedException, ParseException {
        // write your code here
//        Date date = new Date();
//        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        System.out.println(df.format(date));
//        Date parse = df.parse("2016-07-30 14:09:00");
//        System.out.println(parse.getTime());
//        System.out.println(System.currentTimeMillis());
//        while (parse.getTime()>System.currentTimeMillis()){
//            System.out.println(df.format(System.currentTimeMillis()));
//            Thread.sleep(50);
//        }
//        System.out.println("搞定");
        String animTime = "2016-07-30 14:34:50";
        HashMap<String, String> stringStringHashMap = new HashMap<>();
        stringStringHashMap.put("X-DevTools-Emulate-Network-Conditions-Client-Id", "9B055F64-9B50-4D35-BAE6-48771975A6D1");
        stringStringHashMap.put("X-Requested-With", "XMLHttpRequest");
        stringStringHashMap.put("User-Agent", "Mozilla/5.0 (Linux; Android 5.0; SM-G900P Build/LRX21T) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/48.0.2564.23 Mobile Safari/537.36");
        stringStringHashMap.put("Accept", "*/*");
        stringStringHashMap.put("Referer", "http://h5.jumei.com/product/detail?item_id=df160714p2812162&type=jumei_pop");
        stringStringHashMap.put("Accept-Encoding", "gzip, deflate, sdch");
        stringStringHashMap.put("Accept-Language", "zh-CN,zh;q=0.8");
        stringStringHashMap.put("Cookie", "referer_site_cps=wap_touch_; first_visit_time=1469782756; jml7=2; abt_tuan_1=new; jmdl4=2; __ag_cm_=1469785926834; local_city_new=%3Fsite%3Dbj%26city%3Dshanxi; local_city=%7B%20%22site%22%3A%22bj%22%2C%22city%22%3A%22shanxi%22%20%7D; has_download=1; client_addr=%E6%B9%96%E5%8D%97%E7%9C%81-%E9%95%BF%E6%B2%99%E5%B8%82; platform=wap; default_site_25=bj; frwap=wap; cookie_uid=14698423469880185265; m_vid=108021634; abt52=new; abt62=old; PHPSESSID=h103p74v8jj7vmr7vdas2m7uj3; isTime3=7; current_site=bj; search_user_status=1; session_id=579c0406d837a765; route=b2762fc6e1525fbfa59911f3645a0d81; sid=h103p74v8jj7vmr7vdas2m7uj3; is_alipay_gold_account=0; _adwp=265569940.2557142751.1469785926.1469842347.1469847089.3; _adwc=93825820; account=HntnWClkJMlqG0sRaA2yQaQXVse9NrCjMxcn5PZ3%2FMk2mzhjL6E36AREzYdiQA3%2B%2FIUhnI%2Fzt7egUJbZ0G2UDkjFsQF0Hrakumv7AVS8hmJdlG0%2FrKebY72eM1W7pBp8b7ljVCftwZuiyfk1RDNjPmJVIuGrEr5Ei34rmKsiJygSqt54YBAx7xEzQIyJ6x0Slfgg2PI8MgSqmD0qJOkBGA%3D%3D; tk=672074fb90dc689d5ea15aec572b5f94e875006a; uid=109765038; v_uid=109765038; nickname=JM151WCPA8143; token=UYI4EhCE5bxXon3LeTqiuhLVwFK8tir2mN4SMlJOsfgPZrOBDGzPMz9XZo1dARqt06nb5jpAGca2CSkp8yHfvDl6ueaYmWUc0RVIHQQd7K1J3sWj9BNxFwykvBIKxIUG; session=M8Gc2ljg6HXOIrouYCqNAVs0vEwKWMPU; cookie_ver=1; login_account_name=15140968143; last_reg=1469847141; __xsptplus428=428.3.1469847795.1469847795.1%234%7C%7C%7C%7C%7C%23%23iYJA84dwHM-0MFJUbNQ1OOAW-79TFQ6f%23; ag_fid=Eed4pnEX6Es82NLF; privilege_group=0; register_time=1469736222; referer_site=wap_touch_; npo=0; demoCookie=0; search_start_time=1469847798337; cs_logined_uid=109765038; _adwb=123961810; _adwr=123961810%23http%253A%252F%252Fpassport.jumei.com%252Fi%252Faccount%252Fjump; __utma=1.13332653.1469785927.1469842347.1469847090.3; __utmb=1.9.8.1469847794159; __utmc=1; __utmz=1.1469785927.1.1.utmcsr=(direct)|utmccn=(direct)|utmcmd=(none); __utmt=1; Hm_lvt_884477732c15fb2f2416fb892282394b=1469782757,1469842347; Hm_lpvt_884477732c15fb2f2416fb892282394b=1469847846; __utma=96101381.1014938397.1469782757.1469842591.1469845649.4; __utmb=96101381.16.9.1469847876909; __utmc=96101381; __utmz=96101381.1469782757.1.1.utmcsr=(direct)|utmccn=(direct)|utmcmd=(none); device_platform=android");

        for (int i = 0; i < 1; i++) {
            new AddCartThread(animTime, "df2856829095061221,df160728p2856829,1", stringStringHashMap).start();
        }
    }
}
