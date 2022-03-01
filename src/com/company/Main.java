package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 integers");
        int[] array = new int[5];

        for (int i = 0; i < 5; i++){
            array[i] = input.nextInt();
        }
        input.close();

        for(int i = array.length - 1; i >= 0; i--){
            System.out.println(array[i] + " ");
        }
    }
}
