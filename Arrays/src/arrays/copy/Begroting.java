package arrays.copy;

import java.math.BigDecimal;

public class Begroting {
	// obp07: Schrijf een klasse Begroting. In de constructor geef je mee
	// hoeveel inkomsten en hoeveel uitgaven je wil registreren. Voorzie een
	// methode om een inkomst toe te voegen en een methode om een uitgave toe te
	// voegen. De methode presenteerBegroting moet een string teruggeven met een
	// lijst van alle uitgaven, gevolgd door alle inkomsten. Wanneer de uitgaven
	// groter zijn dan de inkomsten, moet er een extra inkomst worden getoond
	// die de begroting in evenwicht brengt.
	private BigDecimal[] inkomsten,uitgaven;
	private int indexUitgaven,indexInkomsten;

	public Begroting(int aantalInkomsten,int aantalUitgaven) {
		inkomsten= new BigDecimal[aantalInkomsten];
		uitgaven= new BigDecimal[aantalUitgaven];
	}
	
	public void voegUitgaveToe(double bedrag){
		if (indexUitgaven>=0 ||indexUitgaven<uitgaven.length)
			uitgaven[indexUitgaven++]=new BigDecimal(bedrag);
	}
	
	public void voegInkomstToe(double bedrag){
		if (indexInkomsten>=0 ||indexInkomsten<inkomsten.length)
			inkomsten[indexInkomsten++]=new BigDecimal(bedrag);
	}
	
	private BigDecimal getSomUitgaven(){
		BigDecimal som= new BigDecimal(0);
		for (BigDecimal uitgave : uitgaven) {
			som= som.add(uitgave);
		}
		return som;
	}
	
	public String getUitgaven(){
		String uitgaven="Uitgaven:\n";
		for (BigDecimal uitgave : this.uitgaven) {
			uitgaven+=uitgave.toString()+"\n";
		}
		return uitgaven;
	}
	
	public String getInkomsten(){
		String inkomsten="Inkomsten:\n";
		for (BigDecimal inkomst : this.inkomsten) {
			inkomsten+=inkomst.toString()+"\n";
		}
		return inkomsten;
	}	
	
	private BigDecimal getSomInkomsten(){
		BigDecimal som= new BigDecimal(0);
		for (BigDecimal inkomst : inkomsten) {
			som= som.add(inkomst);
		}
		return som;
	}
		
	private boolean isInEvenwicht(){
	return (getSomInkomsten()==(getSomUitgaven()) ? true : false);	
	}
	
	public String presenteerBegroting(){
		return String.format("%s%s%s%n%s", getUitgaven(),getInkomsten(),
				(getSomUitgaven()==(getSomInkomsten())?"Extra "+getSomUitgaven().subtract(getSomInkomsten()):""),
				(isInEvenwicht()?"De begroting is in evenwicht":"De begroting is in evenwicht gebracht door een extra inkomst.\nIndien dit negatief is, is er een begrotingsoverschot."));
	}
	
	
}
