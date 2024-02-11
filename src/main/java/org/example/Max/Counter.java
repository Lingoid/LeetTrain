package org.example.Max;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        soundCounter();

    }

    static void soundCounter(){

        ArrayList <Character> doubleVowels = new ArrayList<>(Arrays.asList('ё', 'е', 'я', 'ю'));
        ArrayList <Character> vowels = new ArrayList<>(Arrays.asList('ё', 'е', 'я', 'ю', 'у', 'ы', 'а', 'о', 'э', 'и'));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String word = scanner.nextLine();
        int wordCounter = 0;
        int soundCounter = 0;
        int i = 0;
        while (i < word.length()){
            if(word.charAt(i) == 'ъ' || word.charAt(i) == 'ь'){
                if(doubleVowels.contains(word.charAt(++i))){
                    soundCounter += 2;
                    i++;
                }

            } else if(word.indexOf(word.charAt(i)) == 0 && doubleVowels.contains(word.charAt(i))) {
                soundCounter += 2;
                i++;


            } else if(doubleVowels.contains(word.charAt(i++)) && vowels.contains(word.charAt(i))) {
                soundCounter += 2;

            } else {
                soundCounter++;

            }

        }

        for (int j = 0; j < word.length(); j++) {
            wordCounter++;
        }

        System.out.println(word + " : " + wordCounter);
        System.out.println(word + " : " + soundCounter);
    }



}
