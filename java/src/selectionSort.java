import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int arr1[] = {8, 6, 9, 5, 7, 1};
    for(int i = 0;i< arr1.length-1;i++){
        for (int j = 0;j< arr1.length - i- 1;j++){
            if(arr1[j+1]<arr1[j]){
                int temp = arr1[j+1];
                arr1[j+1]=arr1[j];
                arr1[j]=temp;
            }
        }
    }
        System.out.println(Arrays.toString(arr1));

    }
}