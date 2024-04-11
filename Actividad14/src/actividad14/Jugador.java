package actividad14;
/**
<<<<<<< HEAD
 * Clase que incluye dos métodos con los que conoceremos el dorsal del <b>Jugador</b>
 *  mediante el método <b>"ponerDorsal"</b>y esi está o no expulsado mediante el método <b>"estaExpulsado"</b>
 *  @author Felix de Pablo
 *  @version 1.0
=======
 * El obejetivo de esta clase es proporcionar lo que va a tener cada jugador
 * Tendra diferentes metodos para ver las tarjetas rojas y amarillas y dorsal
>>>>>>> 977dadbbef5b3607214a34a03eba1a896dfbb0c5
 */
public class Jugador {
	/**
	 * Esta propiedad representa el número que llevará el jugador en la camiseta.
	 */
	private int dorsal;
	/**
	 * Esta propiedad representa el número de tarjetas amarillas que posee el <b>Jugador</b>
	 */
	private int numeroTarjetasAmarillas;
	/**
	 * Esta propiedad representa el número de tarjetas rojas que posee un <b>Jugador</b>
	 */
	private int numeroTarjetasRojas;

<<<<<<< HEAD
//Crear los métodos “get” y “set” de los atributos cuando se vayan a hacer las pruebas y la documentación. Aquí no se han creado porque no aportan nada
	/**
	 * Este método nos ayudará a conocer el dorsal pasado por parámetros del <b>Jugador</b>
	 * El número deberá comprender entre el 1 y el 30.
	 * @param <b>dorsal</b> el número pasado por parámetro que llevará el jugador a la espalda. 
=======
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
>>>>>>> 977dadbbef5b3607214a34a03eba1a896dfbb0c5
	 */
	public void ponerDorsal(int dorsal) {

		if (dorsal >= 1 && dorsal <= 30) {
			this.dorsal = dorsal;
		} else {
			this.dorsal = -1;
		}
	}
<<<<<<< HEAD
	/**
	 * Este método nos permite saber si el jugador está o no expulsado.
	 * Si el jugador tiene un número de tarjetas amarillas  <b>("numeroTarjetasAmarillas")</b>igual a 2 estará expulsado.
	 * Si el jugador tiene un número de tarjetas rojas <b>("numeroTarjetasRojas")</b> igual a 1
	 * el jugador también estará expulsado.
	 * @return <b>true</b> si el jugador está expulsado. <b>false</b> si el jugador no está expulsado.
	 */
=======
/**
 * Este metodo nos devulve si un jugador va a ser expulsado. Cuando el jugador llega a 2 tarjetas amarillas sera expulsado al igual
 * que si tiene una tarjeta roja sera expulsado tambien.
 * @return true - expulsado; false - sigue jugando
 */
>>>>>>> 977dadbbef5b3607214a34a03eba1a896dfbb0c5
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
