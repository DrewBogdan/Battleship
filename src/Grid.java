import java.util.ArrayList;

public class Grid {

    GridTile[][] grid;

    public Grid() {
        grid = new GridTile[10][10];
    }

    public void printOpponent() {
        for(int x = 0; x < 10; ++x) {
            for(int y = 0; y < 10; ++y) {
                grid[x][y].printOpponent();
            }
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
                System.out.println(" O ");
            }
            else {
                System.out.println(" X ");
            }
        }
        else {
            System.out.println(" ~ ");
        }
    }
}