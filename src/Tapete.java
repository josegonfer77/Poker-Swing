
import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marin
 */
public class Tapete extends javax.swing.JFrame {

    /**
     * Creates new form Tapete
     */
    

    
    public Tapete() {
        Color micolor = new Color(0, 100 , 0);
        this.getContentPane().setBackground(micolor);
        initComponents();
        principal();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCarta0 = new javax.swing.JLabel();
        lblCarta1 = new javax.swing.JLabel();
        lblCarta2 = new javax.swing.JLabel();
        lblCarta3 = new javax.swing.JLabel();
        lblCarta4 = new javax.swing.JLabel();
        lblCarta5 = new javax.swing.JLabel();
        lblCarta6 = new javax.swing.JLabel();
        lblCarta7 = new javax.swing.JLabel();
        lblCrono = new javax.swing.JLabel();
        btnRepartir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCarta0.setText("jLabel1");
        lblCarta0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCarta0MouseClicked(evt);
            }
        });

        lblCarta1.setText("jLabel1");
        lblCarta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCarta1MouseClicked(evt);
            }
        });

        lblCarta2.setText("jLabel1");
        lblCarta2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCarta2MouseClicked(evt);
            }
        });

        lblCarta3.setText("jLabel1");
        lblCarta3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCarta3MouseClicked(evt);
            }
        });

        lblCarta4.setText("jLabel1");
        lblCarta4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCarta4MouseClicked(evt);
            }
        });

        lblCarta5.setText("jLabel1");
        lblCarta5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCarta5MouseClicked(evt);
            }
        });

        lblCarta6.setText("jLabel1");
        lblCarta6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCarta6MouseClicked(evt);
            }
        });

        lblCarta7.setText("jLabel1");
        lblCarta7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCarta7MouseClicked(evt);
            }
        });

        lblCrono.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblCrono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCrono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnRepartir.setText("Repartir");
        btnRepartir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepartirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCarta0, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCarta4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCarta1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCarta5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCarta2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCarta6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCarta3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCarta7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRepartir)
                    .addComponent(lblCrono, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCarta0, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCarta1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCarta2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCarta3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(lblCrono, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCarta7, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCarta4, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCarta5, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCarta6, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnRepartir)))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCarta0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCarta0MouseClicked
        mostrarCarta(0, lblCarta0);
    }//GEN-LAST:event_lblCarta0MouseClicked

    private void lblCarta1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCarta1MouseClicked
        mostrarCarta(1, lblCarta1);
    }//GEN-LAST:event_lblCarta1MouseClicked

    private void lblCarta2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCarta2MouseClicked
        mostrarCarta(2, lblCarta2);
    }//GEN-LAST:event_lblCarta2MouseClicked

    private void lblCarta3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCarta3MouseClicked
        mostrarCarta(3, lblCarta3);
    }//GEN-LAST:event_lblCarta3MouseClicked

    private void lblCarta4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCarta4MouseClicked
        mostrarCarta(4, lblCarta4);
    }//GEN-LAST:event_lblCarta4MouseClicked

    private void lblCarta5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCarta5MouseClicked
        mostrarCarta(5, lblCarta5);
    }//GEN-LAST:event_lblCarta5MouseClicked

    private void lblCarta6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCarta6MouseClicked
        mostrarCarta(6, lblCarta6);
    }//GEN-LAST:event_lblCarta6MouseClicked

    private void lblCarta7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCarta7MouseClicked
        mostrarCarta(7, lblCarta7);
    }//GEN-LAST:event_lblCarta7MouseClicked

    private void btnRepartirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRepartirActionPerformed
        repartir();// TODO add your handling code here:
    }//GEN-LAST:event_btnRepartirActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tapete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tapete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tapete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tapete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tapete().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRepartir;
    private javax.swing.JLabel lblCarta0;
    private javax.swing.JLabel lblCarta1;
    private javax.swing.JLabel lblCarta2;
    private javax.swing.JLabel lblCarta3;
    private javax.swing.JLabel lblCarta4;
    private javax.swing.JLabel lblCarta5;
    private javax.swing.JLabel lblCarta6;
    private javax.swing.JLabel lblCarta7;
    private javax.swing.JLabel lblCrono;
    // End of variables declaration//GEN-END:variables

    
// Voy a construir las 8 cartas y les asigno una posicion por defecto
    Carta carta0 = new Carta("5 de corazones", "src/imagenes/5corazones.png");
    Carta carta1 = new Carta("5 de corazones", "src/imagenes/5corazones_1.png");
    Carta carta2 = new Carta("10 de picas", "src/imagenes/10picas.png");
    Carta carta3 = new Carta("10 de picas", "src/imagenes/10picas_1.png");
    Carta carta4 = new Carta("reina picas", "src/imagenes/reinapicas.png");
    Carta carta5 = new Carta("reina picas", "src/imagenes/reinapicas_1.png");
    Carta carta6 = new Carta("rey diamantes", "src/imagenes/reydiamantes.png");
    Carta carta7 = new Carta("rey diamantes", "src/imagenes/reydiamantes_1.png");
    
    Carta trasera = new Carta();
    
    
 // Almacenar la ultima carta visualizada para hacer match
    Carta ultimaCarta;
    

