package org.magz014;

public class Main {
    public static void main(String[] args) {
        DataBaseConnector dataBaseConnector = DataBaseConnector.getInstance();
        System.out.println("dataBaseConnector 1: "+ dataBaseConnector);

        DataBaseConnector dataBaseConnector2 = DataBaseConnector.getInstance();
        System.out.println("dataBaseConnector 2: "+ dataBaseConnector2);

        System.out.println("\n");
        dataBaseConnector2.connectDataBase();
        dataBaseConnector.connectDataBase();
    }
}