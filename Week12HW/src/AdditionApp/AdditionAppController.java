package AdditionApp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AdditionAppController {

    @FXML
    private TextField number1TextField;

    @FXML
    private TextField number2TextField;

    @FXML
    private Label totalTextField;

    @FXML
    void calculateButtonPressed(ActionEvent event) {
        try{
            double n1 = Double.parseDouble(number1TextField.getText());
            double n2 = Double.parseDouble(number2TextField.getText());
            double total = n1 + n2;

            totalTextField.setText(String.valueOf(total));  
        }
        catch(NumberFormatException e){
            totalTextField.setText("Please enter a number"); 
        }
        
        
    }

}
