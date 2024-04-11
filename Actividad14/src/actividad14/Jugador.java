package actividad14;

/**
 * Clase que contine el objeto jugador, tiene como objetivo 
 * realizar un seguimiento de las diferentes estadisticas del
 * jugador. Contiene los siguientes atributos:
 * <br>
 * <ul>
 * <li> dorsal </li>
 * <li> numeroTarjetasAmarillas </li>
 * <li> numeroTarjetasRojas </li>
 * </ul>
 * <br>
 * Posee los siguientes metodos {@link #ponerDorsal(int)},
 * {@link #numeroTarjetasAmarillas} y {@link #numeroTarjetasRojas}
 * @author Yina.

/**
 * El obejetivo de esta clase es proporcionar lo que va a tener cada jugador
 * Tendra diferentes metodos para ver las tarjetas rojas y amarillas y dorsal
>>>>>>> 977dadbbef5b3607214a34a03eba1a896dfbb0c5
 */
public class Jugador {
	/**
	 * Representa el numero de la camiseta del jugador.
	 * Se limita su rango de valores con el metodo 
	 * {@link #ponerDorsal(int)}
	 * Atributo de tipo entero
	 */
	private int dorsal;
	/**
	 * Representa el numero de tarjetas amarillas sacadas al
	 * jugador.
	 * Atributo de tipo entero
	 */
	private int numeroTarjetasAmarillas;
	/**
	 * Representa el numero de tarjetas rojas sacadas al
	 * jugador.
	 * Atributo de tipo entero
	 */
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

	
	/**
	 * Metodo que condiciona el rango de valores que puede
	 * tener el dorsal del jugador, teniendo como parametro de 
	 * entrada un dorsal. 
	 * <br>
	 * La condicion que sigue es la siguiente: 
	 * - Si el dorsal es mayor o igual a 1 y menor o igual a 30: El
	 * atributo dorsal del jugador se igualara al dorsal pasado por 
	 * parametro
	 * - De no cumplirse la condicion anterior el atributo dorsal
	 * se igualara a "-1"
	 * 
	 * @param dorsal valor que se condicionara.
	 */
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
	 * Metodo que devulve si el jugador será o no expulsado, creando 
	 * una variable llamada <i>'expulsado'</i> e igualandola a 'false'. 
	 * <br>
	 * Las condiciones que rigen el metodo son:
	 * -En caso de que el jugador hubiese recibido dos tarjetas amarillas
	 * seria expulsado.
	 * -Si el jugador recibio directamente una tarjeta roja tambien va a 
	 * ser expulsado. 
	 * @return <b>true</b> si el jugador ha recibido dos tarjetas amarillas
	 * o una roja y <b>false</b> si no secedio ninguno de los casos anteriores.
	 */

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
