package rmiService;

import metier.Compte;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.*;

public class BanqueImpl extends UnicastRemoteObject implements IBanque{

    List<Compte> comptes = new ArrayList<>();

    @Override
    public String creerCompte(Compte c) throws RemoteException{
        comptes.add(c);
        return("Le compte avec le code "+c.getCode()+" est créé le "+c.getDateCreation());
    }

    @Override
    public String getInfoCompte(int code) throws RemoteException{
        for(Compte c : comptes){
            if (c.getCode() == code){
                return "Le compte avec le code "+c.getCode()+"\ncontient "+c.getSolde()+"\ncree le "+c.getDateCreation();
            }
        }
        return "Aucun compte avec ce code";
    }
    public BanqueImpl() throws RemoteException{}
}
