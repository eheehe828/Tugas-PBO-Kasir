import java.util.Scanner;

public class KasirSederhanaVersiKamu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String namaBarang;
        int harga = 0, jumlah, totalBarang, totalBelanja = 0;
        double diskon = 0, totalBayar;
        char ulang;

        System.out.println("=== Program Kasir Sederhana Versi Pengembangan ===");
        
        do {
            System.out.println("\n=== Menu Barang ===");
            System.out.println("1. Kopi Hitam     - Rp 15.000");
            System.out.println("2. Roti Cokelat   - Rp 10.000");
            System.out.println("3. Mie Instan     - Rp 7.000");
            System.out.println("4. Air Mineral    - Rp 5.000");
            System.out.println("===================");

            System.out.print("Pilih nomor barang: ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    namaBarang = "Kopi Hitam";
                    harga = 15000;
                    break;
                case 2:
                    namaBarang = "Roti Cokelat";
                    harga = 10000;
                    break;
                case 3:
                    namaBarang = "Mie Instan";
                    harga = 7000;
                    break;
                case 4:
                    namaBarang = "Air Mineral";
                    harga = 5000;
                    break;
                default:
                    namaBarang = "Tidak Diketahui";
                    harga = 0;
                    System.out.println("Pilihan tidak valid!");
            }

            if (harga != 0) {
                System.out.print("Masukkan jumlah: ");
                jumlah = input.nextInt();

                totalBarang = harga * jumlah;
                totalBelanja += totalBarang;

                System.out.println(namaBarang + " x" + jumlah + " = Rp " + totalBarang);
            }

            System.out.print("\nApakah ingin menambah barang lain? (y/n): ");
            ulang = input.next().charAt(0);

        } while (ulang == 'y' || ulang == 'Y');

        // Hitung diskon
        if (totalBelanja >= 100000) {
            diskon = 0.10; // 10%
        } else if (totalBelanja >= 50000) {
            diskon = 0.05; // 5%
        }

        totalBayar = totalBelanja - (totalBelanja * diskon);

        System.out.println("\n=== Struk Pembayaran ===");
        System.out.println("Total Belanja : Rp " + totalBelanja);
        System.out.println("Diskon        : " + (diskon * 100) + "%");
        System.out.println("Total Bayar   : Rp " + totalBayar);

        System.out.println("===============================");
        System.out.print("Masukkan uang pembayaran: ");
        double bayar = input.nextDouble();

        double kembalian = bayar - totalBayar;
        System.out.println("Kembalian     : Rp " + kembalian);
        System.out.println("=== Terima Kasih Telah Berbelanja! ===");

        input.close();
    }
}
