package ar.edu.unlam.pb2.cajafuerte;

import org.junit.Assert;
import org.junit.Test;

public class CajaFuerteTest {
	@Test
	public void alCrearUnaCajaFuerteDeberiaEstarAbierta() {
		// Preparacion - condiciones necesarias - (new) inicialiazaciones previos al
		// comportamiento. given
		// vacio como es de creacion la vamos a obviar

		// Ejecucion - Cuando creo una caja fuerte when
		CajaFuerte caja = cuandoCreoUnaCajaFuerte();

		// Contrastacion - entonces then
		laCajaFuerteEstaAbierta(caja);
	}
	@Test 
	public void alCerrarlaDeberiaQuedarCerrada() {
		
		CajaFuerte caja = dadoQueExisteUnaCajaFuerte();
		
		cuandoCierroLaCajaFuerte(caja);
		
		entoncesLaCajaFuerteEstaCerrada(caja);
	}
	// Al abrir la caja fuerte con el codigo de serie deberia estar abierta
	@Test
	public void alAbrirLaCajaFuerteConElCodigoDeSerieDeberiaAbrirse() {
		//perarapcion
		CajaFuerte caja = dadoQueExisteUnaCajaFuerte();
		
			dadoQueCierroLaCajaFuerte(caja, codigoDeApertura);
		
		//cuando abro la caja fuerte la caja fuerte se abre ejecucion
			cuandoAbroLaCajaFuerte(caja, codigoDeApertura);
			
			//Costatacion
			entoncesLaCajaFuerteSeAbre(caja);
		
	}
	
	
	private CajaFuerte dadoQueExisteUnaCajaFuerte() {
		return new CajaFuerte();
		
	}
	private void cuandoCierroLaCajaFuerte(CajaFuerte caja) {
			caja.cerrar();
		
	}
	private void entoncesLaCajaFuerteEstaCerrada(CajaFuerte caja) {
								//esperado, sobre obtenido
		Assert.assertEquals(false, caja.estaAbierta());
	}
	// para dar verde -> no dar null
	private CajaFuerte cuandoCreoUnaCajaFuerte() {
		return new CajaFuerte(); //constructor
	}

	private void laCajaFuerteEstaAbierta(CajaFuerte caja) {
		//asercion 
		Assert.assertTrue(caja.estaAbierta());
	}

}
