public class Movement {

    boolean verifyMovement() {
        int randomNumber = (int) (Math.random() * 10);
        return randomNumber > 3;
    }

     String moveMonster(){
         String move = "--";
         String stop = "";

         return verifyMovement() ? move : stop;
    }
}
