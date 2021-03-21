package com.Rectangle;

import org.junit.jupiter.api.Test;

import java.lang.reflect.UndeclaredThrowableException;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleProxyTest {
    @Test
    public void SetterShouldFail(){
        var rectangle = new Rectangle(5, 6, 7, 8);
        RectangleInterface proxy = (RectangleInterface) RectangleProxy.newProxyInstance(rectangle);

        Throwable exception = assertThrows(UndeclaredThrowableException.class, ()->proxy.setA(2));
        assertTrue(exception.getCause() instanceof IllegalAccessException);
    }

    @Test
    public void AreGettersAllowed() {
        var rectangle = new Rectangle(5, 6, 7, 8);
        RectangleInterface proxy = (RectangleInterface) RectangleProxy.newProxyInstance(rectangle);

        assertEquals(proxy.getA(), 7);
    }
}
