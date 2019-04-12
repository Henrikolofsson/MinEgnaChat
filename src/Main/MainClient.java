package Main;

import Controllers.ClientController;
import GUI.Window;

public class MainClient {

    public static void main(String[] args){
        Window window = new Window(700,700);
        ClientController clientController = new ClientController(window);
    }
}
