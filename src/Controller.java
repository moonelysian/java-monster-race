import java.util.ArrayList;

public class Controller {
    private int numberOfMonster;
    private int chance;

    Controller(int numberOfMonster, int change){
        this.numberOfMonster = numberOfMonster;
        this.chance = change;
    }

    ArrayList<String> resultOfRace(){
        ArrayList result = new ArrayList();
        for (int monsterNumber=0; monsterNumber < numberOfMonster; monsterNumber++){
            result.add(calculateTotalMovement());
        }
        return result;
    }

    String calculateTotalMovement(){
        String result = "";
        Movement movement = new Movement();
        for (int i = 0; i < chance; i++) {
            result += movement.moveMonster();
        }
        return result;
    }
}
