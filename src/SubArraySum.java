import java.util.ArrayList;

public class SubArraySum {
    public static void main(String[] args) {
        int [] arr={1,2,3,7,5};
        int target=12;
        ArrayList<Integer> list= new ArrayList<>();
        list=subArraySum(arr,target);
        System.out.println(list.toString());
    }
    private static ArrayList<Integer> subArraySum(int[] arr, int target) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int sum=arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(sum==target){
                    int p=j-1;
                    list.add(i);
                    list.add(p);
                    return list;
                }
                if(sum>target){
                    break;
                }
                sum=sum+arr[j];
            }
        }
        return null;
    }
}
//Time Complexity O(n^2)
//Space Complexity O(1)