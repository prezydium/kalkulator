import java.io.File;
import java.io.FileNotFoundException;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.JFileChooser;

class Szczecinska3133 {

	static double mieszk;
	static double czwspol;
	static double grunt;
	static String wyniki = new String();
	
	public String getWyniki() {
		return wyniki;
	}

	public void setWyniki(String wyniki) {
		Szczecinska3133.wyniki = wyniki;
	}

	public double getMieszk() {
		return mieszk;
	}

	public void setMieszk(double mieszk) {
		Szczecinska3133.mieszk = mieszk;
	}

	public double getCzwspol() {
		return czwspol;
	}

	public void setCzwspol(double czwspol) {
		Szczecinska3133.czwspol = czwspol;
	}

	public double getGrunt() {
		return grunt;
	}

	public void setGrunt(double grunt) {
		Szczecinska3133.grunt = grunt;
	}

	static Szczecinska3133 szcz1 = new Szczecinska3133();

	public static void skan() {
		JFileChooser fc = new JFileChooser();
		
	 fc.showOpenDialog(fc);

		File textFile = fc.getSelectedFile();
				

		Scanner in = null;
		try {
			in = new Scanner(textFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Brak Pliku");
		}

		StringBuilder sb = new StringBuilder();

		while (in.hasNextLine()) {
			String line = in.nextLine();
			sb.append(line);

		}

		System.out.println(sb);
		in.close();
		int x = sb.indexOf("890896");
		

		System.out.println(x);
		String licznik = sb.substring(x - 5, x - 1);
		
		
		double y = Integer.parseInt(licznik);
		System.out.println(y);

		szcz1.setMieszk(y / 100);
		szcz1.setCzwspol((y * 6273) / 890896);
		szcz1.setGrunt((y * 6587) / 890896);

		System.out.println("Powierzchnia mieszkania: " + mieszk);
		System.out.println("Powierzchnia cz. wspol: " + czwspol);
		System.out.println("Powierzchnia gruntu: " + grunt);
		
		DecimalFormat dc =new DecimalFormat("###.##");
		dc.setRoundingMode(RoundingMode.HALF_UP);
		
		wyniki = ("Powierzchnia mieszkania wynosi: " + dc.format(Szczecinska3133.mieszk) + 
				"\nPowierzchnia czêœci wspólnych wynosi: " + dc.format(Szczecinska3133.czwspol) +
				"\nPowierzchnia gruntu z udzia³em w drodze wynosi: " + dc.format(Szczecinska3133.grunt + 3.14));
		}

		
	

}
