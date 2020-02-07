public abstract class Monster implements Comparable<Monster>{
    String name;
    String type;
    int movePoint;
    int distance = 0;

    void move(){}

    void getDistance(int chance) {
        for (int i = 0; i < chance; i++) {
            move();
        }
    }

    @Override
    public int compareTo(Monster monster) {
        if (this.distance > monster.distance) {
            return -1;
        } else if (this.distance < monster.distance) {
            return 1;
        }
        return 0;
    }
}
