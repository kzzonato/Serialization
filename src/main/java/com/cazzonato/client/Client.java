package com.cazzonato.client;

import com.cazzonato.message.Message;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("Localhost", 8080);
            System.out.println("Initialized client...");

            // Obj message
            Message message = new Message("Kzzonato", "Hello Server");

            // Data flow for submission
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            System.out.println("Before server: "+message.toString());
            outputStream.writeObject(message);

            // Input
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            Message object = (Message) inputStream.readObject();
            System.out.println("After server: "+object.toString());  // Token...

            // Closing connections
            outputStream.close();
            socket.close();
        } catch (Exception e) {
            System.out.println("Error on the part of the server");
        }

    }
}
