package com.Rectangle;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        var view = new View();
        var rectangle = new Rectangle();
        var controller = new Controller(rectangle, view);

        controller.run();

//        var point = new Point(4, 5);
//        System.out.println(point);
//        var rectangle = new Rectangle(5, 6, 7, 8);
//        System.out.println(rectangle);
//        //rectangle.move(1,2);
//        //System.out.println(rectangle);
//
//        var c = rectangle.getClass();
//
//        System.out.println("Class name: \n" + getClassname(c) + "\n Class fields:\n" + getFields(c) + "\n" + callMethods(rectangle));
//
//        RectangleInterface proxy = (RectangleInterface) RectangleProxy.newProxyInstance(rectangle);
//        System.out.println("getA(): " + proxy.getA());
//        proxy.setA(5);

    }

    public static String getClassname(Class<? extends Rectangle> c) {

        return Modifier.toString(c.getModifiers()) + " " + c.getName();
    }

    public static List<String> callMethods(Rectangle rectangle) throws IllegalAccessException, InvocationTargetException {
        List<String> methodsArray = new ArrayList<String>();
        for (Method method : rectangle.getClass().getMethods()) {
            if (method.isAnnotationPresent(MyAnnotation.class)) {
                String str = method.getName() + ": " + method.invoke(rectangle);
//                System.out.println(str);
                methodsArray.add(str);
                //System.out.println(method.getName() + ": " + method.invoke(rectangle));
            }
        }
        return methodsArray;
    }

    public static ArrayList<String> getFields(Class<? extends Rectangle> c) {
        ArrayList<String> fieldsArray = new ArrayList<String>();
        for (Field field : c.getFields()) {
            String str = Modifier.toString(field.getModifiers()) + " " + field.getType().getName() + " " +
                    field.getName();
//            System.out.println(str);
            fieldsArray.add(str);
        }
        return fieldsArray;
    }
}
