
package UAS;

 public class FilmBuku {//clas 
        private String nama;//
        private String genre;
        private double rating;
        private boolean isFavorit;

        // Konstruktor
        public FilmBuku(String nama, String genre, double rating) {
            this.nama = nama;
            this.genre = genre;
            this.rating = rating;
            this.isFavorit = false; //
        }

        // Accessor
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

        // Mutator
        public void setFavorit(boolean favorit) {
            isFavorit = favorit;
        }

        // polymorphism
        @Override
        public String toString() {
            return "Nama: " + nama + ", Genre: " + genre + ", Rating: " + rating + (isFavorit ? " (Favorit)" : "");
        }
    }
