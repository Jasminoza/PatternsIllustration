package creational.factory;

public class ForumFactory implements WebsiteFactory{
    @Override
    public Website createWebsite() {
        return new Forum();
    }
}
