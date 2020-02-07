import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Controller {
    private int numberOfMonster;
    private int chance;
    private ArrayList<Monster> monsterList = new ArrayList<>();
    private final String[] MONSTER_TYPE = {"달리기", "비행", "에스퍼"};

    void startGame() {
        System.out.println(Message.startLine);
        inputNumberOfMonster();
        inputMonsterNameAndType();
        inputNumberOfChance();
        resultOfRace();
    }

    private void inputNumberOfMonster() {
        Scanner input = new Scanner(System.in);
        System.out.println(Message.askNumberOfMonster);
        this.numberOfMonster = Integer.parseInt(input.nextLine());
    }

    private void inputMonsterNameAndType() {
        Scanner input = new Scanner(System.in);
        System.out.println(Message.askTypeOfMonster);
        for (int i = 0; i < this.numberOfMonster; i++) {
            String[] monsterNameAndType = input.nextLine()
                    .replaceAll(" ", "")
                    .split(",");
            if (monsterNameAndType[1].equals("달리기")){
                monsterList.add(new RunTypeMonster(monsterNameAndType[0]));
            }
            else if (monsterNameAndType[1].equals("비행")) {
                monsterList.add(new FlyTypeMonster(monsterNameAndType[0]));
            }
            else {
                monsterList.add(new EsperTypeMonster(monsterNameAndType[0]));
            }
        }
    }

    private void inputNumberOfChance() {
        Scanner input = new Scanner(System.in);
        System.out.println(Message.askNumberOfChance);
        this.chance = Integer.parseInt(input.nextLine());
    }

    private void resultOfRace() {
        for (int i = 0; i < this.chance; i++) {
            monsterList.forEach(Monster::move);
        }
        monsterList.forEach(monster -> System.out.println(monster.name + " " + monster.type + " " + monster.distance));
        Collections.sort(monsterList);
        System.out.println(Message.congratulations + " " + monsterList.get(0).name + " " + Message.winner);
    }
}
