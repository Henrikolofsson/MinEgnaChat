package Server;

import Client.Client;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ClientHandler extends Thread {
    private Server server;
    private Socket socket;
    private String ipAddress;
    private ObjectOutputStream oos;
    private ObjectInputStream ois;
    private Client client;
    private boolean isRunning;
    private String username;

    public ClientHandler(Server server, Socket socket, String ipAddress){
        this.server = server;
        this.socket = socket;
        this.ipAddress = ipAddress;
        isRunning = true;
    }

    public void run(){
        try {
            oos = new ObjectOutputStream(socket.getOutputStream());
            ois = new ObjectInputStream(socket.getInputStream());
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
