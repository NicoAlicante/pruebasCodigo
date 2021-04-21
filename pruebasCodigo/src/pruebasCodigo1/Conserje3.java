package pruebasCodigo1;

import java.util.Scanner;

public class Conserje3
{
	//private static Hijo []h =new Hijo [3];
	private static Vecina [] a = new Vecina [4];
	private static int indice=0;
	private static Scanner teclado = new Scanner(System.in);
	
	public static void agregarHobbie()
	{
		
		for(int i =0; i < a.length; i++)
		{
			if(a[i]!=null){if(indice==a.length){ indice=4; } else{indice++; break;}}
		}
		if(indice < a.length)
		{
			Vecina aux = new Vecina();
			aux=introducirDatosV(); 
			a[indice]=new Vecina();
			a[indice].setNomHobbie(aux.getNomHobbie());
			a[indice].setLocalidad(aux.getLocalidad());
			a[indice].setNumPersonas(aux.getNumPersonas());
		} 	

	}	/* -------------------> |final prcedimiento|----------------------------->*/
	
	public static void visualizar() {for(Vecina lista :a) System.out.println(lista);}
	
	
		
	public static Vecina introducirDatosV()
	{
		Vecina hobbie=new Vecina();
		int n=0;
		System.out.print("introduce el nombre del hobbie ");
		hobbie.setNomHobbie(teclado.nextLine());
		System.out.print("introduce donde sueles realizarlo ");
		hobbie.setLocalidad(teclado.nextLine());
		for(int i = 0; i<1;i++)
		{
			try	{System.out.print("¿Con cuántas personas sueles realizarlo? ");	n=Integer.parseInt(teclado.nextLine());			}
			catch(Exception e) {i--;System.out.println("error al introducir tipo de dato");}
		}
		hobbie.setNumPersonas(n);
		return hobbie;
	}
	
	public static void main(String[] args) 
	{	
		boolean continuar=true;
		int menu=1;
		while(continuar==true) 
		{
			for(int i =0; i<1; i++) 
			{
				System.out.println("1. Introducir dato.");
				System.out.println("2. Mostrar aficiones.");
				System.out.println("0. Salir ,"+continuar);
				try {menu=Integer.parseInt(teclado.nextLine());}
				catch(Exception e) {System.out.println("dato erroneo, inténtelo de nuevo");i--;}
			}
			switch (menu)
			{
			case 1:{System.out.println(indice);if(indice < a.length) agregarHobbie(); else System.out.println("no se pueden añadir nuevas aficiones, has completado el cupo");break;}
			case 2:{System.out.println(indice);visualizar();break;}
			case 0:{continuar=false;System.out.println("Esta mañana ,"+continuar);break; }
			default: System.out.println("opcion no disponible temporalmente");
			}
		}
				
		teclado.close();
	}			/*-------------------fin menu principal----------------------------*/
}
/*
for(Hijo inquilino: h) {System.out.println(inquilino);}	
agregarHobbie();
for(Hijo v: h) {System.out.println(v);}
agregarHobbie();
for(Hijo v: h) {System.out.println(v);}
teclado.close();
*/