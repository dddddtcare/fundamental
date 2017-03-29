import java.util.Arrays;

/**
 * Created by rxu on 3/29/2017.
 Quicksort	
 time complexity worst case 	O(n^2)
 time complexity best case  O(nlog(n))
 time complexity average case O(nlog(n))
 space complexity O(log(n))
 
 */
public class QC1 {
    public static void main(String[] args){
        int[] input={4,2,7,3,9,5,1};
        QC1 qc1=new QC1();
        int low=0;
        int high=input.length-1;
        qc1.quicksort(input,low,high);
        System.out.println(Arrays.toString(input));
    }
    public static void quicksort(int[] array,int low,int high){

        if(array==null||array.length==0)
            return;
          if(low>=high)
              return;

        int middle=low+(high-low)/2;
        int pivot=array[middle];
        int i=low;
        int j=high;
        while(i<=j){
            while(array[i]<pivot){
                i++;
            }
            while(array[j]>pivot){
                j--;
            }
            if(i<=j){
                swap(array,i,j);
                i++;
                j--;
            }
        }

        if (low < j)
            quicksort(array, low, j);

        if (high > i)
            quicksort(array, i, high);
    }

    public static void swap(int[] array,int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}
