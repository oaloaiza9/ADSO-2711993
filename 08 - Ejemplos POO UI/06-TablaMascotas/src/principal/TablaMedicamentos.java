package principal;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
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

public class TablaMedicamentos extends javax.swing.JFrame {

    DefaultTableModel modelo;
    Mascota mascota;
    
    public TablaMedicamentos(Mascota mascota) {
        this.mascota = mascota;
        
        initComponents();
        initAlternComponents();
        imprimirMedicamentos();
    }
    
    public void initAlternComponents(){
        setIconImage(getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_mascota.png")));
        setTitle("Medicamentos");
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        
        etqMascota.setText( mascota.getNombre().toUpperCase() );
        campoFechaInicio.setDate(new Date());
        
        modelo = (DefaultTableModel) tablaMedicamentos.getModel();
        
        tablaMedicamentos.getColumnModel().getColumn(4).setCellEditor(new ButtonEditor(new JCheckBox()));
        tablaMedicamentos.getColumnModel().getColumn(4).setCellRenderer(new ButtonRenderer());
        
        // Ajuste del Orden y Ancho de Columnas
        tablaMedicamentos.getTableHeader().setReorderingAllowed(false);
        tablaMedicamentos.getTableHeader().setResizingAllowed(false);
        
        // Centrar contenido de columnas
        DefaultTableCellRenderer centerRender = new DefaultTableCellRenderer();
        centerRender.setHorizontalAlignment(SwingConstants.CENTER);
        tablaMedicamentos.getColumnModel().getColumn(0).setCellRenderer(centerRender);
        tablaMedicamentos.getColumnModel().getColumn(2).setCellRenderer(centerRender);
        tablaMedicamentos.getColumnModel().getColumn(3).setCellRenderer(centerRender);
        
        // Alto de las filas
        tablaMedicamentos.setRowHeight(25);
        
        // Tamaño de Columnas
        tablaMedicamentos.getColumnModel().getColumn(0).setPreferredWidth(10);
        tablaMedicamentos.getColumnModel().getColumn(1).setPreferredWidth(200);
        tablaMedicamentos.getColumnModel().getColumn(2).setPreferredWidth(100);
        tablaMedicamentos.getColumnModel().getColumn(3).setPreferredWidth(100);
        tablaMedicamentos.getColumnModel().getColumn(4).setPreferredWidth(10);
    }
    
    public void imprimirMedicamentos(){
        modelo.setRowCount(0);
        for (int i=0; i<mascota.listaMedicamentos.length && mascota.listaMedicamentos[i]!=null; i++) {
            String nombre = mascota.listaMedicamentos[i].getNombre();
            String fecha_inicio = mascota.listaMedicamentos[i].getFecha_inicio();
            String fecha_fin = mascota.listaMedicamentos[i].getFecha_fin();
            
            JButton btnMedicamento = new JButton();
            btnMedicamento.setBackground(Color.white);
            btnMedicamento.setFocusable(false);
            Image icono_eliminar = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_eliminar.png"));
            icono_eliminar = icono_eliminar.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
            btnMedicamento.setIcon(new ImageIcon(icono_eliminar));
            
            Object datos[] = new Object[]{ (i+1), nombre, fecha_inicio, fecha_fin, btnMedicamento};
            modelo.addRow(datos);
            
            Medicamento medicamentoActual = mascota.listaMedicamentos[i];
            btnMedicamento.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    mascota.removeMedicamento(medicamentoActual);
                    imprimirMedicamentos();
                }
            });
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPrincipal = new javax.swing.JPanel();
        etqTitulo = new javax.swing.JLabel();
        etqMascota = new javax.swing.JLabel();
        etqNombre = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        etqFechaInicio = new javax.swing.JLabel();
        campoFechaInicio = new com.toedter.calendar.JDateChooser();
        etqFechaFin = new javax.swing.JLabel();
        campoFechaFin = new com.toedter.calendar.JDateChooser();
        btnCrear = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMedicamentos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        contentPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        etqTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etqTitulo.setText("MASCOTA:");

        etqMascota.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etqMascota.setForeground(new java.awt.Color(0, 102, 102));

        etqNombre.setText("Nombre Medicamento:");

        campoNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoNombre.setMargin(new java.awt.Insets(2, 10, 2, 10));

        etqFechaInicio.setText("Fecha Inicio:");

        etqFechaFin.setText("Fecha Fin:");

        btnCrear.setBackground(new java.awt.Color(0, 153, 153));
        btnCrear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCrear.setForeground(new java.awt.Color(255, 255, 255));
        btnCrear.setText("CREAR");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        tablaMedicamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "Nombre", "Fecha Inicio", "Fecha Fin", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaMedicamentos);

        javax.swing.GroupLayout contentPrincipalLayout = new javax.swing.GroupLayout(contentPrincipal);
        contentPrincipal.setLayout(contentPrincipalLayout);
        contentPrincipalLayout.setHorizontalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPrincipalLayout.createSequentialGroup()
                        .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contentPrincipalLayout.createSequentialGroup()
                                .addComponent(etqTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etqMascota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(contentPrincipalLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campoNombre)
                                    .addComponent(etqNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(contentPrincipalLayout.createSequentialGroup()
                                        .addComponent(etqFechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE))
                                    .addGroup(contentPrincipalLayout.createSequentialGroup()
                                        .addComponent(campoFechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etqFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCrear)))
                        .addGap(18, 18, 18))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE))
                .addContainerGap())
        );
        contentPrincipalLayout.setVerticalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqTitulo)
                    .addComponent(etqMascota))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(contentPrincipalLayout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(btnCrear, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                        .addGroup(contentPrincipalLayout.createSequentialGroup()
                            .addComponent(etqNombre)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(campoFechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(campoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))))
                    .addGroup(contentPrincipalLayout.createSequentialGroup()
                        .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etqFechaInicio)
                            .addComponent(etqFechaFin))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoFechaFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
        Date dateInicio = campoFechaInicio.getDate();
        Date dateFin = campoFechaInicio.getDate();
        
        String nombre = campoNombre.getText();
        String fecha_inicio = dateFormat.format(dateInicio);
        String fecha_fin = dateFormat.format(dateFin);
        
        Medicamento medicamento = new Medicamento(nombre, fecha_inicio, fecha_fin);
        mascota.addMedicamento(medicamento);
        imprimirMedicamentos();
        
        campoNombre.setText("");
        campoFechaInicio.setDate(null);
        campoFechaFin.setDate(null);
        campoNombre.requestFocus();
    }//GEN-LAST:event_btnCrearActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private com.toedter.calendar.JDateChooser campoFechaFin;
    private com.toedter.calendar.JDateChooser campoFechaInicio;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JPanel contentPrincipal;
    private javax.swing.JLabel etqFechaFin;
    private javax.swing.JLabel etqFechaInicio;
    private javax.swing.JLabel etqMascota;
    private javax.swing.JLabel etqNombre;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tablaMedicamentos;
    // End of variables declaration//GEN-END:variables
}
