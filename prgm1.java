import java.io.*;
import java.util.*;
public class prgm1 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n,i,sum=0,avg=0;
		System.out.println("Enter size of array:");
		n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter elements in the array");
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
			}
		for(i=0;i<n;i++) {
			sum+=a[i];
			avg=sum/n;
		}
		System.out.println("sum:"+sum);
		System.out.println("avg:"+avg);
	}
	 
	}
