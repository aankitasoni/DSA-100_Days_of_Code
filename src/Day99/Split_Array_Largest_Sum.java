package Day99;

public class Split_Array_Largest_Sum {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int K = 2;
        if (arr[0] == 0 && K == 1) System.out.println(0);
        int N = arr.length;
        int sum = 0;
        for (int i:arr) {
            sum += i;
        }
        int start = 1;
        int end = sum;

        while(start<=end) {
            int mid = (start+end)/2;

            if (isPosible(mid,K,arr)) {
                end = mid - 1;
            } else {
                start = mid +1;
            }
        }

        System.out.println(end + 1);
    }

    static boolean isPosible(int mid,int k, int[] arr) {

        int sum = 0;
        int count = 0;
        for (int i=0;i<arr.length;i++) {
            sum += arr[i];
            if (arr[i]>mid) return false;
            if (sum>mid) {
                count++;
                sum = arr[i];
            }
        }
        if (sum<=mid) {
            count++;
        }

        if (k>=count) return true;
        return false;
    }
    }

