package praktikum_2.latihan_3;

public class AkunBank {
    // Atribut private - tidak bisa diakses langsung dari luar class
    private double saldo = 1000000;

    // Method public - bisa diakses dari mana saja
    public void tampilkanSaldo() {
        System.out.println("Saldo : Rp " + saldo);
    }
}