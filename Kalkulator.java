/**
 * Kelas Kalkulator menyediakan metode-metode dasar untuk operasi
 * aritmatika seperti penjumlahan, pengurangan, perkalian, dan pembagian.
 */
public class Kalkulator {

    /**
     * Menjumlahkan dua angka.
     *
     * @param a angka pertama
     * @param b angka kedua
     * @return hasil penjumlahan dari a dan b
     */
    public double tambah(double a, double b) {
        return a + b;
    }

    /**
     * Mengurangkan dua angka.
     *
     * @param a angka pertama
     * @param b angka kedua
     * @return hasil pengurangan dari a dan b
     */
    public double kurang(double a, double b) {
        return a - b;
    }

    /**
     * Mengalikan dua angka.
     *
     * @param a angka pertama
     * @param b angka kedua
     * @return hasil perkalian dari a dan b
     */
    public double kali(double a, double b) {
        return a * b;
    }

    /**
     * Membagi dua angka.
     *
     * @param a angka pertama
     * @param b angka kedua, tidak boleh nol
     * @return hasil pembagian dari a dan b
     * @throws ArithmeticException jika b adalah nol
     */
    public double bagi(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Tidak dapat membagi dengan nol");
        }
        return a / b;
    }

    /**
     * Metode utama untuk menjalankan kalkulator.
     * Contoh penggunaan: menjalankan operasi penjumlahan, pengurangan, perkalian, dan pembagian.
     *
     * @param args argumen baris perintah (tidak digunakan)
     */
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();

        double a = 10;
        double b = 5;

        System.out.println("Penjumlahan: " + kalkulator.tambah(a, b));
        System.out.println("Pengurangan: " + kalkulator.kurang(a, b));
        System.out.println("Perkalian: " + kalkulator.kali(a, b));
        System.out.println("Pembagian: " + kalkulator.bagi(a, b));
    }
}
