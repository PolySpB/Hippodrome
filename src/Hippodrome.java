import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses;
    static Hippodrome game;

    public List<Horse> getHorses() {
        return horses;
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public void run() throws InterruptedException {
        for (int i=0 ; i < 30; i++) {
            this.move();
            this.print();
            Thread.sleep(100);
        }
    }

    public void move() {
        for (int i=0; i < horses.size(); i++) {
            horses.get(i).move();
        }
    }

    public void print() {
        for (int i=0; i < horses.size(); i++) {
            horses.get(i).print();
        }
        for (int i=0; i < 10; i++) {
            System.out.println();
        }
    }

    public Horse getWinner() {
        Horse winner = null;
        double maxDistance = 0;
        for (int i=0; i < horses.size(); i++) {
            double dist = horses.get(i).getDistance();
            if (dist > maxDistance) {
                maxDistance = dist;
                winner = horses.get(i);
            }
        }
        return winner;
    }

    public void printWinner() {
        System.out.printf("Winner is %s!", getWinner().getName());
    }

    public static void main(String[] args) throws InterruptedException {
        Horse horse1 = new Horse("horse1", 3, 0);
        Horse horse2 = new Horse("horse2", 3, 0);
        Horse horse3 = new Horse("horse3", 3, 0);

        List<Horse> horses = new ArrayList<>();
        Collections.addAll(horses, horse1, horse2, horse3);
        
        game = new Hippodrome(horses);

        game.run();

        game.printWinner();

    }
}
