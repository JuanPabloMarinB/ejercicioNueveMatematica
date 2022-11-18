package Entidades;

public class Matematica {

    private double numUno;

    private double numDos;

    private double numMayor;

    private double numMenor;

    public Matematica() {
    }

    public Matematica(double numUno, double numDos, double numMayor, double numMenor) {
        this.numUno = numUno;
        this.numDos = numDos;
        this.numMayor = numMayor;
        this.numMenor = numMenor;
    }

    public double getNumUno() {
        return numUno;
    }

    public void setNumUno(double numUno) {
        this.numUno = numUno;
    }

    public double getNumDos() {
        return numDos;
    }

    public void setNumDos(double numDos) {
        this.numDos = numDos;
    }

    public double getNumMayor() {
        return numMayor;
    }

    public void setNumMayor(double numMayor) {
        this.numMayor = numMayor;
    }

    public double getNumMenor() {
        return numMenor;
    }

    public void setNumMenor(double numMenor) {
        this.numMenor = numMenor;
    }
}
