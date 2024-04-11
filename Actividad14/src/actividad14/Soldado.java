package actividad14;
/**
 * esta clase nos mostarara la cantidad de balas que va tener el soldado para crear los metodos
 *  que nos ayudaran saber si un soldado vive o muere
 */
public class Soldado {
	private boolean estaMuerto;
	private int numeroBalas;

public boolean isEstaMuerto() {
		return estaMuerto;
	}

	public void setEstaMuerto(boolean estaMuerto) {
		this.estaMuerto = estaMuerto;
	}

	public int getNumeroBalas() {
		return numeroBalas;
	}

	public void setNumeroBalas(int numeroBalas) {
		this.numeroBalas = numeroBalas;
	}

	//Crear los métodos “get” y “set” de los atributos cuando se vayan a hacer las pruebas y la documentación.
	//Aquí no se han creado porque no aportan nada
	
	/**
	 * Este metodo nos devulve si podemos disparar o no. Si el numero de balas es superior a 0 podemos disparar 
	 * en caso contrario no
	 * @return true - dispara. false - no se puede disparar(no hay balas)
	 */
	public boolean puedeDisparar() {
		if (this.numeroBalas > 0) {
			return true;
		}
		return false;

	}
/**
 * Este metodo evalua cuando muere un soldado.
 * invocando este metodo se comieza la lucha el soldado que se quede primero sin balas muere.
 * @param sol objeto soldado
 */
	public void disparar(Soldado sol) {
		this.numeroBalas--;
		sol.estaMuerto = true;

	}
}
