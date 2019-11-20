package methodlibrary;

import java.util.Scanner;

public class Inlämning {

	public static void main(String[] args) {
		Fahrenheit();
		Kel();
		Kmtimme();
		MoH();
		MassHeight();
		TreTal();
		Papa();
		betyg();
		SochH();
		KochS();
		vel();
		vol();
		sidor();
		diameter();
	}

	/**
	 * tar in fahrenheit och skickar det till FtoK
	 */
	public static void Fahrenheit() {
		Scanner input = new Scanner(System.in);
		System.out.println("skriv Fherenheit");
		double F = input.nextDouble();
		System.out.println(FtoK(F));
	}

	/**
	 * Räknar ut vad tex 1 fahrenheit är i Kelvin
	 * 
	 * @param F
	 * @return
	 */
	public static double FtoK(double F) {
		double kelvin = (F - 32) / 1.8 + 273.15;
		return kelvin;

	}

	/**
	 * Tar in Kelvin och skickar till KtoC
	 */
	public static void Kel() {
		Scanner input = new Scanner(System.in);
		System.out.println("skriv Kelvin");
		double K = input.nextDouble();
		System.out.println(KtoC(K));
	}

	/**
	 * tar emot kelvin och räknar ut vad det är i celsius
	 * 
	 * @param K
	 * @return
	 */
	public static double KtoC(double K) {
		Scanner input = new Scanner(System.in);
		double celsius = K - 273.15;
		return celsius;

	}

	/**
	 * tar in en double km och skicar den till KmToMs
	 */
	public static void Kmtimme() {
		Scanner input = new Scanner(System.in);
		double Km = input.nextDouble();
		System.out.println(KmToMs(Km));

	}

	/**
	 * Tar emot Km och räknar ut Ms
	 * 
	 * @param Km
	 * @return
	 */
	public static double KmToMs(double Km) {
		double Ms = Km / 3.6;

		return Ms;
	}

	/**
	 * tar in två doubles massa och hastighet och skickar till KEnergy
	 */
	public static void MoH() {
		Scanner input = new Scanner(System.in);
		System.out.println("skriv massa");
		double massa = input.nextDouble();
		System.out.println("skriv hastighet");
		double hastighet = input.nextDouble();
		System.out.println(KEnergy(massa, hastighet));
	}

	/**
	 * tar emot två doubles Räknar ut Kinetisk energi och skickar tillbacka
	 * 
	 * @param massa
	 * @param hastighet
	 * @return
	 */
	public static double KEnergy(double massa, double hastighet) {
		double Kenergy = Math.pow(hastighet, 2) * massa / 2;
		return Kenergy;
	}

	/**
	 * tar in två doubles och skickar dem till Penergy
	 */
	public static void MassHeight() {
		Scanner input = new Scanner(System.in);
		System.out.println("skriv massa");
		double massa = input.nextDouble();
		System.out.println("skriv höjd");
		double Height = input.nextDouble();
		System.out.println(Penergy(massa, Height));
	}

	/**
	 * tar emot double massa och height och räknar ut potentiell energi och skickar
	 * tillbaka
	 * 
	 * @param massa
	 * @param Height
	 * @return
	 */
	public static double Penergy(double massa, double Height) {
		double Pe = massa * Height * 9.82;
		return Pe;
	}

	public static void TreTal() {
		Scanner input = new Scanner(System.in);
		double tal1 = input.nextDouble();
		double tal2 = input.nextDouble();
		double tal3 = input.nextDouble();
		System.out.println(medel(tal1, tal2, tal3));
	}

	public static double medel(double tal1, double tal2, double tal3) {
		double svar = (tal1 + tal2 + tal3) / 3;
		return svar;
	}

	public static void Papa() {
		String Papa = "PaParaZZi";
		System.out.println(paparazzi(Papa));
	}

	public static String paparazzi(String Papa) {
		String Paparazzi = Papa;
		System.out.println(Paparazzi.toLowerCase());
		return Paparazzi;
	}

	public static void betyg() {
		String Betyg = "jag vill bli godkänd i programmering! <3";

	}

	public static void Betyg(String Betyg) {
		System.out.println(Betyg.replace("o", "0").toUpperCase());
	}

	public static void SochH() {
		Scanner input = new Scanner(System.in);
		double S = input.nextDouble();
		double H = input.nextDouble();
		System.out.println(Tid(S, H));
	}

	public static double Tid(double S, double H) {
		double Tid = S / H;
		return Tid;
	}

	public static void KochS() {
		Scanner input = new Scanner(System.in);
		System.out.println("skriv Kraft");
		double K = input.nextDouble();
		System.out.println("skriv Sträcka");
		double S = input.nextDouble();
		System.out.println(Arbete(K, S) + " Watt");
	}

	public static double Arbete(double K, double S) {
		double Arbete = K * S;
		return Arbete;
	}

	public static void vel() {
		Scanner input = new Scanner(System.in);
		double velocity = input.nextDouble();
		System.out.println(VelToHigh(velocity));
	}

	public static double VelToHigh(double velocity) {
		double high = Math.pow(velocity, 2) / (2 * 9.82);
		return high;
	}

	public static void vol() {
		Scanner input = new Scanner(System.in);
		double vol = input.nextDouble();
		System.out.println(radie(vol));
	}

	public static double radie(double vol) {
		double radie = Math.cbrt((3 * vol) / (4 * 3.14));
		return radie;
	}

	/**
	 * Tar in två double för 2 av sidorna och skickar till area
	 */
	public static void sidor() {
		Scanner input = new Scanner(System.in);
		double sida1 = input.nextDouble();
		double sida2 = input.nextDouble();

	}

	/**
	 * räknar ut arean
	 * 
	 * @param sida1
	 * @param sida2
	 */
	public static void area(double sida1, double sida2) {
		double area = sida1 * sida2;
		System.out.println(area);
	}

	/**
	 * tar in double diameter och skickar till cirkelomkrets
	 */
	public static void diameter() {
		Scanner input = new Scanner(System.in);
		System.out.println("skriv diameter");
		double diameter = input.nextDouble();
		System.out.println(cirkelomkrets(diameter) + " cm");
	}

	/**
	 * tar emot en double diameter och räknar ut omkrets och skickar tillbaka
	 * 
	 * @param diameter
	 * @return
	 */
	public static double cirkelomkrets(double diameter) {
		double Omkrets = diameter * Math.PI;
		return Omkrets;
	}
}