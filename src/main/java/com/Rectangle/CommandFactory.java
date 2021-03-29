package com.Rectangle;

import java.util.HashMap;
import java.util.Map;

public class CommandFactory {
    protected static CommandFactory instance = new CommandFactory();

    public static CommandFactory getInstance() {
        return instance;
    }

    protected Map<String, Command> commands = new HashMap<>();

    protected CommandFactory() {
        commands.put("заповнення", new SetupCommand());
        commands.put("виведення", new ShowCommand());
        commands.put("зміщення", new MoveCommand());
    }

    public Command getCommand(String command) {
        return commands.getOrDefault(command, () -> "Invalid command");
    }
}
