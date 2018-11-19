package programs;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int checknumber = 47;
		System.out.print("Is " + checknumber +" a Prime Number ? ");
		System.out.println(isPrime(checknumber)?"Yes!":"No.");


	}
	
	static boolean isPrime(int number) {
		int m = number/2;
		int i;
		for (i=2;i<=m;i++) {
			if (number/i==0) break;
		}
		if (i>m) return true;
		return false;			
	}

}
