package arrays.copy;

public class BegrotingMain {

	public static void main(String[] args) {
		Begroting begroting = new Begroting(2, 3);
		begroting.voegUitgaveToe(5000);
		begroting.voegUitgaveToe(6000);
		begroting.voegInkomstToe(4000);
		begroting.voegUitgaveToe(7000);
		begroting.voegInkomstToe(3000);
		System.out.print(begroting.presenteerBegroting());

		// De output van deze main-methode is: 
		//Uitgaven:
		//-5000
		//-6000
		//-7000
		// Inkomsten:
		//4000
		//3000
		//11000
		//De begroting is in evenwicht.
	}

}
