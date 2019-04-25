package game;

import java.util.List;

public interface Level {

    public void correcAns();

    public void setScore(int score);

    public int getScore();

    public void setHighScore(int highscore);

    public int getHighScore();

    public void randX();

    public int getX();

    public void randChoices();

    public List<Integer> getChoices();

}
