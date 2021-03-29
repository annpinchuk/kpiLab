package com.Rectangle;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyService {
    protected RectangleInterface rectangle;
    protected static MyService instance = new MyService();

    private MyService() {
    }

    public static MyService getInstance() {
        return instance;
    }

    public RectangleInterface getRectangle() {
        return rectangle;
    }

    public void setRectangle(RectangleInterface rectangle) {
        this.rectangle = rectangle;
    }


    public String getClassname(Class<? extends Rectangle> c) {

        return Modifier.toString(c.getModifiers()) + " " + c.getName();
    }

    public List<String> callMethods(Rectangle rectangle) throws IllegalAccessException, InvocationTargetException {
        List<String> methodsArray = new ArrayList<String>();

        var iterator = Arrays.stream(rectangle.getClass().getMethods()).iterator();
        while (iterator.hasNext()) {
            Method method = iterator.next();
            if (method.isAnnotationPresent(MyAnnotation.class)) {
                String str = method.getName() + ": " + method.invoke(rectangle);
                methodsArray.add(str);
            }
        }

        return methodsArray;
    }

    public ArrayList<String> getFields(Class<? extends Rectangle> c) {
        ArrayList<String> fieldsArray = new ArrayList<String>();

        var iterator = Arrays.stream(rectangle.getClass().getFields()).iterator();
        while (iterator.hasNext()) {
            Field field = iterator.next();
            String str = Modifier.toString(field.getModifiers()) + " " + field.getType().getName() + " " +
                    field.getName();
            fieldsArray.add(str);
        }

        return fieldsArray;
    }
}
