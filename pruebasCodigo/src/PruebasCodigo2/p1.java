package PruebasCodigo2;

import java.util.Scanner;

public class p1 
{

	public static void main(String[] args) 
	{
		/*Declaracion de variables*/
		Scanner teclado = new Scanner(System.in);
		String [] cadenas= {"hola", "ramon","como estas","el nico es el mejor"};
		int menu=0;
		boolean salir=false;
		while(salir==false) 
		{
			for(int i =0; i<cadenas.length; i++)
			{System.out.println((i+1)+"..."+cadenas[i]);}
			System.out.println("0...Salir");
			for(int x =0; x<1; x++)
			{
				try{System.out.print("Introduce una opcion de las anteriores ");menu=Integer.parseInt(teclado.nextLine());}
				catch(Exception e) {x--;System.out.println("Dato incorrecto, vuelva a intentarlo");}
			}

			switch (menu) 
			{
			case 1:{System.out.println("has escogido la opcion 1: "+cadenas[0]);break;}
			case 2:{System.out.println("has escogido la opcion 2: "+cadenas[1]);break;}
			case 3:{System.out.println("has escogido la opcion 3: "+cadenas[2]);break;}
			case 4:{System.out.println("has escogido la opcion 4: "+cadenas[3]);break;}
			case 0:{System.out.println("Adios");salir=true;break;}
			default:{System.out.println("esa opcion no está disponible ");}
			}// cierre del switch
		}		//------------------------------------------------------------>|cierre del while|
		teclado.close();
			int posicion=0;
			System.out.println("\tEl resultado mostrando en filas de 2 elementos\n");
			
			for(int i =0; i < (cadenas.length/2); i++) 
			{
				if(i<1) 
				{
					for(int x=0; x < 2; x++) 
					{System.out.print((x+1)+". "+cadenas[posicion]+".\t");posicion++;}
					System.out.println();
				}
				else 
				{
					for(int y=2; y < cadenas.length; y++)
					{System.out.print((y+1)+". "+cadenas[posicion]+".\t"); posicion++;}
					System.out.println();
				}
			}
			int posicion2=0;
			System.out.println("\tEl resultado mostrando en filas de 2 elementos\n");
			
			for(int i =0; i < (cadenas.length/2); i++) 
			{
				if(i<1) 
				{
					for(int x=0; x < 3; x++) 
					{System.out.print((x+1)+". "+cadenas[posicion2]+".\t");posicion2++;}
					System.out.println();
				}
				else 
				{
					//for(int y=2; y < cadenas.length; y++)
					System.out.print("4. "+cadenas[posicion2]+".\t"); posicion2++;
					System.out.println();
				}
			}
			
	}	// cierre del main
}