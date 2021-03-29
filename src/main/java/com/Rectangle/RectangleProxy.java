package com.Rectangle;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class RectangleProxy implements InvocationHandler {
    private Object ref;

    private RectangleProxy(Object ref) {
        this.ref = ref;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Викликаємо " + method.getName() + " обєкту " + ref.getClass().getName());
        return method.invoke(ref, args);
    }

    public static Object newProxyInstance(Object obj) {
        return java.lang.reflect.Proxy.newProxyInstance(
                obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(),
                new RectangleProxy(obj));
    }

}
