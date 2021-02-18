public class RubberDuck {

    private static int nextId = 0;
    private int id;

    public RubberDuck() {
        id = nextId;
        nextId += 1;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "The Winner is duck: " + id + "!!";
    }
}
