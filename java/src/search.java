public class search {
    public static void main(String[] args) {
        int arr[] = {10, 8, 7, 5, 4, 3};
        int x = 2;
        System.out.println(BynarySearch(arr,x));;
    }

    public static int BynarySearch(int[] arr, int x){
            int left = 0;
            int right = arr.length - 1;
            int mid;
            while (right >= left) {
                mid = (right + left) / 2;
                if (arr[mid] == x)
                    return mid;
                if (arr[mid] > x)
                    left = mid + 1;

                else
                    right = mid - 1;
            }

            return -1;
        }
    }
