import java.util.Scanner;

public class Ship {

    protected boolean sunk;
    protected int size;
    protected String direction;
    protected int yCord;
    protected int xCord;

    public Ship() {
        sunk = false;
        size = 0;
        direction = null;
    }

    public String toString() {
        return "Ship";
    }

    protected void setShip(String direction, String place, Grid grid) {
        this.direction = direction;
        Scanner parser = new Scanner(place).useDelimiter("");
        xCord = parser.next().charAt(0) - 'A';
        yCord = parser.nextInt();
        if(checkLegal(grid)) {
            if (direction.equals("up")) {

            }
        }

    }

    private boolean checkLegal(Grid grid) {
        if (direction.equals("up")) {
            if(xCord - size < 0) {
                return false;
            }
            else {
                if(grid.setShip(toString(), "up", size)) {
                    return true;
                }
                else {
                    return false;
                }
            }
        }
        else if (direction.equals("down")) {
            if(xCord + size > 9) {
                return false;
            }
            if(grid.setShip(toString(), "down", size)) {
                return true;
            }
            else {
                return false;
            }
        }
        else if (direction.equals("right")) {
            if(yCord + size > 9) {
                return false;
            }
            if(grid.setShip(toString(), "right", size)) {
                return true;
            }
            else {
                return false;
            }
        }
        else if (direction.equals("left")) {
            if(yCord - size < 0) {
                return false;
            }
            if(grid.setShip(toString(), "left", size)) {
                return true;
            }
            else {
                return false;
            }

        }
        else {
            return false;
        }
    }

}
