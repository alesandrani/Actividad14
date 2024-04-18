package actividad14;


/**
 * Esta clase incluye dos métodos que darán funcionalidad al <b>Soldado</b>.
 * El primer método nos dirá si al soldado le quedan balas o no.
 * Con el segundo método el soldado disparará si le quedan balas.
 * @author Felix de Pablo
 * @version 1.0

/** esta clase nos mostarara la cantidad de balas que va tener el soldado para crear los metodos
 *  que nos ayudaran saber si un soldado vive o muere
 */
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
	/**
	 * Representa si el soldado esta o no Muerto
	 * Atributo de tipo boolean
	 */
	private boolean estaMuerto;
	/**
	 * Esta propiedad nos indica el número de balas pasadas por parámetro.
	 */
	/**
	 * Representa el numero de balas que tiene el soldado
	 * Atributo de tipo entero
	 */
	/**
	 * Este atributo representa el número de balas que tiene
	 * un soldado
	 */


	private int numeroBalas;


	//Crear los métodos “get” y “set” de los atributos cuando se vayan a hacer las pruebas y la documentación.
	//Aquí no se han creado porque no aportan nada


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
	 * Este metodo nos devulve si podemos disparar o no. Si el numero de balas es superior a 0 podemos disparar 
	 * en caso contrario no
	 * @return true - dispara. false - no se puede disparar(no hay balas)
	 */
	/**
	 * Este método nos indica si el <b>Soldado</b> puede o no disparar, en función del número de balas que se hayan
	 * pasado por parámetro.
	 * Si el número de balas es mayor que 0, entonces <b>sí</b> podrá disparar.
	 * En caso de que sea igual a 0 <b>no</b> podrá disparar.
	 * @return<b>true</b> si le quedan balas y puede disparar o <b>false</b> si no le quedan balas 
	 * no puede disparar.
	*/
	/**
	 * Metodo que devulve si el Soldado puede disparar o no
	 * evaluando el atributo numeroBalas 
	 * @return <b>true</b> Si el atributo numeroBalas es mayor a 0 y
	 * <b>false</b> si no es mayor a 0.
	 */
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

