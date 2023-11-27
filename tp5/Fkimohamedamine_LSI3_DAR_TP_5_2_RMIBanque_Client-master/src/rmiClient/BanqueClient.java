package rmiClient;

import metier.Compte;
import rmiService.IBanque;

import java.rmi.Naming;

public class BanqueClient {
    public static void main(String[] args){
        try{
            IBanque stub = (IBanque) Naming.lookup("rmi://localhost:1099/BanqueObject");
            stub.creerCompte(new Compte(1,500.0));
            stub.creerCompte(new Compte(2,750.0));
            stub.creerCompte(new Compte(3,123.0));

            System.out.println(stub.getInfoCompte(1));
            System.out.println(stub.getInfoCompte(5));


        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
