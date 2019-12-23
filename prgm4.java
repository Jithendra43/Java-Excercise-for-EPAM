import java.io.*;
import java.util.*;
public class prgm4 {
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
		for(i=0;i<n;i++) {
			System.out.println((char)a[i]);
		}
	}
}
