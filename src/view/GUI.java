
package view;

import graph.LineChart;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import parts.CountingTheSelectedDoors;
import parts.MouseHandler;
import parts.Door;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import org.jfree.chart.ChartPanel;

/**
 *
 * @author czimbortibor
 */
public class GUI extends javax.swing.JFrame {  
        private final String rules = "Suppose you're on a game show, and you're given the choice of three doors:\n"
                + "Behind one door is a car; behind the others, goats. You pick a door, say No. 1, and the host\n"
                + "who KNOWS what's behind the doors, opens another door, say No. 3, which has a goat. He then says to you:\n"
                + "Do you want to pick door No. 2?";
        private FlowLayout flow = new FlowLayout();
        private Door[] doors1 = new Door[3];
        private Door[] doors2 = new Door[3];
        private CountingTheSelectedDoors ct = new CountingTheSelectedDoors(doors1);
        private Thread t1 = new Thread(ct);
        private MouseHandler mHandler;
        private double[][] randomData; 
        private double[][] switchData; 
        private Timer timer = new Timer(0, null);
        JOptionPane optionPane = new JOptionPane("Hit", JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE, null, new Object[]{}, null);
        JDialog message = new JDialog();
        private int k = 0;
        
    public GUI() {
        this.setLocation(150, 45);
        this.getContentPane().setBackground(java.awt.Color.LIGHT_GRAY);
        flow.setHgap(0);
        flow.setVgap(0);
        initComponents();
        initDoors1();
        panelDoors2.setVisible(false);
        toggleBtnChoose.setVisible(false);
        btnAgain.setVisible(false);
        randomLabel.setVisible(false);
        switchLabel.setVisible(false);
        separatingPanel.setVisible(false);
        delaySpinner.setVisible(false);
        delayLabel.setVisible(false);
        btnPause.setVisible(false);
        pack();
        /*message.setModal(true);
        message.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        message.setContentPane(optionPane);
        message.pack();*/
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDoors1 = new javax.swing.JPanel();
        btnGame = new javax.swing.JButton();
        toggleBtnChoose = new javax.swing.JToggleButton();
        btnSimulation = new javax.swing.JButton();
        chartHoldingPanel = new javax.swing.JPanel();
        btnAgain = new javax.swing.JToggleButton();
        randomLabel = new javax.swing.JLabel();
        switchLabel = new javax.swing.JLabel();
        separatingPanel = new javax.swing.JPanel();
        delaySpinner = new javax.swing.JSpinner();
        delayLabel = new javax.swing.JLabel();
        btnRules = new javax.swing.JButton();
        btnPause = new javax.swing.JButton();
        panelDoors2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Monty Hall Problem");
        setBackground(java.awt.Color.LIGHT_GRAY);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(0, 102, 102));
        setName("mainFrame"); // NOI18N
        setResizable(false);

