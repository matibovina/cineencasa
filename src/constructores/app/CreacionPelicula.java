package constructores.app;

public class CreacionPelicula {
	
	private Pelicula peliculas []; //Array de objeto para almacenar la informacion de la pelicula
	
	public Pelicula[] getPeliculas() {
		return peliculas;
	}
	public void setPeliculas(Pelicula[] peliculas) {
		this.peliculas = peliculas;
	}
	//Metodo para asignar la informacion de la pelicula en el array de objetos
	public void crearPelicula() {
			peliculas = new Pelicula[2]; 
			Pelicula pelicula = new Pelicula(); //Nueva instancia de pelicula
			pelicula.getTituloPelicula(); //asigna titulo
			pelicula.getDuracionPelicula(); //asigna duracion
			pelicula.getEdadMinima(); //asigna edad minima
			pelicula.getDirectorPelicula(); //asigna director
			peliculas[0] = pelicula; //asigna a la posicion 0 del array la instancia el objeto pelicula.
	}
	//Metodo para imprimir la informacion de la pelicula 
	public void imprimirDatosPeli() {
		System.out.println("-Duracion: " + peliculas[0].getDuracionPelicula() + " min.-\n"+
			"-Edad minima: " + peliculas[0].getEdadMinima() + " años.-\n" +
			"-Director: " + peliculas[0].getDirectorPelicula() + ".-\n");
	}
}
