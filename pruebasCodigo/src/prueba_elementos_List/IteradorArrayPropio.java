package prueba_elementos_List;

import java.util.Iterator;

public class IteradorArrayPropio <T> implements Iterator<T>
{
	//TODO A�adir los atributos necesarios
	public IteradorArrayPropio(T[] array)
	{
	//TODO Hacer las inicializaciones necesarias
	}
	@Override
	public boolean hasNext()
	{
	// TODO Rellenar el m�todo comprobadando si existe siguiente
	return false;
	}
	@Override
	public T next()
	{
	// TODO Devolvemos el objeto actual y avanzamos una posici�n
	return null;
	}

	
	
	
	
	
}
/*
import java.util.Iterator;
public class IteradorArrayPropio<T> implements Iterator<T>
{
    T[] miArray;
    int miIndice;
    
    //TODO A�adir los atributos necesarios
    public IteradorArrayPropio(T[] array)
    {
        miArray=array;
        miIndice=0;
    }
    @Override
    public boolean hasNext()
    {
        /*boolean resultado=true;
        try
        {
            T actual=miArray[miIndice];
        }catch(Exception e)
        {
            resultado=false;
        }*/
        /*
        return miIndice<miArray.length;
    }
    @Override
    public T next()
    {
        T actual=miArray[miIndice];
        miIndice++;
        return actual;
    }
} 
*/