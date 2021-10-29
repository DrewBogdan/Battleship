import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Player {

    private String name;
    private Grid grid;

    public Player(String name) {
        makePlayer(name);
        makeGrid();
    }

    private void makePlayer(String name) {
        System.out.println("Would you like " + name + " to be a User(1) or A.I.(2)");

        Scanner input = new Scanner(System.in);
        String userIn = input.next();

        if(userIn.equals("1")) {
            System.out.println("What would you like your name to be?");
            this.name = input.nextLine();
        }
        else if(userIn.equals("2")) {
            System.out.println("Under Construction");
        }
        else {
            System.out.println("Ok. " + name + " will be killed. You are now known as Bob");
            this.name = "Bob " + name;
        }
    }

    private void makeGrid() {
        grid = new Grid();
        grid.printOpponent();
    }
}
