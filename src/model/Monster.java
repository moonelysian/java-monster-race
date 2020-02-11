package model;

public abstract class Monster implements Comparable<Monster>{
    public String name;
    public String type;
    int movePoint;
    int distance = 0;

    void move(){}

    public void setDistance(int chance) {
        for (int i = 0; i < chance; i++) {
            move();
        }
    }

    public String distanceToString() {
        return "-".repeat(distance);
    }

    @Override
    public int compareTo(Monster monster) {
        if (this.distance < monster.distance) {
            return -1;
        } else if (this.distance > monster.distance) {
            return 1;
        }
        return 0;
    }
}
