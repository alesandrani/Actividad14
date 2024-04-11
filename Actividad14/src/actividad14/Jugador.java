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

//Crear los métodos “get” y “set” de los atributos cuando se vayan 
//a hacer las pruebas y la documentación. Aquí no se han creado 
//porque no aportan nada
	
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
