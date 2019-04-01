package arhiv.command;

import arhiv.ConsoleHelper;
import arhiv.ZipFileManager;
import arhiv.command.Command;

import java.nio.file.Path;
import java.nio.file.Paths;

public abstract class ZipCommand implements Command {

    @Override
    public void execute() throws Exception {

    }

    public ZipFileManager getZipFileManager() throws Exception{
        ConsoleHelper.writeMessage("Введите полный путь файла архива:");
        Path zipPath = Paths.get(ConsoleHelper.readString());
        return new ZipFileManager(zipPath);
    }
}