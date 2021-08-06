package constructores.app;
import java.util.Scanner;
public class CreacionEspectadores {
	
	//Esta clase fue creada para crear los espectadores y asignarlos a un array de objetos que luego usare para sentarlos.
	
	private Espectador espectadores[]; //Array de objeto
	
	//Metodo para crear la cantidad de espectadores que el cliente diga.
	public void crearEspectadores() {
		try { //Try para ver si el valor ingresado por el cliente es correcto, sino saltara mensaje de error.
			Scanner sc = new Scanner(System.in);
			System.out.println("Cuantos espectadores van a intentar ingresar a la sala?");
			int cantidadEspectadores = sc.nextInt(); // Pide numero entero por consola para ver cuantos espectadores se crearan
			
			espectadores = new Espectador[cantidadEspectadores]; //El largo del array es la cantidad de espectadores que crearan.

			
			//Bucle para crear las instancias de objeto con los parametros solicitados. Nombre edad dinero booleano.
			for (int i = 0; i < cantidadEspectadores; i++) { // Loop para crear  //
				Espectador espectador = new Espectador();
				espectador.getNombre();
				espectador.getEdad();
				espectador.getDinero();
				espectador.isPuedeIngresar();
				espectadores[i] = espectador; //Asigna cada instancia de objeto a la posicion i del array de objetos
			}
		} catch (Exception e) { //Mensaje de error y se reinicia el programa si ingresa algo distinto a numero entero.
			// TODO: handle exception
			System.err.println("\n ----VALOR INCORRECTO.----\n ----INGRESE NUMERO ENTERO.----");
			crearEspectadores();
//			System.exit(0);
		}
	}
	//Getters y setters
	public Espectador[] getEspectadores() {
		return espectadores;
	}

	public void setEspectadores(Espectador[] espectadores) {
		this.espectadores = espectadores;
	}
	
	//Metodo para imprimir espectadores
	public void imprimirEspectadores() {
		System.out.println("\n----Espectadores creados----");
		for(Espectador num : espectadores) {
	System.out.println("Nombre: " + num.getNombre() + " - Edad: " + num.getEdad() + " - Dinero: " + num.getDinero() + " - " + num.isPuedeIngresar());
		}
	}
}

