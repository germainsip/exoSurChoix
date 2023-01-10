package fr.tomoetek.exosurchoix.gui;

import fr.tomoetek.exosurchoix.model.LabelStyle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

public class HelloController{
    public TitledPane optionsBloc ,backgroudBloc, couleurBloc, casseBloc;
    public TextField leTexte;
    public Label rendue;

    public CheckBox backCheck, colorCheck, casseCheck;
    public RadioButton redBack, greenBack, blueBack, redTxt , greenTxt, blueTxt, minuscule, majuscule;
    public ToggleGroup fondgrp, colGrp, casseGrp;
    public LabelStyle lblStyle;

    public void initialize(){
        optionsBloc.setDisable(true);
        backgroudBloc.setDisable(true);
        couleurBloc.setDisable(true);
        casseBloc.setDisable(true);
        lblStyle = new LabelStyle(rendue,leTexte);
    }

    public void updateTexte(KeyEvent keyEvent) {
        optionsBloc.setDisable(leTexte.getText().isEmpty());
        setStyle();
    }

    public void setStyle(){

            if(!backgroudBloc.isDisable()){
                RadioButton rdFond = (RadioButton) fondgrp.getSelectedToggle();
                if (rdFond != null)  lblStyle.setBackCol( rdFond.getId().replace("Back",""));
            } else lblStyle.setBackCol("");

            if(!couleurBloc.isDisable()){
                RadioButton rdCol = (RadioButton) colGrp.getSelectedToggle();
                if (rdCol != null) lblStyle.setTxtCol(rdCol.getId().replace("Txt",""));
            } else lblStyle.setTxtCol("");


            lblStyle.setStyle();
            lblStyle.setMsg(casseBloc.isDisable(),casseGrp.getSelectedToggle());

    }

    public void chkOptions(ActionEvent actionEvent) {
        backgroudBloc.setDisable(!backCheck.isSelected());
        couleurBloc.setDisable(!colorCheck.isSelected());
        casseBloc.setDisable(!casseCheck.isSelected());
        setStyle();
    }


    public void change(MouseEvent mouseEvent) {
        setStyle();
    }


}