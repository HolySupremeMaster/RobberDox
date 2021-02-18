import static sun.java2d.cmm.ColorTransform.Simulation;

public class Main {





        public static void main(String[] args) {
            // write your code here
            Simulation simulation = new Simulation(10);

            RubberDuck duck = simulation.run();
            System.out.println(duck);
        }
    }
