package com.example;


import java.time.LocalDate;
import java.util.Scanner;

public class taskcount {
    public static void main(String[] args) {
        /*   *//*  *
         **
         ***
         ****
         ******//*
         *//*  int i,j;
        int odd=5;
        int count = 5;

        for(i=1; i<=5; i++){
            for (j=1; j<=odd; j++) {
                if(j==count || j>count) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            count-=1;

            System.out.println("");
        }*//*

         *//* * * * * *
         * * * *
         * * *
         * *
         * *//*

        int i,j;
        int odd=5;

        for(i=1; i<=5; i++){
            for (j=1; j<=odd; j++) {
                    System.out.print("*" + " ");
                }

            odd-=1;
            System.out.println("");
            }


        }*/


        String date = "2023-01-30";
        LocalDate localDate = LocalDate.parse(date).minusDays(90);
        System.out.println(localDate);
    }
}

