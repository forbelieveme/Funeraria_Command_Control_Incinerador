package control;

public class Comando_Calentamiento_Incinerador implements Comando{
	
	Incinerador incinerador;

	public Comando_Calentamiento_Incinerador(Incinerador incinerador) {
		this.incinerador = incinerador;
	}

	@Override
	public void ejecutar() {
		incinerador.calentar();
	}

}
