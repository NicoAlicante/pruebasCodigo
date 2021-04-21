package PruebasCodigo2.pruebas1;

public class principal_hilos 
{

	public static void main(String[] args)
	{
		mainDormir();
	}	
		public static void mainDormir() 
		{
			//System.out.println("MainClass."+Thread.currentThread().getName()+": Buenos dias Mundo");
			
			HiloDurmiente []arrayHilos=new HiloDurmiente[5];
			
			HiloDurmiente hDormir=new HiloDurmiente(500);
			hDormir.start();
			for(int x = 0; x < arrayHilos.length; x++)
			{arrayHilos[x]=new HiloDurmiente(300);arrayHilos[x].start();}
			
/*									
			{arrayHilos[x]=hDormir;}
			(arrayHilos[1]=new HiloDurmiente(100)).start();
			
*/
			for(int i=0; i<arrayHilos.length; i++)
			{
				try {arrayHilos[i].join(); /*Espera a que el otro hilo termine*/} 
				catch (InterruptedException e) {/* TODO Auto-generated catch block*/e.printStackTrace();}
			}
			
			System.out.println("MainClass."+Thread.currentThread().getName()+": Adiós");
		}
		
		
		
		

	

}	//--------------------{ Close of the class
