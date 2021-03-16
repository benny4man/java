package TemperatureConversion2;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TemperatureConversion2 extends JFrame {
    
    private final JLabel tempLabel1;
    private final JTextField tempTextField1;
    private final JLabel tempLabel2;
    private final JTextField tempTextField2;
    
    public TemperatureConversion2(){
        super("Temperature Converter");
        setLayout(new FlowLayout(FlowLayout.CENTER));
        
        tempTextField1 = new JTextField("Fahrenheit",10);
        tempTextField2 = new JTextField("Celsius",10);
        tempLabel1 = new JLabel("Celsius");
        tempLabel2 = new JLabel("Kelvin");
        add(tempTextField1);
        add(tempLabel1);
        add(tempTextField2);
        add(tempLabel2);
        
        TextFieldHandler handler = new TextFieldHandler();
        tempTextField1.addActionListener(handler);
        tempTextField2.addActionListener(handler);
    }
    
    private class TextFieldHandler implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent event){
            
            String string = "";
            
            if(event.getSource() == tempTextField1){
                double F = Double.valueOf(event.getActionCommand());
                double C = (5.0/9.0) * (F-32.0); 
                string = String.format("%.2f C",C);
                tempLabel1.setText(string);
            }
            if(event.getSource() == tempTextField2){
                double C = Double.valueOf(event.getActionCommand());
                double K = C + 273.15;
                string = String.format("%.2f K",K);
                tempLabel2.setText(string);
            }
            
        }
    }
    
    public static void main(String[] args) {
        
        TemperatureConversion2 window = new TemperatureConversion2();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(250,100);
        window.setVisible(true);
    }
    
}
