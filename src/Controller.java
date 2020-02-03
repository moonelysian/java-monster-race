public class Controller {
    private int count;

    Controller(int count){
        this.count = count;
    }

    String run(){
        String result = "";
        Movement movement = new Movement();
        for (int i = 0; i < count; i++) {
            result += movement.moveMonster();
        }
        return result;
    }
}
