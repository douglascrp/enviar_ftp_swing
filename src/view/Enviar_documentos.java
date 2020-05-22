/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Toolkit;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JULIANO TI
 */
public class Enviar_documentos extends javax.swing.JFrame {

    /**
     * Creates new form Enviar_documentos
     */
    public Enviar_documentos() {
        initComponents();
        setIcon();
    }

    private String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("ddMMyyyyHHmmssSSSS");
        Date date = new Date();
        return dateFormat.format(date);
    }

    private int taxa_porcentagem() {
        DefaultTableModel tabela = (DefaultTableModel) jTable_Documentos.getModel();
        int qtde_documentos = tabela.getRowCount();
        int taxa_porcentagem = (100 / qtde_documentos);
        return taxa_porcentagem;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboTiposDocumentais = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        txtFData = new javax.swing.JFormattedTextField();
        buttonIndexar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Documentos = new javax.swing.JTable();
        buttonInserir = new javax.swing.JButton();
        buttonExcluir = new javax.swing.JButton();
        buttonLimpar = new javax.swing.JButton();
        Barra = new javax.swing.JProgressBar();
        buttonEnviar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtxtLog = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Login"));

        jLabel1.setText("Usuario:");

        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });

        txtSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSenhaMouseClicked(evt);
            }
        });
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });

        jLabel3.setText("Senha:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel3)))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                    .addComponent(txtUsuario))
                .addGap(138, 138, 138))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setText("Tipo");

        jComboTiposDocumentais.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cheques", "Boletos", "Envio Numerário", "Débitos", "Senhas", "Pagamentos Diversos", "Declaração de Origem e Recursos", "Documentos Tesouraria", "Compensação", "Outros" }));
        jComboTiposDocumentais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboTiposDocumentaisActionPerformed(evt);
            }
        });

        jLabel6.setText("Data");

        try {
            txtFData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        buttonIndexar.setText("Indexar");
        buttonIndexar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIndexarActionPerformed(evt);
            }
        });

        jTable_Documentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome arquivo", "Tipo", "Data", "Caminho"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_Documentos.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jTable_Documentos.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jTable_Documentos);

        buttonInserir.setText("Inserir");
        buttonInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInserirActionPerformed(evt);
            }
        });

        buttonExcluir.setText("Excluir");
        buttonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirActionPerformed(evt);
            }
        });

        buttonLimpar.setText("Limpar");
        buttonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLimparActionPerformed(evt);
            }
        });

        buttonEnviar.setText("ENVIAR");
        buttonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEnviarActionPerformed(evt);
            }
        });

        jtxtLog.setEditable(false);
        jtxtLog.setColumns(20);
        jtxtLog.setRows(5);
        jScrollPane2.setViewportView(jtxtLog);

        jLabel2.setText("Versão 1.1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buttonInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonIndexar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(buttonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Barra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboTiposDocumentais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFData, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(buttonEnviar))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboTiposDocumentais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtFData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonIndexar)
                    .addComponent(buttonInserir)
                    .addComponent(buttonExcluir)
                    .addComponent(buttonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Barra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonEnviar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInserirActionPerformed
        JFileChooser jfile = new JFileChooser();
        jfile.setMultiSelectionEnabled(true);
        //filtra tipos do JFileChosser
        jfile.setFileFilter(new FileNameExtensionFilter("Documentos", "pdf"));
        jfile.setAcceptAllFileFilterUsed(false);

        int retorno;
        retorno = jfile.showOpenDialog(this);

        if (retorno == JFileChooser.APPROVE_OPTION) {
//seleciona arquivo pelo JFileChooser
            File file[] = jfile.getSelectedFiles();
            for (File f : file) {
                DefaultTableModel dtmTabelaSubmit = (DefaultTableModel) jTable_Documentos.getModel();
                Object[] dados = {f.getName(), "", "", f.getPath()};
                dtmTabelaSubmit.addRow(dados);
            }
     //adicionando dados na tabela

        }        // TODO add your handling code here:
    }//GEN-LAST:event_buttonInserirActionPerformed

    private void buttonIndexarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIndexarActionPerformed
        int linhas[] = jTable_Documentos.getSelectedRows();
        if (linhas.length <= 0) {
            JOptionPane.showMessageDialog(
                    null, "Selecione o documento que queira indexar", "ERRO", JOptionPane.INFORMATION_MESSAGE);
        } else if (txtFData.getText().equals("  /  /    ") || txtFData.getText().length() != 10) {
            JOptionPane.showMessageDialog(
                    null, "Favor informar a data do documento selecionado", "ERRO", JOptionPane.INFORMATION_MESSAGE);
        } else {
            DefaultTableModel tabelaModelo = (DefaultTableModel) jTable_Documentos.getModel();
            for (int i = 0; i < linhas.length; i++) {
                tabelaModelo.setValueAt(jComboTiposDocumentais.getSelectedItem(), linhas[i], 1);
                tabelaModelo.setValueAt(txtFData.getText(), linhas[i], 2);

            }
        }// TODO add your handling code here:
    }//GEN-LAST:event_buttonIndexarActionPerformed

    private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed
        int row = jTable_Documentos.getSelectedRow();

        if (row <= 0) {
            JOptionPane.showMessageDialog(
                    null, "Selecione o documento que queira excluir", "ERRO", JOptionPane.ERROR_MESSAGE);
        } else {
            DefaultTableModel dtm = (DefaultTableModel) jTable_Documentos.getModel();

            dtm.removeRow(row);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_buttonExcluirActionPerformed

    private void buttonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLimparActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Você vai limpar sua tabela, tem certeza?");

        if (a == 0) {
            DefaultTableModel tabela = (DefaultTableModel) jTable_Documentos.getModel();
            tabela.setNumRows(0);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_buttonLimparActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed

    }//GEN-LAST:event_txtSenhaActionPerformed

    private void txtSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSenhaMouseClicked

    }//GEN-LAST:event_txtSenhaMouseClicked

    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioKeyPressed

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioKeyTyped

    private void txtUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyReleased

// TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioKeyReleased

    private void buttonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEnviarActionPerformed

        String usuario = txtUsuario.getText();
        String senha = txtSenha.getText();
        String []split_pa = txtUsuario.getText().split("_");
        String pa = split_pa[1];

        if (usuario.equals("") || senha.equals("")) {
            JOptionPane.showMessageDialog(null, "Insira o usuário e senha do gerenciador de documentos!");
        } else {

            String usuario_aut = txtUsuario.getText();
            String senha_aut = txtSenha.getText();

            Metodo2_UploadFile m = new Metodo2_UploadFile();
            if (m.enviar_FTP(usuario_aut, senha_aut, "", "", "").equals("não foi enviado, usuário e/ou senha incorretos.")) {
                JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos!", "ERRO", JOptionPane.ERROR_MESSAGE);
            } else if (m.enviar_FTP(usuario_aut, senha_aut, "", "", "").equals("Não é possível conectar-se ao servidor da UAD, favor verificar sua conexão.")) {

//desabilitar os campos
                txtFData.setEnabled(false);
                txtUsuario.setEnabled(false);
                txtSenha.setEnabled(false);
                jComboTiposDocumentais.setEnabled(false);
                jTable_Documentos.setEnabled(false);
                buttonEnviar.setEnabled(false);
                buttonExcluir.setEnabled(false);
                buttonIndexar.setEnabled(false);
                buttonInserir.setEnabled(false);
                buttonLimpar.setEnabled(false);

                DefaultTableModel tabela = (DefaultTableModel) jTable_Documentos.getModel();
                int qtde_documentos = tabela.getRowCount();

                new Thread() {
                    @Override
                    public void run() {

                        try {
                            //criando conexao com FTP
                            String texto = "";
                            int taxa = taxa_porcentagem();
                            int contador = 0;
                            for (int i = 0; i < qtde_documentos; i++) {
                                if ((String) jTable_Documentos.getValueAt(i, 1) == "") {
                                    contador++;
                                }
                                if ((String) jTable_Documentos.getValueAt(i, 2) == "") {
                                    contador++;
                                }
                            }

                            if (contador == 0) {
                                for (int i = 0; i < qtde_documentos; i++) {
       // FTPUploader ftp = new FTPUploader("gedsicoobcredisul.com.br",2021,usuario,senha);
                                    //nomear os arquivos
                                    String tipo = (String) jTable_Documentos.getValueAt(i, 1);
                                    String data = (String) jTable_Documentos.getValueAt(i, 2);
                                    String nome = tipo + "_" + data + "_" + getDateTime() + ".pdf";
                                    nome = nome.replaceAll("/", "");
                                    String localFileFullName = ((String) jTable_Documentos.getValueAt(i, 3)).replaceAll("\\\\", "\\\\\\\\");
                                    String nome_path_original = (String) jTable_Documentos.getValueAt(i, 0);

                                    System.out.println(localFileFullName);
                                    System.out.println(localFileFullName);
                                    System.out.println(localFileFullName);
                                    System.out.println(nome);

                                    String user = txtUsuario.getText();
                                    String pswd = txtSenha.getText();
                                    String path = localFileFullName;
                                    //
                                    String path_ftp = "/Alfresco/Sites/caixa/documentLibrary/01 - Carga em Lote/PA 0"+pa+"/";
                                    System.out.println(path_ftp);
                                    String nome_arquivo = nome;
                                    Metodo2_UploadFile upload = new Metodo2_UploadFile();
                                    String log = upload.enviar_FTP(user, pswd, path, path_ftp, nome_arquivo);

                                    Barra.setValue(taxa);
                                    if (texto.equals("")) {
                                        texto = texto + nome_path_original + " " + log;
                                    } else {
                                        texto = texto + "\n" + nome_path_original + " " + log;
                                    }

                                    jtxtLog.setText(texto);
                                    // ftp.uploadFile(localFileFullName,nome,caminho_FTP);
                                    taxa = taxa + taxa_porcentagem();

       // ftp.disconnect();
                                }

                                txtFData.setEnabled(true);
                                txtUsuario.setEnabled(true);
                                txtSenha.setEnabled(true);
                                jComboTiposDocumentais.setEnabled(true);
                                jTable_Documentos.setEnabled(true);
                                buttonEnviar.setEnabled(true);
                                buttonExcluir.setEnabled(true);
                                buttonIndexar.setEnabled(true);
                                buttonInserir.setEnabled(true);
                                buttonLimpar.setEnabled(true);
                                Barra.setValue(0);
                                DefaultTableModel tabela = (DefaultTableModel) jTable_Documentos.getModel();
                                tabela.setNumRows(0);

                            } else {
                                JOptionPane.showMessageDialog(rootPane,"Favor indexar todos os documentos!");
                                txtFData.setEnabled(true);
                                txtUsuario.setEnabled(true);
                                txtSenha.setEnabled(true);
                                jComboTiposDocumentais.setEnabled(true);
                                jTable_Documentos.setEnabled(true);
                                buttonEnviar.setEnabled(true);
                                buttonExcluir.setEnabled(true);
                                buttonIndexar.setEnabled(true);
                                buttonInserir.setEnabled(true);
                                buttonLimpar.setEnabled(true);
                            }

                        } catch (Exception ex) {
                            Logger.getLogger(Enviar_documentos.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }.start();

            } else {
                JOptionPane.showMessageDialog(null, "Não foi possível enviar os arquivos, erro desconhecido.", "ERRO", JOptionPane.ERROR_MESSAGE);

            }

        }

    }//GEN-LAST:event_buttonEnviarActionPerformed

    private void jComboTiposDocumentaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboTiposDocumentaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboTiposDocumentaisActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Enviar_documentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Enviar_documentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Enviar_documentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Enviar_documentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Enviar_documentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar Barra;
    private javax.swing.JButton buttonEnviar;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JButton buttonIndexar;
    private javax.swing.JButton buttonInserir;
    private javax.swing.JButton buttonLimpar;
    private javax.swing.JComboBox jComboTiposDocumentais;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_Documentos;
    private javax.swing.JTextArea jtxtLog;
    private javax.swing.JFormattedTextField txtFData;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
 private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagens/pinlogo.png")));
    }

}
