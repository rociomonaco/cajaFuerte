package ar.edu.unlam.pb2.cajafuerte;

public class CajaFuerte {

	
	private Boolean estaAbierta = true;

	public Boolean estaAbierta() {
		return estaAbierta;
	}

	public void cerrar() {
		this.estaAbierta = false;
	}

}
