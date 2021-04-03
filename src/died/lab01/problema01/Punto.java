package died.lab01.problema01;

public class Punto {

	public float x;
	public float y;
	
	public Punto(float x, float y){
		this.x = x;
		this.y = y;
		
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public boolean equals(Object otroPunto) {
		if(getClass() != otroPunto.getClass())
			return false;
		Punto p = (Punto)otroPunto;
		if(!(p.getX()==(this.getX()))){
			return false;
		}
		if(!(p.getY()==(this.getY()))){
			return false;
		}
		return true;
	}
}
