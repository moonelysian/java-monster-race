package util;

public class Movement {
    int randomMax = 10;
    int movePoint;

    public Movement(int movePoint) {
        this.movePoint = movePoint;
    }

    public boolean verifyMovement() {
        int randomNumber = (int) (Math.random() * randomMax);
        return (randomNumber >= movePoint);
    }
}
