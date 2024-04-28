import javax.swing.JOptionPane;
public class InterfazDeJuego{
	public int askGamemode(String mensaje){
		String gamemodeIDString = JOptionPane.showInputDialog(mensaje);
		int gamemodeID = 0;
		try{
			gamemodeID = Integer.parseInt(gamemodeIDString);
		}
		catch(NumberFormatException e){
			System.err.println("Me parece que eso no es un número. Detecté este error: " + e);
			System.exit(0);
		}
		return gamemodeID;
	}
	public int askNumFichas(String mensaje){
		String askNumFichasString = JOptionPane.showInputDialog(mensaje);
		int numFichas = 0;
		try{
			numFichas = Integer.parseInt(askNumFichasString);
		}
		catch(NumberFormatException e){
			System.err.println("Me parece que eso no es un número. Detecté este error: " + e);
			System.exit(0);
		}
		return numFichas;
	}
}
