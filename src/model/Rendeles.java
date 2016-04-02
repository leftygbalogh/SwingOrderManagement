/*
 * Code is prose.
 * 
 * Lefty G Balogh
 */

package model;

/**
 *
 * @author Lefty G Balogh
 */
class Rendeles {
    int id;
    int megrendeloID;
    int darabszam;
    double osszeg;

    public Rendeles() {
    }

    public Rendeles(int id, int megrendeloID, int darabszam, double osszeg) {
        this.id = id;
        this.megrendeloID = megrendeloID;
        this.darabszam = darabszam;
        this.osszeg = osszeg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMegrendeloID() {
        return megrendeloID;
    }

    public void setMegrendeloID(int megrendeloID) {
        this.megrendeloID = megrendeloID;
    }

    public int getDarabszam() {
        return darabszam;
    }

    public void setDarabszam(int darabszam) {
        this.darabszam = darabszam;
    }

    public double getOsszeg() {
        return osszeg;
    }

    public void setOsszeg(double osszeg) {
        this.osszeg = osszeg;
    }

    @Override
    public String toString() {
        return "Rendeles:" + "id=" + id + ", megrendeloID=" + megrendeloID + ", darabszam=" + darabszam + ", osszeg=" + osszeg;
    }
    
    
}
