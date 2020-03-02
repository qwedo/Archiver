package com.javarush.task.Projects.Archiver.command;

import com.javarush.task.Projects.Archiver.ConsoleHelper;
import com.javarush.task.Projects.Archiver.ZipFileManager;

import java.nio.file.Path;
import java.nio.file.Paths;

public abstract class ZipCommand implements Command {

    public ZipFileManager getZipFileManager() throws Exception{
        ConsoleHelper.writeMessage("Введите полный путь файла архива:");
        Path zipPath = Paths.get(ConsoleHelper.readString());
        return new ZipFileManager(zipPath);
    }
}