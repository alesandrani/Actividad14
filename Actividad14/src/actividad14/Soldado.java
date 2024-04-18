package actividad14;
/**
 * Clase que contine el objeto soldado, tiene como objetivo 
 * atacar a otros soldados.
 * Contiene los siguientes atributos:
 * <br>
 * <ul>
 * <li> estaMuerto </li>
 * <li> numeroBalas </li>
 * </ul>
 * <br>
 * Tambien posee los siguientes metodos {@link #puedeDisparar)},
 * {@link #disparar(Soldado)}
 * @author Yina.
 */

public class Soldado {
	/**
	 * Esta propiedad nos indica si el <b>Soldado</b> está muerto o no.
	 */
	private boolean estaMuerto;
	/**
	 * Este atributo representa el número de balas que tiene
	 * un soldado
	 */
	private int numeroBalas;




@Override
	public String toString() {
		return "Soldado [estaMuerto=" + estaMuerto + ", numeroBalas=" + numeroBalas + "]";
	}

public boolean isEstaMuerto() {
		return estaMuerto;
	}

	public void setEstaMuerto(boolean estaMuerto) {
		this.estaMuerto = estaMuerto;
	}

	public int getNumeroBalas() {
		return numeroBalas;
	}

	public void setNumeroBalas(int numeroBalas) {
		this.numeroBalas = numeroBalas;
	}

/**
 * Este método nos indica si el <b>Soldado</b> puede o no disparar, en función del número de balas que se hayan
 * pasado por parámetro.
 * Si el número de balas es mayor que 0, entonces <b>sí</b> podrá disparar.
 * En caso de que sea igual a 0 <b>no</b> podrá disparar.
 * @return<b>true</b> si le quedan balas y puede disparar o <b>false</b> si no le quedan balas 
 * no puede disparar.
*/

	public boolean puedeDisparar() {

		if (this.numeroBalas > 0) {
			return true;
		}
		return false;

	}

	/**
	 * Metodo mediante el cual se mata a un Soldado pasado por
	 * parametro. Se le restara una bala al soldado desde el 
	 * cual se llama el metodo y se igualará el atributo
	 * estaMuerto del soldado pasado por parametro a 'true'
	 * @param sol representa el soldado que morirá.
	 */

	public void disparar(Soldado sol) {
		this.numeroBalas--;
		sol.estaMuerto = true;
	}
}

