package Ex1;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
	/* System.out.println("hi nada");
	 System.out.println("safsaf");
	 
	 int nb=3;
	 System.out.println("nb="+nb);
	 int a= nb+12;
	 System.out.println("a="+nb+"+12="+a);
	 
	 int x;
	 Scanner s = new Scanner(System.in);
	 x = s.nextInt();
	 System.out.println("x="+x);*/
	 

		Nombre  a = new Nombre(1) ;
		System.out.println("la valeur de a est : "+a.x);
		
		carre b = new carre (5);
		/*int ab = b.getN();
		System.out.println("le carre de b est : "+ab);*/
		b.affiche();

		
 
	}

}
