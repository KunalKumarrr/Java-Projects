public class HighScore {
    public static void main(String[] args){
        int highScorePosition=calculateHighScorePosition(1500);
        displayHighScorePosition("Kunal",highScorePosition);
        highScorePosition=calculateHighScorePosition(800);
        displayHighScorePosition("Himanish" ,highScorePosition);
        highScorePosition=calculateHighScorePosition(400);
        displayHighScorePosition("Shivani" ,highScorePosition);
        highScorePosition=calculateHighScorePosition(200);
        displayHighScorePosition("GamerGal" ,highScorePosition);


    }
    public static void displayHighScorePosition(String Name, int position){
        System.out.println(Name + " managed to get into position " + position
                + " on the high score table" );

    }
    public static int calculateHighScorePosition(int playerScore){
        if(playerScore>1000) {
            return 1;
        }else if (playerScore>500 && playerScore<1000) {
            return 2;
        }else if (playerScore>100 && playerScore<500) {
            return 3;
        } else {
            return 4;
        }
        }
    }
