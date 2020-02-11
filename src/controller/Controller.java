package controller;

import model.*;
import util.Message;
import java.util.ArrayList;
import java.util.Arrays;

public class Controller {
    private final static String[] AVAILABLE_MONSTER_TYPE = {"달리기", "비행", "에스퍼"};
    public static ArrayList<Monster> monsterList = new ArrayList<>();
    public static int numberOfMonster;
    public static int chance;

    private static boolean verifyTypeOfMonster(String monsterType) {
        return Arrays.asList(AVAILABLE_MONSTER_TYPE).contains(monsterType);
    }

    private static void createMonster(String monsterName, String monsterType) {
        if (monsterType.equals("달리기")) {
            monsterList.add(new RunTypeMonster(monsterName));
        } else if (monsterType.equals("비행")) {
            monsterList.add(new FlyTypeMonster(monsterName));
        } else {
            monsterList.add(new EsperTypeMonster(monsterName));
        }
    }

    public static void setMonsterList(String[] monster){
        final int NAME = 0;
        final int TYPE = 1;

        if (verifyTypeOfMonster(monster[TYPE])) {
            createMonster(monster[NAME], monster[TYPE]);
            return;
        }
        System.out.println(Message.monsterTypeError);
        System.exit(0);
    }

    public void race() {
        monsterList.forEach(monster -> monster.setDistance(chance));
    }
}
