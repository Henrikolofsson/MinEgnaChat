package Server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import Client.Client;

public class Server {
    private static final int PORT = 55000;
    private ServerSocket serverSocket;
    private Socket socket;
    private ArrayList<Client> loggedInClients = new ArrayList<Client>();
    private ArrayList<ClientHandler> clients;
    private ObjectOutputStream objectOutputStream;
    private ObjectInputStream objectInputStream;

    public Server(){
        clients = new ArrayList<ClientHandler>();
        try {
            serverSocket = new ServerSocket(PORT);
        } catch(IOException e){
            e.printStackTrace();
        }
        if(!serverSocket.isClosed()){
            listenForClients();
        }
    }


    private void listenForClients(){
        try {
            socket = serverSocket.accept();
            String ipAddress = socket.getInetAddress().getHostAddress();
            ClientHandler client = new ClientHandler(this, socket, ipAddress);
            client.start();
            clients.add(client);
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
