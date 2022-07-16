package qtx.test;

public class ProbadorPerros {

	public static void main(String[] args) throws InterruptedException {

		
		Perro firulais = new Perro("Firulais","French Poodle");
		Perro killer = new Perro("Killer","Doberman");
		
		for(int i=0; i<10;i++) {
			System.out.println("(Hilo " + Thread.currentThread().getId() + ")\ti=" + i);
			Thread.sleep(500);
		}
		
		killer.muere();
		
		for(int i=0; i<10;i++) {
			System.out.println("(Hilo " + Thread.currentThread().getId() + ")\ti=" + i);
			Thread.sleep(500);
		}
		
		firulais.muere();
	}

}
