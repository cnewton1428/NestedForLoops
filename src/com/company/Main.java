package com.company;

//static= allocate variable; final= can't alternate

public class Main {

    public static void main(String[] args) {
        // Nested For Loops: for loop inside for loops

        int row, column;

        for (row = 1; row < 10; row++) {           //displays 1st row
            for (column = 1; column <= row; column++) {   //then loops to this; column <= row because it is a terminating sequence and it stops printing more columns since column<=row
                System.out.print(row);              //what do you want to display? rows 1 to 9; so only print the row variable that already contains the data sets 1 to 9
            }
            System.out.println(); //Takes us to next line instead of printing on same line
        }
    }
}

