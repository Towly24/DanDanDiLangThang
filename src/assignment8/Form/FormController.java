package assignment8.Form;

import assignment7.Students;
import assignment8.Controller;
import assignment8.Main;
import assignment8.Subject;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class FormController {

    @FXML
    public TextField txtName;
    @FXML
    public TextField txtId;

    @FXML
    public TableView<Subject> table;
    @FXML

    public TableColumn<Subject, String> nameColumn;
    @FXML

    public TableColumn<Subject, Integer> idColumn;

    public ObservableList<Subject> SubjectList ;

    public void setSubject(ActionEvent e){
        Subject newSubject = new Subject();

        newSubject.setName(txtName.getText());

        newSubject.setId(Integer.parseInt(txtId.getText()));
        SubjectList.add(newSubject);
        table.setItems(SubjectList);
    }

    public void backToList(ActionEvent actionEvent) throws Exception{
        Parent formPage = FXMLLoader.load(getClass().getResource("../List/ListFx.fxml"));
        Scene formScene = new Scene(formPage,800,600);
        assignment8.Main.rootStage.setTitle("Thêm môn học");
        Main.rootStage.setScene(formScene);
    }


    public void Add(ActionEvent actionEvent) {
    }

}
