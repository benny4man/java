package TipCalculator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

public class TipCalculatorController {

    private static final NumberFormat currency = NumberFormat.getCurrencyInstance();
    private static final NumberFormat percent = NumberFormat.getPercentInstance();
    private BigDecimal tipPercentage = new BigDecimal(0.15);

    @FXML
    private Label tipPercentageLabel;

    @FXML
    private TextField amountTextField;

    @FXML
    private TextField tipTextField;

    @FXML
    private TextField totalPerPersonTextField;

    @FXML
    private TextField totalTextField;

    @FXML
    private Slider tipPercentageSlider;

    @FXML
    private TextField numberOfPeopleTextField;

    @FXML // FMXL loader calls this method
    public void initialize() {
        currency.setRoundingMode(RoundingMode.HALF_UP);

        tipPercentageSlider.valueProperty().addListener(
                new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> ov,
                    Number oldValue, Number newValue) {
                BigDecimal tip = tipPercentage;
                tipPercentage = BigDecimal.valueOf(newValue.intValue() / 100.0);
                calculate();
            }
        }
        );
        amountTextField.textProperty().addListener(
                new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> ov,
                    String oldValue, String newValue) {
                calculate();
            }
        }
        );
        tipPercentageLabel.textProperty().bind(
                tipPercentageSlider.valueProperty().asString("%.0f%%"));
    }

    public void calculate() {
        try {
            //math
            BigDecimal amount = new BigDecimal(amountTextField.getText());
            BigDecimal tip = amount.multiply(tipPercentage);
            BigDecimal total = amount.add(tip);

            //display
            tipTextField.setText(currency.format(tip));
            totalTextField.setText(currency.format(total));
        } catch (NumberFormatException ex) {
            totalTextField.setText("Enter emount");
        }
    }

}
