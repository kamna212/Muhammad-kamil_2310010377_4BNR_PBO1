
package UAS;

import java.util.ArrayList;
import java.util.List;

 class Rekomendasi {
    private List<FilmBuku> daftarFilmBuku;//a

    public Rekomendasi() {
        daftarFilmBuku = new ArrayList<>();
    }
    //menambahkan film/buku
    public void tambahFilmBuku(FilmBuku fb) {
        daftarFilmBuku.add(fb);
    }

    public void tampilkanRekomendasiBerdasarkanGenre(String genre) {
        System.out.println("Rekomendasi berdasarkan genre " + genre + ":");
        for (FilmBuku fb : daftarFilmBuku) {
            if (fb.getGenre().equalsIgnoreCase(genre)) {
                System.out.println(fb);
            }
        }
    }

    public void tampilkanRekomendasiBerdasarkanRating(double minRating) {
        System.out.println("Rekomendasi dengan rating lebih besar dari " + minRating + ":");
        for (FilmBuku fb : daftarFilmBuku) {
            if (fb.getRating() >= minRating) {
                System.out.println(fb);
            }
        }
    }

    public void tambahKeFavorit(String nama) {
        for (FilmBuku fb : daftarFilmBuku) {
            if (fb.getNama().equalsIgnoreCase(nama)) {
                fb.setFavorit(true);
                System.out.println(nama + " telah ditambahkan ke favorit.");
            }
        }
    }
    //getter san film dan buku
    public List<FilmBuku> getDaftarFilmBuku() {
        return daftarFilmBuku;//
    }
}   