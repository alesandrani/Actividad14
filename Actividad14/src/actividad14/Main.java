package actividad14;

public class Main {

	public static void main(String[] args) {
		//JUGADOR
		//*************************Avril jugador*************************
		//Metodo ponerDorsal()******************************************
		//Seran 3 pruebas que haremos en este metodo
		
		//Prueba 1
		//Dorsal = 1
		//Resultado esperado = 1
		
		//Prueba 2
		//Dorsal = -3
		//Resultado esperado = -1
		
		//Prueba 3
		//Dorsal = 50
		//Resultado esperado = -1
		
		//Ejecutamos la prueba 1
		Jugador j1 = new Jugador();
		int dorsal = 1;
		int resultadoEsperado = 1;
		j1.ponerDorsal(dorsal);
		int resultadoObtenido = j1.getDorsal();
		if(resultadoEsperado == resultadoObtenido) {
			System.out.println("Metodo ponerDorsal() prueba 1 -> OK");
		}else {
			System.out.println("Metodo ponerDorsal() prueba 1 -> KO");
		}
		
		//Ejecutamos la prueba 2
		Jugador j2 = new Jugador();
		dorsal = -3;
		resultadoEsperado = -1;
		j2.ponerDorsal(dorsal);
		resultadoObtenido = j2.getDorsal();
		if(resultadoEsperado == resultadoObtenido) {
			System.out.println("Metodo ponerDorsal() prueba 2 -> OK");
		}else {
			System.out.println("Metodo ponerDorsal() prueba 2 -> KO");
		}
		
		//Ejecutamos la prueba 3
		Jugador j3 = new Jugador();
		dorsal = 50;
		resultadoEsperado = -1;
		j3.ponerDorsal(dorsal);
		resultadoObtenido = j3.getDorsal();
		if(resultadoEsperado == resultadoObtenido) {
			System.out.println("Metodo ponerDorsal() prueba 3 -> OK");
		}else {
			System.out.println("Metodo ponerDorsal() prueba 3 -> KO");
		}
		//**********************************************************************
		//Metodo estaExpulsado()******************************************
		//Seran 3 pruebas que haremos en este metodo
		
		//Prueba 1
		//tarjetasAmarillas = 2
		//tarjetasRojas = 0
		//Resultado esperado = true
		
		//Prueba 2
		//tarjetasAmarillas =0
		//tarjetasRojas = 1
		//Resultado esperado = true
		
		//Prueba 3
		//tarjetasAmarillas =0
		//tarjetasRojas = 0
		//Resultado esperado = false
		
		//Ejecutamos la prueba 1
		Jugador j4 = new Jugador();
		int tarjetasAmarillas = 2;
		int tarjetasRojas = 0;
		j4.setNumeroTarjetasAmarillas(tarjetasAmarillas);
		j4.setNumeroTarjetasRojas(tarjetasRojas);
		boolean bResultadoEsperado = true;
		boolean bResultadoObtenido = j4.estaExpulsado();
		if(bResultadoEsperado == bResultadoObtenido) {
			System.out.println("estaExpulsado() prueba 4 -> OK");
		}else {
			System.out.println("estaExpulsado() prueba 4 -> KO");
		}
		//Ejecutamos la prueba 2
		Jugador j5 = new Jugador();
		tarjetasAmarillas = 0;
		tarjetasRojas = 1;
		j5.setNumeroTarjetasAmarillas(tarjetasAmarillas);
		j5.setNumeroTarjetasRojas(tarjetasRojas);
		bResultadoEsperado = true;
		bResultadoObtenido = j5.estaExpulsado();
		if(bResultadoEsperado == bResultadoObtenido) {
			System.out.println("estaExpulsado() prueba 5 -> OK");
		}else {
			System.out.println("estaExpulsado() prueba 5 -> KO");
		}
		
		//Ejecutamos la prueba 3
		Jugador j6 = new Jugador();
		tarjetasAmarillas = 0;
		tarjetasRojas = 0;
		j6.setNumeroTarjetasAmarillas(tarjetasAmarillas);
		j6.setNumeroTarjetasRojas(tarjetasRojas);
		bResultadoEsperado = false;
		bResultadoObtenido = j6.estaExpulsado();
		if(bResultadoEsperado == bResultadoObtenido) {
			System.out.println("estaExpulsado() prueba 6 -> OK");
		}else {
			System.out.println("estaExpulsado() prueba 6 -> KO");
		}
		//*************************************************************************
		//*******************************Avril Jugador***************************
		
		//SOLDADO 
		//*******************************Avril Soldado*****************************
		//Metodo puedeDisparar()***************************************************
		//Seran 3 pruebas que haremos en este metodo
		
		//Prueba 1
		//balas = 50
		//Resultado esperado = true
		
		//Prueba 2
		//balas = 0
		//Resultado esperado = false
		
		//Prueba 3
		//balas = -30
		//Resultado esperado = false
		
		//Ejecutamos la prueba 1
		Soldado s1 = new Soldado();
		int balas = 50;
		s1.setNumeroBalas(balas);
		boolean sResultadoEsperado = true;
		boolean sResultadoObtenido = s1.puedeDisparar();
		if(sResultadoEsperado == sResultadoObtenido) {
			System.out.println("puedeDisparar() prueba 7 -> OK");
		}else {
			System.out.println("estaExpulsado() prueba 7 -> KO");
		}
		
		//Ejecutamos la prueba 2
		Soldado s2 = new Soldado();
		balas = 0;
		s2.setNumeroBalas(balas);
		sResultadoEsperado = false;
		sResultadoObtenido = s2.puedeDisparar();
		if(sResultadoEsperado == sResultadoObtenido) {
			System.out.println("puedeDisparar() prueba 8 -> OK");
		}else {
			System.out.println("estaExpulsado() prueba 8 -> KO");
		}
		
		//Ejecutamos la prueba 3
		Soldado s3 = new Soldado();
		balas = -30;
		s3.setNumeroBalas(balas);
		sResultadoEsperado = false;
		sResultadoObtenido = s3.puedeDisparar();
		if(sResultadoEsperado == sResultadoObtenido) {
			System.out.println("puedeDisparar() prueba 9 -> OK");
		}else {
			System.out.println("estaExpulsado() prueba 9 -> KO");
		}
		//*************************************************************************
		//Metodo disparar()********************************************************
		
		//Prueba 1
		//numeroDeBalasInicial = 10
		//numeroBalasEsperado = 9
		//estaMuertoInicial = false
		//estaMuertoEsperado = true
		
		//Ejecucion de preuba 1
		Soldado sDispara  = new Soldado();
		Soldado sDisparado = new Soldado();
		sDispara.setNumeroBalas(10);
		int numeroBalasEsperado = 9;
		sDisparado.setEstaMuerto(false);
		sDispara.disparar(sDisparado);
		int balasFinal = sDispara.getNumeroBalas();
		
		if((numeroBalasEsperado == balasFinal) && sDisparado.isEstaMuerto()) {
			System.out.println("disparar(Soldado sol) prueba 10 -> OK");
		}else {
			System.out.println("disparar(Soldado sol) prueba 10 -> KO");
		}
		//**************************************************************************
		//*******************************Avril Soldado*****************************

	}

}
