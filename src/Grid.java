import java.util.ArrayList;

public class Grid {

    GridTile[][] grid;

    public Grid() {
        grid = new GridTile[10][10];
        initializeArray();
    }

    private void initializeArray() {
        for(int x = 0; x < 10; ++x) {
            for(int y = 0; y < 10; ++y) {
                grid[y][x] = new GridTile();
                if(x == 4) {
                    grid[y][x].setShip("Destroyer","up");
                }
                if(y == 2) {
                    grid[y][x].setShip("Destroyer","west");
                }
            }
        }
    }

    public void printGrid(String type) {
        System.out.println("\n\n");
        for(int x = 0; x < 11; ++x) {
            for(int y = 0; y < 11; ++y) {
                if(x == 0 && y == 0) {
                    System.out.print(" 0 ");
                }
                else if(y == 0) {
                    System.out.print(Colors.PURPLE + " " + (char)('A' + (x-1)) + " " + Colors.BASE);
                }
                else if(x == 0) {
                    System.out.print(Colors.PURPLE + " " + (y) + " " + Colors.BASE);
                }
                else {
                    if(type.equals("player")) {
                        grid[y - 1][x - 1].printPlayer();
                    }
                    else {
                        grid[y - 1][x - 1].printOpponent();
                    }
                }
            }
            System.out.println();
        }
    }

    public boolean setShip(String name, String direction, int size) {
        if (direction.equals("up")) {

        }
        else if (direction.equals("down")) {

        }
        else if (direction.equals("right")) {

        }
        else if (direction.equals("left")) {

        }

    }
}

class GridTile {

    String type;
    String shipDirection;
    boolean hit;

    public GridTile() {
        type = "water";
        shipDirection = null;
        hit = false;
    }

    public void hit() {
        hit = true;
    }

    public void setShip(String ship, String direction) {
        type = ship;
        shipDirection = direction;
    }

    public void printOpponent() {
        if(hit) {
            if(type.equals("water")) {
                System.out.print(Colors.YELLOW + " O " + Colors.YELLOW);
            }
            else {
                System.out.print(Colors.RED + " X " + Colors.BASE);
            }
        }
        else {
            System.out.print(Colors.BLUE + " ~ " + Colors.BASE);
        }
    }

    public void printPlayer() {
        if(hit) {
            if(type.equals("water")) {
                System.out.print(Colors.YELLOW + " O " + Colors.YELLOW);
            }
            else {
                System.out.print(Colors.RED + " X " + Colors.BASE);
            }
        }
        else {
            if(type.equals("water")) {
                System.out.print(Colors.BLUE + " ~ " + Colors.BASE);
            }
            else {
                if(shipDirection.equals("up") || shipDirection.equals("down")) {
                    System.out.print(Colors.BLACK + "| |" + Colors.BASE);
                }
                else {
                    System.out.print(Colors.BLACK + " = " + Colors.BLACK);
                }
            }
        }
    }
}