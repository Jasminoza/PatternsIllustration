package structural.bridge;

public class ProjectCreator {
    public static void main(String[] args) {
        PhotoProject[] projects = {
                new WeddingProject(new FoodPhotographer()),
                new FoodProject(new WeddingPhotographer())
        };

        for (PhotoProject project : projects) {
            project.makeProject();
        }
    }
}
