package actividad14;
<<<<<<< HEAD
/**
<<<<<<< HEAD
 * Clase que incluye dos métodos con los que conoceremos el dorsal del <b>Jugador</b>
 *  mediante el método <b>"ponerDorsal"</b>y esi está o no expulsado mediante el método <b>"estaExpulsado"</b>
 *  @author Felix de Pablo
 *  @version 1.0
=======
=======

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
>>>>>>> ce10405fbbc1a92d5c261bf47f05bb1e10d21813
 * El obejetivo de esta clase es proporcionar lo que va a tener cada jugador
 * Tendra diferentes metodos para ver las tarjetas rojas y amarillas y dorsal
>>>>>>> 977dadbbef5b3607214a34a03eba1a896dfbb0c5
 */
public class Jugador {
	/**
<<<<<<< HEAD
	 * Esta propiedad representa el número que llevará el jugador en la camiseta.
	 */
	private int dorsal;
	/**
	 * Esta propiedad representa el número de tarjetas amarillas que posee el <b>Jugador</b>
	 */
	private int numeroTarjetasAmarillas;
	/**
	 * Esta propiedad representa el número de tarjetas rojas que posee un <b>Jugador</b>
=======
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
>>>>>>> ce10405fbbc1a92d5c261bf47f05bb1e10d21813
	 */
	private int numeroTarjetasRojas;
	

<<<<<<< HEAD
<<<<<<< HEAD
//Crear los métodos “get” y “set” de los atributos cuando se vayan a hacer las pruebas y la documentación. Aquí no se han creado porque no aportan nada
	/**
	 * Este método nos ayudará a conocer el dorsal pasado por parámetros del <b>Jugador</b>
	 * El número deberá comprender entre el 1 y el 30.
	 * @param <b>dorsal</b> el número pasado por parámetro que llevará el jugador a la espalda. 
=======
=======
>>>>>>> ce10405fbbc1a92d5c261bf47f05bb1e10d21813
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

<<<<<<< HEAD
	//Crear los métodos “get” y “set” de los atributos cuando se vayan a hacer las pruebas y la documentación.
	//Aquí no se han creado porque no aportan nada
	
	/**
	 * Este metodo es una restriccion para cuando se crea un metodo para asignar el numero de camiseta a cada jugador.
	 * Los numeros tienen que estar en el rango de <b>(1-30 incluidos)<b>. Si sale del rango  dara error.
	 * @param dorsal el numero que se le asignara al jugador
>>>>>>> 977dadbbef5b3607214a34a03eba1a896dfbb0c5
=======
	
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

>>>>>>> ce10405fbbc1a92d5c261bf47f05bb1e10d21813
	 */
	public void ponerDorsal(int dorsal) {
		if (dorsal >= 1 && dorsal <= 30) {
			this.dorsal = dorsal;
		} else {
			this.dorsal = -1;
		}
	}
<<<<<<< HEAD
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
=======

>>>>>>> ce10405fbbc1a92d5c261bf47f05bb1e10d21813

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
