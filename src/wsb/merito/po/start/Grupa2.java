package wsb.merito.po.start;

import java.util.Objects;

public class Grupa2 {

    private int liczba = 0;
    private String napis = null;


    public Grupa2(int liczba, String napis) {
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
        return "Grupa2{" +
                "liczba=" + liczba +
                ", napis='" + napis + '\'' +
                '}';
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Grupa2 grupa2)) return false;

        return getLiczba() == grupa2.getLiczba() && Objects.equals(getNapis(), grupa2.getNapis());
    }

    @Override
    public int hashCode() {
        int result = getLiczba();
        result = 31 * result + Objects.hashCode(getNapis());
        return result;
    }
}
