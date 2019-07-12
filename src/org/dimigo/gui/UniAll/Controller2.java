package org.dimigo.gui.UniAll;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class Controller2 implements Initializable {

    @FXML
    private TableView univTableView1;
    @FXML private TextField txtName;
    @FXML private Button SearchbyBox;
    @FXML private Button Search;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1){
    }

    public void handleRegAction(ActionEvent event){
        String Search = txtName.getText();

        if (Search.contains("여대")){
            Search = Search.replaceAll("여대","여자");
            System.out.println(Search);
        }
        if (Search.contains("공대")){
            Search = Search.replaceAll("공대","공업");
            System.out.println(Search);
        }
        if (Search.contains("강대")){
            Search = Search.replaceAll("강대","강원대");
            System.out.println(Search);
        }
        if (Search.contains("과기대")){
            Search = Search.replaceAll("과기대","과학기술대");
            System.out.println(Search);
        }
        if (Search.contains("과대")){
            Search = Search.replaceAll("과대","과학대");
            System.out.println(Search);
        }
        if (Search.contains("예대")){
            Search = Search.replaceAll("예대","예술");
            System.out.println(Search);
        }
        if (Search.contains("홍대")){
            Search = Search.replaceAll("홍대","홍익대");
            System.out.println(Search);
        }
        if (Search.contains("폴리텍대")){
            Search = Search.replaceAll("폴리텍대","폴리텍");
            System.out.println(Search);
        }


        System.out.println(Search);

        List<Univ2> univList = new Scrap2().Scrap(Search);

        ObservableList<Univ2> data = FXCollections.observableArrayList(univList);
        univTableView1.setItems(data);
        bindUnivTableColumn();
    }

    private void bindUnivTableColumn() {
        TableColumn schoolName = (TableColumn) univTableView1.getColumns().get(0);
        schoolName.setCellValueFactory(new PropertyValueFactory<Univ, String>("schoolName"));
        TableColumn campusName = (TableColumn) univTableView1.getColumns().get(1);
        campusName.setCellValueFactory(new PropertyValueFactory<Univ, String>("campusName"));
        TableColumn schoolType = (TableColumn) univTableView1.getColumns().get(2);
        schoolType.setCellValueFactory(new PropertyValueFactory<Univ, String>("schoolType"));
        TableColumn schoolGubun = (TableColumn) univTableView1.getColumns().get(3);
        schoolGubun.setCellValueFactory(new PropertyValueFactory<Univ, String>("schoolGubun"));
        TableColumn adres = (TableColumn) univTableView1.getColumns().get(4);
        adres.setCellValueFactory(new PropertyValueFactory<Univ, String>("adres"));
        TableColumn estType = (TableColumn) univTableView1.getColumns().get(5);
        estType.setCellValueFactory(new PropertyValueFactory<Univ, String>("estType"));
        TableColumn link = (TableColumn) univTableView1.getColumns().get(6);
        link.setCellValueFactory(new PropertyValueFactory<Univ, String>("link"));
    }

    @FXML
    public void changeWindow(ActionEvent event) throws IOException {

        Stage stage = (Stage) SearchbyBox.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));

        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();

    }
}
