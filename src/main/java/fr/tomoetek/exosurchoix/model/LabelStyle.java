package fr.tomoetek.exosurchoix.model;

import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;

public class LabelStyle {
    private String backCol ="";
    private String txtCol = "";


    private final Label lbl;
    private final TextField txtField;



    public LabelStyle(Label lbl, TextField txtField){
        this.lbl = lbl;
        this.txtField = txtField;
    }

    public void setMsg(boolean disable, Toggle selectedToggle) {
        RadioButton radioButton = (RadioButton) selectedToggle;
        if (disable || (radioButton == null)) {
            lbl.setText(txtField.getText());

        } else {
                switch (radioButton.getId()){
                    case "majuscule":
                        lbl.setText(txtField.getText().toUpperCase());
                    break;
                    case "minuscule":
                        lbl.setText(txtField.getText().toLowerCase());
                    break;

                }
            }
        }


    public void setBackCol(String backCol) {
        this.backCol =  backCol.isEmpty()? "":"-fx-background-color: "+backCol+";";
    }



    public void setTxtCol(String txtCol) {
        this.txtCol = txtCol.isEmpty()? "":"-fx-text-fill: "+txtCol+";";
    }



    public void setStyle(){
        lbl.setStyle(backCol+txtCol);
    }
}
