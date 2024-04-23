/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Client;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Sami Ahmed
 */
public class ClientDashboardController implements Initializable {

    @FXML
    private ComboBox<String> projectcatergoryComboBox;
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
    @FXML
    private DatePicker contractPostingDateDatepicker;

    
    ArrayList<clientcontract>CliemtContractList;
    
    ToggleGroup Delivery,Currency;
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        Delivery = new ToggleGroup();
        firsttimeRadioButton.setToggleGroup(Delivery);
        secondtimeRadioButton.setToggleGroup(Delivery);
        thirdTimeRadioButton.setToggleGroup(Delivery);
        
        
        projectcatergoryComboBox.getItems().addAll("Transleting","Video Editing","Graphics","Website Developer");
        
        
        Currency = new ToggleGroup();
        dollarRadioButton.setToggleGroup(Currency);
        EuroRadioButton.setToggleGroup(Currency);
        
        CliemtContractList=new ArrayList<clientcontract>();
    }    


    @FXML
    private void submitClickOnAction(ActionEvent event) {

        String status = "";
        if (firsttimeRadioButton.isSelected()) {
            status = "24 Hours";
        } 
        else if (secondtimeRadioButton.isSelected()) {
            status = "3 Days";
        }
        else if (thirdTimeRadioButton.isSelected()) {
            status = "7 Days";
            
        }
        
        String currency="";
        
        if (dollarRadioButton.isSelected()){
            currency="Dollar";
        }
        else if (EuroRadioButton.isSelected()){
            currency="Euro";
        }
        
    
        
        clientcontract newList = new clientcontract(
                contractPostingDateDatepicker.getValue(),
                status,
                projectcatergoryComboBox.getValue(),
                currency
                
            );
        
        
                //Save In Bin
        
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            f = new File("Project Contracts.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            oos.writeObject(newList);
        } catch (IOException ex) {

        }
        CliemtContractList.add(newList);
        
 
        
    }

    
}
