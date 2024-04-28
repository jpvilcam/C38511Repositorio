import javax.swing.JOptionPane;
public class JuegoTesting{
	public static void main (String [] args){
			
		Juego juego1 = new Juego();
		InterfazDeJuego interfaz = new InterfazDeJuego();

			int gamemode1 = interfaz.askGamemode("Introduzca 1 para juego individual. Introduzca 2 para juego HotSeat.");
			juego1.chooseGamemode(gamemode1);

			int numfichas1 = interfaz.askNumFichas("Introduzca 6 para jugar hasta [6|6]. Introduzca 7 para jugar hasta [7|7]. Introduzca 8 para jugar hasta [8|8].");
			juego1.chooseNumFichas(numfichas1);
	}
}