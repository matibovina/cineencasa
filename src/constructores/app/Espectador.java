package constructores.app;
import java.util.Random;


public class Espectador {
	Random r = new Random(); //numero aleatorio
	private String nombre; //atributo Nombre
	private int edad; //atributo Edad
	private double dinero; //atributo dinero
	private boolean puedeIngresar; //booleano para ver si cumple las condiciones para ingresar.
	
	
	//Arrays de Nombres y Apellidos para luego generar nombres aleatorios.
	private String [] nombres = new String []{"Juan", "Claudia", "Mariano", "Lucila", "Carla", "Leo", "Laura", "Sofia", "Samuel",
			"Matias", "Ailen", "Fernanda", "Facundo", "Gisella", "Lautaro"};
	private String [] apellidos = new String []{"Gomez", "Ahumada", "Garcia", "Peralta", "Gutierrez", "Velez", "Velazquez", "Del Pino",
			"Perez", "Pisano", "Paz", "Castillo", "Castro", "Garzon", "Fernandez"};
	
	//Constructor / no terminaba de funcionar con el metodo tradicional "this.nombre = nombre etc por eso use setter".
	public Espectador() {
		// TODO Auto-generated constructor stub
		setNombre(nombre);
		setEdad(edad);
		setDinero(dinero);
	}

	//getters y setters
	
	public String getNombre() {
		return nombre;
	}

	//El nombre del espectador se genera usando una posicion aleatoria de nombres y apellidos /
	public void setNombre(String nombre) {
		this.nombre = nombres[r.nextInt(14)] + " " + apellidos[r.nextInt(14)];

	}


	public int getEdad() {
		return edad;
	}

	//La edad se genera con un numero aleatorio entre el 1 y el 80
	public void setEdad(int edad) {
		this.edad = r.nextInt(80);
	}


	public double getDinero() {
		return dinero;
	}

	//El dinero se genera con un numero aletorio entre el 1 y 300 y se redondea a 2 decimeales.
	public void setDinero(double dinero) {
		this.dinero = ((double)(Math.round((double)(Math.random()*300+1) * 100.0) / 100.0));
	}

	public boolean isPuedeIngresar() {
		return puedeIngresar;
	}

	public void setPuedeIngresar(boolean puedeIngresar) {
		this.puedeIngresar = puedeIngresar;
	}

	//Metodo para comprobar que tiene edad y dinero suficiente. 
	//Utiliza argumentos de la clase Cine y de la clase Creacion Pelicula para comparar.
	public boolean pagarEntrada(Cine cine, CreacionPelicula nuevaPelicula) {
	if (getDinero() >= cine.getPrecioEntrada() && getEdad() >= nuevaPelicula.peliculas[0].getEdadMinima()) {
		setPuedeIngresar(true);
	} 
	return isPuedeIngresar();
}

}