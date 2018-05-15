package pl.coderslab.model;

public class Employee {
     String imie;
    private String nazwisko;
    private String dane_adresowe;
    private int nr_tel;
    private String note;
    private double rg;


    public Employee(String imie, String nazwisko, String dane_adresowe, int nr_tel, String note, double rg) {
        setImie(imie);
        setNazwisko(nazwisko);
        setDane_adresowe(dane_adresowe);
        setNr_tel(nr_tel);
        setNote(note);
        setRg(rg);
    }


    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getDane_adresowe() {
        return dane_adresowe;
    }

    public void setDane_adresowe(String dane_adresowe) {
        this.dane_adresowe = dane_adresowe;
    }

    public int getNr_tel() {
        return nr_tel;
    }

    public void setNr_tel(int nr_tel) {
        this.nr_tel = nr_tel;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public double getRg() {
        return rg;
    }

    public void setRg(double rg) {
        this.rg = rg;
    }
}
