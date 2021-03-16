package MortgageCalculator;


import java.math.RoundingMode;
import java.text.NumberFormat;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

public class MortgageCalculatorController {
    
    private static final NumberFormat currency = NumberFormat.getCurrencyInstance();
    private int years = 20;

    @FXML
    private TextField purchasePriceTextField;

    @FXML
    private TextField downPaymentTextField;

    @FXML
    private TextField interestRateTextField;
    
    @FXML
    private TextField monthlyPaymentTextField;
    
    @FXML
    private TextField loanAmountTextField;

    @FXML
    private Slider yearsSlider;

    @FXML
    private Label yearsLabel;

    @FXML
    void calculateBottonPressed(ActionEvent event) {
        try{
            double purchasePrice = Double.valueOf(purchasePriceTextField.getText());
            double downPayment = Double.valueOf(downPaymentTextField.getText());
            double interestRate = Double.valueOf(interestRateTextField.getText()) / 100;
            
            double monthlyRate = interestRate/12;
            double term = years * 12;
            double loan = purchasePrice - downPayment;
            double monthlyPayment = (loan*monthlyRate) / (1 - Math.pow(1+monthlyRate, -term));
            
            
            monthlyPaymentTextField.setText(currency.format(monthlyPayment));
            loanAmountTextField.setText(currency.format(loan));
            
        }
        catch(NumberFormatException ex){
            loanAmountTextField.setText("Please use numeric values");
        }
    }
    
    @FXML // FMXL loader calls this method
    public void initialize() {
        currency.setRoundingMode(RoundingMode.HALF_UP);
        
        yearsSlider.valueProperty().addListener(
                new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> ov,
                    Number oldValue, Number newValue) {
                
                years = newValue.intValue();
                yearsLabel.setText(String.valueOf(years));
            }

        }
        );
    }

}
