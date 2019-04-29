package game;

import java.util.*;

public class Game {

    private int score ;
    private int lv;
    private int randomNumber;
    private int answer;
    private Random rand = new Random();;

    public Game (int lv){
        this.lv = lv;
        this.score = 0;
        this.setX();
    }

    public void setX(){
            randomNumber = rand.nextInt(20)+1;
            this.answer = randomNumber*this.lv;
    }

    public String getX(){
        return Integer.toString(this.randomNumber);
    }

    public void checkCorrect(String a){
        int input = Integer.parseInt(a);
        if(this.answer==input){
            score++;
        }
        this.setX();
    }

    public String getScore(){
        return Integer.toString(this.score);
    }

    public String getAnswer(){
        return Integer.toString(this.answer);
    }

    public String getIncorrectAnswer(String a,String a2){
        int anotherAnswer = Integer.parseInt(a);
        int anotherAnswer2 = Integer.parseInt(a2);

        int incorrectAnswer = rand.nextInt(this.answer*this.lv)+1;
        if( incorrectAnswer == answer || incorrectAnswer == anotherAnswer || incorrectAnswer == anotherAnswer2 ){
            getIncorrectAnswer(a,a2);
        }
        return Integer.toString(incorrectAnswer);
    }
}
