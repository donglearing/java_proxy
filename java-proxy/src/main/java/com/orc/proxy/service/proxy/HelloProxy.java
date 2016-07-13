package com.orc.proxy.service.proxy;

import com.orc.proxy.service.Hello;
import com.orc.proxy.service.impl.HelloImpl;

/**
 * Created by Administrator on 2016/7/12.
 */
public class HelloProxy implements Hello{
    private Hello proxy;

    public HelloProxy(){
        proxy = new HelloImpl();
    }

    @Override
    public void say(String name) {
        begin();
        proxy.say(name);
        end();
    }

    private void begin(){
        System.out.println("--begin--");
    }

    private void end(){
        System.out.println("--end--");
    }
}
