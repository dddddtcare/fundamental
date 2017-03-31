//Ω(n)	Θ(n^2)	O(n^2)	O(1)
/*
best:O(n)
average:O(n^2)
worst:O(n^2)
space o(n)
 */
public class test {

    public static void main(String a[]){
        int[] arr1 = {10,34,2,56,7,67,88,42};
        int[] arr2 = doInsertionSort(arr1);
        for(int i:arr2){
            System.out.print(i);
            System.out.print(", ");
        }
    }

    public static int[] doInsertionSort(int[] input){
        /**
         * arr={10,34,2,56,7,67,88,42} i:34 j:34
         * arr={2,10,34,56,7,67,88,42} i=2  j:2,34
         */
        int temp;
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(input[j] < input[j-1]){
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
        return input;
    }
}
