package prueba_elementos_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class principalPrueba1 
{
	//1
	private static void pruebaArrayFor()
	{
		String array[]=new String[20];
		for(int i=0; i<array.length; i++)array[i]="String"+i;
		for(int i=0; i<array.length; i++)System.out.println(array[i]);}
	//2
	private static void pruebaArrayForEach()
	{
		String array[]=new String[20];
		int i=0;
		for(String actual:array)actual="String"+(i++);
		for(String actual:array)System.out.println(actual);	}	
	//3
	private static void pruebaArrayListFor()
	{
		ArrayList<String> miArrayList=new ArrayList<>();
		for(int i=0; i<20; i++)	miArrayList.add("String"+i);
		for(int i=0; i<miArrayList.size(); i++) System.out.println(miArrayList.get(i));	}
	//4
	private static void pruebaArrayListForIni()
	{
		ArrayList<String> miArrayList=new ArrayList<>();
		for(int i=0; i<20; i++) miArrayList.add(null);
		for(int i=0; i<20; i++)	{ String actual=miArrayList.get(i);actual="String"+i; }
		for(int i=0; i<miArrayList.size(); i++)	System.out.println(miArrayList.get(i));	}
	//5
	private static void pruebaArrayListForEach()
	{
		ArrayList<String> miArrayList=new ArrayList<>();
		for(int i=0; i<20; i++) miArrayList.add(null);
		int i=0;
		for(String actual:miArrayList) actual="String"+(i++);
		for(String actual:miArrayList) System.out.println(actual);	}
	//6
	private static void pruebaArrayListIterator()
	{
		ArrayList<String> miArrayList=new ArrayList<>();
		for(int i=0; i<20; i++) miArrayList.add(null);
		int i=0; Iterator<String> itInicio=miArrayList.iterator();
		while(itInicio.hasNext()){ String actual=itInicio.next(); actual="String"+(i++); }
		Iterator<String> it=miArrayList.iterator();
		while(it.hasNext()) System.out.println(it.next());	}

	
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		int menu=0; boolean salir=false;
		while(salir==false) {
			System.out.println("escoge una opcion");
			for(int i =1; i <=6; i++) {System.out.println(i+" opcion ["+i+"]");}
			System.out.println("0 Salir.");

			for(int i =0; i<1;i++)
			{
				try {menu = Integer.parseInt(teclado.nextLine());}
				catch(Exception e) {i--; System.out.println("opcion inválida");}
			}
			switch (menu)
			{
			case 1:{pruebaArrayFor();break;}
			case 2:{pruebaArrayForEach();break;}
			case 3:{pruebaArrayListFor();break;}
			case 4:{pruebaArrayListForIni();break;}
			case 5:{pruebaArrayListForEach();break;}
			case 6:{pruebaArrayListIterator();break;}
			case 0:{salir=true;break;}
			default: {System.out.println("opcion no válida");}
			}
	
		}
		teclado.close();
		
		
		
		
		
		
		
	} // --------------------{ close of main

}	// ------------------[ close of the class
