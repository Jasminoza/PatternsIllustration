package structural.adapter;

public class AdapterDatabaseToJavaApplication extends JavaApplication implements Database {

    @Override
    public void insert() {
        insertObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void read() {
        readObject();
    }

    @Override
    public void delete() {
        deleteObject();
    }
}
