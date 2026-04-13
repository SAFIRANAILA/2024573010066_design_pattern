package praktikum_2.latihan_1;

public class Main {
    public static void main(String[] args) {
        // Membuat object dari class Buku
        Buku buku1 = new Buku();

        // Mengisi nilai atribut
        buku1.judul = "Belajar Java";
        buku1.pengarang = "Ahmad Rizky";

        // Menampilkan nilai atribut
        System.out.println("Judul     : " + buku1.judul);
        System.out.println("Pengarang : " + buku1.pengarang);
    }
}