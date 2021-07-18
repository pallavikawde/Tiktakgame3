package com.timbhuchalka;

import java.util.Scanner;

//create class
public class Tictak {
    static char[] board= new char[10];
    static char shiftchoice;
//create methode
    public static char[] createboard(){
//creatin array with size 10

        for(int i=1;i<board.length;i++) {
            board[i]=' ';
        }
            return board;
    }
    //methode to take user input
    public static char playeroption()
    {
      Scanner sc=new Scanner(System.in);
        System.out.println("enter a shift choice either x or o");
        shiftchoice=sc.next().charAt(0);

        if ((shiftchoice != 'x') && (shiftchoice != 'o')){
        System.out.println("invalid choice");
        shiftchoice = shiftchoice;
    }
        System.out.println("your choice - " +shiftchoice);
        return shiftchoice;
    }
    public static void showboard(char[] boardtoshow) {


        int count = 0;
        for (int i = 1; i < boardtoshow.length; i++) {
            count++;
            System.out.print(i+"[" + boardtoshow[i] + "] ");
            if (count == 3) {

                count = 0;
                System.out.println("\n");
            }
        }
    }
    public static char[] dlocation(char[]oldBoard){
        Scanner dlo = new Scanner(System.in);
        System.out.println("this is the board");
        showboard(oldBoard);
        System.out.println("check empty spaces & enter a location where you want to add input");
        int location = dlo.nextInt();
        if(oldBoard[location] == ' ')
        {
            oldBoard[location] = playeroption();
        }
        else {
            System.out.println("Location is already reserved select another location");
        }
        return oldBoard;



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
            dlocation(board);
            showboard(board);
        }
    }





