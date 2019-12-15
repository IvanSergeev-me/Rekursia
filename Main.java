  
import java.util.Scanner;

public class Recursion {
	static long exponentN(long a,long n) {
		if (n>0) a = a*(exponentN(a,n-1));
		else if(n==0) {
			
			return 1;
		}
		return a;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите a: ");
		long a = sc.nextLong();
		System.out.println("Введите n: ");
		long n = sc.nextLong();
		System.out.println(exponentN(a,n));
		sc.close();
	}


	public static long gcd(long x,long y) {
		if (y>x) {
			long p;
			p=x;
			x=y;
			y=p;
			
		}
		if (x==1|y==1) return 1;
		else if  (y==0) return x;
		else{ return gcd(y,x%y);
	}
}
}
