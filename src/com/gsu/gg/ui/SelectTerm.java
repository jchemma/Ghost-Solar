package com.gsu.gg.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javafx.scene.control.ChoiceDialog;

public class SelectTerm{
    String selection;
    public String display(){
        List<String> choices = new ArrayList<>();
        String[] semester = {"Spring Semester 2017",
                "Fall Semester 2016(View Only)",
                "Summer Semester 2016(View Only)",
                "Spring Semester 2016(View Only)",
                "Spring Semester 2016(View Only)",
                "Fall Semester 2015(View Only)",
                "Summer Semester 2015(View Only)",
                "Spring Semester 2015(View Only)",
                "Fall Semester 2014(View Only)",
                "Summer Semester 2014(View Only)",
                "Spring Semester 2014(View Only)",
                "Fall Semester 2013(View Only)",
                "Summer Semester 2013(View Only)",
                "Spring Semester 2013(View Only)",
                "Fall Semester 2012(View Only)"
        };
        for(String str:semester){
            choices.add(str);
        }
        
        ChoiceDialog<String> dialog = new ChoiceDialog<>("Semester", choices);
        dialog.setTitle("Select Term");
        dialog.setHeaderText("Select A Term");
        dialog.setContentText("Choose a term: ");
        
        Optional<String> result = dialog.showAndWait();
        result.ifPresent(e -> selection = e);
        
        return selection;
    }
}