
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/
package crud;
import clases.LibroClass;
import javax.swing.JOptionPane;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.table.DefaultTableModel;

public final class LibroCrud extends javax.swing.JInternalFrame {
        
                
        EntityManagerFactory emf = null;
        EntityManager em = null;
        
        private int filaSeleccionada = -1;

            public LibroCrud() {
                initComponents();
                emf = Persistence.createEntityManagerFactory("C:/base/Practica.odb");
                em = emf.createEntityManager();
                listarm();
            }       

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        titulo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        autor = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        eliminar = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        guardarcambios = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Registrar Libro");

        jLabel1.setText("REGISTRAR LIBRO");

        jLabel2.setText("Titulo:");

        titulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tituloActionPerformed(evt);
            }
        });

        jLabel3.setText("Autor:");

        guardar.setText("GUARDAR");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        jLabel4.setText("Libros Registrados");

        eliminar.setText("ELIMINAR");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        editar.setText("SELECCIONAR");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        guardarcambios.setText("EDITAR");
        guardarcambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarcambiosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(guardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(eliminar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(titulo)
                            .addComponent(autor, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)))
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(editar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guardarcambios)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(404, 404, 404))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(autor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(guardar)
                            .addComponent(eliminar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editar)
                            .addComponent(guardarcambios)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tituloActionPerformed
    
    public LibroClass crearlibro(){   
        String titulol = titulo.getText();
        String autorl = autor.getText();
        
        LibroClass L = new LibroClass(titulol, autorl);
   
        return L;
    }
    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
                em = emf.createEntityManager(); // Crear un nuevo EntityManager
        LibroClass L = crearlibro();
        try {
            em.getTransaction().begin();
            em.persist(L);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(this, "Registro agregado correctamente", "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
                    ex.printStackTrace();
        } finally {
                        em.close();
        }
        listarm();
             // Limpia los campos de texto
            titulo.setText("");
            autor.setText("");
    }//GEN-LAST:event_guardarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // TODO add your handling code here:
   int filaSeleccionada = tabla.getSelectedRow();
    if (filaSeleccionada != -1) {
        String titulo = (String) tabla.getValueAt(filaSeleccionada, 0);
        String autor = (String) tabla.getValueAt(filaSeleccionada, 1);

        em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            Query query = em.createQuery("DELETE FROM LibroClass l WHERE l.titulo = :titulo AND l.autor = :autor");
            query.setParameter("titulo", titulo);
            query.setParameter("autor", autor);
            query.executeUpdate();
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(this, "Registro eliminado correctamente", "Eliminación exitosa", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            em.close();
        }

        listarm();
    }
    }//GEN-LAST:event_eliminarActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        // TODO add your handling code here:
               // Obtiene la fila seleccionada
            filaSeleccionada = tabla.getSelectedRow();

        // Verifica si se seleccionó una fila
        if (filaSeleccionada != -1) {
            // Obtiene los datos de la fila seleccionada
            String tituloSeleccionado = (String) tabla.getValueAt(filaSeleccionada, 0);
            String autorSeleccionado = (String) tabla.getValueAt(filaSeleccionada, 1);

            // Muestra los datos en los campos de texto
            titulo.setText(tituloSeleccionado);
            autor.setText(autorSeleccionado);
        }
    }//GEN-LAST:event_editarActionPerformed

    private void guardarcambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarcambiosActionPerformed
        // TODO add your handling code here:
          if (filaSeleccionada != -1) {
            String nuevoTitulo = titulo.getText();
            String nuevoAutor = autor.getText();

            em = emf.createEntityManager();
            try {
                em.getTransaction().begin();
                Query query = em.createQuery("UPDATE LibroClass l SET l.titulo = :nuevoTitulo, l.autor = :nuevoAutor WHERE l.titulo = :titulo AND l.autor = :autor");
                query.setParameter("nuevoTitulo", nuevoTitulo);
                query.setParameter("nuevoAutor", nuevoAutor);
                query.setParameter("titulo", tabla.getValueAt(filaSeleccionada, 0));
                query.setParameter("autor", tabla.getValueAt(filaSeleccionada, 1));
                query.executeUpdate();
                em.getTransaction().commit();

                JOptionPane.showMessageDialog(this, "Cambios guardados correctamente", "Edición exitosa", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                em.close();
            }

            // Restablece el valor de la variable de fila seleccionada
            filaSeleccionada = -1;

            // Limpia los campos de texto
            titulo.setText("");
            autor.setText("");

            listarm();
        }
    
    }//GEN-LAST:event_guardarcambiosActionPerformed

        public void listarm() {
        em = emf.createEntityManager(); // Crear un nuevo EntityManager.
        try {
            Query ConsultaLibro = em.createQuery("SELECT m FROM LibroClass m");
            List<LibroClass> ResultadosLibro = ConsultaLibro.getResultList();

            DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
            modelo.setRowCount(0);
            for (LibroClass libro : ResultadosLibro) {
                modelo.addRow(new Object[]{libro.getTitulo(), libro.getAutor()});
            }
        } catch (Exception ex) {
                    ex.printStackTrace();
        } finally {
            em.close();
        }

    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField autor;
    private javax.swing.JButton editar;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton guardar;
    private javax.swing.JButton guardarcambios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField titulo;
    // End of variables declaration//GEN-END:variables

}