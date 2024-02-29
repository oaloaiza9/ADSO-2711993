package principal;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import utils.ButtonEditor;
import utils.ButtonRenderer;
import utils.Mascota;
import utils.Medicamento;

public class TablaMascotas extends javax.swing.JFrame {

    DefaultTableModel modelo;
    Mascota listaMascotas []; 
    
    public TablaMascotas() {
        listaMascotas = new Mascota[100];
        listaMascotas[0] = new Mascota("Samantha", "PERRO", "8");
        listaMascotas[1] = new Mascota("Motas", "PERRO", "2");
        listaMascotas[2] = new Mascota("Manchas", "GATO", "1");
        listaMascotas[3] = new Mascota("Nieve", "PERRO", "15");
        
        Medicamento medicamento_01 = new Medicamento("Ibuprofeno", "01-01-2024", "29-02-2024");
        Medicamento medicamento_02 = new Medicamento("Omeprazol", "01-01-2024", "29-02-2024");
        Medicamento medicamento_03 = new Medicamento("Lozartan", "15-03-2023", "31-12-2023");
        Medicamento medicamento_04 = new Medicamento("Ibuprofeno", "01-03-2023", "31-12-2023");
        listaMascotas[0].listaMedicamentos[0] = medicamento_01;
        listaMascotas[0].listaMedicamentos[1] = medicamento_02;
        listaMascotas[0].listaMedicamentos[2] = medicamento_03;
        listaMascotas[0].listaMedicamentos[3] = medicamento_04;
        
        initComponents();
        initAlternComponents();
        imprimirMascotas();
    }
    
    public void initAlternComponents(){
        
        setIconImage(getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_mascota.png")));
        setTitle("Lista Mascotas");
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        
        modelo = (DefaultTableModel) tablaMascotas.getModel();
        
        tablaMascotas.getColumnModel().getColumn(4).setCellEditor(new ButtonEditor(new JCheckBox()));
        tablaMascotas.getColumnModel().getColumn(4).setCellRenderer(new ButtonRenderer());
        
        // Ajuste del Orden y Ancho de Columnas
        tablaMascotas.getTableHeader().setReorderingAllowed(false);
        tablaMascotas.getTableHeader().setResizingAllowed(false);
        
        // Centrar contenido de columnas
        DefaultTableCellRenderer centerRender = new DefaultTableCellRenderer();
        centerRender.setHorizontalAlignment(SwingConstants.CENTER);
        tablaMascotas.getColumnModel().getColumn(0).setCellRenderer(centerRender);
        tablaMascotas.getColumnModel().getColumn(2).setCellRenderer(centerRender);
        tablaMascotas.getColumnModel().getColumn(3).setCellRenderer(centerRender);
        
        // Alto de las filas
        tablaMascotas.setRowHeight(25);
        
        // Tamaño de Columnas
        tablaMascotas.getColumnModel().getColumn(0).setPreferredWidth(10);
        tablaMascotas.getColumnModel().getColumn(1).setPreferredWidth(300);
        tablaMascotas.getColumnModel().getColumn(2).setPreferredWidth(80);
        tablaMascotas.getColumnModel().getColumn(3).setPreferredWidth(30);
        tablaMascotas.getColumnModel().getColumn(4).setPreferredWidth(10);
    }
    
    public void imprimirMascotas(){
        modelo.setRowCount(0);
        for (int i=0; i<listaMascotas.length && listaMascotas[i]!=null; i++) {
            String nombre = listaMascotas[i].getNombre();
            String tipo = listaMascotas[i].getTipo();
            String edad = listaMascotas[i].getEdad();
            
            JButton btnMedicamentos = new JButton();
            btnMedicamentos.setBackground(Color.white);
            btnMedicamentos.setFocusable(false);
            Image icono_medicamento = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_medicamento.png"));
            icono_medicamento = icono_medicamento.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
            btnMedicamentos.setIcon(new ImageIcon(icono_medicamento));
            
            Object datos[] = new Object[]{ (i+1), nombre, tipo, edad, btnMedicamentos};
            modelo.addRow(datos);
            
            Mascota mascotaActual = listaMascotas[i];
            btnMedicamentos.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    TablaMedicamentos ventana = new TablaMedicamentos(mascotaActual);
                }
            });
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPrincipal = new javax.swing.JPanel();
        etqTitulo = new javax.swing.JLabel();
        etqNombre = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        etqTipo = new javax.swing.JLabel();
        campoTipo = new javax.swing.JComboBox<>();
        etqEdad = new javax.swing.JLabel();
        campoEdad = new javax.swing.JTextField();
        btnEdad = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMascotas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contentPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        etqTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etqTitulo.setText("MASCOTA:");

        etqNombre.setText("Nombre:");

        campoNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoNombre.setMargin(new java.awt.Insets(2, 10, 2, 10));

        etqTipo.setText("Tipo:");

        campoTipo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----", "PERRO", "GATO", "CABALLO" }));

        etqEdad.setText("Edad:");

        campoEdad.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoEdad.setMargin(new java.awt.Insets(2, 10, 2, 10));

        btnEdad.setBackground(new java.awt.Color(0, 153, 153));
        btnEdad.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEdad.setForeground(new java.awt.Color(255, 255, 255));
        btnEdad.setText("CREAR");
        btnEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdadActionPerformed(evt);
            }
        });

        tablaMascotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "Nombre", "Tipo", "Edad", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaMascotas);

        javax.swing.GroupLayout contentPrincipalLayout = new javax.swing.GroupLayout(contentPrincipal);
        contentPrincipal.setLayout(contentPrincipalLayout);
        contentPrincipalLayout.setHorizontalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
                    .addGroup(contentPrincipalLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(contentPrincipalLayout.createSequentialGroup()
                                .addComponent(etqNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etqTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(contentPrincipalLayout.createSequentialGroup()
                                .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoEdad)
                            .addComponent(etqEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEdad)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        contentPrincipalLayout.setVerticalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(contentPrincipalLayout.createSequentialGroup()
                        .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etqNombre)
                            .addComponent(etqTipo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(campoTipo)))
                    .addGroup(contentPrincipalLayout.createSequentialGroup()
                        .addComponent(etqEdad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEdad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoEdad))))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdadActionPerformed
        String nombre = campoNombre.getText();
        String tipo = campoTipo.getSelectedItem().toString();
        String edad = campoEdad.getText();
        
        for (int i=0; i<listaMascotas.length; i++) {
            if (listaMascotas[i]==null) {
                listaMascotas[i] = new Mascota(nombre, tipo, edad);
                imprimirMascotas();
                break;
            }
        }
    }//GEN-LAST:event_btnEdadActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdad;
    private javax.swing.JTextField campoEdad;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JComboBox<String> campoTipo;
    private javax.swing.JPanel contentPrincipal;
    private javax.swing.JLabel etqEdad;
    private javax.swing.JLabel etqNombre;
    private javax.swing.JLabel etqTipo;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tablaMascotas;
    // End of variables declaration//GEN-END:variables
}
