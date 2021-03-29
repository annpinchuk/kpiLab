package com.Rectangle;

import java.util.Scanner;

public class Controller {
    RectangleInterface rectangle;
    View view;
    Scanner in;
    CommandFactory commandFactory = CommandFactory.getInstance();

    public Controller(RectangleInterface rectangle, View view, Scanner in) {
        this.rectangle = rectangle;
        this.view = view;
        this.in = in;
    }

    public void run() {
        while (true) {
            view.printHello();

            var userCommand = in.nextLine();
            Command command = commandFactory.getCommand(userCommand);
            String result = command.execute();

            view.printString(result);
        }
    }
}
