package com.Rectangle;

public class MoveCommand implements Command {
    public MoveCommand(){
    }

    @Override
    public String execute() {
        var service = MyService.getInstance();
        var input = View.getInstance().readMove();
        var rectangle = service.getRectangle();

        rectangle.move(input[0], input[1]);

        return "зміщено успішно";
    }

}
