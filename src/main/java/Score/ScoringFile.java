package Score;

import java.io.*;

public class ScoringFile {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("scores.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            //Jack
            String Line = reader.readLine();
            while (Line != null) {
                System.out.println(Line);
                String[] token = Line.split(" ,");
                String name = token[0];
                int English = Integer.parseInt(token[1]);
                int math = Integer.parseInt(token[2]);
                Student stu = new Student(name, English, math);
                stu.print();
                Line = reader.readLine();

            }
        } catch (FileNotFoundException e) {
            System.out.println("檔案讀去失敗");
        } catch (IOException e) {
            System.out.println("資料讀取失敗");
        }
        System.out.println("Testing");
    }

}


