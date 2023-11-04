package com.cazzonato.server;

import com.cazzonato.message.Message;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ThreadServe extends Thread {
    Socket socket;
    public ThreadServe(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        System.out.println("Client connected with thread: ("+this.threadId()+") : "+socket.getInetAddress());
        try {
            // Client's Data flow to communicate and send
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            Message object = (Message) inputStream.readObject();
            System.out.println(object.toString());

            // Creating a token for the client
            object.tokenServer();
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            outputStream.writeObject(object);

            Thread.sleep(10000);
            // Closing client's connection
            socket.close();
            System.out.println("Finished client: "+socket.getInetAddress()+" thread: ("+this.threadId()+")");
        } catch (Exception e) {
            System.out.println("Error on the part of the server (thread)");
        }
    }
}
