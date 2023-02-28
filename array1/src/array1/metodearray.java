package array1;

public class metodearray {
	public boolean leerEdad(int notealums) {
		boolean correcto = true;
		try {

			if (notealums > 18 || notealums < 35) {
				correcto = false;
			}
		} catch (Exception e) {
			correcto = false;
		}
		return correcto;
	}

	public double calcularMedia(int[] notealums) {
		// TODO Auto-generated method stub

		double media = notealums[20] / 20;
		return media;

	}

	public void imprimirEdad(int[] notealums) {
		// TODO Auto-generated method stub
		double resulta = calcularMedia(notealums);
		System.out.println("Edad "+ notealums[20]);
		System.out.println("Edad " + resulta);
	}
}