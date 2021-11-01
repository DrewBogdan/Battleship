import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;

public class Player {

    private String name;

    private Grid grid;

    private ArrayList<Ship> ships;

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
            Scanner inputName = new Scanner(System.in);
            this.name = inputName.nextLine();
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
        makeShips();
    }

    private void makeShips() {
        ships = initializeShipArray();
        grid.printGrid("player");
        System.out.println("Where would you like to put your ships " + name + "?");
        System.out.println("Just type the starting coordinate(ex. A4)");
        for(int count = 0; count < ships.size(); ++count) {
            System.out.println("Starting with the " + ships.get(count));
            Scanner startInput = new Scanner(System.in);
            String shipStart = startInput.next();
            System.out.println("Which direction? (up, down, left, right)");
            startInput = new Scanner(System.in);
            String shipDirection = startInput.next();
            ships.get(count).setShip(shipDirection,shipStart, grid);
        }

    }

    private ArrayList<Ship> initializeShipArray() {
        ArrayList<Ship> ships = new ArrayList<>();
        ships.add(new Cruiser());
        ships.add(new Destroyer());
        ships.add(new Battleship());
        ships.add(new Cruiser());
        ships.add(new Scout());
        return ships;
    }

}
