package useArray;

import java.util.Random;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        Random ran=new Random();
        int[] array = new int[1000];
        System.out.println("Plz enter numbers: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = ran.nextInt( 10000);
        }
        for (int j = 0; j < array.length; j++) {
            System.out.println("Array index value : " + array[j]);

        }
    }
}
