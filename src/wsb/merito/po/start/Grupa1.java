package wsb.merito.po.start;

import java.util.Objects;

public class Grupa1 {

    private int liczba = 0;
    private String napis = null;

    public Grupa1(int liczba, String napis) {
        this.liczba = liczba;
        this.napis = napis;
    }

    public int getLiczba() {
        return liczba;
    }

    public void setLiczba(int liczba) {
        this.liczba = liczba;
    }

    public String getNapis() {
        return napis;
    }

    public void setNapis(String napis) {
        this.napis = napis;
    }

    @Override
    public String toString() {
        return "Grupa1{" +
                "liczba=" + liczba +
                ", napis='" + napis + '\'' +
                '}';
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Grupa1 grupa1)) return false;

        return getLiczba() == grupa1.getLiczba() && Objects.equals(getNapis(), grupa1.getNapis());
    }

    @Override
    public int hashCode() {
        int result = getLiczba();
        result = 31 * result + Objects.hashCode(getNapis());
        return result;
    }
}
