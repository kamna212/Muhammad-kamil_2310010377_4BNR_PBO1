package UAS;

public class Buku extends FilmBuku {
    private String penulis;

    public Buku(String nama, String genre, double rating, String penulis) {
        super(nama, genre, rating);
        this.penulis = penulis;
    }

    @Override
    public String toString() {
        return super.toString() + ", Penulis: " + penulis;
    }
}

