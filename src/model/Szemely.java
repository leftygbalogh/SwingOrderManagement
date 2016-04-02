/*
 * Code is prose.
 * 
 * Lefty G Balogh
 */

package model;

import java.io.Serializable;

/**
 *
 * @author Lefty G Balogh
 */
class Szemely implements Serializable{
    
    private int id;
    private String nev;
    private String email;

    public Szemely() {
    }

    public Szemely(String nev, String email) {
        this.nev = nev;
        this.email = email;
    }
    
    

    public Szemely(int id, String nev, String email) {
        this.id = id;
        this.nev = nev;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return nev + "(email:"+ email +")";
    }
    
    
}
