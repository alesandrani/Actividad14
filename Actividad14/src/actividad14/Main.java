package actividad14;

public class Main {

	public static void main(String[] args) {
		//JUGADOR
		//*****************************Aleksandra***********************************************
		//Prueba 1 ponerDorsal
		//dorsal = 1
		//resultadoEsperado = 1
		
		//Prueba 2 
		//dorsal = 45
		//resultadoEsperado = -1
		
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

		// Prueba 2 ponerDorsal()
		Jugador j2 = new Jugador();
		dorsal = 45;
		resultadoEsperado = -1;
		j2.ponerDorsal(dorsal);
		resultadoObtenido = j2.getDorsal();
		if (resultadoEsperado == resultadoObtenido) {
			System.out.println("Prueba 2 ponerDorsal -> OK");
		} else {
			System.out.println("Prueba 2 ponerDorsal -> KO");
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
		//Prueba 1 estaExpulsado
		//numeroTarjetasAmarillas = 1
		//numeroTarjetasRojas = 1
		//resultadoEsperado = true
		
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
		
		// Prueba 1 estaExpulsad0()
		Jugador j4 = new Jugador();
		int numeroTarjetasAmarillas = 1;
		int numeroTarjetasRojas = 1;
		boolean yresultadoEsperado = true;
		j4.setNumeroTarjetasAmarillas(numeroTarjetasAmarillas);
		j4.setNumeroTarjetasRojas(numeroTarjetasRojas);
		boolean yrestuldadoObtenido = j4.estaExpulsado();
		if (resultadoEsperado == resultadoObtenido) {
			System.out.println("Prueba 1 estaExpulsado -> OK");
		} else {
			System.out.println("Prueba 1 estaExpulsado -> KO");
		}

		// Prueba 2 estaExpulsado()
		Jugador j5 = new Jugador();
		numeroTarjetasAmarillas = 2;
		numeroTarjetasRojas = 0;
		yresultadoEsperado = true;
		j5.setNumeroTarjetasAmarillas(numeroTarjetasAmarillas);
		j5.setNumeroTarjetasRojas(numeroTarjetasRojas);
		yrestuldadoObtenido = j5.estaExpulsado();
		if (resultadoEsperado == resultadoObtenido) {
			System.out.println("Prueba 2 estaExpulsado -> OK");
		} else {
			System.out.println("Prueba 2 estaExpulsado -> KO");
		}

		// Prueba 3 estaExpulsado()
		Jugador j6 = new Jugador();
		numeroTarjetasAmarillas = 0;
		numeroTarjetasRojas = 0;
		yresultadoEsperado = true;
		j6.setNumeroTarjetasAmarillas(numeroTarjetasAmarillas);
		j6.setNumeroTarjetasRojas(numeroTarjetasRojas);
		yrestuldadoObtenido = j6.estaExpulsado();
		if (resultadoEsperado == resultadoObtenido) {
			System.out.println("Prueba 3 estaExpulsado -> OK");
		} else {
			System.out.println("Prueba 3 estaExpulsado -> KO");
		}

		// Prueba 4 estaExpulsado()
		Jugador j7 = new Jugador();
		numeroTarjetasAmarillas = 2;
		numeroTarjetasRojas = 2;
		yresultadoEsperado = true;
		j7.setNumeroTarjetasAmarillas(numeroTarjetasAmarillas);
		j7.setNumeroTarjetasRojas(numeroTarjetasRojas);
		yrestuldadoObtenido = j7.estaExpulsado();
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
		
		//Prueba 2 puedeDisparar
		//numeroBalas = 20
		// resultadoEsperado = true
		
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

		// Prueba 2 puedeDisparar()
		Soldado s2 = new Soldado();
		numeroBalas = 20;
		aresultadoEsperado = true;
		s2.setNumeroBalas(numeroBalas);
		aresultadoObtenido = s2.puedeDisparar();
		if (aresultadoEsperado == aresultadoObtenido) {
			System.out.println("Pruba 2 puedeDisparar -> OK");
		} else {
			System.out.println("Pruba 2 puedeDisparar -> KO");
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

	}

}
