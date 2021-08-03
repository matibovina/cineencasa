package constructores.app;
import java.util.Random;


public class SentarEspectadores {
	
	Random r = new Random(); //Metodo random para crear ubicaciones aleatorias en la sala.
	private String[][] sala = new String[8][9]; //matriz de String para generar sala inicial
	private String salaOcupada[][] = new String[8][9]; //matriz de String para asignar espectadores asientos.
	//Array de String para guardar solo Espectadores que cumplan la condicion de Edad y Dinero.
	private String espectIngresa[] = new String[salaOcupada.length*salaOcupada[0].length]; 
	
	//Metodo para crear la distribucion de los asientos de la sala usando como parametro la instancia de la Clase Sala
	public void crearSala(Sala sala1) {	
	System.out.println("\n----ASIENTOS DISPONIBLES----");
	String  letra[] = new String[] {"A", "B", "C", "D", "E", "F", "G", "H", "I"}; //Array de letras de cada fila
	for (int i = 7; i >= 0; i--) {
		for (int j = 0; j < letra.length; j++) {
			sala1.setAsientos((i+1) + letra[j]); //creacion del nombre de cada asiento.
			sala[i][j] = sala1.getAsientos(); // Asigna el nombre del asiento a la ubicacion de la matriz.
			System.out.print(sala[i][j] + " "); // imprime la fila 
		}
		System.out.println();
	}
	System.out.println();
}
	//Metodo para guardar el nombre del Espectador que cumplio la condicion de dinero y edad 
	//Solo se guardaran hasta 72 espectadores que es la capacidad de la sala.
public void guardarNombre(CreacionEspectadores creacionEspectadores, Cine cine, CreacionPelicula nuevaPelicula) {
	
	int y = 0;
	for(int i = 0; i < creacionEspectadores.getEspectadores().length; i++) {
		creacionEspectadores.getEspectadores()[i].pagarEntrada(cine, nuevaPelicula); //funcion de Espectador para comprobar si tiene edad y dinero
		if(creacionEspectadores.getEspectadores()[i].isPuedeIngresar() && y < espectIngresa.length) {//si es true y la sala tiene lugar se asigna al array espectIngresa
			espectIngresa[y] = creacionEspectadores.getEspectadores()[i].getNombre();
			y++;
		}
	}
}
//Metodo para ocupar los asientos. Utiliza como argumentos a Sala y CreacionEspectadores 
public void ocuparAsientos(Sala sala1, CreacionEspectadores creacionEspectadores) {
	//int i = 0;
	int x = 0; //indice de filas
	int y = 0; //indice de columnas
	int i = 0; //indice que recorre el array de espectIngresa
	System.out.println("----Espectadores que ingresan a la sala----");
	while (i < espectIngresa.length) {
		
		x = r.nextInt(8); //generacion de numero aleatorio para fila
		y = r.nextInt(9); //generacion de numero aleatorio para columna

		char inicial; //Variable para guardar letra inicial del nombre del espectador (mas prolijo para imprimir)
		
		if (espectIngresa[i] == null) { 
			espectIngresa[i] = "-"; //funcion para modificar el valor null por caracter "-" en caso de que el array tenga nulls.
		}
		inicial = espectIngresa[i].charAt(0); //se guarda la inicial de espectador
		
		if(salaOcupada[x][y] == null) { //si el asiento de salaOcupada esta vacio(null) se asigna un espectador en esa posicion.
			if(espectIngresa[i] != "-") {
				System.out.println(sala[x][y] + ": " + espectIngresa[i]);	
			}
			salaOcupada[x][y] = (sala[x][y] + ": " + inicial);
			i++;
		}
	}
	//Se imprime la sala con la inicial de los espectadores o con "-" si el asiento esta vacio.
	System.out.println("\n----ASIENTOS OCUPADOS----");
	for(String[] num : salaOcupada) {
		for(String fila : num) {
			System.out.print(fila + " ");
		}
		System.out.println();
	}
  }
	//metodo para imprimir asiento y nombre del espectador que ingreso 
}
