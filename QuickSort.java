import java.util.Arrays;
import java.util.Scanner;
public class QuickSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n  = s.nextInt();
        int[] l = new int[n];
        for(int i = 0; i < n; i++){
            l[i] = s.nextInt();
        }
        s.close();
        quicksort(l, 0, l.length-1);
        System.out.println(Arrays.toString(l));
    }
    public static void quicksort(int[] l,int low,int high) {
        if(l.length == 1){}
        else if(low<high){
            int mid = low+(high-low)/2;
            int pivot = l[mid];int b = low; int s = high;
            while(b<s){
                while(l[b]<pivot){
                    b++;
                }
                while(l[s]>pivot){
                    s--;
                }
                if(b<s){
                    int temp = l[s]; l[s] = l[b]; l[b] = temp;
                    b++;s--;
                }
            }
            int temp = l[s]; l[s] = l[mid]; l[mid] = temp;
            if(low<s-1) quicksort(l, low, s-1);
            if(s+1<high) quicksort(l, s+1, high);
        }
    }
}
