
package UAS;

public class Film extends FilmBuku {//
    private String sutradara;

    public Film(String nama, String genre, double rating, String sutradara) {
        super(nama, genre, rating);//
        this.sutradara = sutradara;//
    }

    @Override
    public String toString() {
        return super.toString() + ", Sutradara: " + sutradara;//polifesme 
    }
}
