package com.timbhuchalka;
//create class
public class Tictak {
//create methode
    public static char[] createboard(){
//creatin array with size 10
        char[] board= new char[10];
        for(int i=0;i<board.length;i++) {
            board[i]=' ';
        }
            return board;
    }
            //main methode
        public static void main(String[] args) {
        //calling methode
           char[] board =  createboard();

        }
    }





