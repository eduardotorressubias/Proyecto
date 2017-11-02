package com.company;
import com.company.model.jeopardyModel;
import com.company.view.jeopardyView;
import com.company.controller.jeopardyController;


public class jeopardyMain {

    public static void main(String[] args) {
	jeopardyModel model = new jeopardyModel();
	jeopardyView view  = new jeopardyView();
	jeopardyController controller = new jeopardyController(model,view);
    }
}
