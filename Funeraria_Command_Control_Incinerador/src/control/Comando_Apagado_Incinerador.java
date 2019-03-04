package control;

public class Comando_Apagado_Incinerador implements Comando{

	Incinerador incinerador;

	public Comando_Apagado_Incinerador(Incinerador incinerador) {
		this.incinerador = incinerador;
	}

	@Override
	public void ejecutar() {
		incinerador.apagar();
	}

}
