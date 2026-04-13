package praktikum_2.latihan_5;

public class Main {
    public static void main(String[] args) {
        // Menggunakan default constructor
        Barang barang1 = new Barang();
        System.out.println("=== Barang 1 (Default Constructor) ===");
        barang1.tampilkanInfo();

        System.out.println();

        // Menggunakan parameterized constructor
        Barang barang2 = new Barang("Laptop", 8500000);
        System.out.println("=== Barang 2 (Parameterized Constructor) ===");
        barang2.tampilkanInfo();
    }
}
