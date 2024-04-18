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
 * */

/**
 * esta clase nos mostarara la cantidad de balas que va tener el soldado para crear los metodos
 *  que nos ayudaran saber si un soldado vive o muere
 */

public class Soldado {
	/**
	 * Representa si el soldado esta o no Muerto
	 * Atributo de tipo boolean
	 */
	private boolean estaMuerto;
	/**
	 * Representa el numero de balas que tiene el soldado
	 * Atributo de tipo entero
	 */
	private int numeroBalas;

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

	// puedeDisparar() Documentacion Yina 
		/**
		 * Metodo que devulve si el Soldado puede disparar o no
		 * evaluando el atributo numeroBalas 
		 * @return <b>true</b> Si el atributo numeroBalas es mayor a 0 y
		 * <b>false</b> si no es mayor a 0.
		 */
	
	/**
	 * Este metodo nos devulve si podemos disparar o no. Si el numero de balas es superior a 0 podemos disparar 
	 * en caso contrario no
	 * @return true - dispara. false - no se puede disparar(no hay balas)
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

/**
 * Este metodo evalua cuando muere un soldado.
 * invocando este metodo se comieza la lucha el soldado que se quede primero sin balas muere.
 * @param sol objeto soldado
 */

	public void disparar(Soldado sol) {
		this.numeroBalas--;
		sol.estaMuerto = true;
	}
}
