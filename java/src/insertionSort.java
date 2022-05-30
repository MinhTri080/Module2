import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int arr[]= {8,5,6,2,1,0};
        for(int i =0;i<arr.length;i++){
            int j=i;
            while (j>0 && arr[j-1]> arr[j]){
                int temp = arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}