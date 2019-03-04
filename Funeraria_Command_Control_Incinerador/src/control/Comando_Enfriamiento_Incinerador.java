package control;

public class Comando_Enfriamiento_Incinerador implements Comando{

	Incinerador incinerador;

	public Comando_Enfriamiento_Incinerador(Incinerador incinerador) {
		this.incinerador = incinerador;
	}

	@Override
	public void ejecutar() {
		incinerador.enfriar();
	}
}
