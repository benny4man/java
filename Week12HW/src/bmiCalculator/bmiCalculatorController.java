package bmiCalculator;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class bmiCalculatorController {
    
    ObservableList unitsList = FXCollections.observableArrayList("Metric","Imperial");

    @FXML
    private ChoiceBox<String> unitsChoiceBox;

    @FXML
    private TextField weightTextField;

    @FXML
    private TextField heightTextField;

    @FXML
    private TextField bmiTextField;

    @FXML
    void calculateButtonPressed(ActionEvent event) {
        try{
            double weight = Double.valueOf(weightTextField.getText());
            double height = Double.valueOf(heightTextField.getText());
            double bmi = 0;
            
            if (unitsChoiceBox.getValue().equals("Metric")){
                bmi = weight / (height*height);
            }
            else{
                bmi = (weight *703) / (height*height);
            }
            bmiTextField.setText(String.format("%.1f",bmi));
        }
        catch(NumberFormatException ex){
            bmiTextField.setText("Please use numeric values");
        }
    }
    
    @FXML
    private void initialize(){
        unitsChoiceBox.setItems(unitsList);
        unitsChoiceBox.setValue("Metric");
    }
}

