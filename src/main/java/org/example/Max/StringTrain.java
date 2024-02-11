package org.example.Max;


import java.util.*;

public class StringTrain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        StringTrain stringTrain = new StringTrain();
        int size = stringTrain.lengthOfLongestSubstring(string);
        System.out.println(size);

    }
    public int lengthOfLongestSubstring(String s) {
        List<Character> uniqueChars = new ArrayList<>();
        char[] array = s.toCharArray();
        Map<Integer, String> map = new HashMap<>();
        for(Character character : array){
            if(!uniqueChars.contains(character)){
                uniqueChars.add(character);
            } else{
                map.put(uniqueChars.size(), uniqueChars.toString());
                uniqueChars.clear();
                uniqueChars.add(character);
            }


        }
        Set<Integer> set = map.keySet();
        Optional<Integer> max = set.stream().max(Comparator.naturalOrder());
        int result = max.orElse(0);

        System.out.println(map.get(result));

        return result;

    }
}
