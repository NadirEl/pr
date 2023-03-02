import java.util.Scanner;



public class Examenpp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Examen fc= new Examen();
		System.out.println("Introduce un asignatura ");
		String asignatura=sc.nextLine();	
	
		System.out.println("Introduce un aula ");
		String aula=sc.nextLine();
		System.out.println("Introduce  dia ");
		int dia=sc.nextInt();
		fc.setDía(dia);
		System.out.println("Introduce mes ");
		int mes=sc.nextInt();
		fc.setMes(mes);
		System.out.println("Introduce año ");
		int año=sc.nextInt();
		fc.setAño(año);
		System.out.println("Introduce hora " );
		int hora=sc.nextInt();
		fc.setHora(hora);
		System.out.println("Introduce minuto ");
		int minuto=sc.nextInt();
		fc.setMinuto(minuto);
		
		fc.CambiarDatos(sc,asignatura,aula,dia,mes,año,hora,minuto);

		fc.Devolver(sc,asignatura,aula,dia,mes,año,hora);
		fc.toString();
	}

}
