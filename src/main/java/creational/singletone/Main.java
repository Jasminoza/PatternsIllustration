package creational.singletone;

public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger();

        logger.showLogInfo();
        logger.addLogInfo("First log...");
        logger.addLogInfo("Second log...");
        logger.addLogInfo("Third log...");
        logger.showLogInfo();
    }
}
