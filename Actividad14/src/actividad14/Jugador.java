package actividad14;
/**
 * El obejetivo de esta clase es proporcionar lo que va a tener cada jugador
 * Tendra diferentes metodos para ver las tarjetas rojas y amarillas y dorsal
 */
public class Jugador {
	private int dorsal;
	private int numeroTarjetasAmarillas;
	private int numeroTarjetasRojas;

public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public int getNumeroTarjetasAmarillas() {
		return numeroTarjetasAmarillas;
	}

	public void setNumeroTarjetasAmarillas(int numeroTarjetasAmarillas) {
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
	}

	public int getNumeroTarjetasRojas() {
		return numeroTarjetasRojas;
	}

	public void setNumeroTarjetasRojas(int numeroTarjetasRojas) {
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}

	//Crear los métodos “get” y “set” de los atributos cuando se vayan a hacer las pruebas y la documentación.
	//Aquí no se han creado porque no aportan nada
	
	/**
	 * Este metodo es una restriccion para cuando se crea un metodo para asignar el numero de camiseta a cada jugador.
	 * Los numeros tienen que estar en el rango de <b>(1-30 incluidos)<b>. Si sale del rango  dara error.
	 * @param dorsal el numero que se le asignara al jugador
	 */
	public void ponerDorsal(int dorsal) {

		if (dorsal >= 1 && dorsal <= 30) {
			this.dorsal = dorsal;
		} else {
			this.dorsal = -1;
		}
	}
/**
 * Este metodo nos devulve si un jugador va a ser expulsado. Cuando el jugador llega a 2 tarjetas amarillas sera expulsado al igual
 * que si tiene una tarjeta roja sera expulsado tambien.
 * @return true - expulsado; false - sigue jugando
 */
	public boolean estaExpulsado() {

		boolean expulsado = false;
		if (numeroTarjetasAmarillas == 2) {
			expulsado = true;
		}
		if (numeroTarjetasRojas == 1) {
			expulsado = true;
		}
		return expulsado;

	}

}
