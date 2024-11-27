package Week_7;

import java.util.*;
import java.util.Random;

public class exercise3 {
    public static int askQuestion(int num1, int num2){
        Scanner input = new Scanner(System.in);
        System.out.println(num1 + " x " + num2 + " = ");
        int userAnswer = input.nextInt();
        return userAnswer;
    }
    public static int correctAnswer(int score){
        System.out.println("Correct");
        score ++;
        return score;
    }
    public static int wrongAnswer(int answer, int lives){
        System.out.println("Wrong! ");
        lives--;
        return lives;
    }
    public static void gameOver(int score, int lives){
        System.out.println("Game Over. youre score is" + score);
        if (lives > 0) {
            System.out.println("Well Done!");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int score = 0;
        int lives = 3;
        int count = 1;

        while (count<=10) {
            int userAnswer = askQuestion(count, count * count);
            int answer = count + (count * count);

            if (answer == userAnswer) {
                score = correctAnswer(score);
            } else {
                lives = wrongAnswer(answer, lives);
            }

            count++;
        }
        gameOver(score, lives);



    }
}








