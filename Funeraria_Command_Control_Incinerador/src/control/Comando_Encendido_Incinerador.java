package control;

public class Comando_Encendido_Incinerador implements Comando {

	Incinerador incinerador;

	public Comando_Encendido_Incinerador(Incinerador incinerador) {
		this.incinerador = incinerador;
	}

	@Override
	public void ejecutar() {
		incinerador.encender();
	}

}
