package PruebasCodigo2.pruebas1;

public class HiloDurmiente extends Thread
{/* Begin of class*/

	/* ---------------> Attributes of Class ->*/	private int time;
	
	/*----------------> Constructor of Class ->*/ HiloDurmiente(int t) {this.time=t;}
	
	//----------------> Methods of Class
	
	@Override
	public void run() 
	{
		for(int i =0; i <5; i++)
		{
			System.out.println("Hilo "+(i)+": Hola mundo");//show to screen
				// ----------------------> para hacer dormir al proceso que lo invoque o para capturar la Exception
			try {Thread.sleep(time);} 
			catch (InterruptedException e) {/*// TODO Auto-generated catch block*/e.printStackTrace();}
				// <<---------------------------------------------[
			//System.out.println("HiloDormir."+Thread.currentThread().getName()+": Adiós");//Show contain to Screen
		}
	}
		
	
}/*End of class*/
