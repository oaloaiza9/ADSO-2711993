import javax.swing.*;
import java.awt.*;

public class TableroAjedrez extends JFrame{

	JLabel tablero[][];

	public TableroAjedrez(){
		tablero = new JLabel[8][8];
		initComponents();
	}

	public void initComponents(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 600);
		setLocationRelativeTo(null);

		JPanel contenedor = new JPanel();
		contenedor.setBackground(Color.WHITE);
		contenedor.setLayout(new GridLayout(8,8));

		int cont = 1;
		for (int i=0; i<tablero.length; i++) {
			for (int j=0; j<tablero[i].length; j++) {
				tablero[i][j] = new JLabel();
				
				tablero[i][j].setOpaque(true);
				tablero[i][j].setBackground((cont%2==0)? Color.WHITE : Color.BLACK);
				tablero[i][j].setForeground((cont%2==0)? Color.BLACK : Color.WHITE);
				tablero[i][j].setFont(new Font("Arial", Font.BOLD, 28));
				tablero[i][j].setHorizontalAlignment(JLabel.CENTER);
				
				contenedor.add(tablero[i][j]);
				cont += (j<tablero[i].length-1)? 1 : 0;
			}
		}

		tablero[0][0].setText("TB");
		tablero[1][0].setText("CB");
		tablero[2][0].setText("AB");
		tablero[3][0].setText("RYB");
		tablero[4][0].setText("RNN");
		tablero[5][0].setText("AB");
		tablero[6][0].setText("CB");
		tablero[7][0].setText("TB");
		for (int i=0; i<tablero.length; i++) {
			tablero[i][1].setText("PN");
		}


		tablero[0][7].setText("TB");
		tablero[1][7].setText("CB");
		tablero[2][7].setText("AB");
		tablero[3][7].setText("RNN");
		tablero[4][7].setText("RYB");
		tablero[5][7].setText("AB");
		tablero[6][7].setText("CB");
		tablero[7][7].setText("TB");
		for (int i=0; i<tablero.length; i++) {
			tablero[i][6].setText("PB");
		}

		add(contenedor);
		setVisible(true);
		revalidate();
	}

}
