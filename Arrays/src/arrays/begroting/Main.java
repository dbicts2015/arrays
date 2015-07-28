package arrays.begroting;


public class Main {

	public static void main(String[] args) {
		Begroting begroting = new Begroting(2, 3);
		begroting.voegUitgaveToe(5000);
		begroting.voegUitgaveToe(6000);
		begroting.voegInkomstToe(4000);
		begroting.voegUitgaveToe(7000);
		begroting.voegInkomstToe(3000);
		System.out.print(begroting.presenteerBegroting());
	}

}