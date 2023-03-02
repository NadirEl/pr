
public class Fecha {
	private int  día;
	private int mes;
	private int año;
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	public int getDía() {
		return día;
	}
	public void setDía(int día) {
		this.día = día;
	}
	@Override
	public String toString() {
		return "Fecha [día=" + día + ", mes=" + mes + ", año=" + año + "]";
	}
	
}

