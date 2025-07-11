
package UAS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        Rekomendasi rekomendasi = new Rekomendasi();


        rekomendasi.tambahFilmBuku(new Film("Dune", "Sci-Fi", 8.3, "Denis Villeneuve"));
        rekomendasi.tambahFilmBuku(new Buku("The Great Gatsby", "Drama", 7.8, "F. Scott Fitzgerald"));
        rekomendasi.tambahFilmBuku(new Film("Harry Potter", "Fantasy", 9.1, "Chris Columbus"));
        rekomendasi.tambahFilmBuku(new Buku("The Hobbit", "Fantasy", 8.7, "J.R.R. Tolkien"));

        boolean selesai = false;
        while (!selesai) { 
            System.out.println("\nMenu:");
            System.out.println("1. Rekomendasi berdasarkan Genre");
            System.out.println("2. Rekomendasi berdasarkan Rating");
            System.out.println("3. Tambah ke Favorit");
            System.out.println("4. Lihat Daftar Favorit");
            System.out.println("5. Keluar");

            int pilihan = -1;
            while (pilihan < 1 || pilihan > 5) {//i
                try {
                    System.out.print("Pilih menu (1-5): ");
                    pilihan = Integer.parseInt(scanner.nextLine());
                    if (pilihan < 1 || pilihan > 5) {
                        System.out.println("Masukkan angka yang valid (1-5)!");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Masukkan angka yang valid!");
                }
            }

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan genre: ");
                    String genre = scanner.nextLine();
                    rekomendasi.tampilkanRekomendasiBerdasarkanGenre(genre);
                    break;
                case 2:
                    double rating = -1; //s 
                    while (rating < 1 || rating > 10) {
                        try {//
                            System.out.print("Masukkan rating minimum (1-10): ");
                            rating = Double.parseDouble(scanner.nextLine());
                            if (rating < 1 || rating > 10) {
                                System.out.println("Masukkan rating yang valid antara 1 dan 10!");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Masukkan rating yang valid (1-10)!");
                        }
                    }
                    rekomendasi.tampilkanRekomendasiBerdasarkanRating(rating);
                    break;
                case 3:
                    System.out.print("Masukkan nama film atau buku yang ingin ditambahkan ke favorit: ");
                    String namaFavorit = scanner.nextLine();
                    rekomendasi.tambahKeFavorit(namaFavorit);
                    break;
                case 4:
                    Favorit.tampilkanFavorit(rekomendasi.getDaftarFilmBuku());
                    break;
                case 5:
                    selesai = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
        scanner.close(); 
    }
}
