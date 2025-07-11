
package UAS;

import java.util.List;

public class Favorit {
    // Menampilkan daftar favorit
    public static void tampilkanFavorit(List<FilmBuku> daftarFilmBuku) {
        System.out.println("Daftar Favorit:");
        for (FilmBuku fb : daftarFilmBuku) {
            if (fb.isFavorit()) {//san cek apakah favorite
                System.out.println(fb);//tampil
            }
        }
    }
}