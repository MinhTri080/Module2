import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int arr[] = {9, 8, 7, 5, 2};
        for (int i = 0;i<arr.length -1;i++){
            for (int j = 0;j<arr.length -i -1;j++){
                if(arr[j+1]< arr[j]){
                    int temp = arr[j+1];
                    arr[j+1]= arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}