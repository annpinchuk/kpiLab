package com.Rectangle;

public class SetupCommand implements Command {
    public SetupCommand(){
    }

    @Override
    public String execute() {
        var service = MyService.getInstance();
        var input = View.getInstance().read();
        var rectangle = service.getRectangle();

        rectangle.setX(input[0]);
        rectangle.setY(input[1]);
        rectangle.setA(input[2]);
        rectangle.setB(input[3]);

        return "поля введено";
    }

}
