package main.app;
import constructores.app.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("BIENVENIDO AL CINE!");
	//Creacion instancia de Pelicula
		CreacionPelicula nuevaPelicula = new CreacionPelicula();
		nuevaPelicula.crearPelicula();
	//Creacion instancia de Cine
		Cine cine = new Cine(); // el constructor obtiene titulo de pelicula y precio de entrada.
		cine.setPeliculaReproduciendo(nuevaPelicula.getPeliculas()[0].getTituloPelicula()); //Asignacion del titulo de la pelicula al Cine
		System.out.println(cine.toString()); // Imprime info del cine.
		nuevaPelicula.imprimirDatosPeli(); //Imprime informacion de la pelicula
	//Creacion instancia de Sala
		Sala sala1 = new Sala();
	//Creacion instancia de CreacionEspectadores y llamado al metodo crearEspectadores()
		CreacionEspectadores creacionEspectadores = new CreacionEspectadores();
		creacionEspectadores.crearEspectadores();
	//Creacion instancia de Sentar Espectadores donde estan todos los metodos para asignar asientos e imprimir la sala vacia
		SentarEspectadores sala2 = new SentarEspectadores();
		sala2.crearSala(sala1);
	//Llamado al metodo para guardar espectadores que cumplen la condicion en el array de espectIngresa	
		sala2.guardarNombre(creacionEspectadores, cine, nuevaPelicula);
	//Llamado al metodo para sentar e imprimir la sala 
		sala2.ocuparAsientos(sala1, creacionEspectadores);
	//Impresion de todos los espectadores creados con su informacion.
		creacionEspectadores.imprimirEspectadores();
		}
	}

/*
 	-----READ ME----
 	
	- Se creo cada clase solicitada: Espectador, Pelicula, Cine y Sala y se les asignaron los atributos solicitados.
	- Aparte se crearon las clases CreacionPelicula, CreacionEspectadores y SentarEspectadores.
	- En esas clases se encuentran los metodos para generar cada objeto, validaciones y sentar a los espectadores.
	- No me quedaba tan claro que se debia imprimir y que no asi que imprimi por consola la informacion que me parecio pertinente.
*/