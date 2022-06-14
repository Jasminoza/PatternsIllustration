package creational.prototype;

public class CarBlueprint implements Copyable {
    int id;
    String modelName;
    String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CarBlueprint(int id, String modelName, String description) {
        this.id = id;
        this.modelName = modelName;
        this.description = description;
    }

    @Override
    public Object copy() {
        CarBlueprint copy = new CarBlueprint(id, modelName, description);
        return copy;
    }

    @Override
    public String toString() {
        return "CarBlueprint{" +
                "id=" + id +
                ", modelName='" + modelName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
