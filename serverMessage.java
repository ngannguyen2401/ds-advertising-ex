package sample;

import java.io.*;
import java.net.*;

public class server {

    public static void main(String[] args) throws IOException {
        try {
            ServerSocket server = new ServerSocket(1999);

            Socket socket = server.accept();

            DataInputStream inputStream = new DataInputStream(socket.getInputStream());

            boolean done = false;

            while (!done) {
                try {
                    String line = inputStream.readUTF();
                    done = line.equals("stop");
                } catch (IOException ioe) {
                    done = true;
                }
            }
            inputStream.close();
            socket.close();
            server.close();
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
