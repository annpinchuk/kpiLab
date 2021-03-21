package com.Rectangle;

public class Rectangle extends Point implements RectangleInterface{
    public Integer a;
    public Integer b;

    public Rectangle(Integer x, Integer y, Integer a, Integer b) {
        super(x, y);
        this.a = a;
        this.b = b;
    }

    public Rectangle() {
    }

    @Override
    @MyAnnotation
    public Integer getA() {
        return a;
    }

    @Override
    @MyAnnotation
    public Integer getB() {
        return b;
    }

    @Override
    public void setA(Integer a) {
        this.a = a;
    }

    @Override
    public void setB(Integer b) {
        this.b = b;
    }

    @Override
    public void move(Integer dx, Integer dy) {
        x += dx;
        y += dy;
    }

    @Override
    @MyAnnotation
    public String toString() {
        return "Rectangle{" + "x=" + x + ", y=" + y + "; a=" + a + ", b=" + b + '}';
    }
}
