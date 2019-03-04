package main;

import control.Comando_Apagado_Incinerador;
import control.Comando_Calentamiento_Incinerador;
import control.Comando_Encendido_Incinerador;
import control.Comando_Enfriamiento_Incinerador;
import control.Controlador;
import control.Incinerador;

public class Prueba_Control_Incinerador_Command {

	public static void main(String[] args) {

		Controlador controlador = new Controlador();
		Incinerador incinerador= new Incinerador();
		
		Comando_Encendido_Incinerador encendido= new Comando_Encendido_Incinerador(incinerador);
		Comando_Calentamiento_Incinerador calentador= new Comando_Calentamiento_Incinerador(incinerador);
		Comando_Enfriamiento_Incinerador enfriador = new Comando_Enfriamiento_Incinerador(incinerador);
		Comando_Apagado_Incinerador apagado=  new Comando_Apagado_Incinerador(incinerador);
		
		controlador.setComando(encendido);
		controlador.ejecutar();
		controlador.setComando(calentador);
		controlador.ejecutar();
		controlador.setComando(enfriador);
		controlador.ejecutar();
		controlador.setComando(apagado);
		controlador.ejecutar();
		
	}

}
