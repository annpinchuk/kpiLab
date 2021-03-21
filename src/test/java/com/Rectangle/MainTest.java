package com.Rectangle;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {
    @Test
    public void DoesGetFieldsReturnRightValues() {
        var rectangle = new Rectangle(5, 6, 7, 8);
        var c = rectangle.getClass();
        var fieldsArray = Arrays.asList("public java.lang.Integer a", "public java.lang.Integer b", "public java.lang.Integer x", "public java.lang.Integer y");
        assertEquals(Main.getFields(c), fieldsArray);
    }


    @Test
    public void DoesCallMethodsReturnRightValues() throws InvocationTargetException, IllegalAccessException {
        var rectangle = new Rectangle(5, 6, 7, 8);
        var methodsArray = Arrays.asList("toString: Rectangle{x=5, y=6; a=7, b=8}", "getA: 7", "getB: 8");

        assertTrue(methodsArray.containsAll(Main.callMethods(rectangle)));
    }

    @Test
    public void DoesGetClassNameReturnRightValues() {
        var rectangle = new Rectangle(5, 6, 7, 8);
        var c = rectangle.getClass();
        String s = "public com.Rectangle.Rectangle";

        assertEquals(Main.getClassname(c), s);
    }
}
