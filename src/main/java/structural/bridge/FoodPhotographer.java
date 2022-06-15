package structural.bridge;

public class FoodPhotographer implements Photographer  {

    @Override
    public void makePhotos() {
        System.out.println("Food photographer makes food photos...");
    }
}
