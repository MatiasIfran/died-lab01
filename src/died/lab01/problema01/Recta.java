package died.lab01.problema01;

public class Recta {

	private Punto punto1;
	private Punto punto2;

	public Recta (Punto p1, Punto p2) {
		this.punto1 = p1;
		this.punto2 = p2;
	}
	
	public Recta() {
		Punto p1 = new Punto(1,1);
		Punto p2 = new Punto(9,9);
		this.punto1 = p1;
		this.punto2 = p2;
	}
	
	public boolean equals(Object otraRecta) {
		Recta R = (Recta)otraRecta;
		float m;
		m=((R.punto1.getY()-this.punto1.getY())/(R.punto1.getX()-this.punto1.getX()));
		if(!((this.pendiente()==m) && (R.pendiente()==m)))
			return false;
		return true;
	}
	
	public float pendiente() {
		float m;
		m = ((this.getPunto2().getY()-this.getPunto1().getY())/(this.getPunto2().getX()-this.getPunto1().getX()));
		return m;
	}
	
	public Punto getPunto1() {
		return punto1;
	}

	public void setPunto1(Punto punto1) {
		this.punto1 = punto1;
	}

	public Punto getPunto2() {
		return punto2;
	}

	public void setPunto2(Punto punto2) {
		this.punto2 = punto2;
	}

	public boolean paralelas(Recta otraRecta){
		Recta r = (Recta)otraRecta;
		if(!(this.pendiente()==r.pendiente())) {
			return false;
		}
		return true;
	}
}
