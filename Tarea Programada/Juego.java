public class Juego{
	
	//Atributos
	public int gamemode;
	//1 es contra la compu, 2 es HotSeat.
	public int cantidadFichas;

	//Métodos
	public void chooseGamemode(int gamemodeID){
		if(gamemodeID == 1){
			gamemode = 1;
			System.out.println("Modo de juego seleccionado: rival virtual.");
		}
		else if(gamemodeID == 2){
			gamemode = 2;
			System.out.println("Modo de juego seleccionado: HotSeat.");
		}
			
		else{
			System.out.println("Valor inválido. Vuelve a intentarlo.");
			System.exit(0);
		}
	}

	public void chooseNumFichas(int numFichas){
		if(numFichas == 6){
			cantidadFichas = 6;
			System.out.println("La mayor ficha será [6|6].");
		}
		else if(numFichas == 7){
			cantidadFichas = 7;
			System.out.println("La mayor ficha será [7|7].");
		}
		else if(numFichas == 8){
			cantidadFichas = 8;
			System.out.println("La mayor ficha será [8|8].");
		}
		else{
			System.out.println("Valor inválido. Vuelve a intentarlo.");
			System.exit(0);
		}
	}

	public void generarFichas(){ //SE REQUIERE LA CLASE FICHA PARA, CON UN CICLO, GENERAR TODAS LAS FICHAS.

	}
}