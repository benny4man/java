package TemperatureConversion;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TemperatureConversion extends JFrame {
    
    private final JLabel tempLabel;
    private final JTextField tempTextField;
    
    public TemperatureConversion(){
        super("Fahrenheit to Celsius Converter");
        setLayout(new FlowLayout(FlowLayout.CENTER));
        
        tempTextField = new JTextField("Fahrenheit",10);
        tempLabel = new JLabel("Celsius");
        add(tempTextField);
        add(tempLabel);
        
        TextFieldHandler handler = new TextFieldHandler();
        tempTextField.addActionListener(handler);
    }
    
    private class TextFieldHandler implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent event){
            
            String string = "";
            double F = Double.valueOf(event.getActionCommand());
            double C = (5.0/9.0) * (F-32.0); 
            string = String.format("%.2f C",C);
            tempLabel.setText(string);
        }
    }
    
    public static void main(String[] args) {
        
        TemperatureConversion window = new TemperatureConversion();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(300,100);
        window.setVisible(true);
    }
    
}
