package praktikum_3.bagian_4.overloading.latihan;

public class Main {
    public static void main(String[] args) {
        Matematika mat = new Matematika();
        System.out.println("Hasil 1 : " + mat.tambah(5, 10));
        System.out.println("Hasil 2 : " + mat.tambah(5, 10, 15));
        System.out.println("Hasil 3 : " + mat.tambah(3.5, 2.5));
    }
}