        panelDoors1.setBackground(getBackground());
        panelDoors1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 0), null));
        panelDoors1.setForeground(new java.awt.Color(102, 102, 0));

        javax.swing.GroupLayout panelDoors1Layout = new javax.swing.GroupLayout(panelDoors1);
        panelDoors1.setLayout(panelDoors1Layout);
        panelDoors1Layout.setHorizontalGroup(
            panelDoors1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 252, Short.MAX_VALUE)
        );
        panelDoors1Layout.setVerticalGroup(
            panelDoors1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnGame.setBackground(new java.awt.Color(0, 204, 204));
        btnGame.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGame.setText("Game");
        btnGame.setToolTipText("");
        btnGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGameActionPerformed(evt);
            }
        });

        toggleBtnChoose.setBackground(new java.awt.Color(0, 204, 204));
        toggleBtnChoose.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        toggleBtnChoose.setText("Choose");
        toggleBtnChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleBtnChooseActionPerformed(evt);
            }
        });

        btnSimulation.setBackground(new java.awt.Color(0, 204, 204));
        btnSimulation.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSimulation.setText("Simulation");
        btnSimulation.setToolTipText("");
        btnSimulation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimulationActionPerformed(evt);
            }
        });

        chartHoldingPanel.setBackground(getBackground());
        chartHoldingPanel.setLayout(new java.awt.BorderLayout());

        btnAgain.setBackground(new java.awt.Color(0, 204, 204));
        btnAgain.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAgain.setText("Again");
        btnAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgainActionPerformed(evt);
            }
        });

        randomLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        randomLabel.setText("Choosing randomly");

        switchLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        switchLabel.setText("Choosing switching");

        separatingPanel.setBackground(new java.awt.Color(102, 102, 102));
        separatingPanel.setBorder(new javax.swing.border.SoftBevelBorder(1));

        javax.swing.GroupLayout separatingPanelLayout = new javax.swing.GroupLayout(separatingPanel);
        separatingPanel.setLayout(separatingPanelLayout);
        separatingPanelLayout.setHorizontalGroup(
            separatingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        separatingPanelLayout.setVerticalGroup(
            separatingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        delaySpinner.setModel(new javax.swing.SpinnerNumberModel(1000, 10, null, 100));

        delayLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        delayLabel.setText("Delay:");

        btnRules.setText("Guide");
        btnRules.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRulesActionPerformed(evt);
            }
        });

        btnPause.setBackground(new java.awt.Color(240, 171, 0));
        btnPause.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPause.setText("Pause");
        btnPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPauseActionPerformed(evt);
            }
        });

        panelDoors2.setBackground(getBackground());
        panelDoors2.setBorder(panelDoors1.getBorder());

        javax.swing.GroupLayout panelDoors2Layout = new javax.swing.GroupLayout(panelDoors2);
        panelDoors2.setLayout(panelDoors2Layout);
        panelDoors2Layout.setHorizontalGroup(
            panelDoors2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 232, Short.MAX_VALUE)
        );
        panelDoors2Layout.setVerticalGroup(
            panelDoors2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(delayLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delaySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnSimulation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGame, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnRules))
                        .addGap(13, 13, 13)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelDoors1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(separatingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelDoors2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(btnPause)
                        .addGap(30, 30, 30)
                        .addComponent(toggleBtnChoose)
                        .addGap(71, 71, 71)
                        .addComponent(btnAgain, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(chartHoldingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 827, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 226, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(randomLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(switchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(280, 280, 280))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRules)
                                .addGap(42, 42, 42)
                                .addComponent(btnGame)
                                .addGap(17, 17, 17)
                                .addComponent(btnSimulation)
                                .addGap(76, 76, 76))
                            .addComponent(separatingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelDoors1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelDoors2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(switchLabel)
                            .addComponent(randomLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(toggleBtnChoose)
                            .addComponent(btnAgain))
                        .addGap(7, 7, 7))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(delaySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(delayLabel)
                        .addComponent(btnPause)))
                .addComponent(chartHoldingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGameActionPerformed
        toggleBtnChoose.setVisible(true);
        toggleBtnChoose.setEnabled(true);
        btnPause.setVisible(false);
        t1 = new Thread(ct);
        for (Door d : doors1) {
            d.setSelected(false);
        }
        panelDoors2.removeAll();
        chartHoldingPanel.removeAll();
        try {
            if (timer.isRunning()) {
                timer.stop();
            }
        } catch(NullPointerException ex) {
            throw ex;
        }
        try {
            t1.start();
        } catch(IllegalThreadStateException ex) {
            throw ex;
        }
        delaySpinner.setVisible(false);
        separatingPanel.setVisible(false);
        randomLabel.setVisible(false);
        switchLabel.setVisible(false);
        delayLabel.setVisible(false);
        initDoors1();
        pack();
    }//GEN-LAST:event_btnGameActionPerformed

    private void toggleBtnChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleBtnChooseActionPerformed
        int i, nr = 0;
        for (i = 0; i < 3; ++i){
            if ( doors1[i].getSelected() ){
                break;
            }
        }
        int r = (int)(Math.random() * 3);
        while ( r == i || doors1[r].getBehind().equals("car") ){
            r = (int)(Math.random() * 3);
        }
        
        if( toggleBtnChoose.isSelected() ) {
            toggleBtnChoose.setSelected(false);
            t1.resume();
            for (Door d : doors1) {
                if ( d.getSelected() ) {
                    ++nr;
                }
            }
            if (nr > 0) {
                doors1[r].setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/door_with_goat.png")));
                doors1[r].setSelectedByRandom(true);
                for (Door d : doors1) {
                    if ( d.getSelected() ) {
                        ++nr;
                        Object[] userOptions = {"Stay", "Switch"};
                        String question = "You have a choice:\n do you stay with your original choice or switch to the other door?";
                        int choice = JOptionPane.showOptionDialog(this, question, "Choice", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, userOptions, userOptions[0]);
                        if (choice == 0) {
                            if (d.getBehind().equals("car") ) {
                                JOptionPane.showMessageDialog(this, "You won!", "Result", 1, null);
                                d.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/door_selected_with_car.png")));
                            } else { 
                                JOptionPane.showMessageDialog(this, "You lost!", "Result", 1, null);
                                d.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/door_selected_with_goat.png")));
                            }
                        } else {
                            d.setSelected(false);
                            d.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/door_simple.png")));
                            for ( Door d1 : doors1 ){
                                if ( !d1.equals(d) && !d1.getSelectedByRandom() ) {
                                    d1.setSelected(true);
                                    d1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/door_selected.png")));
                                    d.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/door_simple.png")));
                                    if ( d1.getBehind().equals("goat") ) {  
                                        JOptionPane.showMessageDialog(this, "You lost!", "Result", 1, null);
                                        d1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/door_selected_with_goat.png")));
                                    }else {
                                        JOptionPane.showMessageDialog(this, "You won!", "Result", 1, null);
                                        d1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/door_selected_with_car.png")));
                                    }
                                } 
                            }  
                        }
                        break;
                    } 
                }
                // open the last door
                for (Door d : doors1) {
                    if ( !d.getSelected() ) {
                        if ( d.getBehind().equals("goat") ) {
                            d.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/door_with_goat.png")));
                        } else {
                            d.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/door_with_car.png")));
                        }
                    }
                }
                btnAgain.setVisible(true);  
                btnAgain.setSelected(false);
                toggleBtnChoose.setSelected(false);
                toggleBtnChoose.setEnabled(false);
            } else { 
                JOptionPane.showMessageDialog(null, "Choose a door!", "Error", 1);       
            }
        } else {
            t1.suspend();
        }
    }//GEN-LAST:event_toggleBtnChooseActionPerformed

    private void resetDoors(Door[] doors) {
         int r = (int)(Math.random() * 3);
         doors[r].setBehind("car");
         for (int i = 0; i < doors.length; ++i){
             if (i != r) {
                 doors[i].setBehind("goat");
             }
             doors[i].setSelected(false);
         }
    }
    
    private void switchDoorsAction() {
        resetDoors(doors1);
        int r = (int)(Math.random() * 3);
        doors1[r].setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/door_selected.png")));
        doors1[r].setSelected(true);
        int rNew = (int)(Math.random() * 3);
        while (rNew == r || doors1[rNew].getBehind().equals("car")) {
            rNew = (int)(Math.random() * 3);
        }
        doors1[rNew].setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/door_with_goat.png")));
        doors1[rNew].setSelected(true);
        
        doors1[r].setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/door_simple.png")));
        Door selectedDoor = doors1[0];
        for (Door d : doors1) {
            if (!d.getSelected()) {
                selectedDoor = d;
            }
        }
        
        switchData[0][k] = k + 1;
        if (selectedDoor.getBehind().equals("goat")) {
            selectedDoor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/door_selected_with_goat.png")));
            doors1[r].setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/door_with_car.png")));
            if (k > 0) {
                switchData[1][k] = switchData[1][k-1];
            } else {
                switchData[1][k] = 1;
            }
        } else {
            selectedDoor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/door_selected_with_car.png")));
            doors1[r].setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/door_with_goat.png")));
            /*message.setLocationRelativeTo(panelDoors1);
            timer.setDelay((int)spinnerDelay.getValue()+1000);
            message.setVisible(true);
            message.dispose();
            timer.setDelay((int)spinnerDelay.getValue());*/
            if (k > 0) {
                switchData[1][k] = switchData[1][k-1] + 1;
            } else {
                switchData[1][k] = 1;
            }
        }
    }
    
    private void randomDoorsAction() {
        resetDoors(doors2);
        int r = (int)(Math.random() * 3);
        doors2[r].setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/door_selected.png")));
        int rNew = (int)(Math.random() * 3);
        while (rNew == r || doors2[rNew].getBehind().equals("car")) {
            rNew = (int)(Math.random() * 3);
        }
        doors2[rNew].setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/door_with_goat.png")));
        doors2[rNew].setSelected(true);
        
        doors2[r].setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/door_simple.png")));
        int selected = (int)(Math.random() * 3);
        while ( selected == rNew || doors2[selected].getSelected() ) {
            selected = (int)(Math.random() * 3);
        }
        
        randomData[0][k] = k + 1;
        if (doors2[selected].getBehind().equals("goat")) {
            doors2[selected].setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/door_selected_with_goat.png")));
            doors2[r].setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/door_with_car.png")));
            if (k > 0) {
                randomData[1][k] = randomData[1][k-1];
            } else {
                randomData[1][k] = 1;
            }
        } else {
            doors2[selected].setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/door_selected_with_car.png")));
            doors2[r].setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/door_with_goat.png")));
            if (k > 0) {
                randomData[1][k] = randomData[1][k-1] + 1;
            } else {
                randomData[1][k] = 1;
            }
        }
    }
    
    private void btnSimulationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimulationActionPerformed
        k = 0;
        panelDoors1.removeAll();
        panelDoors2.removeAll();
        initDoors2();
        initDoors1();
        if (timer.isRunning()) {
            timer.stop();
        }
        t1.stop();
        delaySpinner.setVisible(true);
        btnPause.setVisible(true);
        delayLabel.setVisible(true);
        chartHoldingPanel.removeAll();
        toggleBtnChoose.setVisible(false);
        btnAgain.setVisible(false);
        panelDoors2.setVisible(true);
        btnSimulation.setEnabled(false);
        for (Door d : doors1) {
            d.removeMouseListener(mHandler);
        }
        randomLabel.setVisible(true);
        switchLabel.setVisible(true);
        separatingPanel.setVisible(true);
       
        int simNr = getSimNr();
        randomData = new double[2][simNr];
        switchData = new double[2][simNr];
        
        for (int i = 0; i < 2; ++i){
            for (int j = 0; j < simNr; ++j){
                randomData[i][j] = 0;
                switchData[i][j] = 0;
            }
        }
        
        for (Door d : doors1){
            d.setSelected(false);
        }
        for (Door d1 : doors2){
            d1.setSelected(false);
        }
        
        LineChart chart = new LineChart(randomData, switchData);
        ChartPanel chPanel = chart.getChartPanel();
        //chPanel.setPreferredSize(new Dimension(500, 400));
        chPanel.setMouseWheelEnabled(true);
        chartHoldingPanel.add(chPanel, BorderLayout.CENTER);  
        btnSimulation.setEnabled(true);
        
        timer = new Timer((int)delaySpinner.getValue(), new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (k < simNr) {
                    switchDoorsAction();
                    randomDoorsAction();
                    refreshChart(chart);
                    //pack();
                     ++k; 
                     timer.setDelay((int)delaySpinner.getValue());
                } else {
                    timer.stop();
                }
            }
        });
        
        timer.start();
    }//GEN-LAST:event_btnSimulationActionPerformed

    private void refreshChart(LineChart chart){
        chartHoldingPanel.removeAll();
        chart.refresh(randomData, switchData);
        ChartPanel chPanel = chart.getChartPanel();
        chPanel.setMouseWheelEnabled(true);
        chartHoldingPanel.add(chPanel, BorderLayout.CENTER);
        chartHoldingPanel.repaint();  
    }
    
    private int getSimNr() {
        int simNr = 1;
        boolean error = false;
        while (!error) {
            try {
                String s = JOptionPane.showInputDialog(this, "Enter the number of simulations");
                while (s.isEmpty()) {
                    s = JOptionPane.showInputDialog(this, "Enter the number of simulations");
                }
                simNr = Integer.parseInt(s);
                error = true;
            } catch (NumberFormatException ex) {         
                JOptionPane.showMessageDialog(this, "Only integer numbers!");
                error = false;
            }
        }
        return simNr;
    }
    
    private void btnAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgainActionPerformed
        panelDoors1.removeAll();
        initDoors1();
        btnAgain.setVisible(false);
        toggleBtnChoose.setEnabled(true);
    }//GEN-LAST:event_btnAgainActionPerformed

    private void btnRulesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRulesActionPerformed
        JOptionPane.showMessageDialog(this, rules , "Guide", 1, null);
    }//GEN-LAST:event_btnRulesActionPerformed

    private void btnPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPauseActionPerformed
        if (timer.isRunning()) {
            timer.stop();
        } else {
            timer.start();
        }
    }//GEN-LAST:event_btnPauseActionPerformed

    private void initDoors1() {
        panelDoors1.removeAll();
        panelDoors1.setLayout(flow);
        this.mHandler = new MouseHandler();
        for (int i = 0; i < 3; ++i) {
            doors1[i] = new Door(""+"door"+i);
            panelDoors1.add(doors1[i]);
            doors1[i].setText(null);
            doors1[i].setContentAreaFilled(false);
            doors1[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/door_simple.png")));
            doors1[i].addMouseListener(this.mHandler);
        }
        pack();
        
        int r = (int)(Math.random() * 3);
        doors1[r].setBehind("car");
    }
    
    private void initDoors2() {
        panelDoors2.setLayout(flow);
        for (int i = 0; i < 3; ++i) {
            doors2[i] = new Door(""+"door"+i);
            panelDoors2.add(doors2[i]);
            doors2[i].setText(null);
            doors2[i].setContentAreaFilled(false);
            doors2[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/door_simple.png")));
        }
        pack();
    }
    

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
                
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAgain;
    private javax.swing.JButton btnGame;
    private javax.swing.JButton btnPause;
    private javax.swing.JButton btnRules;
    private javax.swing.JButton btnSimulation;
    private javax.swing.JPanel chartHoldingPanel;
    private javax.swing.JLabel delayLabel;
    private javax.swing.JSpinner delaySpinner;
    private javax.swing.JPanel panelDoors1;
    private javax.swing.JPanel panelDoors2;
    private javax.swing.JLabel randomLabel;
    private javax.swing.JPanel separatingPanel;
    private javax.swing.JLabel switchLabel;
    private javax.swing.JToggleButton toggleBtnChoose;
    // End of variables declaration//GEN-END:variables
}
