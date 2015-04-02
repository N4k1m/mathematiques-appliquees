package GUI;

import Fonctions.FonctionA;
import Utils.MessageBoxes;
import java.awt.GridBagConstraints;
import signaux.Discretiseur;
import signaux.Signal;
import signaux.SignalPeriodique;

/**
 *
 * @author Nakim
 */
public class MainFrame extends javax.swing.JFrame
{
    //<editor-fold defaultstate="collapsed" desc="Constructor">
    public MainFrame()
    {
        // GUI Configuration
        this.initComponents();

        // Plots creation
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH; // Maximum width and height
        gbc.weightx = 1;
        gbc.weighty = 1;


        this.plotSignalSerieFourier = new SignalPanel("Signal de départ et série de Fourier", null, null);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.weightx = 2;
        this.panelPlots.add(this.plotSignalSerieFourier, gbc);

        this.plotSpectreSerieFourier = new SignalPanel("Spectre de la série de Fourier", null, null);
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.weightx = 1;
        this.panelPlots.add(this.plotSpectreSerieFourier, gbc);

        this.plotRealPartTFSerieF = new SignalPanel("Partie réelle de la TF de la série de Fourier", null, null);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.weightx = 1;
        this.panelPlots.add(this.plotRealPartTFSerieF, gbc);

        this.plotImaginaryPartTFSerieF = new SignalPanel("Partie imaginaire de la TF de la série de Fourier", null, null);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.weightx = 1;
        this.panelPlots.add(this.plotImaginaryPartTFSerieF, gbc);

        this.plotPhaseTFSerieF = new SignalPanel("Phase de la TF de la série de Fourier", null, null);
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.weightx = 1;
        this.panelPlots.add(this.plotPhaseTFSerieF, gbc);

        // Resize window to fit the preferred sizes and layouts
        this.pack();
    }
    //</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        splitPaneMainFrame = new javax.swing.JSplitPane();
        panelOptions = new javax.swing.JPanel();
        panelDiscretiseur = new javax.swing.JPanel();
        labelSamples = new javax.swing.JLabel();
        labelOrigine = new javax.swing.JLabel();
        labelDuree = new javax.swing.JLabel();
        spinnerSamplesDisc = new javax.swing.JSpinner();
        spinnerOrigineDisc = new javax.swing.JSpinner();
        spinnerDureeDisc = new javax.swing.JSpinner();
        panelSignals = new javax.swing.JPanel();
        labelChoixSignal = new javax.swing.JLabel();
        comboBoxSignaux = new javax.swing.JComboBox();
        labelPeriode = new javax.swing.JLabel();
        spinnerPeriode = new javax.swing.JSpinner();
        buttonAfficher = new javax.swing.JButton();
        labelNbTermesSerieFourier = new javax.swing.JLabel();
        spinnerNbTermesSerieFourier = new javax.swing.JSpinner();
        buttonAjouterSerieFourier = new javax.swing.JButton();
        labelAmplitude = new javax.swing.JLabel();
        spinnerAmplitude = new javax.swing.JSpinner();
        buttonClearAll = new javax.swing.JButton();
        panelPlots = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mathématiques Appliquées - Dossier 1");

        splitPaneMainFrame.setOneTouchExpandable(true);

