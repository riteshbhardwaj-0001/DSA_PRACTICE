package Practice_Programs;

public class Code_Delloite {
    public static void main(String[] args) {
        String str="2143658790";
        System.out.println(hidePhoneNumber(str));
    }

    private static String hidePhoneNumber(String str) {
        String s_odd="";
        String s_even="";
        for(int i=0;i<str.length();i++){
           if(str.charAt(i)%2!=0){
               s_odd=s_odd+str.charAt(i);
           }
           else{
               s_even=s_even+str.charAt(i);
           }
        }
        StringBuilder sb=new StringBuilder(s_even);
        sb.reverse();

        String ans=s_odd+sb.toString();
        return ans;
    }
}
