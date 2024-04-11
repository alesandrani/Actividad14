package actividad14;


/**
 * El objetivo de esta clase es <b>representar un jugador</b>
 * 
 * Tendra <b>metodos</b> que nos permitira saber cosas del jugador
 * como el número de camiseta con el metodo <b>"ponerDorsal"</b> y
 * saber si esta expulsado co el metodo <b>"estaExpulsado"</b>.
 * 
 * @author Avril
 */
public class Jugador {
	/**
	 * "dorsal" representa el número de la camiseta del jugador.
	 * Este es utilizado para crear parte del metodo "ponerDorsal"
	 */
	private int dorsal;
	/**
	 * "numeroTarjetasAmarillas" representa el número de taretas 
	 * amarillas asignadas al jugador.
	 * Se utiliza este atributo en el metodo "estaExpulsado"
	 */
	private int numeroTarjetasAmarillas;
	/**
	 * "numeroTarjetasROjas" representa el número de taretas 
	 * rojas asignadas al jugador.
	 * Se utiliza este atributo en el metodo "estaExpulsado"
	 */
	private int numeroTarjetasRojas;


//Crear los métodos “get” y “set” de los atributos cuando se vayan a hacer las pruebas y la documentación. Aquí no se han creado porque no aportan nada
	
	/**
	 * Metodo que <b>coloca</b> el número de dorsal pasado por parametro
	 * al atributo "dorsal". La condicion es que si el número del 
	 * dorsal pasado por parametro es mayor o igual a 1 y 
	 * menor o igual a 30 se le asignara dicho número al atributo 
	 * "dorsal". En caso contrario el atributo "dorsal" se igualara 
	 * a "-1"
	 * @param dorsal Número de camiseta del jugador pasador por parametro
	 */
	public void ponerDorsal(int dorsal) {

		if (dorsal >= 1 && dorsal <= 30) {
			this.dorsal = dorsal;
		} else {
			this.dorsal = -1;
		}
	}


	/**
	 * Metodo que <b>devuelve</b> si un jugador a sido expulsado o no. En primer lugar
	 * se crea la variable expulsado y se iguala a "false". <b>La condicion</b> es que
	 * si el atributo "numeroTarjetasAmarillas" es igual a 2 el jugador estara
	 * expulsado. Ademas si el atributo "numeroTarjetasRojas" es igual a 1 tambien
	 * sera expulsado. En caso que <b>no</b> se cumpla la condicion anterior devolvera
	 * que no esta expulsado
	 *  
	 * @return true si el jugador esta expulsado o false si no estaexpulsado
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
