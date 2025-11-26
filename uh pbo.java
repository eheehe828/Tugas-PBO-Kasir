import java.util.Scanner;

public class Perpustakaan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] buku = {
            "Animal Farm",
            "1984",
            "The Alchemist",
            "Bumi Manusia",
            "Crime And Punishment",
        };

        int pilihan;

        do {
            System.out.println("=== MENU PERPUSTAKAAN ===");
            System.out.println("1. Lihat Daftar Buku");
            System.out.println("2. Pinjam Buku");
            System.out.println("3. Kembalikan Buku");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("=== DAFTAR BUKU ===");
                    for (int i = 0; i < buku.length; i++) {
                        System.out.println((i + 1) + ". " + buku[i]);
                    }
                    break;

                case 2:
                    System.out.println("=== PINJAM BUKU ===");
                    for (int i = 0; i < buku.length; i++) {
                        System.out.println((i + 1) + ". " + buku[i]);
                    }
                    System.out.print("Pilih nomor buku: ");
                    int nomor = input.nextInt();
                    if (nomor >= 1 && nomor <= buku.length) {
                        System.out.println("Buku berhasil dipinjam!");
                    } else {
                        System.out.println("Nomor tidak valid!");
                    }
                    break;

                case 3:
                    System.out.println("=== KEMBALIKAN BUKU ===");
                    System.out.println("Buku berhasil dikembalikan!");
                    break;

                case 4:
                    System.out.println("Keluar dari program...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

            System.out.println();

        } while (pilihan != 4);

        input.close();
    }
}
