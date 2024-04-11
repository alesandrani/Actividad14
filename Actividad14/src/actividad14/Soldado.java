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

    //Crear los métodos “get” y “set” de los atributos cuando se vayan
	//a hacer las pruebas y la documentación. Aquí no se han creado porque no
	//aportan nada
	
	/**
	 * Metodo que devulve si el Soldado puede disparar o no
	 * evaluando el atributo numeroBalas 
	 * @return <b>true</b> Si el atributo numeroBalas es mayor a 0 y
	 * <b>false</b> si no es mayor a 0.
	 */
	public boolean puedeDisparar(){
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
