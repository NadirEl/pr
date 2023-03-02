import java.util.Scanner;

public class Examen {
private int  día;
private int mes;
private int año;
private int  hora;
private int minuto;
	public int CambiarDatos(Scanner sc, String asignatura, String aula, int fecha, int hora, int año2, int hora2, int minuto2) {
		// TODO Auto-generated method stub
		int correct = 0;
		System.out.println("Introduce lo que deseas cambiar ");
		String cambiar = sc.nextLine();
		if (cambiar.equals(asignatura)) {
			System.out.println("Introduce la nueva asignatura ");
			String asi = sc.nextLine();
			asignatura = asi;
		} else if (cambiar.equals(aula)) {
			System.out.println("Introduce la nueva aula ");
			String au = sc.nextLine();
			aula = au;
		} else if (cambiar.equals(fecha)) {
			System.out.println("Introduce la nueva fecha ");
			int fechanueva = sc.nextInt();
			fecha = fechanueva;
		} else if (cambiar.equals(hora)) {
			System.out.println("Introduce la nueva hora ");
			int horanueva = sc.nextInt();
			fecha = horanueva;
		}

		return correct;
	}

	@Override
	public String toString() {
		return "Examen [día=" + día + ", mes=" + mes + ", año=" + año + ", hora=" + hora + ", minuto=" + minuto + "]";
	}

	public int Devolver(Scanner sc, String asignatura, String aula, int fecha, int hora, int año,  int minuto) {
		// TODO Auto-generated method stub
		int correct = 0;

		return correct;
	}

	public int getDía() {
		return día;
	}

	public void setDía(int día) {
		this.día = día;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

}
