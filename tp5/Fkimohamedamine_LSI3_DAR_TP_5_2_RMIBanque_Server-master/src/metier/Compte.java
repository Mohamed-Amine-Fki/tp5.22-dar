package metier;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Compte implements Serializable {
    private int code;
    private double solde;
    private Date dateCreation;

    public Compte(int code, double solde){
        this.code = code;
        this.solde = solde;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        this.dateCreation = new Date();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}
