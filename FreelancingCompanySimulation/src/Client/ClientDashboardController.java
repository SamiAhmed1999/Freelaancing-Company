/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Client;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Sami Ahmed
 */
public class ClientDashboardController implements Initializable {

    @FXML
    private ComboBox<?> projectcatergoryComboBox;
    @FXML
    private RadioButton dollarRadioButton;
    @FXML
    private RadioButton EuroRadioButton;
    @FXML
    private RadioButton firsttimeRadioButton;
    @FXML
    private RadioButton secondtimeRadioButton;
    @FXML
    private RadioButton thirdTimeRadioButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void submitClickOnAction(ActionEvent event) {
    }

    
}
