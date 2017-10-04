/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkia_c2;

import java.util.Objects;

/**
 *
 * @author
 */
public class Coche implements Cloneable{
    private String modelo;
    private int cv;
    //private String color;
    private static int contador = 0;
    private Company company;
    
    public Coche(){
        contador++;
    }
    /*
    public Coche(String modelo, int cv, String color){
        this(modelo, cv);
        this.color = color;
    }
    */

    public Coche(String modelo, int cv, Company company) {
        this(); //Va a llamar al constructor y me va a hacer contador++
        this.modelo = modelo;
        this.cv = cv;
        this.company = company;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Coche.contador = contador;
    }

    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    @Override
    public String toString() {
        return "Coche{" + "modelo=" + modelo + ", cv=" + cv +  " " + company;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        contador++;
        return super.clone(); 
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + Objects.hashCode(this.modelo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Coche other = (Coche) obj;
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        return true;
        //return modelo.equalsIgnoreCase(other.modelo);
    }

    @Override
    protected void finalize() throws Throwable {
        contador--;
        super.finalize(); 
    }


    
    
    
 
}
