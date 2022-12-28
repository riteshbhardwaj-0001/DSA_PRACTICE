package SlidingWindow;

import java.util.HashMap;

public class CountOccurencesAnagram {
    public static void main(String[] args) {
        String s="aabaabaa";
        int length=s.length();
        String anagram="aaba";
        int k=anagram.length();
        int result=countAnagrams(s,anagram,length,k);
        System.out.println(result);
    }
    private static int countAnagrams(String s, String anagram, int length, int k) {
        int count=0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<anagram.length();i++){
            map.put(anagram.charAt(i),map.getOrDefault(anagram.charAt(i),0)+1);
        }
        int mapSize= map.size();
        int start=0,end=0;
        while(end<length){
            if(map.containsKey(s.charAt(end))){
                map.put(s.charAt(end), map.get(s.charAt(end))-1);
                if(map.get(s.charAt(end))==0){
                    mapSize--;
                }
            }
            if(end-start+1<k){
                end++;
            }
            else if(end-start+1==k){
                if(mapSize==0){
                    count++;
                }
                if(map.containsKey(s.charAt(start))){
                    map.put(s.charAt(start), map.get(s.charAt(start))+1);
                    if(map.get(s.charAt(start))!=0){
                        mapSize++;
                    }
                }
                start++;
                end++;
            }
        }
        return count;
    }
}
