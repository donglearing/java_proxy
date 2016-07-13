package com.orc.proxy.main;

import com.orc.proxy.service.Hello;
import com.orc.proxy.service.impl.HelloImpl;
import com.orc.proxy.service.proxy.CGLibProxy;
import com.orc.proxy.service.proxy.DynamicProxy;
import com.orc.proxy.service.proxy.HelloProxy;

import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2016/7/12.
 */
public class MainMethod {
    public static void main(String args[]){
//        Hello h = new HelloImpl();
//        h.say("orc");
//
//        HelloProxy proxy = new HelloProxy();
//        proxy.say("orclh");
//
//        DynamicProxy proxy1 = new DynamicProxy(new HelloImpl());
//        Hello helloProxy = proxy1.getProxy();
//        helloProxy.say("lh");


        HelloImpl hi = CGLibProxy.getInstance().getProxy(HelloImpl.class);
        hi.say("orc");
    }
}
