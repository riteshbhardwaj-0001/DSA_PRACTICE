package SlidingWindow;

import java.util.HashMap;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        String s="tabctttmtapt";
        String t="tta";
        int size=fun(s,t);
        System.out.println(size);
    }
    private static int fun(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        int sw=0,ew=0;
        int size=Integer.MAX_VALUE;
        for(int i=0;i<t.length();i++){
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i),0)+1);
        }
        int count=map.size();
        while(ew<s.length()){
            if(map.containsKey(s.charAt(ew))){
                map.put(s.charAt(ew), map.get(s.charAt(ew))-1);
                if(map.get(s.charAt(ew))==0){
                    count--;
                }
                ew++;
            }else{
                ew++;
            }
            if(count==0){
                while(count==0){
                    size=Math.min(size,ew-sw);
                    if(map.containsKey(s.charAt(sw))){
                        map.put(s.charAt(sw),map.get(s.charAt(sw))+1);
                        if(map.get(s.charAt(sw))>0){
                            count++;
                        }
                    }
                    sw++;
                }
            }
        }
        return size;
    }
}
