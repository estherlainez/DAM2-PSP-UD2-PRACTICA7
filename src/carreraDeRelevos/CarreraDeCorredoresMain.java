package carreraDeRelevos;

public class CarreraDeCorredoresMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Carrera de corredores");
		System.out.println("La carrera ha comenzado");
		Pista v=new Pista();
		
		Corredor []corredores=new Corredor[4];
	
		
		for(int i=0;i<corredores.length;i++) {
			corredores[i]=new Corredor("corredor "+i, v);
			corredores[i].start();
			try {
				corredores[i].join();
			} catch (InterruptedException e) {

				e.getStackTrace();
			}
		
		}
		System.out.println("La carrera ha terminado");
		
	}

}
