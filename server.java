package sample;

import java.io.*;
import java.net.*;
import java.util.*;

public class server {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1999);

        try {
            Socket socket = serverSocket.accept();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(socket.getOutputStream()));
            ObjectInputStream objectInputStream = new ObjectInputStream(new BufferedInputStream(socket.getInputStream()));
            List<Advertising> request = (List)objectInputStream.readObject();
            objectOutputStream.writeObject(Advertising.getOverallSale(request));
            objectOutputStream.flush();
        } catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
