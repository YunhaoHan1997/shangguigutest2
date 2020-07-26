
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {1, -2, 7, 3, 4, 7, 2, 8, 9, 3, 4, 0, -1};
        Sort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);

        }
    }

    private static void Sort(int a[],int begin, int end){
        if (begin >= end) {
            return;
        }


        int low = begin;
        int high = end;
        int pivot = a[low];
        /*
        while (low < high && a[high] > pivot){
            high -- ;
        }
        a[low] = a[high];
        while (low < high && a[low] < pivot){
            low ++ ;
        }
        a[high] = a[low];
         */
        while (low < high){
            if (a[high] < pivot){
                a[low] = a[high];
                low++;
            }
            else high--;
            if (a[low] > pivot){
                a[high]=a[low];
                high--;
            }
            else low++;

        }
        a[low] = pivot;
        Sort(a,begin,low-1);
        Sort(a,low+1,end);


    }

}


/*
public class QuickSort {
    public static void main(String[] args) {
        int [] a = {1,6,8,7,3,5,16,4,8,36,13,44};
        QKSourt(a,0,a.length-1);
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
    }
    private static void QKSourt(int[] a, int start, int end) {
        if (a.length < 0){
            return ;
        }
        if (start >= end){
            return ;
        }
        int left = start;
        int right = end;
        int temp = a[left];
        while (left < right){
            while (left < right && a[right] > temp){
                right -- ;
            }
            a[left] = a[right];
            while (left < right && a[left] < temp){
                left ++ ;
            }
            a[right] = a[left];
        }
        a[left] = temp;
        QKSourt(a, start, left -1);
        QKSourt(a,left+1,end);
    }
}

 */
