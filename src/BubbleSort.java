public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {1,-2,7,3,4,7,2,8,9,3,4,0,-1};
        System.out.println(a.length);
        int temp = 0;
        for (int i = 0; i< a.length; i++){
            for (int j = 0; j < a.length -1 -i; j++){
                if(a[j] > a[j+1]){
                    temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;


            }

            }
        }
        for (int i = 0; i< a.length; i++){
            System.out.print(" "+ a[i]);
        }
    }

}
