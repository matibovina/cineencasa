package constructores.app;

public class Pelicula {
	
	private String tituloPelicula; //Titulo de la Pelicula
	private int duracionPelicula; // Duracion de la Pelicula
	private int edadMinima; // Edad Minima para ingresar.
	private String directorPelicula; // Director de la pelicula
	
	//Arrays para generar Peliculas de forma aleatoria. 
	// Los datos de la pelicula son totalmente aleatorios solo para jugar un poco mas.
	private String [] peliculaRandom = new String [] {"Cadena perpetua", "El padrino", "El padrino: Parte II", "El caballero oscuro", "12 hombres sin piedad", 
			"La lista de Schindler", "Pulp Fiction", 
			"El bueno, el feo y el malo", "El club de la lucha", "Matrix" };
	private String [] directorRandom = new String [] {"Pedro Almodóvar", "Wes Anderson", "Darren Aronofsky", "Michael Bay", "Christopher Nolan", 
			"Danny Boyle", "Tim Burton", 
			"Damien Chazelle", "Hermanos Coen", "Isabel Coixet" };
	protected int [] duracionRandom = new int [] {90, 120, 140, 180, 210, 240};
	protected int [] edadRandom = new int [] {0, 13, 16, 18};
	
	//Constructor
	public Pelicula() {
		setTituloPelicula(tituloPelicula);
		setDuracionPelicula(duracionPelicula);
		setEdadMinima(edadMinima);
		setDirectorPelicula(directorPelicula);
	}
	
	// Getters y setters
	public String getTituloPelicula() {
		return tituloPelicula;
	}
	
	//numero random para elegir el titulo de la pelicula dentro del array.
	public void setTituloPelicula(String tituloPelicula) {
		this.tituloPelicula = peliculaRandom[(int)(Math.random()*9)];;
	}

	public int getDuracionPelicula() {
		return duracionPelicula;
	}


	//numero random para elegir la duracion de la pelicula dentro del array.
	public void setDuracionPelicula(int duracionPelicula) {
		this.duracionPelicula = duracionRandom[(int)(Math.random()*4)];
	}

	public int getEdadMinima() {
		return edadMinima;
	}
	//Numero random para elegir la edad minima de la pelicula
	public void setEdadMinima(int edadMinima) {
		this.edadMinima = edadRandom[(int)(Math.random()*4)];
	}

	public String getDirectorPelicula() {
		return directorPelicula;
	}
	//numero random para elegir el director de la pelicula dentro del array.
	public void setDirectorPelicula(String directorPelicula) {
		this.directorPelicula = directorRandom[(int)(Math.random()*9)];
	}

}