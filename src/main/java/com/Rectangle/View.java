package com.Rectangle;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class View {
    public void write(Rectangle rectangle) throws InvocationTargetException, IllegalAccessException {
        System.out.println(rectangle);
        System.out.println("Class name: \n" + Main.getClassname(rectangle.getClass()) + "\n Class fields:\n" +
                Main.getFields(rectangle.getClass()) + "\n" + Main.callMethods(rectangle) + "\n");

//        RectangleInterface proxy = (RectangleInterface) RectangleProxy.newProxyInstance(rectangle);
//        System.out.println("getA(): " + proxy.getA());
//        proxy.setA(5);
    }

    public int[] read() {
        System.out.println("Введіть координати х та у: ");
        Scanner in = new Scanner(System.in);
        int[] array = new int[4];
        array[0] = in.nextInt();
        array[1] = in.nextInt();
        System.out.println("Введіть сторони прямокутника а та b: ");
        array[2] = in.nextInt();
        array[3] = in.nextInt();
        return array;
    }

    public int[] readMove() {
        System.out.println("Введіть dх та dу: ");
        Scanner in = new Scanner(System.in);
        int[] array = new int[2];
        array[0] = in.nextInt();
        array[1] = in.nextInt();
        return array;
    }

}
