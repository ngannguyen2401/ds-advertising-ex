package sample;

import java.io.*;
import java.net.Socket;


public class client {

        public static void main(String[] args) throws IOException {
            Socket socket = new Socket("localhost", 1999);

            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());

                try {
                    System.out.println("Connect to" + socket.getRemoteSocketAddress());
                    ObjectOutputStream  objectOutputStream = new ObjectOutputStream((new BufferedOutputStream(socket.getOutputStream())));
                    objectOutputStream.writeObject(reader.readInfo("advertising.csv"));
                    objectOutputStream.flush();
                    ObjectInputStream objectInputStream = new ObjectInputStream(new BufferedInputStream(socket.getInputStream()));
                    float reply = (Float)objectInputStream.readObject();
                    System.out.println(reply);
                } catch (IOException e){
                    e.printStackTrace();
                } catch (ClassNotFoundException e){
                    e.printStackTrace();

            }

        }
    }
