package died.lab01.problema03;

import died.lab01.problema02.Escala;
import died.lab01.problema02.Temperatura;

public class Registro {

	private String ciudad;
	private Temperatura[] historico;
	private int maxArreglo = 10;
	
	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Registro(){
		this.ciudad = "-";
		this.historico = new Temperatura[maxArreglo] ;
	}
	
	public Registro(String ciudad) {
		this.ciudad = ciudad;
		this.historico = new Temperatura[maxArreglo];
	}
	
	public void imprimir() {
		System.out.println("Temperaturas registradas en: " + this.getCiudad());
		for(int i=0; i<historico.length; i++) {
			System.out.println("El Dia " + i + " se registro " + historico[i]); // REVISAR 
		}
	}
	
	public void agregar(Temperatura t) {
		int aux;
		for(aux=0; aux<historico.length; aux++) {
			if(historico[aux] == null) {
				break;
			}
		}
		if(aux!=historico.length) {
			historico[aux] = t;
		}
	}
	
	public double MediaAsCelcius() {
		double suma=0;
		int tamMax=0;
		for(int i=0; i<historico.length; i++) {
			if(historico[i]!=null) {
				if(historico[i].getEscala().equals(Escala.CELCIUS)) {
				suma = suma + historico[i].getGrados();
				}
				else {
					suma = suma + historico[i].asCelcius();
				}
				tamMax = i;
			}
			else {
				tamMax = i;
			}
			
		}
		return suma/tamMax;
	}
	
	public double MediaAsFahrenheir() {
		double suma=0;
		int tamMax=0;
		for(int i=0; i<historico.length; i++) {
			if(historico[i]!=null) {
				if(historico[i].getEscala().equals(Escala.FAHRENHEIT)) {
				suma = suma + historico[i].getGrados();
				}
				else {
					suma = suma + historico[i].asFahrenheit();
				}
				tamMax = i;
			}
			else {
				tamMax = i;
			}
			
		}
		return suma/tamMax;
	}
	
	public Temperatura maximo() {
		Temperatura tem = historico[0];
		for(int i=0; i<historico.length; i++) {
			if(historico[i].getGrados()>tem.getGrados()) {
				tem = historico[i];
			}
		}
		return tem;
	}
	
}
