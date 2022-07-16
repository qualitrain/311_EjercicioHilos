package qtx.test;

public class Perro implements Runnable {
	private String nombre;
	private String raza;
	private Thread hilo;
//	private Thread hilo2;

	
	public Perro(String nombre, String raza) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.hilo = new Thread(this);
		this.hilo.start();
		
//		this.hilo2 = new Thread(this);
//		this.hilo2.start();
	}

	public void muere() {
		this.hilo.interrupt();		
	}

	public void ladrar() {
		System.out.println("(Hilo " + Thread.currentThread().getId() + ")\t" + this.nombre + " dice Guau Guau!! ");
	}
	@Override
	public void run() {
		try {
			while(true) {
				this.ladrar();
				Thread.sleep(1000);
//				if(Thread.interrupted())
//					break;
			}			
		}
		catch(Exception iex) {
			System.out.println(this.nombre + " no ladrá más");
		}
		finally {
			System.out.println(this.nombre + " HA MUERTO :(");
		}
		
	}

	
	
}
