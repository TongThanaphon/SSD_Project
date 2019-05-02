package game;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Score {

    private static Score instance;
    private final String PATH = "src/data/highscore.txt";

    public static Score getInstance(){
        if(instance == null) instance = new Score();

        return instance;
    }

    public List<String> readFile() throws Exception{
        List<String> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new FileReader(PATH));
        String line = reader.readLine();

        while(line != null){
            String[] sp = line.split("_");
            list.add(sp[2]);
            line = reader.readLine();
        }

        reader.close();

        return list;
    }

    public void updateFile(String lv, String score) throws Exception{
        List<String> list = readFile();
        FileWriter writer = new FileWriter(PATH);

        String oldsc = "";
        String title = "LV_"+ lv + "_" + score;
        String sc = "";

        for(int i=0; i<11; i++){
            if(i == Integer.parseInt(lv) - 2) oldsc = "LV_" + lv + "_" + list.get(i);

            String x = "LV_" + (i+2) + "_" + list.get(i);
            sc = sc + x + System.lineSeparator();
        }

        String newsc = sc.replaceAll(oldsc, title);
        writer.write(newsc);

        writer.close();
    }

}
