package control;

public class Controlador {
	
	private Comando comando;
	
	public Controlador() {
	}

	public void setComando(Comando comando) {
		this.comando = comando;
	}
	
	public void ejecutar() {
		comando.ejecutar();
	}
	
	

}
