import java.util.Scanner;

/**
 * Created by Austin on 4/18/2017.
 */


public class SomeoneElsesCode {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter number Elements in Array");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("enter Elements ");
        for(int i=0; i<n; i++) {
            arr[i]=s.nextInt();
        }
        int [] odd = filterOdd(arr);
        try {
            for(int i=0; i<n; i++) {
                System.out.println("Odd" + odd[i]);
            }
        } catch(ArrayIndexOutOfBoundsException e) {}
        int [] even = filterEven(arr);
        try {
            for(int i=0; i<n; i++) {
                System.out.println("Even" + even[i]);
            }
        } catch(ArrayIndexOutOfBoundsException e) {}
    }
    public static int[] filterOdd(int[] a) {
        int l = 0;
        int j = 0;
        for(int i=0; i<a.length; i++) {
            if(a[i]%2==1) {
                l++;
            }
        }
        int k[]=new int[l];
        for(int i=0; i<a.length; i++) {
            if(a[i]%2==1) {
                k[j] = a[i];
                j++;
            }
        }
        return k;
    }
    public static int[] filterEven(int[] a) {
        int l = 0;
        int j = 0;
        for(int i=0; i<a.length; i++) {
            if(a[i]%2==0) {
                l++;
            }
        }
        int k[] = new int[l];
        for(int i=0; i<a.length; i++) {
            if(a[i]%2==0) {
                k[j] = a[i];
                j++;
            }
        }
        return k;
    }
}