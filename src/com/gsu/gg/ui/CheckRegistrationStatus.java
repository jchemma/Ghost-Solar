package com.gsu.gg.ui;

import javafx.scene.control.Label;
import javafx.scene.text.Text;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jchemma
 */
public class CheckRegistrationStatus {
    public void display(String semester){
        
        Label studentAddDropPeriod = new Label("Student Add/Drop Period");
        Text studentadddropdescription = new Text(
                "From the time registration opens - up until registration closes. See specified time frames below or refer to the academic calendar.\n"
                + "Dropped courses do not appear on the transcript.");
        
    }
}
