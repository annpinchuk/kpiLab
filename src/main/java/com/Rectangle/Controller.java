package com.Rectangle;

public class Controller {
    Rectangle rectangle;
    View view;

    public Controller(Rectangle rectangle, View view) {
        this.rectangle = rectangle;
        this.view = view;
    }

    public void run() throws Exception {
        var input = view.read();

        rectangle.setX(input[0]);
        rectangle.setY(input[1]);
        rectangle.setA(input[2]);
        rectangle.setB(input[3]);

        view.write(rectangle);

        var inputMove = view.readMove();

        rectangle.move(inputMove[0], inputMove[1]);
        view.write(rectangle);
    }
}
