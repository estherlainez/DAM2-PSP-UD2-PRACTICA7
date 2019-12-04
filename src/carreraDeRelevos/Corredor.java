package carreraDeRelevos;

public class Corredor extends Thread{
	private String nombre;
	Pista vuelta;
	
	public Corredor(String nombre, Pista vuelta) {
		super();
		this.nombre=nombre;
		this.vuelta=vuelta;
	}

	
	public void run() {
		super.run();
		
			vuelta.empezarCorrer(nombre);
				
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			vuelta.pararCorrer(nombre);
			
			
			
		}
		
	
}
