package praktikum_3.bagian_1.latihan;

public class Main {
    public static void main(String[] args) {
        // Membuat objek dari class Buku
        Buku buku1 = new Buku();
        buku1.judul = "Belajar Java";
        buku1.penulis = "Ahmad Rizky";
        buku1.tahunTerbit = 2023;

        // Menampilkan informasi buku
        buku1.displayInfo();
    }
}