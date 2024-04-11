package actividad14;
/**
 * Esta clase incluye dos métodos que darán funcionalidad al <b>Soldado</b>.
 * El primer método nos dirá si al soldado le quedan balas o no.
 * Con el segundo método el soldado disparará si le quedan balas.
 * @author Felix de Pablo
 * @version 1.0
 */
public class Soldado {
	/**
	 * Esta propiedad nos indica si el <b>Soldado</b> está muerto o no.
	 */
	private boolean estaMuerto;
	/**
	 * Esta propiedad nos indica el número de balas pasadas por parámetro.
	 */
	private int numeroBalas;

//Crear los métodos “get” y “set” de los atributos cuando se vayan a hacer las pruebas y la documentación. Aquí no se han creado porque no aportan nada
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
	 * Este método sirve para que el soldado dispare. Cuando el soldado dispara, gasta balas,
	 * por lo tanto se le resta una bala al número de balas que le habíamos pasado por parámetro.
	 * Además al objeto sol pasado por parámetro que reciba el disparo morirá.
	 * @param <b>sol</b> el objeto sol pasado por parámetro al que queremos disparar.
	 */
	public void disparar(Soldado sol) {
		this.numeroBalas--;
		sol.estaMuerto = true;

	}
}
