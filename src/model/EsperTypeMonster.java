package model;

import util.Movement;

public class EsperTypeMonster extends Monster {
    public EsperTypeMonster(String name) {
        super.name = name;
        super.type = "에스퍼";
        super.movePoint = 6;
    }

    @Override
    void move() {
        Movement move = new Movement(movePoint);
        if (move.verifyMovement()){
            super.distance += (int)(Math.random()*99) + 1;
        }
    }
}
