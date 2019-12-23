import java.io.*;
import java.util.*;
public class prgm5 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n,i;
		System.out.println("Enter size of array:");
		n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter elements in the array");
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
			}
		Arrays.sort(a);
		System.out.println("Largest 2 value are:"+a[n-1]+","+a[n-2]);
		System.out.println("smallest 2 value are:"+a[0]+","+a[1]);
	}
}
