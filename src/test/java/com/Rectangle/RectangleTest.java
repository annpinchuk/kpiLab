package com.Rectangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

    @Test
    public void IsTheInfoAboutRectangleAddedCorrectly() {
        Integer x = 5;
        Integer y = 6;
        Integer a = 7;
        Integer b = 8;

        var rectangle = new Rectangle(x, y, a, b);

        assertEquals(x, rectangle.getX());
        assertEquals(y, rectangle.getY());
        assertEquals(a, rectangle.getA());
        assertEquals(b, rectangle.getB());
    }

    @Test
    public void DoesReturnRightString() {
        var rectangle = new Rectangle(5, 6, 7, 8);

        assertEquals(rectangle.toString(), "Rectangle{x=5, y=6; a=7, b=8}");
    }

    @Test
    public void IsMoveChangedValuesCorrectly() {
        var rectangle = new Rectangle(4, 8, 2, 3);
        rectangle.move(1,2);

        assertEquals(rectangle.getX(), 5);
        assertEquals(rectangle.getY(), 10);
    }

}
