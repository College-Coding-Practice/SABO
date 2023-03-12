/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediaplayer;

import java.awt.BorderLayout;
import java.awt.Component;
import java.io.IOException;
import java.net.URL;
import javax.media.CannotRealizeException;
import javax.media.Manager;
import javax.media.NoPlayerException;
import javax.media.Player;

/**
 *
 * @author hp
 */
public class MediaPanel extends javax.swing.JPanel {

    /**
     * Creates new form MediaPanel
     */
    public MediaPanel() {
        initComponents();
    }
    
    public MediaPanel( URL mediaURL ) {
        setLayout( new BorderLayout() );
        Manager.setHint( Manager.LIGHTWEIGHT_RENDERER, true );
        try {
            
        // create a player to play the media specified in the URL
        Player mediaPlayer = Manager.createRealizedPlayer( mediaURL );
        // get the components for the video and the playback controls
        Component video = mediaPlayer.getVisualComponent();
        Component controls = mediaPlayer.getControlPanelComponent();
            if ( video != null )
            add( video, BorderLayout.CENTER );
            if ( controls != null )
            add( controls, BorderLayout.SOUTH );
            mediaPlayer.start(); // start playing the media clip
        } catch ( NoPlayerException noPlayerException ) {
        System.err.println( "No media player found" );
        } catch ( CannotRealizeException cannotRealizeException ) {
            System.err.println( "Could not realize media player" );
            } catch ( IOException iOException ) {
            System.err.println( "Error reading from the source" );
    }
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}