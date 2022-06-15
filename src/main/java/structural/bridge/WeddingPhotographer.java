package structural.bridge;

public class WeddingPhotographer implements Photographer {
    @Override
    public void makePhotos() {
        System.out.println("Wedding photographer making wedding photos...");
    }
}
