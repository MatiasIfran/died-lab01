package died.lab01.problema02;

public class Temperatura {

	private double grados;
	private Escala escala;
	
	public double getGrados() {
		return grados;
	}
	
	public void setGrados(double grados) {
		this.grados = grados;
	}
	
	public Escala getEscala() {
		return escala;
	}
	
	public void setEscala(Escala escala) {
		this.escala = escala;
	}
	
	public Temperatura() {
		this.setGrados(0.0);
		this.setEscala(Escala.CELCIUS);
	}
	
	public Temperatura(double grados, Escala escala) {
		this.grados = grados;
		this.escala = escala;
	}
	
	public String toString() {
		if(this.escala.equals(Escala.CELCIUS)) {
			return this.getGrados() + "C°";
		}
		if(this.escala.equals(Escala.FAHRENHEIT)) {
			return this.getGrados() + "F°";		
			}
		return null;
	}
	
	public double asFahrenheit() {
		if(this.getEscala().equals(Escala.CELCIUS)) {
			double aux;
			aux = ((this.getGrados()*9/5)+32);
			return aux;
		}
		return this.getGrados();
	}
	
	public double asCelcius() {
		if(this.getEscala().equals(Escala.FAHRENHEIT)) {
			double aux;
			aux = ((this.getGrados()-32)*5/9);
			return aux;
		}
		return this.getGrados();
	}
	
	public double aumentar(Temperatura temperatura) {
		if(this.getGrados()<0.0) {
			return -1;
		}
		if(!(this.getEscala().equals(temperatura.getEscala()))) {
			double aux;
			
			if(temperatura.getEscala().equals(Escala.CELCIUS)){
				aux = this.getGrados() + temperatura.asFahrenheit();
				this.setGrados(aux);
				return this.getGrados();
			}
			if(temperatura.getEscala().equals(Escala.FAHRENHEIT)){
				aux = this.getGrados() + temperatura.asCelcius();
				this.setGrados(aux);
				return this.getGrados();
			}
		}
		double aux;
		aux = this.getGrados() + temperatura.getGrados();
		this.setGrados(aux);
		return this.getGrados();
	}
	
	public double disminuir(Temperatura temperatura) {
		if(this.getGrados()<0.0) {
			return -1;
		}
		if(!(this.getEscala().equals(temperatura.getEscala()))) {
			double aux;
			
			if(temperatura.getEscala().equals(Escala.CELCIUS)){
				aux = this.getGrados() - temperatura.asFahrenheit();
				this.setGrados(aux);
				return this.getGrados();
			}
			if(temperatura.getEscala().equals(Escala.FAHRENHEIT)){
				aux = this.getGrados() - temperatura.asCelcius();
				this.setGrados(aux);
				return this.getGrados();
			}
		}
		double aux;
		aux = this.getGrados() - temperatura.getGrados();
		this.setGrados(aux);
		return this.getGrados();
	}
	
}
