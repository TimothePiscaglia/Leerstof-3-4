package be.odisee.javafxmaven;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;


public class HelloController {
    @FXML
    private TextField txtUserName;
    @FXML
    private PasswordField pwdPassword;

    @FXML
    protected void onLoginClick() {
        pwdPassword.setText(txtUserName.getText());
        // do something
    }

    @FXML
    protected void onCancelClick() {
        // do something
    }
}