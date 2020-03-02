package com.javarush.task.Projects.Archiver.command;

import com.javarush.task.Projects.Archiver.ConsoleHelper;

public class ExitCommand implements Command {
    @Override
    public void execute() throws Exception {
        ConsoleHelper.writeMessage("До встречи!");
    }
}
