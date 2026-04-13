package praktikum_2.latihan_5;

public class Barang {
    private String namaBarang;
    private double harga;

    // Default Constructor
    public Barang() {
        namaBarang = "Unknown";
        harga = 0;
    }

    // Parameterized Constructor
    public Barang(String namaBarang, double harga) {
        this.namaBarang = namaBarang;
        this.harga = harga;
    }

    // Method tampilkan info
    public void tampilkanInfo() {
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Harga       : Rp " + harga);
    }
}