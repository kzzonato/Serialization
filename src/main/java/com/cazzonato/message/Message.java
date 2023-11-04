package com.cazzonato.message;

import java.io.Serializable;
import java.util.UUID;

// Serialization

public class Message implements Serializable {
    public String nome;
    public String msg;
    private  String token;
    public Message(String userName, String message){
        this.nome = userName;
        this.msg = message;
    }
    public void tokenServer () {
        this.token = UUID.randomUUID().toString();
    }
    public String toString(){
        return this.nome+"\t"+"msg: "+msg+"\t"+"token: "+token;
    }
}
