package Practice_Programs;

import java.util.HashMap;
import java.util.Map;

class ShortestCompletingWord {
    public static void main(String[] args) {
        String[] words = {"step","steps","stripe","stepple"};
        String s=shortestCompletingWord("1s3 PSt",words);
        System.out.println(s);
    }
    public static String shortestCompletingWord(String licensePlate, String[] words) {
        //key must be unique
        HashMap<Character,Integer> map = new HashMap<>();
        licensePlate=licensePlate.toLowerCase();
        for(int i=0;i<licensePlate.length();i++){
            if(Character.isLetter(licensePlate.charAt(i))){
                map.put(licensePlate.charAt(i),map.getOrDefault(licensePlate.charAt(i),0)+1);
            }
        }
        int length = Integer.MAX_VALUE;
        String s = "";
        for(int i=0;i<words.length;i++){
            if(words[i].length()>=length){
                continue;
            }
            String word = words[i];
            if(canBuild(map, word)){
                s = word;
                length = word.length();
            }
        }
        return s;
    }

    private static boolean canBuild(Map<Character, Integer> map, String word){
        Map<Character, Integer> map1 = new HashMap();

        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            map1.put(ch, map1.getOrDefault(ch,0)+1);
        }

        for(char ch: map.keySet()){
            if(map.getOrDefault(ch,0)>map1.getOrDefault(ch,0))
                return false;
        }

        return true;
    }

}
