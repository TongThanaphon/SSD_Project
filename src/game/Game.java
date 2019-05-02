package game;

import java.util.*;

public class Game {

    private int score ;
    private int randomNumber;
    private int answer;
    private int wrongN;
    private String lv;
    private String highscore;
    private Random rand = new Random();

    private Score sc = Score.getInstance();

    public Game (String lv){
        this.lv = lv;
        this.score = 0;
        this.setX();
        this.wrongN = 0;
    }

    public String getLV(){ return this.lv; }

    public void setX(){
            randomNumber = rand.nextInt(20)+1;
            this.answer = randomNumber * Integer.parseInt(lv);
    }

    public String getX(){
        return Integer.toString(this.randomNumber);
    }

    public void checkCorrect(String a){
        int input = Integer.parseInt(a);
        if(this.answer==input){
            score += 10;
        }else{
            wrongN += 1;
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
        int max = this.answer + 30;
        int min = this.answer - 30;

        if(min<0) {
            min = 1;
        }
        int incorrectAnswer = rand.nextInt(max-min+1) + (min);
        if( incorrectAnswer < 0 || incorrectAnswer % 10 != answer % 10 || incorrectAnswer == answer
                || incorrectAnswer == anotherAnswer || incorrectAnswer == anotherAnswer2 ){
            return getIncorrectAnswer(a,a2);
        }
        return Integer.toString(incorrectAnswer);
    }

    public void updateHighscore(String highscore) throws Exception {
        int int_high = Integer.parseInt(highscore);
        String lvstr = lv;
        if(score > int_high) sc.updateFile(lvstr, Integer.toString(score));
    }

    public void setHighscore(String highscore){
        this.highscore = highscore;
    }

    public String getHighscore(){ return this.highscore; }

    public int getWrongN(){ return wrongN; }

}
