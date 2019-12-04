package carreraDeRelevos;

public class Pista {
	boolean  vueltaTerminada=false;
	
	public Pista() {
		this.vueltaTerminada=vueltaTerminada;
		
	}	
	public synchronized void empezarCorrer(String nombre) {
		while(this.vueltaTerminada) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.vueltaTerminada=true;
		System.out.println("El "+nombre+" ha empezado a correr");
		
	}
	
	public synchronized void pararCorrer(String nombre) {
		System.out.println(" el "+nombre+" ha finalizado la vuelta");
		this.vueltaTerminada=false;
		
		notify();
			
		
		
	}
}
