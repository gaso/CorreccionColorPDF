/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correccioncolorpdfs;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.FileDialog;
import java.awt.HeadlessException;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.pdfbox.exceptions.COSVisitorException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.edit.PDPageContentStream;
import org.apache.pdfbox.pdmodel.graphics.xobject.PDJpeg;
import org.apache.pdfbox.pdmodel.graphics.xobject.PDXObjectImage;

/**
 *
 * @author gusta
 */
public class CorrectorColorUI extends javax.swing.JFrame {
    
    private JFileChooser chooser;
    private String rutaPDF;
    private String nombrePDF;
    private String rutaPDFImprimible;
    
    public CorrectorColorUI() {
        initComponents();
        
        setLocationRelativeTo(null);
        bAbrirPDF.setVisible(false);
        bAbrirUbicacion.setVisible(false);
        
        setIconImage(new ImageIcon(getClass().getResource("/imagen/icono3.png")).getImage());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        cRutaPDF = new javax.swing.JTextField();
        lMsj = new javax.swing.JLabel();
        bAbrirUbicacion = new javax.swing.JButton();
        bAbrirPDF = new javax.swing.JButton();
        bConvertir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Corrector Color PDF");
        setResizable(false);

        jButton1.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        jButton1.setText("Buscar");
        jButton1.setToolTipText("Seleccione el archivo al que le desea realizar la conversión de colores");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cRutaPDF.setEditable(false);
        cRutaPDF.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N

        lMsj.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        lMsj.setText("Esperando");

        bAbrirUbicacion.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        bAbrirUbicacion.setText("Abrir Ubicación PDF");
        bAbrirUbicacion.setToolTipText("Abrir ubicación del archivo en el Explorador del Sistema Operativo");
        bAbrirUbicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAbrirUbicacionActionPerformed(evt);
            }
        });

        bAbrirPDF.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        bAbrirPDF.setText("Abrir PDF");
        bAbrirPDF.setToolTipText("Abrir PDF en el Visor del Sistema");
        bAbrirPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAbrirPDFActionPerformed(evt);
            }
        });

        bConvertir.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        bConvertir.setText("Convertir");
        bConvertir.setToolTipText("Clic para Iniciar el proceso de conversión.");
        bConvertir.setEnabled(false);
        bConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConvertirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lMsj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bAbrirUbicacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bAbrirPDF))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cRutaPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bConvertir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(cRutaPDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bConvertir))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lMsj)
                    .addComponent(bAbrirUbicacion)
                    .addComponent(bAbrirPDF))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //mostrarSeleccionadorArchivo();
        buscarArchivoSO();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConvertirActionPerformed
        //ejecuta hilo para no bloquear UI
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                lMsj.setText("Transformando ...");
                transformarPDF();
            }
        });
        t1.start();

    }//GEN-LAST:event_bConvertirActionPerformed

    private void bAbrirUbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAbrirUbicacionActionPerformed
        abrirEnEscritorio(rutaPDF);
    }//GEN-LAST:event_bAbrirUbicacionActionPerformed

    private void bAbrirPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAbrirPDFActionPerformed
        abrirEnEscritorio(rutaPDFImprimible);
    }//GEN-LAST:event_bAbrirPDFActionPerformed

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
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
            UIManager.setLookAndFeel("org.netbeans.swing.laf.dark.DarkMetalLookAndFeel");
            
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CorrectorColorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CorrectorColorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CorrectorColorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CorrectorColorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CorrectorColorUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAbrirPDF;
    private javax.swing.JButton bAbrirUbicacion;
    private javax.swing.JButton bConvertir;
    private javax.swing.JTextField cRutaPDF;
    private javax.swing.JButton jButton1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lMsj;
    // End of variables declaration//GEN-END:variables

    private void mostrarSeleccionadorArchivo() {
        chooser = new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File(cRutaPDF.getText()));
        chooser.setDialogTitle("Seleccione Archivo PDF a convertir");
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter filtrosPDF = new FileNameExtensionFilter("PDF", "pdf");
        chooser.setFileFilter(filtrosPDF);
        //chooser.setAcceptAllFileFilterUsed(false);
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            
            System.out.println("getSelectedFile() : "
                    + chooser.getSelectedFile());
            cRutaPDF.setText(chooser.getSelectedFile().toString());
        } else {
            System.out.println("No Selection ");
        }
    }
    
    private void buscarArchivoSO() {
        lMsj.setText("Esperando");
        FileDialog fd = new FileDialog(this, "Seleccione Archivo PDF a convertir", FileDialog.LOAD);
        fd.setDirectory(cRutaPDF.getText());
        fd.setFile("*.pdf;*.PDF");
        fd.setAlwaysOnTop(true);
        fd.setVisible(true);
        if (fd.getFile() != null) {
            rutaPDF = fd.getDirectory();
            nombrePDF = fd.getFile();
            setTitle("Seguridad para PDFs  " + rutaPDF + " - FunParticipar");
            bConvertir.setEnabled(true);
            cRutaPDF.setText(nombrePDF);
        }
        
    }
    
    private void transformarPDF() {
        try {
            //@see http://stackoverflow.com/questions/18189314/convert-a-pdf-file-to-image
            String rutaPDFOriginal = rutaPDF + nombrePDF; // Pdf files are read from this folder
            //String destinationDir = "D:\\Desarrollo\\pruebas\\reportes_negros\\imagenes\\"; // converted images from pdf document are saved here

            File pdfOriginal = new File(rutaPDFOriginal);
//            File destinationFile = new File(destinationDir);
//            if (!destinationFile.exists()) {
//                destinationFile.mkdir();
//                System.out.println("Folder Created -> " + destinationFile.getAbsolutePath());
//            }
            if (pdfOriginal.exists()) {
                //System.out.println("Images copied to Folder: " + destinationFile.getName());
                PDDocument document = PDDocument.load(rutaPDFOriginal);

                //Documento Fondo Blanco
                PDDocument documentoCool = new PDDocument();
                
                List<PDPage> list = document.getDocumentCatalog().getAllPages();
                System.out.println("Total files to be converted -> " + list.size());
                
                String nombrePDFOriginal = pdfOriginal.getName().replace(".pdf", "");
                int pageNumber = 1;
                for (PDPage page : list) {
                    BufferedImage image = page.convertToImage();

                    //Inviertiendo colores
                    //@see http://stackoverflow.com/questions/8662349/convert-negative-image-to-positive
//                    for (int x = 0; x < image.getWidth(); x++) {
//                        for (int y = 0; y < image.getHeight(); y++) {
//                            int rgba = image.getRGB(x, y);
//                            //Hexa a reemplazar e9e9e1 R=233|G=233|B=225
//                            Color col = new Color(rgba, true);
//                            col = new Color(255 - col.getRed(),
//                                    255 - col.getGreen(),
//                                    255 - col.getBlue());
//
//                            //Si color es igual al invertido - cambiarlo a blanco
//                            if (col.getRGB() == -1447455) {
//                                col = new Color(255, 255, 255);
//                            }
//                            //System.out.println("col.getR = " + col.getRGB());
//                            image.setRGB(x, y, col.getRGB());
//                        }
//                    }
//                    File outputfile = new File(destinationDir + fileName + "_" + pageNumber + ".png");
//                    System.out.println("Image Created -> " + outputfile.getName());
//                    ImageIO.write(image, "png", outputfile);
                    pageNumber++;

                    //Crear pagina nueva para el PDF Convertido
                    float width = image.getWidth();
                    float height = image.getHeight();
                    PDPage paginaSinFondo = new PDPage(new PDRectangle(width, height));
                    documentoCool.addPage(paginaSinFondo);
                    PDXObjectImage img = new PDJpeg(documentoCool, image);
                    PDPageContentStream contentStream = new PDPageContentStream(documentoCool, paginaSinFondo);
                    contentStream.drawImage(img, 0, 0);
                    contentStream.close();
                    
                }
                document.close();
                rutaPDFImprimible = rutaPDF + nombrePDFOriginal + "_img.pdf";
                documentoCool.save(rutaPDFImprimible);
                documentoCool.close();
                
                estadoConversion(true);
            } else {
                JOptionPane.showMessageDialog(this, "No se logró identificar la ruta del archivo, por favor verifique que el archivo si existe o no halla sido movido durante el proceso.", "Ruta de archivo no encontrada", JOptionPane.WARNING_MESSAGE);
            }
            
        } catch (IOException | COSVisitorException | HeadlessException e) {
            estadoConversion(false);
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error durante el proceso de conversión", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Dado un recurso(carpeta/archivo) lo abre con la config del s.o.
     *
     * @param recurso
     */
    private void abrirEnEscritorio(String recurso) {
        if (!cRutaPDF.getText().isEmpty()) {
            File directorio = new File(recurso);
            if (Desktop.isDesktopSupported()) {
                try {
                    Desktop.getDesktop().open(directorio);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "No se logro encontrar el recurso(" + recurso + "),intente de nuevo realizar la conversión o revise que el archivo cumpla con los requisitos para poder ser transformado en un PDF Imprimible", "Error abriendo recurso", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Para poder abrir el recurso primero debe de seleccionar un archivo que desea transformar y realizar el proceso de conversión.", "Aun no ha seleccionado un archivo", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    private void estadoConversion(boolean estado) {
        if (estado) {
            lMsj.setText("Conversión Exitosa");
            lMsj.setForeground(new java.awt.Color(0, 102, 0));
        } else {
            lMsj.setText("Error en Conversión");
            lMsj.setForeground(new java.awt.Color(255, 0, 0));
        }
        bAbrirUbicacion.setVisible(estado);
        bAbrirPDF.setVisible(estado);
    }
    
}
