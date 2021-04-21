/*Funcionalidad de agregar hobbies/asignaturas a un persona/alumno; mediante un menú contextual; diseñado para el ejercicio del examen de presonas/alumnos/profesores
  y asignaturas*/


package pruebasCodigo1;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Conserje4_addhobbiesXmenu
{
	private static Hijo [] h =new Hijo [3];
	private static Vecina [] a = new Vecina [4];
	private static int indice=0,indice2=0;
	private static Scanner teclado = new Scanner(System.in);
	public static String guardarComo;
	
	public static void agregarSocios()
	{
		String nombre, apellidos;
		int edad=0;
		for(int posicion=0; posicion < h.length; posicion++) {h[posicion] = new Hijo();}
		
		for(Hijo socios :h) {if(socios!=null) {if(indice2==2) {indice2=3;} else {indice2++;} break;}}
		
		if(indice2<h.length)
		{
			System.out.print("Introduce el nombre del nuevo socio: ");nombre=teclado.nextLine();
			System.out.print("\nIntroduce los apellidos del nuevo socio: ");apellidos=teclado.nextLine();
			for(int i=0; i<1; i++ ) 
			{
				System.out.print("\nIntroduce la edad del nuevo socio: ");
				try {edad=Integer.parseInt(teclado.nextLine());}
				catch(Exception e) {i--;System.out.println("Error de tipo de dato introducido");}
			}	//<------------------|cierre del for.
			
			h[indice2-1]= new Hijo(nombre,apellidos,edad);
			
		}	//---------------------------------------> [cerrar condicion if]
		else {System.out.println("No puedes agregar nuevos socios");}
		
		for(Hijo lista :h) {if(lista!=null) {System.out.println(lista);}}
	}		//}-----------------------------------> |cierre del método agregarSocios()
	
	
	
	
	public static void agregarHobbie()		//------------------------------------> para agregar hobbies/ asignaturas;
	{
		
		for(int i =0; i < a.length; i++){ if(a[i]!=null){ if(indice==a.length){ indice=4; } else{indice++;} break;}}
		if(indice < a.length)
		{
			Vecina aux = new Vecina();
			aux=introducirDatosV(); 					//-------------------------> llama a función para rellenar datos al usuario;
			a[indice]=new Vecina();
			a[indice].setNomHobbie(aux.getNomHobbie());
			a[indice].setLocalidad(aux.getLocalidad());
			a[indice].setNumPersonas(aux.getNumPersonas());
		} 	

	}	/* -------------------> |final procedimiento|----------------------------->*/
	
	public static void visualizar() {for(Vecina lista :a) System.out.println(lista);}//para mostrar los datos registados
	

		
	public static Vecina introducirDatosV()		// <------------------------------------------------[función para solicitar datos al usuario]
	{
		Vecina hobbie=new Vecina();
		int numPersonas=0;
		System.out.print("introduce el nombre del hobbie ");
		hobbie.setNomHobbie(teclado.nextLine());
		System.out.print("introduce donde sueles realizarlo ");
		hobbie.setLocalidad(teclado.nextLine());
		for(int i = 0; i<1;i++)
		{
			try	{System.out.print("¿Con cuántas personas sueles realizarlo? ");	numPersonas=Integer.parseInt(teclado.nextLine());			}
			catch(Exception e) {i--;System.out.println("error al introducir tipo de dato");}
		}
		hobbie.setNumPersonas(numPersonas);
		
		return hobbie;
	}
			//<-------------------------------------[Cierre de la funcio introducirDatosV()
	
	public static void menuVisualizarYseleccionar(Vecina [] a)//----------------------------------->{Método para visualizar y agregar hobbies/asignaturas}
	{
		boolean salir=false;
		int menu=0;
		while(salir==false) 
		{
			for(int i = 0; i < a.length;i++) {	if(a[i]!=null)System.out.println((i+1)+". "+a[i].getNomHobbie());	}	// --------->[Entorno visual
			System.out.println("0. Volver al menú principal.");


			for(int intentos =0; intentos < 1; intentos++) // ---------------------->{Parte funcional/ operacional
			{
				try {System.out.println("elige una afición para agregar de las que se muestra por pantalla"); menu=Integer.parseInt(teclado.nextLine()); }
				catch(Exception e) {intentos--; System.out.println("valor u opción incorrecta, vuelva a intentarlo");}
			}

			switch (menu)
			{
			case 1:{if(a[0]!=null) {insertHobbieAhijo(menu);} else {System.out.println("Lo sentimos, no hay nada que mostrar");}break;}
			case 2:{if(a[1]!=null) {insertHobbieAhijo(menu);} else {System.out.println("Lo sentimos, no hay nada que mostrar");}break;}
			case 3:{if(a[2]!=null) {insertHobbieAhijo(menu);} else {System.out.println("Lo sentimos, no hay nada que mostrar");}break;}
			case 4:{if(a[3]!=null) {insertHobbieAhijo(menu);} else {System.out.println("Lo sentimos, no hay nada que mostrar");}break;}
			case 0:{salir=true;System.out.println("Hasta la próxima vez.");break;}
			default: {System.out.println("Opción no válida");}
			}
		}
	}
		//----------------------------------------------> |cierre menuVisualizarYSeleccionar|
	
	public static void insertHobbieAhijo(int menu)
	{
		if(menu !=0) {String hobbie = a[menu-1].getNomHobbie();}
		
	}
	
	
	public static void menuSocios()
	{
		int menu=0; boolean volver=false;
		while(volver==false) {
			System.out.println("/***********{menú Socios}***************/\n");
			System.out.println("1. Nuevos Socios");	//-----------> en este apartado crearemos un nuevo objeto y además lo guardaremos en un archivo.
			System.out.println("2. Modificar Socios");	//---------->{en este apartado cargaremos los datos y modificaremos los datos del socio.
			System.out.println("3. Listado de Socios");
			System.out.println("4. Eliminar Socios");
			System.out.println("0. volver al menú principal");

			for(int i =0; i<1;i++) {try{menu=Integer.parseInt(teclado.nextLine());}catch(Exception e) {i--;System.out.println("valor incorrecto");}}

			switch (menu)
			{
			case 1:{agregarSocios();break;}
			case 2:{System.out.println("Estamos en estos momentos haciendo tareas de mantenimiento, disculpen las molestias.");break;}
			case 3:{System.out.println("Estamos en estos momentos haciendo tareas de mantenimiento, disculpen las molestias.");break;}
			case 4:{System.out.println("Estamos en estos momentos haciendo tareas de mantenimiento, disculpen las molestias.");break;}
			case 0:{volver=true;break;}
			default:{System.out.println("Esa opción no está disponible");}
			}

		}
	}
	
	public static void guardarCargar() throws IOException 
	{
		int menu=0; boolean volver=false;
		while(volver==false)
		{
			for(int i =0; i < 1; i++) 
			{
				try	{
				System.out.println("|---------- Menú Guardar/Cargar ------------|\n");
				System.out.println("1. Guardar archivo");
				System.out.println("2. Cargar archivo");
				System.out.println("0. Volver al menú anterior.");
				System.out.print("\n\nEscoge una opción de las que se muestran. ");
				menu=Integer.parseInt(teclado.nextLine());
				}
				catch(Exception e) {i--;System.out.println("Valor introducido es erróneo, vuelve a intentarlo");}
			}	//--------------------------> [ cierre del bucle for
			
			switch (menu)
			{
			case 1:{saveSocios(h);break;}
			case 2:{loadSocios();break;}
			case 0:{volver=true;break;}
			default:{System.out.println("Esa opción no existe por el momento.");}
			}		/*cierre del switch menu guardarCargar*/
		}		// 		<-----------------------------------[ cierre del bucle while. 
		}/*cierre del método guardarCargar()*/
	
	public static void saveSocios(Hijo []h) throws IOException 
	{
		boolean append=true;
		//for (Hijo listaSocios: h) {System.out.println(listaSocios);}
		ArrayList<Hijo> listaSocios=conversionAarrayList(h);
		System.out.print("Guardar el archivo como: ");
		
		guardarComo=teclado.nextLine();
		try
		(FileWriter fileWrite = new FileWriter(guardarComo, append);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWrite);)
		 
		{ for (Hijo socios : listaSocios) {bufferedWriter.write(socios.toString()); bufferedWriter.newLine(); }/*cierre del for*/	}//cierre del bloque del try
		catch(Exception e) {e.printStackTrace();}
		
		
	}/*Cierre del método gardar()*/
	
	public static void loadSocios() 
	{
		try (FileReader fileReader = new FileReader(guardarComo);BufferedReader bufferedReader = new BufferedReader(fileReader))
		{
			String textoFichero="";
			String linea = bufferedReader.readLine(); //lee una linea de texto y omite el \n final
			while(linea != null) 
			{
				//Ejemplo lectura para mostrar luego por pantalla lo que se ha leído
				textoFichero += linea + '\n'; //anyadimos el salto de linea 
				linea = bufferedReader.readLine(); 
			}
			System.out.println("Mostramos contenido del ARCHIVO " + guardarComo);
			System.out.println(textoFichero);
		}
		catch(Exception e) {e.printStackTrace();}
		//catch(FileNotFoundException fnfe) {fnfe.printStackTrace();}
		//catch(IOException ioe) {ioe.printStackTrace();}
	}/*cierre del método cargar*/
		
		
	private static ArrayList<Hijo> conversionAarrayList (Hijo []x) 
	{
		ArrayList <Hijo> lista = new ArrayList<>();
		for(Hijo listasSocios: x) {lista.add(listasSocios);}
		//for(Hijo x2: lista) {System.out.println(x2);}
		return lista;
	}
		
		
	
	
	
	
	
	public static void main(String[] args) throws IOException //--------------------------------------------->|menú principal|
	{	
		boolean continuar=true;
		int menu=1;
		while(continuar==true) 
		{
			for(int i =0; i<1; i++) //<-----------------------------------[parte gráfica
			{
				System.out.println("1. Introducir aficiones.");
				System.out.println("2. Mostrar aficiones.");
				System.out.println("3. Mostrar y seleccionar aficiones");
				System.out.println("4. Menú Socios");
				System.out.println("5. Guardar/Cargar.");
				System.out.println("0. Salir ");
				try {menu=Integer.parseInt(teclado.nextLine());}
				catch(Exception e) {System.out.println("dato erroneo, inténtelo de nuevo");i--;}
			}
			switch (menu)	//<------------------------------------------[parte lógica/operativa.
			{
			case 1:{System.out.println(indice);if(indice < a.length) agregarHobbie(); else System.out.println("no se pueden añadir nuevas aficiones, has completado el cupo");break;}
			case 2:{System.out.println(indice);visualizar();break;}
			case 3:{menuVisualizarYseleccionar(a);break;}
			case 4:{menuSocios();break;}
			case 5:{guardarCargar();break;}
			case 0:{continuar=false;System.out.println("Esta mañana ");break; }
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