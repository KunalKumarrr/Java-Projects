public class Main {
    public static void main(String[] args){

        Calculate_Score(true,800,5,100 );

        Calculate_Score(true,10000,8,200);
        Calculate_Score(true,50000,10,600);


    }
    public static void Calculate_Score(boolean gameOver,int score,int levelCompleted,int bonus){

        if(gameOver){
            int finalScore=score+(levelCompleted*bonus);
            finalScore+=1000;
            System.out.println("Your Final Score is " +finalScore);

        }

    }
}
