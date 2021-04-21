package PruebasCodigo2.pruebas1;

public class Hilos extends Thread
{
				/*--- Attributes of the class---*/
	int id;
				/*--- Constructor\s ---*/
	public Hilos(int d) 
	{System.out.println("Hilos-"+Thread.currentThread().getName()+": Creador del Hilos");this.id=d;	}	/*--- cierre del constructor Hilos---*/


	@Override
	public void run()
	{
		System.out.println("Hilos."+this.getName()+": ¡Ya he llegado!");
		
		try {Thread.sleep(300);	} 
		catch (InterruptedException e) 
		{/* //TODO Auto-generated catch block*/	e.printStackTrace();}
				/* <----[ ****** ]---->*/
		System.out.println("MiHilo."+Thread.currentThread().getName()+": ¡Ya me voy!");
	}	/*--- Close of the run method---*/

	public static void dormir(long milis)
	{
		long inicial=System.currentTimeMillis();
		while(System.currentTimeMillis()-inicial < milis) {/*Esperar a que pase el tiempo*/}
	}
}
