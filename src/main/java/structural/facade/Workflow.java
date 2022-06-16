package structural.facade;

public class Workflow {
    Postman postman = new Postman();
    PackageList packageList = new PackageList();
    Job job = new Job();

    public void doJob() {
        job.doJob();
        postman.doJob(packageList);
        packageList.takingOrders();
        postman.doJob(packageList);
    }
}
