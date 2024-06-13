package ru.part2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class CachingHandler<T>  implements InvocationHandler {
    private T currentObject;
    private Map<Method,Object> results = new HashMap<>();

    public CachingHandler(T currentObject) {
        this.currentObject = currentObject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object objectResult;
        Method currentMethod;

        currentMethod = currentObject.getClass().getMethod(method.getName(), method.getParameterTypes());
        if (currentMethod.isAnnotationPresent(Mutator.class)) {
            results.clear();
        }
        if (currentMethod.isAnnotationPresent(Cache.class)) {
            if(results.containsKey(currentMethod)){
                return results.get(currentMethod);
            }
            objectResult = method.invoke(currentObject, args);
            results.put(currentMethod,objectResult);
            return objectResult;
        }
        return method.invoke(currentObject, args);
    }
}
