import java.rmi.*;
import java.rmi.server.*;

public class serveurrmi extends UnicastRemoteObject implements ServerInterface {
    public Server() throws RemoteException {
        super();
    }

    // Méthode pour la conversion de chaîne
    public String convertString(String input) throws RemoteException {
        // Logique de conversion de chaîne ici
        return input.toUpperCase(); // Exemple: conversion en majuscules
    }

    public static void main(String[] args) {
        try {
            // Création et liaison du serveur RMI
            serveurrmi obj = new serveurrmi();
            Naming.rebind("//localhost/Server", obj);
            System.out.println("Server bound in registry");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}

