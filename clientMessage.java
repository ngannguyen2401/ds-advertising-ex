package sample;

import java.io.*;
import java.net.*;

public class clientMessage {

    public static void main(String[] args) {
        try {
            String serverName = "localhost";
            int serverPort = 1999;
            Socket socket = new Socket(serverName, serverPort);
            BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            String line = "";

            while (!line.equals("stop")) {
                try {
                    line = console.readLine();
                    dataOutputStream.writeUTF(line);
                    dataOutputStream.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            console.close();
            dataOutputStream.close();
            socket.close();
        } catch (UnknownHostException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    }

