package mpgCalculator;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class mpgCalculatorController {

    @FXML
    private TextField milesTextField;

    @FXML
    private TextField gallonsTextField;

    @FXML
    private TextField mpgTextField;

    @FXML
    void calculateButtonPressed(ActionEvent event) {
        try{
            double miles = Double.valueOf(milesTextField.getText());
            double gallons = Double.valueOf(gallonsTextField.getText());

            double mpg = miles/gallons;  
            mpgTextField.setText(String.format("%.2f",mpg));
        }
        catch(NumberFormatException ex){
            mpgTextField.setText("Please use numeric values");
        }
    }

}
