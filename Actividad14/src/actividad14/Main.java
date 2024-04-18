package actividad14;

public class Main {

	public static void main(String[] args) {
		//JUGADOR
//***********************************************************************************************************************************
	//Método ponerDorsal().

	//Prueba 1.
		//dorsal = 1
		//resultado esperado = 1
		
	//Prueba 2.
		//dorsal = 12
		//resultado esperado = 12
		
	//Prueba 3.
		//dorsal = 30
		//rsultado esperado = 30
		
	//Prueba 4.
		//dorsal = 40
		//resultado esperado = -1
		
	//Ejecución Prueba 1	
	Jugador j1 = new Jugador ();
	int dorsal1 = 1;
	int resultadoEsperado = 1;
	j1.setDorsal(dorsal1);
	int resultadoObtenido = j1.getDorsal();
	if(resultadoEsperado == resultadoObtenido) {
		System.out.println("ponerDorsal() Prueba 1 --> OK");
	}else {
		System.out.println("ponerDorsal() Prueba 1 --> KO");
	}
	
	//Ejecución Prueba 2.
	Jugador j2 = new Jugador();
	int dorsal2 = 12;
	resultadoEsperado = 12;
	j2.setDorsal(dorsal2);
	resultadoObtenido = j2.getDorsal();
	if(resultadoEsperado == resultadoObtenido) {
		System.out.println("ponerDorsal() Prueba 2 --> OK");
	}else {
		System.out.println("ponerDorsal() Prueba 2 --> KO");
	}	
	
	//Ejecutamos Prueba 3.
	Jugador j3 = new Jugador();
	int dorsal3 = 30;
	resultadoEsperado = 30;
	j3.setDorsal(dorsal3);
	resultadoObtenido = j3.getDorsal();
	if(resultadoEsperado == resultadoObtenido) {
		System.out.println("ponerDorsal() Prueba 3 --> OK");
	}else {
		System.out.println("ponerDorsal() Prueba 3 --> KO");
	}	
	
	//Ejecutamos Prueba 4.
	Jugador j4 = new Jugador();
	int dorsal4 = 40;
	resultadoEsperado = 40;
	j4.setDorsal(dorsal4);
	resultadoObtenido = j4.getDorsal();
	if(resultadoEsperado == resultadoObtenido) {
		System.out.println("ponerDorsal() Prueba 4 --> OK");
	}else {
		System.out.println("ponerDorsal() Prueba 4 --> KO");
	}	
//*********************************************************************************************************************
	
//*********************************************************************************************************************
	//Método estaExpulsado()
	
		//Prueba 1.
			//tarjetasRojas = 0
			//tarjetasAmarillas = 2
			//resultado esperado = true
		
		//Prueba 2.
			//tarjetasRojas = 1
			//tarjetasAmarillas = 0
			//resultado esperado = true
		
		//Prueba 3.
			//tarjetasRojas = 0
			//tarjetasAmarillas = 1
			//resultado esperado = false
	
	//Ejecutamos Prueba 1.
	
	Jugador j5 = new Jugador();
	int numeroTarjetasRojas1 = 0;
	int numeroTarjetasAmarillas1 = 2;
	boolean bResultadoEsperado = true;
	j5.setNumeroTarjetasAmarillas(numeroTarjetasAmarillas1);
	j5.setNumeroTarjetasRojas(numeroTarjetasRojas1);
	boolean bResultadoObtenido = j5.estaExpulsado();
	if(bResultadoEsperado == bResultadoObtenido) {
		System.out.println("estaExpulsado() Prueba 1 --> OK");
	}else {
		System.out.println("estaExpulsado() Prueba 1 --> KO");
	}
	
	//Ejecutamos Prueba 2.
	Jugador j6 = new Jugador();
	int numeroTarjetasAmarillas2 = 0;
	int numeroTarjetasRojas2 = 1;
	bResultadoEsperado = true;
	j6.setNumeroTarjetasAmarillas(numeroTarjetasAmarillas2);
	j6.setNumeroTarjetasRojas(numeroTarjetasRojas2);
	bResultadoObtenido = j6.estaExpulsado();
	if(bResultadoEsperado == bResultadoObtenido) {
		System.out.println("estaExpulsado() Prueba 2 --> OK");
	}else {
		System.out.println("estaExpulsado() Prueba 2 --> KO");
	}
	
	//Ejecutamos prueba 3.
	Jugador j7 = new Jugador();
	int numeroTarjetasAmarillas3 = 1;
	int numeroTarjetasRojas3 = 0;
	bResultadoEsperado = false;
	j7.setNumeroTarjetasAmarillas(numeroTarjetasAmarillas3);
	j7.setNumeroTarjetasRojas(numeroTarjetasRojas3);
	bResultadoObtenido = j7.estaExpulsado();
	if(bResultadoEsperado == bResultadoObtenido) {
		System.out.println("estaExpulsado() Prueba 3 --> OK");
	}else {
		System.out.println("estaExpulsado() Prueba 3 --> KO");
	}
//*****************************************************************************************************	
	
	
	
	//SOLDADO 

//*****************************************************************************************************
	//Método puedeDisparar()
	
		//Prueba 1.
			//numeroBalas = 0
			//resultado esperado = false
		
		//Prueba 2.
			//numeroBalas = 10
			//resultado esperado = true
	
	//Ejecutamos prueba 1 
	Soldado s1 = new Soldado();
	int numeroBalas1 = 0;
	bResultadoEsperado = false;
	s1.setNumeroBalas(numeroBalas1);
	bResultadoObtenido = s1.puedeDisparar();
	if(bResultadoEsperado == bResultadoObtenido) {
		System.out.println("puedeDisparar() Prueba 1 --> OK");
	}else {
		System.out.println("puedeDisparar() Prueba 1 --> KO");
	}
	
	//Ejecutamos prueba 2. 
	Soldado s2 = new Soldado();
	int numeroBalas2 = 0;
	bResultadoEsperado = false;
	s1.setNumeroBalas(numeroBalas2);
	bResultadoObtenido = s2.puedeDisparar();
	if(bResultadoEsperado == bResultadoObtenido) {
		System.out.println("puedeDisparar() Prueba 2 --> OK");
	}else {
		System.out.println("puedeDisparar() Prueba 2 --> KO");
	
	}
//**********************************************************************************************************
	
//**********************************************************************************************************
	
	//Metodo disparar(sol)
	
		//Prueba 1
			//numeroBalasInicial = 10
			//numeroBalasEsperado = 9
			//sol.estaMuerto = false
			//resultado esperado = true
	
	//Ejecutamos Prueba 1.
	Soldado sDispara = new Soldado();
	Soldado sDisparado = new Soldado();
	sDispara.setNumeroBalas(10);
	int numeroBalasEsperado = 9;
	sDisparado.setEstaMuerto(false);
	sDispara.disparar(sDisparado);
	int numeroBalasFinal = sDispara.getNumeroBalas();
	if(numeroBalasFinal == numeroBalasEsperado) {
		if(sDisparado.isEstaMuerto()) {
			System.out.println("puedeDisparar() Prueba 1 --> OK");
		}else {
			System.out.println("puedeDisparar() Prueba 1 --> KO");

	}
	}
	}
}
