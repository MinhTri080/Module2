public class timGiaTriLonnhat {
    public static void main(String[] args) {
        int arr[]={5,8,4,2,8,6,9,11};
        int max = 0;
        for(int i = 0;i<arr.length;i++){
            if (arr[max]<arr[i]){
                arr[max]=arr[i];
            }
        }
        System.out.println(arr[max]);
    }
}
