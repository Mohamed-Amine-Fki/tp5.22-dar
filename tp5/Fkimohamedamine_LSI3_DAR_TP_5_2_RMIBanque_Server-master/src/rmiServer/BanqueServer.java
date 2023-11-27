package rmiServer;

import rmiService.BanqueImpl;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class BanqueServer {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099); //anniaire
            BanqueImpl BI = new BanqueImpl(); // Skeleton
            System.out.println(BI.toString());
            Naming.rebind("rmi://localhost:1099/BanqueObject",BI);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
