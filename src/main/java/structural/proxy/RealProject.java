package structural.proxy;

public class RealProject implements Project {
    private String url;

    public RealProject(String url) {
        this.url = url;
        loadProjectFromUrl(url);
    }

    public void loadProjectFromUrl(String url) {
        System.out.println("Loading project from " + url + "...");
    }

    @Override
    public void run() {
        System.out.println("Running project...");
    }
}
