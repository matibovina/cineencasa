package constructores.app;

public class Cine {

	private String peliculaReproduciendo; //Titulo de la pelicula que la sala va a reproducir
	private double precioEntrada = 50; //Valor de la entrada

	//Constructor
	public Cine() {
		// TODO Auto-generated constructor stub		
	}	
	
	//Getters y setters
	public String getPeliculaReproduciendo() {
		return peliculaReproduciendo;
	}
	public void setPeliculaReproduciendo(String peliculaReproduciendo) {
		this.peliculaReproduciendo = peliculaReproduciendo;
	}
	public double getPrecioEntrada() {
		return precioEntrada;
	}

	public void setPrecioEntrada(double precioEntrada) {
		this.precioEntrada = precioEntrada;
	}
	
	//Metodo para imprimir la informacion del cine
	@Override
	public String toString() {
		return "PELICULA: " + "--->" + peliculaReproduciendo + "<---" +
				"\n-Precio: " + precioEntrada + "€.-";
	}

}