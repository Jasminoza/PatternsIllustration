package behavioral.chain;

public class WorkerNotifier extends Notifier {

    public WorkerNotifier(int orderPriority) {
        super(orderPriority);
    }

    @Override
    public void write(String message) {
        System.out.println("Message to worker: " + message);
    }
}
