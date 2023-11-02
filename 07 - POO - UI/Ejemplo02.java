import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class Ejemplo02{
	public static void main(String[] args) {
		Font fuente = new Font("Arial", Font.BOLD, 30);
		Color color_red = new Color(255, 100, 100);

		// JFrame -> Ventanas
		JFrame ventana01 = new JFrame();
		ventana01.setTitle("VENTANA 02");
		ventana01.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		ventana01.setLocation(500,100);
		ventana01.setSize(600, 600);
		ventana01.setLocationRelativeTo(null);
		ventana01.setResizable(false);

		JPanel contenedor = new JPanel();
		contenedor.setLayout(new GridLayout(8,8));
		contenedor.setBackground( Color.WHITE );

		JLabel arreglo[][] = new JLabel[8][8];
		int contador = 1;
		for (int i=0; i<8; i++) {
			for (int j=0; j<8; j++) {
				JLabel etq_temp = new JLabel("");
				etq_temp.setFont(fuente);
				etq_temp.setHorizontalAlignment(JLabel.CENTER);
				etq_temp.setOpaque(true);

				if (contador%2==0) {
					etq_temp.setBackground(Color.BLACK);
					etq_temp.setForeground(Color.WHITE);
				}else{
					etq_temp.setBackground(Color.WHITE);
					etq_temp.setForeground(Color.BLACK);
				}

				arreglo[i][j] = etq_temp;
				contenedor.add( arreglo[i][j] );
				if (j<7) {
					contador++;
				}
			}
		}

		for (int i=0; i<8; i++) {
			arreglo[i][1].setText("PB");
			arreglo[i][6].setText("PN");
		}
		
		arreglo[0][0].setText("TB");
		arreglo[1][0].setText("CB");
		arreglo[2][0].setText("AB");
		arreglo[3][0].setText("RYB");
		arreglo[4][0].setText("RNB");
		arreglo[5][0].setText("AB");
		arreglo[6][0].setText("CB");
		arreglo[7][0].setText("TB");

		arreglo[0][7].setText("TN");
		arreglo[1][7].setText("CN");
		arreglo[2][7].setText("AN");
		arreglo[3][7].setText("RYN");
		arreglo[4][7].setText("RNN");
		arreglo[5][7].setText("AN");
		arreglo[6][7].setText("CN");
		arreglo[7][7].setText("TN");

		ventana01.add(contenedor);
		ventana01.revalidate();
		ventana01.setVisible(true);
	}
}