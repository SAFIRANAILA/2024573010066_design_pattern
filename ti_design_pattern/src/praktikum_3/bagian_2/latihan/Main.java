package praktikum_3.bagian_2.latihan;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Motor
        Motor motor1 = new Motor();
        motor1.setMerk("Honda");
        motor1.setTahun(2022);

        // Menampilkan informasi motor
        System.out.println("Merk  : " + motor1.getMerk());
        System.out.println("Tahun : " + motor1.getTahun());
    }
}
