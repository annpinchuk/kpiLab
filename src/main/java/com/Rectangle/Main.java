package com.Rectangle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        var view = new View();
        var rectangle = (RectangleInterface) RectangleProxy.newProxyInstance(new Rectangle());
        var service = MyService.getInstance();
        service.setRectangle(rectangle);
        var in = new Scanner(System.in);
        var controller = new Controller(rectangle, view, in);

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

}
