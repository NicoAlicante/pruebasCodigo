package EjercicioExamenN3;

import java.util.Scanner;

public interface AdoptarPerros 
{
	
	public static final Scanner teclado = new Scanner(System.in);
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
		Perro p1= new Perro(nombre,raza,mordisco,olfato,velocidad);
	
	}

}