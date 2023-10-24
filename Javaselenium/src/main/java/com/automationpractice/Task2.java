package com.automationpractice;

import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        //Task 1. Write a program to print a string entered by user.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter StrinVerify position file can be deleted after performing daily calculationg: ");
        String enterstr =scanner.nextLine();
        System.out.println(enterstr);

        //Task 2. Write a program to input and display the sentence I love candies.
        String printstr = "I love candies";
        System.out.println(printstr);

        //Task 3. Write a program to find the length of the string "refrigerator".
        String strvalue = "refrigerator";
        int strlength = strvalue.length();
        System.out.println(strlength);

        //Task 4. Write a program to check if the letter 'e' is present in the word 'Umbrella'.
        //Task 5. Write a program to check if the word 'orange' is present in the "This is orange juice".
        String strfind = "This is orange juice";
        if(strfind.contains("orange")){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

        /*Task 6. Write a program to find the first and the last occurence of the letter 'o'
        and character ',' in "Hello, World".*/
        String occurence = "Hello, World";
        for(int i=0;i<occurence.length();i++){
            switch(occurence.charAt(i)){
                case 'o':
                    if(occurence.charAt(i)==occurence.charAt(0)){
                        System.out.println("First occurence is the same input you gave "+ occurence.charAt(i));
                        System.out.println("Last occurence of o is "+ occurence.charAt(i+1));
                    }else if(occurence.charAt(i)==occurence.charAt(occurence.length()-1)){
                        System.out.println("First occurence of o is "+ occurence.charAt(i-1));
                        System.out.println("Last occurence is the same input you gave"+ occurence.charAt(i));
                    }else {
                        System.out.println("First occurence of o is " + occurence.charAt(i - 1));
                        System.out.println("Last occurence of o is " + occurence.charAt(i + 1));
                        break;
                    }
                case ',':
                    if(occurence.charAt(i)==occurence.charAt(0)){
                        System.out.println("First occurence is the same input you gave "+ occurence.charAt(i));
                        System.out.println("Last occurence of , is "+ occurence.charAt(i+1));
                    }else if(occurence.charAt(i)==occurence.charAt(occurence.length()-1)){
                        System.out.println("First occurence of , is "+ occurence.charAt(i-1));
                        System.out.println("Last occurence is the same input you gave"+ occurence.charAt(i));
                    }else {
                        System.out.println("First occurence of , is " + occurence.charAt(i - 1));
                        System.out.println("Last occurence of , is " + occurence.charAt(i + 1));
                        break;
                    }
            }

        }

        /*Task 7. Write a program that takes your full name as input and displays the abbreviations
        of the first and middle names except the last name which is displayed as it is.
        For example, if your name is Robert Brett Roser, then the output should be R.B.Roser.*/
        String valuee = "Nishanthi Karnan";
        String[] values = valuee.split(" ");
        System.out.println((values.length));
        System.out.println(values[0].charAt(0)+"."+values[1]);

        String name = "Nishanthi Karnan";
        String[] splited = name.split(" ");
        System.out.println("My name is " + splited[1].charAt(0) + " " + splited[0]);

        //Another methdod
        /*List<String> Val = List.of(valuee.split(" "));
        System.out.println(Val);
        char ans = Val.get(0).charAt(0);
        System.out.println(ans);*/

        /*Task 8. Write a program to find the number of vowels,
         consonents, digits and white space characters in a string.*/
        String value ="I am nishanthi born in july 30";
        int countwithspace = value.length();

        int i;
        int countvowel = 0;
        int countcons = 0;
        int countdigit = 0;
        String vowels ="aeiou";

        /*List<String> consanants = List.of(value.split(" "));
        int countspace = consanants.size()-1;
        System.out.println("No.of space :"+countspace);*/

        String trimmed = value.replace(" ","").toLowerCase();
        int countwithoutspace =trimmed.length();
        System.out.println("No.of characters before removing spaces:"+countwithspace);
        System.out.println("No.of characters after removing spaces:"+countwithoutspace);
        //System.out.println(trimmed);

        for(i=0; i<trimmed.length(); i++){
            if(vowels.contains(String.valueOf(trimmed.charAt(i)))){
                countvowel+=1;
            } else if (Character.isDigit(trimmed.charAt(i))) {
                countdigit+=1;
            } else {
                //System.out.println(trimmed.charAt(i));
                countcons+=1;
            }

        }
        System.out.println("No.of vowels: "+ countvowel);
        System.out.println("No.of Cons: "+ countcons);
        System.out.println("No.of digit: "+ countdigit);

       //Task 9. Write a program to delete all consonents from the string "Hello, have a good day".
        String string = "Hello, have a good day"; //eo, ae a oo a
        String vowel="aeiouAEIOU, ";

        for(i=0; i<string.length(); i++){
            if(vowel.contains(String.valueOf(string.charAt(i)))){
                System.out.print(string.charAt(i));
            }
        }

        /*Task 10. Input a string of alphabets. Find out the number of occurrence of all
        alphabets in that string. Find out the alphabet with maximum occurrence.*/
        /*String message = "associations";
        String temp, initial = null;
        int i, j = 0, add = 0, othertemp = 0, maxioccurr = 0;
        String Number_of_occurence = null;
        for(i=0; i<message.length(); i++){
            for(j=0; j<message.length(); j++){
                temp =String.valueOf(message.charAt(j));
                initial =String.valueOf(message.charAt(i));
                if(initial.equals(temp)){
                    add+=1;
                }
            }
            Number_of_occurence ="No.of "+(initial)+" : "+ add;
            System.out.println(Number_of_occurence);
            maxioccurr = add;
            add=0;
            if(maxioccurr> othertemp){
                othertemp = maxioccurr;
        }
        }
        System.out.println("Maximum time occur letter is "  +(initial)+" and the occurence count is " + maxioccurr);
*/

    }

}

 /*   String str = "5";
    int number = Integer.parseInt(str);
        System.out.println("number: "+ (number + 5));
                System.out.println(number+4);*/
