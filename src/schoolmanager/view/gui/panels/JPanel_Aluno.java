package schoolmanager.view.gui.panels;

import javax.swing.JOptionPane;
import schoolmanager.dao.AlunoDAO;
import schoolmanager.model.Aluno;
import schoolmanager.interfaces.IAlunoSelecionadoListener;

public class JPanel_Aluno extends javax.swing.JPanel implements IAlunoSelecionadoListener {

    public JPanel_Aluno() {
        initComponents();
        SetEditableFields(false);
    }
    
    public void SetEditableFields(boolean opcao){
        Txt_Nome.setEditable(opcao);
        Txt_RA.setEditable(opcao);
        Txt_Idade.setEditable(opcao);
        Txt_Turma.setEditable(opcao);
    }
    
    public void ClearFields(){
        Txt_Id.setText("");
        Txt_Nome.setText("");
        Txt_RA.setText("");
        Txt_Idade.setText("");
        Txt_Turma.setText("");
    }
    
    public boolean CamposObrigatorios(){
        
        if(Txt_Nome.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Digite o nome");
            Txt_Nome.requestFocus();
            return false;
        
        } else if (Txt_RA.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Digite o RA");
            Txt_RA.requestFocus();
            return false;
            
        } else if (Txt_Idade.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null,"Digite a idade");
            Txt_Idade.requestFocus();
            return false;
            
        } else if (Txt_Turma.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Digite a turma");
            Txt_Turma.requestFocus();
            return false;
        
        } else {
            return true;
        }
    }
    
    public void alunoSelecionado(int id, String nome, String ra, String turma, int idade) {
        Txt_Id.setText(String.valueOf(id));
        Txt_Nome.setText(nome);
        Txt_RA.setText(ra);
        Txt_Turma.setText(turma);
        Txt_Idade.setText(String.valueOf(idade));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Btn_Novo = new javax.swing.JButton();
        Lbl_Nome = new javax.swing.JLabel();
        Txt_Nome = new javax.swing.JTextField();
        Lbl_Id = new javax.swing.JLabel();
        Txt_Id = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Txt_RA = new javax.swing.JTextField();
        Lbl_Turma = new javax.swing.JLabel();
        Txt_Turma = new javax.swing.JTextField();
        Lbl_Idade = new javax.swing.JLabel();
        Txt_Idade = new javax.swing.JTextField();
        Btn_Editar = new javax.swing.JButton();
        Btn_Salvar = new javax.swing.JButton();
        Btn_Buscar = new javax.swing.JButton();
        Btn_Apagar = new javax.swing.JButton();

        Btn_Novo.setText("Novo");
        Btn_Novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_NovoActionPerformed(evt);
            }
        });

        Lbl_Nome.setText("Nome");

        Txt_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_NomeActionPerformed(evt);
            }
        });

        Lbl_Id.setText("ID");

        Txt_Id.setEditable(false);
        Txt_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_IdActionPerformed(evt);
            }
        });

        jLabel1.setText("RA");

        Lbl_Turma.setText("Turma");

        Lbl_Idade.setText("Idade");

        Btn_Editar.setText("Editar");
        Btn_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EditarActionPerformed(evt);
            }
        });

        Btn_Salvar.setText("Salvar");
        Btn_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SalvarActionPerformed(evt);
            }
        });

        Btn_Buscar.setText("Buscar");
        Btn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_BuscarActionPerformed(evt);
            }
        });

        Btn_Apagar.setText("Apagar");
        Btn_Apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ApagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lbl_Nome)
                    .addComponent(Lbl_Idade)
                    .addComponent(Txt_Idade, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Btn_Novo)
                            .addGap(34, 34, 34)
                            .addComponent(Btn_Editar)
                            .addGap(40, 40, 40)
                            .addComponent(Btn_Salvar)
                            .addGap(39, 39, 39)
                            .addComponent(Btn_Apagar)
                            .addGap(37, 37, 37)
                            .addComponent(Btn_Buscar))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Lbl_Id)
                                    .addComponent(Txt_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(Txt_RA, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Lbl_Turma)
                                    .addComponent(Txt_Turma, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(Txt_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_Id)
                    .addComponent(jLabel1)
                    .addComponent(Lbl_Turma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_RA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Turma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(Lbl_Nome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Txt_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(Lbl_Idade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Txt_Idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Btn_Apagar)
                    .addComponent(Btn_Salvar)
                    .addComponent(Btn_Editar)
                    .addComponent(Btn_Novo)
                    .addComponent(Btn_Buscar))
                .addGap(60, 60, 60))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_NovoActionPerformed
        
        ClearFields();        
        SetEditableFields(true);

    }//GEN-LAST:event_Btn_NovoActionPerformed

    private void Txt_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_NomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_NomeActionPerformed

    private void Txt_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_IdActionPerformed

    private void Btn_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SalvarActionPerformed
        
        Aluno aluno = new Aluno();
        AlunoDAO alunoDAO = new AlunoDAO();
        
        boolean idLoaded = Txt_Id.getText().trim().isEmpty() ? false : true;

        if(CamposObrigatorios()){
            
            aluno.setNome(Txt_Nome.getText());
            aluno.setRA(Txt_RA.getText());
            aluno.setIdade(Integer.parseInt(Txt_Idade.getText()));
            aluno.setTurma(Txt_Turma.getText());

            if(idLoaded != true){

                try{

                    int idAluno = alunoDAO.adcionarAluno(aluno);

                    if(idAluno > 0){
                        JOptionPane.showMessageDialog(null, "Aluno "+ Txt_Nome.getText() +" adicionado com sucesso!", "Adicionado", JOptionPane.INFORMATION_MESSAGE);

                        Txt_Id.setText(String.valueOf(idAluno));
                        SetEditableFields(false);

                    } else {
                        JOptionPane.showMessageDialog(null, "Erro ao adicionar o aluno", "Erro", JOptionPane.ERROR_MESSAGE);
                    }

                }catch (Exception e) {

                    JOptionPane.showMessageDialog(null, "Erro inesperado: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                    e.printStackTrace();            
                }

            } else {

                aluno.setId(Integer.parseInt(Txt_Id.getText()));

                try{

                    int idAluno = alunoDAO.atualizarAluno(aluno);

                    if(idAluno > 0){
                        JOptionPane.showMessageDialog(null, "Aluno "+ Txt_Nome.getText() +" editado com sucesso!", "Editado", JOptionPane.INFORMATION_MESSAGE);

                        Txt_Id.setText(String.valueOf(idAluno));
                        SetEditableFields(false);

                    } else {
                        JOptionPane.showMessageDialog(null, "Erro ao editar o aluno", "Erro", JOptionPane.ERROR_MESSAGE);
                    }

                }catch (Exception e) {

                    JOptionPane.showMessageDialog(null, "Erro inesperado: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                    e.printStackTrace();            
                }
            }             
        }        
    }//GEN-LAST:event_Btn_SalvarActionPerformed

    private void Btn_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EditarActionPerformed
        
        if(Txt_Id.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Selecione um aluno para editar", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                    
        } else {
            SetEditableFields(true);
        }        
    }//GEN-LAST:event_Btn_EditarActionPerformed

    private void Btn_ApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ApagarActionPerformed
        
        Aluno aluno = new Aluno();
        AlunoDAO alunoDAO = new AlunoDAO();

        if(Txt_Id.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Selecione um aluno para deletar", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                    
        } else {
            
            try{
                
                aluno.setId(Integer.parseInt(Txt_Id.getText()));

                int idAluno = alunoDAO.deletarAluno(aluno);

                if(idAluno > 0){
                    JOptionPane.showMessageDialog(null, "Aluno "+ Txt_Nome.getText() +" apagado com sucesso!", "Editado", JOptionPane.INFORMATION_MESSAGE);
                    
                    ClearFields(); 
                    SetEditableFields(false);

                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao apagar o aluno", "Erro", JOptionPane.ERROR_MESSAGE);
                }

            }catch (Exception e) {

                JOptionPane.showMessageDialog(null, "Erro inesperado: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();            
            }
        }        
    }//GEN-LAST:event_Btn_ApagarActionPerformed

    private void Btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BuscarActionPerformed
        
        JFrame_BuscarAluno frmBuscarAluno = new JFrame_BuscarAluno(this);

        frmBuscarAluno.setLocationRelativeTo(null);
        frmBuscarAluno.setVisible(true);
        
        
        
    }//GEN-LAST:event_Btn_BuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Apagar;
    private javax.swing.JButton Btn_Buscar;
    private javax.swing.JButton Btn_Editar;
    private javax.swing.JButton Btn_Novo;
    private javax.swing.JButton Btn_Salvar;
    private javax.swing.JLabel Lbl_Id;
    private javax.swing.JLabel Lbl_Idade;
    private javax.swing.JLabel Lbl_Nome;
    private javax.swing.JLabel Lbl_Turma;
    private javax.swing.JTextField Txt_Id;
    private javax.swing.JTextField Txt_Idade;
    private javax.swing.JTextField Txt_Nome;
    private javax.swing.JTextField Txt_RA;
    private javax.swing.JTextField Txt_Turma;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
