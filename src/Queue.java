import java.util.ArrayList;
import java.util.List;

public class Queue {

    private List<RubberDuck> list = new ArrayList<>();

    public RubberDuck pop(){
        if(!list.isEmpty()) {
            RubberDuck duck = list.get(0);
            list.remove(0);
            return duck;
        } return null;
    }

    public void add(RubberDuck duck){
        list.add(duck);
    }

    public int size(){
        return list.size();
    }

}
