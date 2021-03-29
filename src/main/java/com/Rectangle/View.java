package com.Rectangle;

import java.util.Scanner;

public class View {
    protected static View instance = new View();

    public static View getInstance() {
        return instance;
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

    public void printHello() {
        System.out.println("Введіть команду заповнення\\виведення\\зміщення:");
    }

    public void printString(String result) {
        System.out.println(result);
    }

}
