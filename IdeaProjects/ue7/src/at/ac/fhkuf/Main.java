package at.ac.fhkuf;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //Aufgabe 2
        int[] intarray = new int[10];
        intarray[0] = 1;
        intarray[1] = 2;
        intarray[2] = 3;
        intarray[3] = 4;
        intarray[4] = 5;
        intarray[5] = 6;
        intarray[6] = 7;
        intarray[7] = 8;
        intarray[8] = 9;
        intarray[9] = 10;

        for (int value : intarray) {
            System.out.println(value);
        }


        //Aufgabe 3
        int[] intarray2 = {1, 2, 3, 4, 5, 6, 7, 8};


        for (int i = 0; i < intarray2.length; i++) {
            System.out.println(intarray2[i]);
        }


        //Aufgabe 4
        List<Integer> myList = new ArrayList<Integer>();

        Random random = new Random();
        int upperborder = random.nextInt(1000000);

        LocalDateTime start = LocalDateTime.now();
        for(int i = 0; i < upperborder; i++){
            myList.add(random.nextInt());
        }
        LocalDateTime end = LocalDateTime.now();
        Duration p = Duration.between(start, end);
        System.out.println(p.getSeconds());

        for(int value : myList){
            System.out.println(value);
        }
        System.out.println("Anzahl:"+ myList.size());



        //Aufgabe 5
        int[][] a4x3 = new int[4][3];

        for(int i = 0; i<4; i++){
            for(int j = 0; j<3; j++){
                a4x3[i][j] = random.nextInt();
            }
        }

        for(int row = 0; row < 4; row++){
            for(int col = 0; col < 3; col++){
                System.out.println(a4x3[row][col]);
            }
        }

        int[][] a5x4 = {
                {0,1,4,5},
                {2,3,3,2},
                {4,5,4,8},
                {3,4,2,8},
                {8,3,1,9}
        };

        int[][] jaggedArray =  new int[5][];

        for(int row = 0; row < 5; row++){
            jaggedArray[row] = new int[row+1];
        }




    }
}
