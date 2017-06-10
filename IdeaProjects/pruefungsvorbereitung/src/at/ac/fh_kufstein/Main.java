package at.ac.fh_kufstein;

import java.io.*;
import java.util.ArrayList;

import static java.lang.System.*;


public class Main {

    public static void main(String[] args) {

        String line;
        ArrayList<String> lines = new ArrayList<>();


        try {
            File file1 = new File("test.txt");
            FileWriter filewriter1 = new FileWriter(file1);

            for (int i = 1; i <= 5; i++) {
                filewriter1.write(i + System.getProperty("line.separator"));
            }
            filewriter1.close();


        } catch (java.io.IOException ex) {
            out.println("Hallo");
        }

        try {


            File file2 = new File("test.txt");
            FileReader filereader1 = new FileReader(file2);
            BufferedReader reader = new BufferedReader(filereader1);


            while ((line = reader.readLine()) != null){
                lines.add(line);
            }

            for (String s : lines){

                System.out.println(s);

            }









            filereader1.close();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        catch (IOException ex1){
            ex1.printStackTrace();
        }










    }
}
