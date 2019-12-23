import java.io.*;
import java.util.*;
public class prgm7 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n,i,j;
		System.out.println("Enter size of array:");
		n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter elements in the array");
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
			}
		for(i=0;i<n;i++) {5
			for(j=i+1;j<n;j++) {
				if(a[i]==a[j]) {
					a[j]=0;
				}
			}
		}
		for(i=0;i<n;i++) {
			if(a[i]>0) {
			System.out.println(a[i]);
			}
		}
	}
}
		
