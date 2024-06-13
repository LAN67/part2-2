package ru.part2;

import lombok.Getter;

//import java.lang.reflect.InvocationHandler;
//import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
//import java.util.Arrays;

public class Utils {
    public static <T> T cache(T objectIncome) {
        return (T) Proxy.newProxyInstance(
                objectIncome.getClass().getClassLoader(),
                objectIncome.getClass().getInterfaces(),
                new CachingHandler(objectIncome));
        //new Cache2(objectIncome));
    }
}

//class Cache2 implements InvocationHandler {
//    Object obj;
//    private boolean isChanged = true;
//    private Object tmp = null;
//
//    public Cache2(Object obj) {
//        this.obj = obj;
//    }
//
//    @Override
//    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        if (method.isAnnotationPresent(Mutator.class)) {
//            isChanged = true;
//        }
//        if (method.isAnnotationPresent(Cache.class)) {
//            if (isChanged) {
//                tmp = method.invoke(obj, args);
//                isChanged = false;
//            }
//            return tmp;
//        }
//        return method.invoke(obj, args);
//    }
//}
