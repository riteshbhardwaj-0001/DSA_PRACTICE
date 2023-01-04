package SlidingWindow;

import java.util.HashMap;

public class LongestSubstring {
    public static void main(String[] args) {
        String s="aabacbebebe";
        int k=3;
        int size=function(s,k);
        System.out.println(size);
    }

    private static int function(String s, int k) {
        int sw=0;
        int ew=0;
        int max=Integer.MIN_VALUE;
        HashMap<Character,Integer> map = new HashMap<>();
        while(ew<s.length()){
            map.put(s.charAt(ew),map.getOrDefault(s.charAt(ew),0)+1);
            if(map.size()<k){
                ew++;
            }
            else if(map.size()==k){
                int ws=ew-sw+1;
                max=Math.max(max,ws);
                ew++;
            } else if (map.size()>k) {
                while(map.size()>k){
                    if(map.containsKey(s.charAt(sw)) && map.get(s.charAt(sw))!=0){
                        map.put(s.charAt(sw),map.get(s.charAt(sw))-1);
                        if(map.get(s.charAt(sw))==0){
                            map.remove(s.charAt(sw));
                        }
                        sw++;
                    }
                }
                ew++;
            }
        }
        return max;
    }
}
