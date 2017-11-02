package com.company.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.company.model.jeopardyModel;
import com.company.view.jeopardyView;

public class jeopardyController implements ActionListener {

    private jeopardyModel model;
    private jeopardyView view;

    public jeopardyController(jeopardyModel model, jeopardyView view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
