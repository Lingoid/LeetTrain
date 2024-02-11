package org.example.Max;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IntegerToRoman {
    private static Map<Integer,String> allRomanNumbers = new HashMap<>();


    public static void main(String[] args) {
        allRomanNumbers.put(1, "I");
        allRomanNumbers.put(4, "IV");
        allRomanNumbers.put(5, "V");
        allRomanNumbers.put(9, "IX");
        allRomanNumbers.put(10, "X");
        allRomanNumbers.put(40, "XL");
        allRomanNumbers.put(50, "L");
        allRomanNumbers.put(90, "XC");
        allRomanNumbers.put(100, "C");
        allRomanNumbers.put(400, "CD");
        allRomanNumbers.put(500, "D");
        allRomanNumbers.put(900, "CM");
        allRomanNumbers.put(1000, "M");
        Scanner scanner = new Scanner(System.in);
        System.out.println(intToRoman(scanner.nextInt()));
    }


    public static String intToRoman(int num) {

        int []values={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String []notations={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder sb=new StringBuilder();


        for(int i=0;i<values.length;i++){
            while(num>=values[i])
            {
                num-=values[i];
                sb.append(notations[i]);
            }
        }

        return sb.toString();
    }
    public static int romanToInt(String s) {
        Map<Character, Integer> m = new HashMap<>();

        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && m.get(s.charAt(i)) < m.get(s.charAt(i + 1))) {
                ans -= m.get(s.charAt(i));
            } else {
                ans += m.get(s.charAt(i));
            }
        }

        return ans;

    }


}






