# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini merupakan aplikasi rekomendasi sederhana berbasis Java yang memberikan rekomendasi film dan buku berdasarkan genre atau rating. Pengguna juga dapat menambahkan item favorit dan menampilkan daftar favoritnya.



## Deskripsi

Aplikasi ini memungkinkan pengguna untuk mendapatkan rekomendasi film atau buku berdasarkan preferensi genre atau rating tertentu. Pengguna juga dapat menambahkan rekomendasi pilihan mereka ke dalam daftar favorit untuk memudahkan pencarian ulang.
.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `FilmBuku`, `Film`, `Buku`, `Rekomendasi`, `Favorit`, dan `Main` adalah contoh dari class.

```bash
public class Main {
}
public class FilmBuku {
    ...
}

public class Film extends FilmBuku {
    ...
}

public class Buku extends FilmBuku {
    ...
}
public class Rekomendasi {
}
public class Favorit {
}
```


2. **Object** adalah instance dari class. Pada kode ini, `new Film("Dune", "Sci-Fi", 8.3, "Denis Villeneuve")` dan `new Buku("The Great Gatsby", "Drama", 7.8, "F. Scott Fitzgerald")` adalah contoh pembuatan object.


```bash
Film film1 = new Film("Dune", "Sci-Fi", 8.3, "Denis Villeneuve");
Buku buku1 = new Buku("The Great Gatsby", "Drama", 7.8, "F. Scott Fitzgerald");
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama`, `genre`, `rating`, dan `isFavorit` di class `FilmBuku` adalah contoh atribut.

```bash
private String nama;
private String genre;
private double rating;
private boolean isFavorit;;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `FilmBuku`, `Film`, dan `Buku`.

```bash
public FilmBuku(String nama, String genre, double rating) {
            this.nama = nama;
            this.genre = genre;
            this.rating = rating;
            this.isFavorit = false; 
        }

```
5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setFavorit(boolean favorit)` adalah contoh method mutator.

```bash
public void setFavorit(boolean favorit) {
    isFavorit = favorit;
}
```

 
6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama()`, `getGenre()`, dan `getRating()` adalah contoh method accessor.

```bash
public String getNama() {
return nama;
}

public String getGenre() {
return genre;
}

public double getRating() {
return rating;
}

public boolean isFavorit() {
return isFavorit;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama`, `genre`, dan `rating` dienkapsulasi.

```bash
private String nama;
private String genre;
public String getGenre () {
        return genre;
}
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `Film` dan `Buku` mewarisi `FilmBuku` dengan sintaks `extends`.

```bash
public class Film extends FilmBuku {
}
public class Film extends FilmBuku {
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `toString()` di `Film` dan `Buku` merupakan override dari method `toString()` di `FilmBuku`.

```bash
@Override
public String toString() {
    return super.toString() + ", Sutradara: " sutradara;
}
@Override
    public String toString() {
        return super.toString() + ", Penulis: " + penulis;
    }
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if` dalam method `tampilkanRekomendasiBerdasarkanRating` dan seleksi `switch` dalam class `Main`.

```bash
if (fb.getRating() >= minRating) {
    System.out.println(fb);
}

switch (pilihan) {
    case 1:

}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` di class `Rekomendasi` dan loop `while` di class `Main`.

```bash
for (FilmBuku fb : daftarFilmBuku) {
    // ...
}

while (!selesai) {
    // ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class Scanner untuk menerima input dan method System.out.println untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan genre: ");
String genre = scanner.nextLine();
System.out.println("Rekomendasi: " + hasil); 
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, List<FilmBuku> daftarFilmBuku = new ArrayList<>() adalah contoh penggunaan array.

```bash
private List<FilmBuku> daftarFilmBuku = new ArrayList<>();
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan try catch untuk menangani input tidak valid.

```bash
try {

    rating = Double.parseDouble(scanner.nextLine());
} catch (NumberFormatException e) {
    System.out.println("Masukan rating yang valid!");
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Kamil
NPM:2310010377

