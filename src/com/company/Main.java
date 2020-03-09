package com.company;

public class Main {


            public static void main(String[] args) {    //********** Main Method *********** Start


                boolean gameOver = true;
                int score = 800;
                int levelCompleted = 5;
                int bonus = 100;
                int highScore = calculatedScore(true, 800, 5, 100);
                System.out.println("Your fianl Score = " + highScore);
                score = 10000;
                levelCompleted = 8;
                bonus = 200;
                highScore = calculatedScore(true, 10000, 8, 200);
                System.out.println("Your fianl Score = " + highScore);

                // to call or print method should be inside the Main Method
                int highScorePosition = calculateHighScorePosition(1500);
                displayHighScorePosition("Tim", highScorePosition);
                // We can use again but we need to remove the datatype at the beginning
                highScorePosition = calculateHighScorePosition(900);
                displayHighScorePosition("Bob", highScorePosition);
                // We can use again but we need to remove the data type at the beginning
                highScorePosition = calculateHighScorePosition(400);
                displayHighScorePosition("Percy", highScorePosition);
                // We can use again the same method but we need to remove the data type at the beginning
                highScorePosition = calculateHighScorePosition(50);
                displayHighScorePosition("Gilbert", highScorePosition);


            }      // ***************** Main Method Ends*****************************


            public static int calculatedScore(boolean gameOver, int score, int levelCompleted, int bonus) {
                if (gameOver) {
                    int finalScore = score + (levelCompleted * bonus);
                    finalScore += 2000;
                    return finalScore;
                }
                return -1;
            }


            // Created the method outside the Main Method
            public static void displayHighScorePosition(String playerName, int highScorePosition) {
                System.out.println(playerName + "  managed to get into position  " + highScorePosition + " on the high score table");
            }

            public static int calculateHighScorePosition(int playerScore) {
//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500 && playerScore <1000){
//            return 2;
//        } else if(playerScore>=100 && playerScore <500) {
//            return 3;
//            // We can even delete the last return and run the code the result won't effect at all.
//        }//else {
//            return 4;

                int position = 4; // assuming position 4 will be returned
                if (playerScore >= 1000) {
                    position = 1;
                } else if (playerScore >= 500) {
                    position = 2;
                } else if (playerScore >= 100); { // I put the semicolon after the (playScore)
                    //in this case nothing happen I just changed the code. and the result changed to position all equal position 3
                    position = 3;
                } // At the last we can only return the position
                return position;
            }

}
