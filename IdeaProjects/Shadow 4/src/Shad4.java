public class Shad4 {

    public static void main(String[] args){
     Die dice1, dice2;
     dice1 = new Die();
     dice2 = new Die();
     //roll the dice1
        dice1.roll();
       // roll dice2 now
        dice2.roll();

        System.out.println("dice1 is " + dice1.getroll() + ", dice2 is " + dice2.getroll() );
    }
}
