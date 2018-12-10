package main;

import models.ModelBloc;
import views.ViewBloc;
import controllers.ControllerBloc;

/**
 *
 * @author alons
 */
public class Main {
    private static ModelBloc modelbloc;
    private static ViewBloc viewbloc;
    
    
    public static void main(String[] args) {
        modelbloc = new ModelBloc();
        viewbloc = new ViewBloc();
        ControllerBloc controllerbloc = new ControllerBloc(modelbloc, viewbloc);
    }
    
}
