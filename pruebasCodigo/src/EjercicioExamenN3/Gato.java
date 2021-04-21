package EjercicioExamenN3;

public class Gato extends Animal 
{
	static int vidas;
	/*<<<<<<<<<<<<<<<<<<<<<<<<<|Attributes|>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
	private int vista,oido, reflejos; 
	
	/*--------------------|Constructions|------------------------------*/
	static {vidas = 7;}
	
	public Gato() {super();vista=0;oido=0;reflejos=0;}

	public Gato(String nombre) {super(nombre);}
	public Gato(String nombre, int vista) {super(nombre);this.vista=vista;this.oido=0;this.reflejos=0;}
	public Gato(String nombre, int vista, int oido) {this(nombre,vista);this.oido=oido;}
	public Gato(String nombre, int vista, int oido, int reflejos)
		{this(nombre,vista,oido);this.reflejos=reflejos;}

	public Gato(String nombre, String raza, int vista) {super(nombre, raza);this.vista=vista;}
	public Gato(String nombre, String raza, int vista, int oido) {this(nombre, raza, vista);this.oido=oido;}
	public Gato(String nombre, String raza, int vista, int oido, int reflejos) 
		{this(nombre, raza, vista, oido);this.reflejos=reflejos;}

	//<-------------------------------------[Methods]	
	/*** @return the vista*/public int getVista() {	return vista;}

	/*** @param vista the vista to set */public void setVista(int vista) {this.vista = vista;}

	/*** @return the oido */public int getOido() {return oido;}

	/*** @param oido the oido to set */public void setOido(int oido) {	this.oido = oido;}

	/*** @return the reflejos */public int getReflejos() {return reflejos;}

	/*** @param reflejos the reflejos to set */public void setReflejos(int reflejos) {this.reflejos = reflejos;}

	public int escapar() 
	{
		int habEscape=0;
		float habilidadMedia=(this.vista+this.oido+this.reflejos)/3;
		habEscape=(int)habilidadMedia;
		return habEscape;
	}
	







}
