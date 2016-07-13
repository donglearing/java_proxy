package com.orc.proxy.service.impl;

import com.orc.proxy.service.Hello;

/**
 * Created by Administrator on 2016/7/12.
 */
public class HelloImpl implements Hello {
    @Override
    public void say(String name) {
        System.out.println("Hello " + name + "！！！");
    }
}
