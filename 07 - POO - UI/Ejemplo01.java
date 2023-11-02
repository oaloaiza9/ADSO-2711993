import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class Ejemplo01{
	public static void main(String[] args) {
		Font fuente = new Font("Arial", Font.BOLD, 80);
		Color color_red = new Color(255, 100, 100);

		// JFrame -> Ventanas
		JFrame ventana01 = new JFrame();
		ventana01.setTitle("VENTANA 01");
		ventana01.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		ventana01.setLocation(500,100);
		ventana01.setSize(500, 500);
		ventana01.setLocationRelativeTo(null);
		ventana01.setResizable(false);

		JPanel contenedor = new JPanel();
		contenedor.setLayout(new GridLayout(3,3));
		contenedor.setBackground( Color.WHITE );

		JLabel etq_01 = new JLabel();
		etq_01.setText("X");
		etq_01.setFont(fuente);
		etq_01.setForeground(color_red);
		etq_01.setHorizontalAlignment(JLabel.CENTER);

		JLabel etq_02 = new JLabel();
		etq_02.setText("O");
		etq_02.setFont(fuente);
		etq_02.setForeground(color_red);
		etq_02.setHorizontalAlignment(JLabel.CENTER);
		etq_02.setOpaque(true);

		JLabel etq_03 = new JLabel();
		etq_03.setText("X");
		etq_03.setFont(fuente);
		etq_03.setForeground(color_red);
		etq_03.setHorizontalAlignment(JLabel.CENTER);

		JLabel etq_04 = new JLabel();
		etq_04.setText("O");
		etq_04.setFont(fuente);
		etq_04.setForeground(color_red);
		etq_04.setHorizontalAlignment(JLabel.CENTER);
		etq_04.setOpaque(true);

		JLabel etq_05 = new JLabel();
		etq_05.setText("X");
		etq_05.setFont(fuente);
		etq_05.setForeground(color_red);
		etq_05.setHorizontalAlignment(JLabel.CENTER);

		JLabel etq_06 = new JLabel();
		etq_06.setText("O");
		etq_06.setFont(fuente);
		etq_06.setForeground(color_red);
		etq_06.setHorizontalAlignment(JLabel.CENTER);
		etq_06.setOpaque(true);

		JLabel etq_07 = new JLabel();
		etq_07.setText("X");
		etq_07.setFont(fuente);
		etq_07.setForeground(color_red);
		etq_07.setHorizontalAlignment(JLabel.CENTER);

		JLabel etq_08 = new JLabel();
		etq_08.setText("O");
		etq_08.setFont(fuente);
		etq_08.setForeground(color_red);
		etq_08.setHorizontalAlignment(JLabel.CENTER);
		etq_08.setOpaque(true);

		JLabel etq_09 = new JLabel();
		etq_09.setText("X");
		etq_09.setFont(fuente);
		etq_09.setForeground(color_red);
		etq_09.setHorizontalAlignment(JLabel.CENTER);
		

		contenedor.add(etq_01);
		contenedor.add(etq_02);
		contenedor.add(etq_03);
		contenedor.add(etq_04);
		contenedor.add(etq_05);
		contenedor.add(etq_06);
		contenedor.add(etq_07);
		contenedor.add(etq_08);
		contenedor.add(etq_09);

		ventana01.add(contenedor);
		ventana01.revalidate();
		ventana01.setVisible(true);
	}
}