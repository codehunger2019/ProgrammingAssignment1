package basic;

public class SpecialTwoDigitNum1 {
	public static void main(String[] args) {
		int x=59;
		int d1=x/10;
		System.out.println(d1);
		
		int d2=x%10;
		System.out.println(d2);
		
		int sum=d1+d2+d1*d2;
		
		if(sum==x)
			System.out.println(x+" is special two digit number");
		else
			System.out.println(x+" is not special two digit number");
	}

}
