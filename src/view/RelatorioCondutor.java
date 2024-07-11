package view;

import controller.CondutorController;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Pessoa;
import model.Veiculo;

public class RelatorioCondutor extends javax.swing.JInternalFrame {

    private CondutorController condController;

    /**
     * Creates new form TelaCadastro
     */
    public RelatorioCondutor() throws IOException {
        initComponents();
        condController = new CondutorController();
        buscarCondutores();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        lblTituloCondutor = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setMaximizable(true);

        lblTituloCondutor.setText("Condutores");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
            },
            new String [] {
                "ID", "Nome", "CPF", "Fone", "CNH", "Categoria"
            }
        )
    );
    jScrollPane1.setViewportView(jTable1);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(189, 189, 189)
            .addComponent(lblTituloCondutor)
            .addContainerGap(189, Short.MAX_VALUE))
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addContainerGap())
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(12, 12, 12)
            .addComponent(lblTituloCondutor)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
            .addContainerGap())
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarCondutores() {
        List<Pessoa> condutores = condController.consultarCondutores(); // Obtém a lista de veículos do banco de dados
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); // Limpa a tabela antes de adicionar os novos dados
        for (Pessoa condutor : condutores) {
            Object[] row = {condutor.getId(), condutor.getNome(), condutor.getCpf(), condutor.getFone(), condutor.getCnh(), condutor.getCategoria()};
            model.addRow(row); // Adiciona cada veículo como uma linha na tabela
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblTituloCondutor;
    // End of variables declaration//GEN-END:variables
}
