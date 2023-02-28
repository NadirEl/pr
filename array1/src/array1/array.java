package array1;

import java.util.Scanner;

public class array {
	public static void main(String[] args) {
		metodearray fc = new metodearray();
		Scanner sc = new Scanner(System.in);
	 
		int [ ] notealums= null;
		notealums= new int[20];
		
		for (int i=0;i<notealums.length;i++){
			 System.out.println("Edad "+i+": "+notealums[i]);
			 int edad=sc.nextInt();
			}
			fc.calcularMedia(notealums);
			fc.imprimirEdad(notealums);
	
		
			
		sc.close();
	}
}
