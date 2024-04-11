package actividad14;
/**
 * Clase que incluye dos métodos con los que conoceremos el dorsal del <b>Jugador</b>
 *  mediante el método <b>"ponerDorsal"</b>y esi está o no expulsado mediante el método <b>"estaExpulsado"</b>
 *  @author Felix de Pablo
 *  @version 1.0
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

//Crear los métodos “get” y “set” de los atributos cuando se vayan a hacer las pruebas y la documentación. Aquí no se han creado porque no aportan nada
	/**
	 * Este método nos ayudará a conocer el dorsal pasado por parámetros del <b>Jugador</b>
	 * El número deberá comprender entre el 1 y el 30.
	 * @param <b>dorsal</b> el número pasado por parámetro que llevará el jugador a la espalda. 
	 */
	public void ponerDorsal(int dorsal) {

		if (dorsal >= 1 && dorsal <= 30) {
			this.dorsal = dorsal;
		} else {
			this.dorsal = -1;
		}
	}
	/**
	 * Este método nos permite saber si el jugador está o no expulsado.
	 * Si el jugador tiene un número de tarjetas amarillas  <b>("numeroTarjetasAmarillas")</b>igual a 2 estará expulsado.
	 * Si el jugador tiene un número de tarjetas rojas <b>("numeroTarjetasRojas")</b> igual a 1
	 * el jugador también estará expulsado.
	 * @return <b>true</b> si el jugador está expulsado. <b>false</b> si el jugador no está expulsado.
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
