package interfaz;

public class operacion {
	private int valorA;
	private int valorB;
	private double resultado;
	public operacion() {	
	}
	public int getValorA() {
		return valorA;
	}
	public void setValorA(int valorA) {
		this.valorA = valorA;
	}
	public int getValorB() {
		return valorB;
	}
	public void setValorB(int valorB) {
		this.valorB = valorB;
	}
	public double getResultado() {
		return resultado;
	}
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	public int modulo() {
		int r=0;
		r=this.getValorA()%this.getValorB();
		return r;
	}
	public void modulo(int a,int b) {
		int r=0;
		r=a%b;
		this.setResultado(r);
	}
	public String suma_plus() {
		int suma=0;
		int nro=this.valorA;
		while(nro>0){
			suma+=nro%10;
			nro=nro/10;
		}		
		return suma+"";
	}
}
