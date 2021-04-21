package EjercicioExamenN3;

import java.util.Scanner;

public class principalMain 
{
	/*-------------- Para funciones, procedimientos y variables static ---------------*/
	static private Perro p1;
	static private Gato g1;
	static Scanner teclado;
	
	public static void adoptarGatos()
	{
		String nombre, raza;
		int vista=0,oido=0,reflejos=0, valor;
		System.out.print("Introduce el nombre de la máscota ");
		nombre=teclado.nextLine();
		System.out.print("\nIntrdoduce la raza de la mascota ");
		raza=teclado.nextLine();
		System.out.print("\nIntroduce habilidad de vista [1-100] ");
		for(int intentos =0; intentos< 1; intentos++)
		{
			try 
			{
				valor=Integer.parseInt(teclado.nextLine());
				if(valor<100 && valor>0) {vista=valor;}
				else {intentos--;System.out.println("El valor debe estar comprendido dentro del rango.");}
			}
			catch (Exception e) {intentos--;System.out.println("el tipo de dato introducido es erróneo");}
		}
		System.out.print("\nIntroduce habilidad del oido [1-100] ");
		for(int intentos =0; intentos< 1; intentos++)
		{
			try 
			{
				valor=Integer.parseInt(teclado.nextLine());
				if(valor<100 && valor>0) {oido=valor;}
				else {intentos--;System.out.println("El valor debe estar comprendido dentro del rango.");}
			}
			catch (Exception e) {intentos--;System.out.println("el tipo de dato introducido es erróneo");}
		}
		System.out.print("\nIntroduce habilidad de reflejos [1-100] ");
		for(int intentos =0; intentos< 1; intentos++)
		{
			try 
			{
				valor=Integer.parseInt(teclado.nextLine());
				if(valor<100 && valor>0) {reflejos=valor;}
				else {intentos--;System.out.println("El valor debe estar comprendido dentro del rango.");}
			}
			catch (Exception e) {intentos--;System.out.println("el tipo de dato introducido es erróneo");}
		}
		g1= new Gato(nombre,raza,vista,oido,reflejos);
	}
//	/*
	public static void adoptarPerros()
	{
		String nombre, raza;
		int mordisco=0,olfato=0,velocidad=0, valor;
		System.out.print("Introduce el nombre de la máscota ");
		nombre=teclado.nextLine();
		System.out.print("\nIntrdoduce la raza de la mascota ");
		raza=teclado.nextLine();
		System.out.print("\nIntroduce potencia del mordisco [1-100] ");
		for(int intentos =0; intentos< 1; intentos++)
		{
			try 
			{
				valor=Integer.parseInt(teclado.nextLine());
				if(valor<100 && valor>0) {mordisco=valor;}
				else {intentos--;System.out.println("El valor debe estar comprendido dentro del rango.");}
			}
			catch (Exception e) {intentos--;System.out.println("el tipo de dato introducido es erróneo");}
		}
		System.out.print("\nIntroduce habilidad del olfato [1-100] ");
		for(int intentos =0; intentos< 1; intentos++)
		{
			try 
			{
				valor=Integer.parseInt(teclado.nextLine());
				if(valor<100 && valor>0) {olfato=valor;}
				else {intentos--;System.out.println("El valor debe estar comprendido dentro del rango.");}
			}
			catch (Exception e) {intentos--;System.out.println("el tipo de dato introducido es erróneo");}
		}
		System.out.print("\nIntroduce habilidad de velocidad [1-100] ");
		for(int intentos =0; intentos< 1; intentos++)
		{
			try 
			{
				valor=Integer.parseInt(teclado.nextLine());
				if(valor<100 && valor>0) {velocidad=valor;}
				else {intentos--;System.out.println("El valor debe estar comprendido dentro del rango.");}
			}
			catch (Exception e) {intentos--;System.out.println("el tipo de dato introducido es erróneo");}
		}
		p1= new Perro(nombre,raza,mordisco,olfato,velocidad);
	
	}
//	*/
	public static boolean cazar()
	{
		boolean cazado=false;
		
	
		return cazado;
		
	}	/*------------------ cierre de la funcion cazar*/	
	
	public static void main(String[] args) 
	{
//	/*	
		/*------------------Attributes----------------*/
		
		int menu=0; boolean salir=false, cazado=false;
		String [] opcionesMenu = {"Adoptar perro","Adoptar gato","juego cazar"};
		teclado=new Scanner(System.in);
		while(salir == false)
		{
			for(int i =0; i < opcionesMenu.length; i++)
				{System.out.println((i+1)+".. "+opcionesMenu[i]+".");}
		
			System.out.println("0.. Salir.");
			for(int intentos=0; intentos <1; intentos++)
				{try {System.out.print("Escoge una opcion de juego");menu=Integer.parseInt(teclado.nextLine());}
				catch(Exception e) {intentos--; System.out.println("Error al introducir la opción");}}
			
			switch (menu)
			{
			case 1:{adoptarPerros();break;} case 2:{adoptarGatos();break;} case 3:{cazado=p1.cazar(g1);break;}
			case 0:{System.out.println("Hasta otra ocasión");salir=true;break;}
			default:{System.out.println("La opción introduciza, aún está en mantenimiento.");}
			}
		}				//cierre del while
//	*/		
		if(cazado==true) System.out.print("El perro ha cazado al gato");
		else System.out.println("El gato se ha escapado");
	teclado.close();	
	
	
	
	}		//------------------------------------->{cierre del main}

}				/***********[close of the class]**********/
