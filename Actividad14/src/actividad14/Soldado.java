package actividad14;

/**
 * El objetivo de esta clase es <b>representar a un soldado</b> y saber
 * de este si esta muerto y su numero de balas
 * 
 * Esta clase tendra metodos tales como "puedeDisparar" y
 * "disparar
 * 
 * @author Avril
 */
public class Soldado {
	/**
	 * Este atributo representa si un soldado esta muerto o no
	 */
	private boolean estaMuerto;
	/**
	 * Este atributo representa el número de balas que tiene
	 * un soldado
	 */
	private int numeroBalas;

//Crear los métodos “get” y “set” de los atributos cuando se vayan a hacer las pruebas y la documentación. Aquí no se han creado porque no aportan nada
	
	/**
	 * Metodo que <b>devuelve</b> si un soldado puede disparar o no. Un soldado
	 * puede disparar  si su numero de balas es mayor a 0. En caso contrario
	 * no podra disparar.
	 * @return <b>true</b> si el soldado puede disparar o <b>false</b> si no puede disparar
	 */
	public boolean puedeDisparar() {
		if (this.numeroBalas > 0) {
			return true;
		}
		return false;

	}

	/**
	 * Metodo que <b>mata</b> a un soldado pasado por parametro. El
	 * número de balas disminuira y el atributo estaMuerto del
	 * soldado pasado por parametro sera igual a true
	 * @param sol soldado pasado por parametro
	 */
	public void disparar(Soldado sol) {
		this.numeroBalas--;
		sol.estaMuerto = true;

	}
}