        panelOptions.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));
        java.awt.GridBagLayout panelOptionsLayout = new java.awt.GridBagLayout();
        panelOptionsLayout.columnWidths = new int[] {0};
        panelOptionsLayout.rowHeights = new int[] {0, 3, 0, 3, 0};
        panelOptions.setLayout(panelOptionsLayout);

        panelDiscretiseur.setBorder(javax.swing.BorderFactory.createTitledBorder("Paramètres du discretiseur"));
        java.awt.GridBagLayout panelDiscretiseurLayout = new java.awt.GridBagLayout();
        panelDiscretiseurLayout.columnWidths = new int[] {0, 5, 0};
        panelDiscretiseurLayout.rowHeights = new int[] {0, 3, 0, 3, 0};
        panelDiscretiseur.setLayout(panelDiscretiseurLayout);

        labelSamples.setText("Samples :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        panelDiscretiseur.add(labelSamples, gridBagConstraints);

        labelOrigine.setText("Origine :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        panelDiscretiseur.add(labelOrigine, gridBagConstraints);

        labelDuree.setText("Durée :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        panelDiscretiseur.add(labelDuree, gridBagConstraints);

        spinnerSamplesDisc.setModel(new javax.swing.SpinnerNumberModel(4096, 64, 4096, 1));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        panelDiscretiseur.add(spinnerSamplesDisc, gridBagConstraints);

        spinnerOrigineDisc.setModel(new javax.swing.SpinnerNumberModel(Double.valueOf(0.0d), null, null, Double.valueOf(0.1d)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        panelDiscretiseur.add(spinnerOrigineDisc, gridBagConstraints);

        spinnerDureeDisc.setModel(new javax.swing.SpinnerNumberModel(Double.valueOf(1.0d), Double.valueOf(0.0d), null, Double.valueOf(0.1d)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        panelDiscretiseur.add(spinnerDureeDisc, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        panelOptions.add(panelDiscretiseur, gridBagConstraints);

        panelSignals.setBorder(javax.swing.BorderFactory.createTitledBorder("Paramètre des signaux"));
        java.awt.GridBagLayout panelSignalsLayout = new java.awt.GridBagLayout();
        panelSignalsLayout.columnWidths = new int[] {0, 5, 0};
        panelSignalsLayout.rowHeights = new int[] {0, 3, 0, 3, 0, 3, 0, 3, 0, 3, 0};
        panelSignals.setLayout(panelSignalsLayout);

        labelChoixSignal.setText("Choix du signal :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        panelSignals.add(labelChoixSignal, gridBagConstraints);

        comboBoxSignaux.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Carré", "Dents de scie", "Fonction A (exercice)", "Fonction B (exercice)" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        panelSignals.add(comboBoxSignaux, gridBagConstraints);

        labelPeriode.setText("Période (T) :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        panelSignals.add(labelPeriode, gridBagConstraints);

        spinnerPeriode.setModel(new javax.swing.SpinnerNumberModel(Double.valueOf(1.0d), Double.valueOf(0.0d), null, Double.valueOf(0.1d)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        panelSignals.add(spinnerPeriode, gridBagConstraints);

        buttonAfficher.setText("Afficher");
        buttonAfficher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAfficherActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        panelSignals.add(buttonAfficher, gridBagConstraints);

        labelNbTermesSerieFourier.setText("Nb termes série Fourier :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        panelSignals.add(labelNbTermesSerieFourier, gridBagConstraints);

        spinnerNbTermesSerieFourier.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        panelSignals.add(spinnerNbTermesSerieFourier, gridBagConstraints);

        buttonAjouterSerieFourier.setText("Ajouter série Fourier");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        panelSignals.add(buttonAjouterSerieFourier, gridBagConstraints);

        labelAmplitude.setText("Amplitude :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        panelSignals.add(labelAmplitude, gridBagConstraints);

        spinnerAmplitude.setModel(new javax.swing.SpinnerNumberModel(Double.valueOf(1.0d), Double.valueOf(1.0d), null, Double.valueOf(0.1d)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        panelSignals.add(spinnerAmplitude, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        panelOptions.add(panelSignals, gridBagConstraints);

        buttonClearAll.setText("Tout effacer");
        buttonClearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClearAllActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        panelOptions.add(buttonClearAll, gridBagConstraints);

        splitPaneMainFrame.setLeftComponent(panelOptions);

        panelPlots.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));
        panelPlots.setLayout(new java.awt.GridBagLayout());
        splitPaneMainFrame.setRightComponent(panelPlots);

        getContentPane().add(splitPaneMainFrame, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //<editor-fold defaultstate="collapsed" desc="Events handlers">
    private void buttonClearAllActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_buttonClearAllActionPerformed
    {//GEN-HEADEREND:event_buttonClearAllActionPerformed
        this.plotSignalSerieFourier.clear();
        this.plotSpectreSerieFourier.clear();
        this.plotRealPartTFSerieF.clear();
        this.plotImaginaryPartTFSerieF.clear();
        this.plotPhaseTFSerieF.clear();
    }//GEN-LAST:event_buttonClearAllActionPerformed

    private void buttonAfficherActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_buttonAfficherActionPerformed
    {//GEN-HEADEREND:event_buttonAfficherActionPerformed
        try
        {
            // Get discretiseur parameters
            int samples = (int)spinnerSamplesDisc.getValue();
            double origine = (double)this.spinnerOrigineDisc.getValue();
            double duree = (double)this.spinnerDureeDisc.getValue();
            Discretiseur discretiseur = new Discretiseur(samples, origine, duree);
            
            // Get signal parameters
            double periode = (double)this.spinnerPeriode.getValue();
            double amplitude = (double)this.spinnerAmplitude.getValue();

            // Create signal
            String signalType = String.valueOf(this.comboBoxSignaux.getSelectedItem());
            switch(signalType)
            {
                case "Carré":
                    System.out.println("Afficher un carré");
                    this.signal = SignalPeriodique.getInstance(
                            SignalPeriodique.CARRE, amplitude,1/periode, 0.0, discretiseur);
                    break;
                case "Dents de scie":
                    System.out.println("Afficher un dents de scie");
                    this.signal = SignalPeriodique.getInstance(
                            SignalPeriodique.SCIE, amplitude, 1/periode, 0.0, discretiseur);
                    break;
                case "Fonction A (exercice)":
                    System.out.println("Afficher signal fonction A");
                    this.signal = SignalPeriodique.getInstance(
                            new FonctionA(amplitude, 1/periode, 0.0), discretiseur);
                    break;
                case "Fonction B (exercice)":
                    System.out.println("Afficher signal fonction B");
                    break;
                default:
                    throw new Exception("Signal non reconnu");
            }
            
            // Display signal
            this.plotSignalSerieFourier.addSignal(this.signal, signalType, true);
        }
        catch (Exception ex)
        {
            MessageBoxes.ShowError(this, ex.getMessage(), "Une erreur s'est produite");
        }
    }//GEN-LAST:event_buttonAfficherActionPerformed
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Main">
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() ->
        {
            new MainFrame().setVisible(true);
        });
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Variables declaration">

    private final SignalPanel plotSignalSerieFourier;
    private final SignalPanel plotSpectreSerieFourier;
    private final SignalPanel plotRealPartTFSerieF;
    private final SignalPanel plotImaginaryPartTFSerieF;
    private final SignalPanel plotPhaseTFSerieF;

    private Signal signal;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAfficher;
    private javax.swing.JButton buttonAjouterSerieFourier;
    private javax.swing.JButton buttonClearAll;
    private javax.swing.JComboBox comboBoxSignaux;
    private javax.swing.JLabel labelAmplitude;
    private javax.swing.JLabel labelChoixSignal;
    private javax.swing.JLabel labelDuree;
    private javax.swing.JLabel labelNbTermesSerieFourier;
    private javax.swing.JLabel labelOrigine;
    private javax.swing.JLabel labelPeriode;
    private javax.swing.JLabel labelSamples;
    private javax.swing.JPanel panelDiscretiseur;
    private javax.swing.JPanel panelOptions;
    private javax.swing.JPanel panelPlots;
    private javax.swing.JPanel panelSignals;
    private javax.swing.JSpinner spinnerAmplitude;
    private javax.swing.JSpinner spinnerDureeDisc;
    private javax.swing.JSpinner spinnerNbTermesSerieFourier;
    private javax.swing.JSpinner spinnerOrigineDisc;
    private javax.swing.JSpinner spinnerPeriode;
    private javax.swing.JSpinner spinnerSamplesDisc;
    private javax.swing.JSplitPane splitPaneMainFrame;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
}