// Voy a construir una estructura que las almacene
    public ArrayList<Carta> misCartas = new ArrayList<>();
    Carta cartaActual = new Carta();
    JLabel ultimaCasilla, casillaActual;
    int hh;
    int mm;
    int ss;
    boolean completado;
    int aciertos;
    
    Timer t;
    


    private TimerTask crearTimerTask(){
        TimerTask timerTask = new TimerTask() {
        @Override
        public void run() {
            
                            if (!completado){
				ss++;
				if (ss >= 60) {
					ss -= 60;
					mm++;
				}
				if (mm >= 60) {
					mm -= 60;
					hh++;
				}
				if (hh >= 24) {
					hh -= 24;
				}

				lblCrono.setText((((hh < 10) ? ("0" + hh) : (hh)) + ":"
					+ ((mm < 10) ? ("0" + mm) : (mm)) + ":"
					+ ((ss < 10) ? ("0" + ss) : (ss))));
                            }else{
                                cancel();
                                
                                return;
                                
                            }    
        }
    };
       return timerTask;
    }
    
    public void llenarArray(){
        misCartas.add(carta0);
        misCartas.add(carta1);
        misCartas.add(carta2);
        misCartas.add(carta3);
        misCartas.add(carta4);
        misCartas.add(carta5);
        misCartas.add(carta6);
        misCartas.add(carta7);
    }
    
   
    
    public void cargarImagen(JLabel etiqueta, Carta carta){
        ImageIcon imagen = new ImageIcon(carta.getRuta());
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(etiqueta.getWidth(), etiqueta.getHeight(), Image.SCALE_DEFAULT ));
        etiqueta.setIcon(icono);
            
    }
    
    public void cargarTraseras(){
        trasera.setRuta("src/imagenes/trasera.png");
        cargarImagen(lblCarta0, trasera);
        cargarImagen(lblCarta1, trasera);
        cargarImagen(lblCarta2, trasera);
        cargarImagen(lblCarta3, trasera);
        cargarImagen(lblCarta4, trasera);
        cargarImagen(lblCarta5, trasera);
        cargarImagen(lblCarta6, trasera);
        cargarImagen(lblCarta7, trasera);
    }
    
    
    
    public void barajarTodasLasCartas(){
        Collections.shuffle(misCartas);
        // Voy a poner a true la propiedad tapada de todas las cartas
        for (Carta carta : misCartas){
            carta.setTapada(true);
        }
    }
    
    public void mostrarCarta(int posicion, JLabel casilla){
        // Voy a comprobar que se hace click en una carta tapada para no alterar el juego
        
        // Recupero la carta que esta asignada a esa posicion
               cartaActual = misCartas.get(posicion);
        if (cartaActual.isTapada()){       
            // Cargo la imagen de la carta
            cargarImagen(casilla, cartaActual);
            cartaActual.setTapada(false);
            casillaActual=casilla;
            
            evaluarAcierto(casilla);
        }    
    }
    
    public void evaluarAcierto(JLabel casilla){
       if( ultimaCarta == null) {  // Significa que es la primera carta de la secuencia
           ultimaCarta = cartaActual;   // Actualizo, esta es la ultima carta
           ultimaCasilla = casilla;
       }else{
           if (!comprobarAcierto(cartaActual)){   // Si no acierto
               HiloTaparCarta hilo1 = new HiloTaparCarta(casillaActual, cartaActual);
               HiloTaparCarta hilo2 = new HiloTaparCarta(ultimaCasilla, ultimaCarta);  
               hilo1.start();
               hilo2.start();
           }else{
               aciertos++;
               if (aciertos==4){
                   completado=true;
                   t.cancel();
                   t.purge();
               }
           }
           ultimaCasilla = null;
           ultimaCarta = null;
       }     
    }
    
    public boolean comprobarAcierto(Carta actual){
        if (ultimaCarta!=null){
            return ultimaCarta.equals(actual);           
        }else
            return true;
    }
    
    
    private void principal() {
        resetearVariables();
        llenarArray();
        cargarTraseras();
        barajarTodasLasCartas();
        
        iniciarTempo();
        
    }  
    
    private void iniciarTempo(){
            t = new Timer();
            TimerTask timer = crearTimerTask();
            t.scheduleAtFixedRate(timer, 0, 1000);  // lanzo la tarea

    }

    private void repartir() {
         resetearVariables();
         cargarTraseras();
         barajarTodasLasCartas();
         iniciarTempo();
    }
    
    
    private void resetearVariables(){
        hh=0;
        mm=0;
        ss=0;
        completado=false;
        aciertos=0;
    }
    
        
    
        

    
    
    private class HiloTaparCarta extends Thread implements Runnable {
        private JLabel casilla = new JLabel();
        private Carta carta = new Carta();
        
        public HiloTaparCarta (JLabel casilla, Carta carta) {
            this.casilla = casilla;
            this.carta = carta;
        }
        
        @Override
        public void run() {
            Esperar(1);
            taparCarta(casilla, carta);
        }
           
    }
    private void Esperar(int seg) {
        try {
            Thread.sleep(seg * 1000);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void taparCarta(JLabel casilla, Carta carta){
        //casilla.setIcon(null);
        cargarImagen(casilla, trasera);
        carta.setTapada(true);
        ultimaCasilla=casilla;
    }
    
}
