package helper;

import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

/**
 *
 * @author Diego Palacios <diego.palacios2@catolica.edu.sv>
 */
public class TextFieldValidation {

    public static boolean isTextFieldEmpty(TextField textField) {
        boolean res = false;
        if (textField.getText().length() == 0 || textField.getText().isEmpty()) {
            res = true;
        }
        return res;
    }
    
     public static boolean isTextFieldEmpty(TextField textField, Label errorLabel, String errorMessage) {
        boolean res = false;
        String msg = null;
        textField.getStyleClass().remove("error");
        if (isTextFieldEmpty(textField)) {
            msg = errorMessage;
            res = true;
            textField.getStyleClass().add("error");
        }
        errorLabel.setText(msg);
        return res;
    }
     
    public static boolean isNotReMatch(TextField textField, String re, Label errorLabel, String errorMessage) {
        boolean res = false;
        String msg = null;
        textField.getStyleClass().remove("error");
        if (!textField.getText().matches(re)) {
            msg = errorMessage;
            res = true;
            textField.getStyleClass().add("error");
        }
        errorLabel.setText(msg);
        return res;
    }

    public static boolean isComboBoxEmpty(ComboBox comboBox) {
        boolean res = false;
        if (comboBox.getValue() == "") {
            res = true;
        }
        return res;
    }

    public static boolean isComboBoxEmpty(ComboBox comboBox, Label errorLabel, String errorMessage) {
        boolean res = false;
        String msg = null;
        comboBox.getStyleClass().remove("error");
        if (isComboBoxEmpty(comboBox)) {
            msg = errorMessage;
            res = true;
            comboBox.getStyleClass().add("error");
        }
        errorLabel.setText(msg);
        return res;
    }

    public static void restrictNumbersOnly(KeyEvent keyEvent) {
        switch (keyEvent.getCode()) {
            case TAB:
            case BACK_SPACE:
            case DELETE:
                break;
            default:
                if (!keyEvent.getCode().isDigitKey()) {
                    Dialog.showErrorDialog("Error", "Incorrecto", "Ingrese solamente digitos");
                    keyEvent.consume();
                }
        }
    }

    public static void restrictLettersOnly(KeyEvent keyEvent) {
        KeyCode code = keyEvent.getCode();
        switch (code) {
            case TAB:
            case BACK_SPACE:
            case DELETE:
            case SPACE:
            case SHIFT:
                break;
            default:
                if (!code.isLetterKey()) {
                    Dialog.showErrorDialog("Error", "Incorrecto", "Ingrese solamente letras y espacios");
                    keyEvent.consume();
                }
        }
    }
}