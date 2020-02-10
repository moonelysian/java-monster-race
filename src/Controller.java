import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Controller {
    private final String[] AVAILABLE_MONSTER_TYPE = {"달리기", "비행", "에스퍼"};
    private int numberOfMonster;
    private int chance;
    private ArrayList<Monster> monsterList = new ArrayList<>();

    void startGame() {
        System.out.println(Message.startLine);
        inputRaceInformation();
        resultOfRace();
    }

    void inputRaceInformation() {
        ConsoleInput input = new ConsoleInput();
        System.out.println(Message.askNumberOfMonster);
        numberOfMonster = input.inputNumberOfMonster();

        System.out.println(Message.askTypeOfMonster);
        for (int i = 0; i < numberOfMonster; i++) {
            setMonsterList(input.inputMonsterNameAndType());
        }

        System.out.println(Message.askNumberOfChance);
        chance = input.inputNumberOfChance();
    }

    private boolean verifyTypeOfMonster(String monsterType) {
        return Arrays.asList(AVAILABLE_MONSTER_TYPE).contains(monsterType);
    }

    private void setMonsterList(String[] monster){
        int name = 0;
        int type = 1;

        if (verifyTypeOfMonster(monster[type])) {
            createMonster(monster[name], monster[type]);
            return;
        }
        System.out.println(Message.monsterTypeErorr);
    }

    private void createMonster(String monsterName, String monsterType) {
        if (monsterType.equals("달리기")) {
            monsterList.add(new RunTypeMonster(monsterName));
        } else if (monsterType.equals("비행")) {
            monsterList.add(new FlyTypeMonster(monsterName));
        } else {
            monsterList.add(new EsperTypeMonster(monsterName));
        }
    }

    private void resultOfRace() {
        monsterList.forEach(monster -> monster.getDistance(chance));
        System.out.println(Message.gameStartMessage);
        for (Monster monster : monsterList) {
            System.out.println(monster.name + " [" + monster.type + "] : " + convertNumberToString(monster.distance));
        }
        Monster winner = Collections.max(monsterList);
        System.out.println(Message.congratulations + " " + winner.name + " " + Message.winner);
    }
    
    private String convertNumberToString(int distance) {
        return "-".repeat(Math.max(0, distance));
    }
}
