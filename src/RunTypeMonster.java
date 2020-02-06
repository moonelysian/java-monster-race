public class RunTypeMonster extends Monster{

    RunTypeMonster(String name) {
        super.name = name;
        super.type = "달리기";
        super.movePoint = 4;
    }

    @Override
    void move() {
        Movement move = new Movement(movePoint);
        if (move.verifyMovement()){
            super.distance += 1;
        }
    }
}