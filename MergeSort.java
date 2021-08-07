import java.util.Arrays;
import java.util.Scanner;
public class MergeSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n  = s.nextInt();
        int[] l = new int[n];
        for(int i = 0; i < n; i++){
            l[i] = s.nextInt();
        }
        s.close();
        sort(l, 0, l.length-1);
        System.out.println(Arrays.toString(l));
    }
    public static void sort(int[]l,int low, int high) {
        if(low<high){
            int mid = (high + low)/2;
            sort(l,low, mid);
            sort(l,mid+1, high);
            merging(l,low,mid,high);
        }
    }
    public static void merging(int[]l,int low,int mid,int high) {
        int[] aux = new int[l.length];
        for(int i=0;i<l.length;i++){
            aux[i] = l[i];
        }
        int i=low; int j=mid+1; int k=low;
        while(i<=mid && j<=high){
            if(aux[i]<aux[j]){
                l[k] = aux[i];
                i++;
            }
            else{
                l[k] = aux[j];
                j++;
            }
            k++;
        }
        if(i>mid){
            while(j<=high){
                l[k] = aux[j];
                j++;k++;
            }
        }
        else{
            while(i<=mid){
                l[k] = aux[i];
                i++;k++;
        }
        }
    }
}
