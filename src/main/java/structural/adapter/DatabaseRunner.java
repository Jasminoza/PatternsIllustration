package structural.adapter;

public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new AdapterDatabaseToJavaApplication();

        database.insert();
        database.update();
        database.read();
        database.delete();
    }
}
