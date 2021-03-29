package com.Rectangle;

public class ShowCommand implements Command {
    public ShowCommand(){
    }

    @Override
    public String execute() {
        var service = MyService.getInstance();
        var polygon = service.getRectangle();
        return polygon.toString();
    }

}
