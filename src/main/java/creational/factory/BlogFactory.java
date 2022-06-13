package creational.factory;

public class BlogFactory implements WebsiteFactory{
    @Override
    public Website createWebsite() {
        return new Blog();
    }
}
