package week1.day2;

public class ConvertNegativeToPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int neg=-55;
		if(neg<0) {
			System.out.println("The given number " +neg +" is negative");
			int pos=neg*-1;
			System.out.println("The converted positive number is " +pos);
		}

	}

}
