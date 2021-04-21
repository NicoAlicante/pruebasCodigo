package pruebasCodigo1.version2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorArchivos 
{
	private String guardarComo;
	private Scanner teclado;
	//private ArrayList<pruebasCodigo1.Hijo> socio = new ArrayList<>();
	
	//public GestorArchivos() {this.guardarComo="";}
	
	public void guardarSocios(ArrayList<pruebasCodigo1.Hijo> x) throws IOException 
	{
		
		boolean append=true;
		System.out.print("Guardar el archivo como: "); guardarComo=teclado.nextLine();
		
		FileWriter fileWrite = new FileWriter(guardarComo, append);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWrite);
		
		try { for ( pruebasCodigo1.Hijo listaSocio : x) {	bufferedWriter.write(listaSocio.toString()); bufferedWriter.newLine(); }/*close for*/ }/*close try*/
		catch(Exception e) {e.printStackTrace();}
	
	}/*Cierre del método gardar()*/
	
	public void cargarSocios() 
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
}
