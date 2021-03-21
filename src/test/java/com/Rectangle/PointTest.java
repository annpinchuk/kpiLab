package com.Rectangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PointTest {
    @Test
    public void IsTheInfoAboutRectangleAddedCorrectly() {
        Integer x = 10;
        Integer y = 11;

        var p = new Point(x, y);

        assertEquals(x, p.getX());
        assertEquals(y, p.getY());
    }

    @Test
    public void IsMoveChangedValuesCorrectly() {
        var p = new Point(4, 8);
        p.move(2,4);

        assertEquals(p.getY(), 12);
    }

    @Test
    public void DoesReturnRightString() {
        var p = new Point(4, 8);

        assertEquals(p.toString(), "Point{x=4, y=8}");
    }
}
