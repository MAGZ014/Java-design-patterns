package org.magz014;
/**
 *  Rules:
 *  1) Debemos tener un constructor vacio / We need to have an empty constructor
 *  2) Debemos tener un atributo privado estatico / We need to have a static private attribute
 *  3) Debemos tener un metodo estatico de devuelva la instancia / We need to have a public static method wich returns the instance
 */

public class DataBaseConnector {

    // 2)
    private  static DataBaseConnector dataBaseConnector;

    // 1)
    private DataBaseConnector(){
        System.out.println("Crating object connection");
    }

    // 3)
    public static synchronized DataBaseConnector getInstance(){ // synchronized para la sincronizacion para hilos
        if(dataBaseConnector == null){
            dataBaseConnector = new DataBaseConnector();
        }
        return dataBaseConnector;
    }

    public void connectDataBase(){
        System.out.println("connectDataBase" + dataBaseConnector);
    }

    public void disconnectDataBase(){
        System.out.println("disconnectDataBase" + dataBaseConnector);
    }
}
