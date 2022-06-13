package creational.factory;

public class VisitCardFactory implements WebsiteFactory{
    @Override
    public Website createWebsite() {
        return new VisitCard();
    }
}
