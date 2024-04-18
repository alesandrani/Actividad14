package actividad14;

public class Main {

	public static void main(String[] args) {
		//JUGADOR

		//*****************************Aleksandra***********************************************
		//Prueba 1 ponerDorsal
		//dorsal = 1
		//resultadoEsperado = 1
		
		//Prueba 2.
		//dorsal = 12
		//resultado esperado = 12
		
		//Prueba 3
		//dorsal = 20
		//resultadoEsperado = 20
		
		// Prueba 1 ponerDorsal()
		Jugador j1 = new Jugador();
		int dorsal = 1;
		int resultadoEsperado = 1;
		j1.ponerDorsal(dorsal);
		int resultadoObtenido = j1.getDorsal();
		if (resultadoEsperado == resultadoObtenido) {
			System.out.println("Prueba 1 ponerDorsal -> OK");
		} else {
			System.out.println("Prueba 1 ponerDorsal -> KO");
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

		// Prueba 3 ponerDorsal()
		Jugador j3 = new Jugador();
		dorsal = 20;
		resultadoEsperado = 20;
		j3.ponerDorsal(dorsal);
		resultadoObtenido = j3.getDorsal();
		if (resultadoEsperado == resultadoObtenido) {
			System.out.println("Prueba 3 ponerDorsal -> OK");
		} else {
			System.out.println("Prueba 3 ponerDorsal -> KO");
		}
//*********************************Aleksandra**********************************************		
		//Prueba 1.
		//tarjetasRojas = 0
		//tarjetasAmarillas = 2
		//resultado esperado = true
		
		//Prueba 2 EstaExpulsado
		//numeroTarjetasAmarillas = 2
		//numeroTarjetasRojas = 0
		//resultadoEsperado = true
		
		//Prueba 3 EstaExpulsado
		//numeroTarjetasAmarillas = 0
		//numeroTarjetasRojas = 0
		//resultadoEsperado = false
		
		//Prueba 4 EstaExpulsado
		//numeroTarjetasAmarillas = 2
		//numeroTarjetasRojas = 2
		//resultadoEsperado = true
		
		System.out.println("***************************");
		
		Jugador j5 = new Jugador();
		int numeroTarjetasRojas = 0;
		int numeroTarjetasAmarillas = 2;
		boolean bResultadoEsperado = true;
		j5.setNumeroTarjetasAmarillas(numeroTarjetasAmarillas);
		j5.setNumeroTarjetasRojas(numeroTarjetasRojas);
		boolean bResultadoObtenido = j5.estaExpulsado();
		if(bResultadoEsperado == bResultadoObtenido) {
			System.out.println("estaExpulsado() Prueba 1 --> OK");
		}else {
			System.out.println("estaExpulsado() Prueba 1 --> KO");
		}
		
		

		// Prueba 2 estaExpulsado()
		Jugador j6 = new Jugador();
		numeroTarjetasAmarillas = 2;
		numeroTarjetasRojas = 0;
		bResultadoEsperado = true;
		j6.setNumeroTarjetasAmarillas(numeroTarjetasAmarillas);
		j6.setNumeroTarjetasRojas(numeroTarjetasRojas);
		bResultadoObtenido = j6.estaExpulsado();
		if (resultadoEsperado == resultadoObtenido) {
			System.out.println("Prueba 2 estaExpulsado -> OK");
		} else {
			System.out.println("Prueba 2 estaExpulsado -> KO");
		}

		// Prueba 3 estaExpulsado()
		Jugador j7 = new Jugador();
		numeroTarjetasAmarillas = 0;
		numeroTarjetasRojas = 0;
		bResultadoEsperado = true;
		j7.setNumeroTarjetasAmarillas(numeroTarjetasAmarillas);
		j7.setNumeroTarjetasRojas(numeroTarjetasRojas);
		bResultadoObtenido = j7.estaExpulsado();
		if (resultadoEsperado == resultadoObtenido) {
			System.out.println("Prueba 3 estaExpulsado -> OK");
		} else {
			System.out.println("Prueba 3 estaExpulsado -> KO");
		}

		// Prueba 4 estaExpulsado()
		Jugador j8 = new Jugador();
		numeroTarjetasAmarillas = 2;
		numeroTarjetasRojas = 2;
		bResultadoEsperado = true;
		j8.setNumeroTarjetasAmarillas(numeroTarjetasAmarillas);
		j8.setNumeroTarjetasRojas(numeroTarjetasRojas);
		bResultadoObtenido = j8.estaExpulsado();
		if (resultadoEsperado == resultadoObtenido) {
			System.out.println("Prueba 4 estaExpulsado -> OK");
		} else {
			System.out.println("Prueba 4 estaExpulsado -> KO");
		}
		
		//*************************Aleksandra****************************************************
		//SOLDADO 
		System.out.println("********************************");
		
		//Prueba 1 puedeDisparar
		//numeroBalas = 0
		//resultadoEsperado = false
		
		//Prueba 2.
		//numeroBalas = 10
		//resultado esperado = true
		
		// Prueba 1 puedeDisparar()
		Soldado s1 = new Soldado();
		int numeroBalas = 0;
		boolean aresultadoEsperado = false;
		s1.setNumeroBalas(numeroBalas);
		boolean aresultadoObtenido = s1.puedeDisparar();
		if (aresultadoEsperado == aresultadoObtenido) {
			System.out.println("Pruba 1 puedeDisparar -> OK");
		} else {
			System.out.println("Pruba 1 puedeDisparar -> KO");
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

		
		//*******************************Aleksandra****************************************************
		//Prueba 1 disparar(sol)
		// numeroBalasInicial = 10
		// numeroBalasEsperado = 9
		// estaMuertoInicial = false
		// estaMuertoEsperado = true
		System.out.println("**************************");
		
		Soldado sQueDispara = new Soldado();
		Soldado sDisparado = new Soldado();
		sQueDispara.setNumeroBalas(10);
		int numeroBalasEsperado = 9;
		sDisparado.setEstaMuerto(false);
		
		sQueDispara.disparar(sDisparado);
		int numeroBalasFinal = sQueDispara.getNumeroBalas();
		
		if(numeroBalasFinal == numeroBalasEsperado) {
			if(sDisparado.isEstaMuerto()) {
				System.out.println("Prueba 1 puedeDisparar -> OK");
			}else {
				System.out.println("Prueba 1 puedeDisparar -> KO");
			}
		}else {
			System.out.println("Prueba 1 puedeDisparar -> KO");
		}


	

	
	
	
	//SOLDADO 


	

	}
	
	}

