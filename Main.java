package pack;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k= sc.nextInt();
		System.out.println(slo(n,k,0));
	
	}
		public static int fact(int n) {
			if(n==1) return 1;
			else {
				return n*fact(n-1);
		}
	}
		public static int fib(int n) {
			if(n==0) return 0;
			else if(n==1) return 1;
			else return fib(n-1)+fib(n-2);
		}
		public static int slo(int n, int k,int s) {
			if (n==0 || k==0) return 0;
			if(k==1) return 1;
			else return s+slo(n,k-1,s);
		}
}
