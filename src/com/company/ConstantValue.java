package com.company;

/**
 * Created by dg on 2016/7/30.
 */
public class ConstantValue {
    /**
     * 加入购物车
     * GET
     * ADDCARTURL+df2856829095061221,df160728p2856829,1
     */
    public static final String ADDCARTURL = "http://h5.jumei.com/cart/add?items=";
    /**
     * 下单接口
     * POST
     * 表单
     * address_id:114585024
     * gateway:AlipayMobileWap
     * items:
     * platform:
     * prefer_delivery_day:
     */
    public static final String PAYURL = "http://h5.jumei.com/cart/pay";
}
