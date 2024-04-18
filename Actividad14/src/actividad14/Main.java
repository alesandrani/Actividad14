package actividad14;

public class Main {

	public static void main(String[] args) {
		//JUGADOR
		//*******************YINA*******************************
		//Metodo ponerDorsal
		//Seran 4 pruebas las que hagamos para este metodo
		//PRUEBA1
		//dorsal =  1
		//resultado esperado= 1
		
		//PRUEBA2
		//dorsal =  10
		//resultado esperado= 10
		
		//PRUEBA3
		//dorsal =  30
		//resultado esperado= 30
				
		//PRUEBA4
		//dorsal = 45
		//resultado esperado = -1
				
		//Ejecucion PRUEBA1
		Jugador j1 = new Jugador();
		int dorsal = 1;
		int resultadoEsperado = 1;
		j1.ponerDorsal(dorsal);
		int resultadoObtenido = j1.getDorsal();
		if (resultadoEsperado == resultadoObtenido) {
			System.out.println("ponerDorsal()Prueba1 -> OK");
		}else {
			System.out.println("ponerDorsal()Prueba1 -> KO");
		}
		
		//Ejecucion PRUEBA2
		Jugador j2 = new Jugador();
		dorsal = 10;
		resultadoEsperado = 10;
		j2.ponerDorsal(dorsal);
		resultadoObtenido = j2.getDorsal();
		if (resultadoEsperado == resultadoObtenido) {
			System.out.println("ponerDorsal()Prueba2 -> OK");
		}else {
			System.out.println("ponerDorsal()Prueba2 -> KO");
		}
		
		//Ejecucion PRUEBA3
		Jugador j3 = new Jugador();
		dorsal = 30;
		resultadoEsperado = 30;
		j3.ponerDorsal(dorsal);
		resultadoObtenido = j3.getDorsal();
		if (resultadoEsperado == resultadoObtenido) {
			System.out.println("ponerDorsal()Prueba3 -> OK");
		}else {
			System.out.println("ponerDorsal()Prueba3 -> KO");
		}
		
		//Ejecucion PRUEBA4
		Jugador j4 = new Jugador();
		dorsal = 50;
		resultadoEsperado = -1;
		j4.ponerDorsal(dorsal);
		resultadoObtenido = j4.getDorsal();
		if (resultadoEsperado == resultadoObtenido) {
			System.out.println("ponerDorsal()Prueba4 -> OK");
		}else {
			System.out.println("ponerDorsal()Prueba4 -> KO");
		}
		//*******************YINA*******************************
		
		//*******************YINA*******************************
		//Metodo estaExpulsado()
		//PRUEBA1
		//tarjetasAmarillas = 2
		//tarjetasRojas = 0
		//resultado esperado  = true;
		
		//PRUEBA2
		//tarjetasAmarillas = 0
		//tarjetasRojas = 1
		//resultado esperado  = true;
		
		//PRUEBA3
		//tarjetasAmarillas = 0
		//tarjetasRojas = 0
		//resultado esperado  = false;
		
		//Ejecucion PRUEBA1
		Jugador j5 = new Jugador();
		int tarjetasAmarillas = 2;
		int tarjetasRojas = 0;
		boolean bResultadoEsperado = true;
		j5.setNumeroTarjetasAmarillas(tarjetasAmarillas);
		j5.setNumeroTarjetasRojas(tarjetasRojas);
		boolean bResultadoObtenido = j5.estaExpulsado();
		if (bResultadoEsperado == bResultadoObtenido) {
			System.out.println("estaExpulsado()Prueba1 -> OK");
		}else {
			System.out.println("estaExpulsado()Prueba1 -> KO");
		}
		
		//Ejecucion PRUEBA2
		Jugador j6 = new Jugador();
		tarjetasAmarillas = 0;
		tarjetasRojas = 1;
		bResultadoEsperado = true;
		j6.setNumeroTarjetasAmarillas(tarjetasAmarillas);
		j6.setNumeroTarjetasRojas(tarjetasRojas);
		bResultadoObtenido = j6.estaExpulsado();
		if (bResultadoEsperado == bResultadoObtenido) {
			System.out.println("estaExpulsado()Prueba2 -> OK");
		}else {
			System.out.println("estaExpulsado()Prueba2 -> KO");
		}
		
		//Ejecucion PRUEBA3
		Jugador j7 = new Jugador();
		tarjetasAmarillas = 2;
		tarjetasRojas = 0;
		bResultadoEsperado = true;
		j7.setNumeroTarjetasAmarillas(tarjetasAmarillas);
		j7.setNumeroTarjetasRojas(tarjetasRojas);
		bResultadoObtenido = j7.estaExpulsado();
		if (bResultadoEsperado == bResultadoObtenido) {
			System.out.println("estaExpulsado()Prueba3 -> OK");
		}else {
			System.out.println("estaExpulsado()Prueba3 -> KO");
		}
		//*******************YINA*******************************
		//SOLDADO 
		//*******************YINA*******************************
		//Metodo puedeDisparar()
		//PRUEBA1
		//numeroBalas = 0
		//resultado esperado = false;
		
		//Metodo puedeDisparar()
		//PRUEBA1
		//numeroBalas = 1
		//resultado esperado = true;
		
		//Ejecucion PRUEBA1
		Soldado s1 = new Soldado();
		int balas = 0;
		bResultadoEsperado = false;
		s1.setNumeroBalas(balas);
		bResultadoObtenido = s1.puedeDisparar();
		if (bResultadoEsperado == bResultadoObtenido) {
			System.out.println("puedeDisparar()Prueba1 -> OK");
		}else {
			System.out.println("puedeDisparar()Prueba1 -> KO");
		}
		
		//Ejecucion PRUEBA2
		Soldado s2 = new Soldado();
		balas = 1;
		bResultadoEsperado = true;
		s2.setNumeroBalas(balas);
		bResultadoObtenido = s2.puedeDisparar();
		if (bResultadoEsperado == bResultadoObtenido) {
			System.out.println("puedeDisparar()Prueba2 -> OK");
		}else {
			System.out.println("puedeDisparar()Prueba2 -> KO");
		}
		//*******************YINA*******************************
		
		//*******************YINA*******************************
		//Metodo disparar()
		//PRUEBA1
		//numeroBalasInicial = 10
		//numeroBalasEsperado = 9
		// estaMuertoInicial = false
		//estaMuertoEsperado = true;
		
		Soldado sQueDispara = new Soldado();
		Soldado sDisparado = new Soldado();
		sQueDispara.setNumeroBalas(10);
		int numeroBalasEsperado = 9;
		sDisparado.setEstaMuerto(false);
		sQueDispara.disparar(sDisparado);
		int numeroBalasResultante = sQueDispara.getNumeroBalas();
		
		if((numeroBalasEsperado == numeroBalasResultante)&& sDisparado.isEstaMuerto()) {
			System.out.println("disparar(sol) PRUEBA1 -> OK");
		}else {
			System.out.println("disparar(sol) PRUEBA1 -> KO");
		}
		//*******************YINA*******************************
		
		
		
		
		
		
		
		
		

	}

}
