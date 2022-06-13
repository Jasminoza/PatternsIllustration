package creational.singletone;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Logger {
    private volatile static Logger logger;
    private final static Path logfilePath = Paths.get("src/main/java/creational/singletone/logger.txt");

    public Logger() {
    }

    public static Logger getLogger() {
        if (logger == null) {
            synchronized (Logger.class) {
                if (logger == null) {
                    return new Logger();
                }
            }
        }
        return logger;
    }

    public void addLogInfo(String info) {
        try {
            Files.writeString(logfilePath, info + "\n", StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void showLogInfo() {
        try {
            System.out.println(Files.readString(logfilePath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
