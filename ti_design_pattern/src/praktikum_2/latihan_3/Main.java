package praktikum_2.latihan_3;

public class Main {
    public static void main(String[] args) {
        AkunBank akun = new AkunBank();

        // Mengakses method public - BERHASIL
        akun.tampilkanSaldo();

        // Mengakses atribut private langsung - ERROR
        // System.out.println(akun.saldo); // Error: saldo has private access in AkunBank
    }
}