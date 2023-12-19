import java.util.Arrays;

public class missingNumber {
    public static void main(String[] args) {
    }
    public int getMissing(int[] arr){
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]!=1){
                return arr[i]+1;
            }
        }
        return -1;
    }
}
