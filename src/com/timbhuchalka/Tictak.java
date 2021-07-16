package com.timbhuchalka;

import java.util.Scanner;

//create class
public class Tictak {
    static char[] board= new char[10];
    static char shiftchoice;
//create methode
    public static char[] createboard(){
//creatin array with size 10

        for(int i=0;i<board.length;i++) {
            board[i]=' ';
        }
            return board;
    }
    //methode to take user input
    public static char playeroption()
    {
      Scanner sc=new Scanner(System.in);
        System.out.println("enter a shift choice");
        shiftchoice=sc.next().charAt(0);
        System.out.println("your choice - " +shiftchoice);
        return shiftchoice;
    }
    public static void showboard(char[] boardtoshow) {


    int count=0;
        for(int i=0;i<boardtoshow.length;i++) {
            count ++;
            System.out.print("["+boardtoshow[i] + "] ");
            if (count == 3) {

                count=0;
                System.out.println("\n");
            }
        }
    }
            //main methode
        public static void main(String[] args) {
        //calling methode
           char[] board =  createboard();
           //taking input for player and computer
            System.out.println("enter option");
            char shiftchoice=playeroption();
            System.out.println("enter option");
            char computerchice=playeroption();
            showboard(board);
        }
    }





