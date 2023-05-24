/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class AdminDashboardPageController implements Initializable {

    @FXML
    private TableView<?> tableView;
    @FXML
    private TableColumn<?, ?> tvID;
    @FXML
    private TableColumn<?, ?> tvUserName;
    @FXML
    private TableColumn<?, ?> tvFirstName;
    @FXML
    private TableColumn<?, ?> tvLastName;
    @FXML
    private TableColumn<?, ?> tvAge;
    @FXML
    private TableColumn<?, ?> tvEmail;
    @FXML
    private TableColumn<?, ?> tvGender;
    @FXML
    private TableColumn<?, ?> tvRole;
    @FXML
    private Button btnLogout;
    @FXML
    private Button btnShowAllBookedWaitingAppointments;
    @FXML
    private Button btnShowAllAppointments;
    @FXML
    private Button btnShowAllBookedFinishedAppointments;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void showLogout(ActionEvent event) {
    }

    @FXML
    private void ShowAllBookedWaitingAppointments(ActionEvent event) {
    }

    @FXML
    private void ShowAllFreeAppointments(ActionEvent event) {
    }

    @FXML
    private void ShowAllBookedFinishedAppointments(ActionEvent event) {
    }

    
}
