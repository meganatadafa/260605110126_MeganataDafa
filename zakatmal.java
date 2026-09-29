import java.util.Scanner;

public class zakatmal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input data
        System.out.print("Masukkan total penghasilan : ");
        long penghasilan = input.nextLong();

        System.out.print("Masukkan total pengeluaran : ");
        long pengeluaran = input.nextLong();

        // Nilai nisab
        long nisab = 212500000;

        // Menghitung surplus
        long surplus = penghasilan - pengeluaran;

        // Menentukan kategori dan zakat
        long zakat;
        String kategori;

        if (surplus >= nisab) {
            kategori = "MUZAKKI";
            zakat = (long) (surplus * 2.5 / 100);
        } else {
            kategori = "MUSTAHIK (MISKIN)";
            zakat = 0;
        }

        // Menampilkan hasil
        System.out.println();
        System.out.println("Total Penghasilan : " + penghasilan);
        System.out.println("Total Pengeluaran : " + pengeluaran);
        System.out.println("Surplus           : " + surplus);
        System.out.println("Nisab             : " + nisab);
        System.out.println("Kategori          : " + kategori);
        System.out.println("Zakat             : " + zakat);

        input.close();
    }
}