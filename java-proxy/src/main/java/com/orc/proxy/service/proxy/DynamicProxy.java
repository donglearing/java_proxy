package com.orc.proxy.service.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2016/7/12.
 */
public class DynamicProxy implements InvocationHandler {

    private Object target;

    private DynamicProxy(){}

    public DynamicProxy(Object target){
        this.target = target;
    }

    public <T> T getProxy(){
        return (T) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        begin();
        Object object = method.invoke(target, args);
        end();
        return null;
    }

    private void begin(){
        System.out.println("**begin**");
    }

    private void end(){
        System.out.println("**end**");
    }
}
