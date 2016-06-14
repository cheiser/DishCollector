/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package infocollector;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.MatteBorder;

/**
 * does not use getContentPane and edits directly in the content pane atm.
 * @author Mattis
 */
public class InfoCollector extends JFrame {
    
    private JTextField typeField;
    private JTextArea dishArea;
    
    public InfoCollector() {
        setConfig();
    }

    private void setConfig() {
        setLayout(new GridLayout(1, 0));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        this.add(new InfoPanel());
        pack();        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new InfoCollector();
    }

    private class InfoPanel extends JPanel {

        public InfoPanel() {
            setConfig();
            drawPanel();
        }

        private void setConfig() {
            this.setLayout(new BorderLayout());
            this.setSize(400, 400);
            this.setVisible(true);
            this.setOpaque(false);
            // this.setBackground(Color.red);
        }

        private void drawPanel() {
            this.add(new TypePanel(), BorderLayout.NORTH);
            this.add(new DishPanel(), BorderLayout.CENTER);
        }

        @Override protected void paintComponent(Graphics g){
            g.setColor(Color.red);
        }
        
        private class TypePanel extends JPanel {

            public TypePanel() {
                this.setConfig();
                this.drawPanel();
            }

            private void setConfig() {
                this.setLayout(new GridLayout(1, 0));
                this.setSize(100, 100);
                this.setVisible(true);
                this.setOpaque(false);
                // this.setBackground(Color.red);
                this.setBorder(new MatteBorder(1, 1, 1, 1, Color.BLACK));
            }

            private void drawPanel() {
                typeField = new JTextField("enter type here");
                typeField.setFont(new Font(Font.SERIF, Font.BOLD, 15));
                this.add(typeField);
                this.add(new JLabel(""));
            }
        }
        
        private class DishPanel extends JPanel{
            
            public DishPanel() {
                this.setConfig();
                this.drawPanel();
            }

            private void setConfig() {
                this.setLayout(new BorderLayout());
                this.setSize(300, 300);
                this.setVisible(true);
                this.setBackground(Color.WHITE);
                this.setBorder(new MatteBorder(1, 1, 1, 1, Color.BLACK));
                getContentPane();
            }

            private void drawPanel() {
                dishArea = new JTextArea("enter dish here", 15, 15);
                dishArea.setLineWrap(true);
                dishArea.setBorder(new MatteBorder(1, 1, 1, 1, Color.BLACK));
                this.add(dishArea, BorderLayout.CENTER);
                this.add(new ButtonPanel(), BorderLayout.EAST);
            }
            
            private class ButtonPanel extends JPanel{
                private JButton doneBtn;
                private JButton continueBtn;
                private int nrOfRows = 10;
                private int nrOfBtns = 2;
                private GridBagConstraints constr = new GridBagConstraints();
                
                public ButtonPanel() {
                this.setConfig();
                this.drawPanel();
            }

            private void setConfig() {
                this.setLayout(new GridBagLayout());
                this.setSize(300, 300);
                this.setVisible(true);
                this.setOpaque(false);
                this.setBackground(Color.WHITE);
            }

            private void drawPanel() {
                constr.fill = GridBagConstraints.NONE;
                constr.gridx = GridBagConstraints.RELATIVE;
                constr.gridy = GridBagConstraints.RELATIVE;
                constr.gridheight = 2;
                constr.gridwidth = GridBagConstraints.REMAINDER;
                constr.anchor = GridBagConstraints.PAGE_START;
                
                doneBtn = new JButton("Done");
                continueBtn = new JButton("Continue");
                addBtnListeners();
                doneBtn.setPreferredSize(new Dimension(100, 25)); // Size(100, 100);
                continueBtn.setPreferredSize(new Dimension(100, 25)); // setSize(200, 200);
                
                /*for(int i = 0; i < nrOfRows-nrOfBtns-1; i++){
                    this.add(new JLabel(""));
                }*/
                
                this.add(doneBtn, constr);
                // this.add(new JLabel(""));
                constr.gridheight = 3;
                this.add(continueBtn, constr);
            }
            
            private void addBtnListeners(){
                doneBtn.addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent e) {
                            System.out.println("Done");
                            System.out.println("typeField contains " + typeField.getText());
                        }
                    });
                continueBtn.addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent e) {
                            System.out.println("Continues");
                            System.out.println("dishArea contains " + dishArea.getText());
                        }
                    });
            }
            }
        }
    }
}
