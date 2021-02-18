import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Simulation {

    private List<Queue> queues = new ArrayList<>();
    private int n;

    public Simulation(int n){
        this.n = n;
    }


    private void Initialize(){
        for (int i = 0; i < n; i++) {
            Queue q = new Queue();
            for (int j = 0; j < n; j++) {
                q.add(new RubberDuck());
            } queues.add(q);
        }
    }

    private void Step() {
        Random randumNum = new Random();
        int upperbound = n;
        int index = randumNum.nextInt(upperbound);
        queues.remove(index);
        for (Queue q: queues) {
            q.pop();
        } n -= 1;
    }

    public RubberDuck run() {
        Initialize();
        while (n > 1) {
            Step();
        } return queues.get(0).pop();
    }

}
