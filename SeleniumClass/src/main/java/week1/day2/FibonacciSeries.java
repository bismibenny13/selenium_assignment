package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8;
		int f=0;
		int s=1;
		System.out.println("Fibonacci Sereries");
		for (int i=1;i<=n;i++) {
			int sum=f+s;
			f=s;
			s=sum;
		System.out.println(f);	
		}

	}

}
