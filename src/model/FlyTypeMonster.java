public class FlyTypeMonster extends Monster {
    FlyTypeMonster(String name) {
        super.name = name;
        super.type = "비행";
        super.movePoint = 6;
    }

    @Override
    void move() {
        Movement move = new Movement(super.movePoint);
        if (move.verifyMovement()){
            super.distance += 3;
        }
    }
}
