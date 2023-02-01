package SlidingWindow;

import java.util.HashMap;

public class PickToys {
    public static void main(String[] args) {
        int k=2;
        String s="abaccab";
        int maxToys=fun(s,k);
        System.out.println(maxToys);
    }
    private static int fun(String s, int k) {
        int sw=0,ew=0;
        int maxToys=Integer.MIN_VALUE;
        HashMap<Character,Integer> map=new HashMap<>();
        while(ew<s.length()){
            map.put(s.charAt(ew),map.getOrDefault(s.charAt(ew),0)+1);
            if(map.size()<k){
                ew++;
            }
            else if(map.size()==k){
                maxToys=Math.max(maxToys,ew-sw+1);
                ew++;
            }
            else if(map.size()>k){
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
        return maxToys;
    }
}
