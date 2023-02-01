package SlidingWindow;

import java.util.HashMap;

public class LongestSubstringAllUnqiqueCharacters {
    public static void main(String[] args) {
        String s = "pwwkeaezcd";
        int size = function(s);
        System.out.println(size);
    }
    private static int function(String s) {
        int sw=0,ew=0;
        int size=Integer.MIN_VALUE;
        HashMap<Character,Integer> mp = new HashMap<>();
        while(ew<s.length()){
            mp.put(s.charAt(ew),mp.getOrDefault(s.charAt(ew),0)+1);
            if(mp.size()==ew-sw+1){
                size= Math.max(size,ew-sw+1);
                ew++;
            }
            else if(mp.size()<ew-sw+1){
                while(mp.size()<ew-sw+1){
                    if(mp.containsKey(s.charAt(sw)) && mp.get(s.charAt(sw))!=0){
                        mp.put(s.charAt(sw),mp.get(s.charAt(sw))-1);
                        if(mp.get(s.charAt(sw))==0){
                            mp.remove(s.charAt(sw));
                        }
                        sw++;
                    }
                }
                ew++;
            }
        }
        return size;
    }
}
