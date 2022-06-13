package creational.factory;

import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        WebsiteFactory websiteFactory = createFactory("Blog");
        Website website = websiteFactory.createWebsite();
        website.showWebsite();
    }

    static WebsiteFactory createFactory(String webSiteType) {
        webSiteType = webSiteType.toLowerCase(Locale.ROOT);
        WebsiteFactory websiteFactory;
        switch (webSiteType) {
            case "blog" -> websiteFactory = new BlogFactory();
            case "forum" -> websiteFactory = new ForumFactory();
            case "visitcard" -> websiteFactory = new VisitCardFactory();
            default -> throw new RuntimeException(webSiteType + " type is unknown.");
        }
        return websiteFactory;
    }
}
