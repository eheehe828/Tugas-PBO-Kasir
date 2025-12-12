interface Kinerja {
    void deskripsiKerja();
}

class Pegawai {
    private String nama;
    private int usia;
    private String jabatan;

    public Pegawai(String nama, int usia, String jabatan) {
        this.nama = nama;
        this.usia = usia;
        this.jabatan = jabatan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
}

class PegawaiTetap extends Pegawai implements Kinerja {

    public PegawaiTetap(String nama, int usia, String jabatan) {
        super(nama, usia, jabatan);
    }

    @Override
    public void deskripsiKerja() {
        System.out.println("Pegawai tetap bekerja full-time dan memiliki tunjangan.");
    }
}

class PegawaiKontrak extends Pegawai implements Kinerja {

    public PegawaiKontrak(String nama, int usia, String jabatan) {
        super(nama, usia, jabatan);
    }

    @Override
    public void deskripsiKerja() {
        System.out.println("Pegawai kontrak bekerja sesuai durasi perjanjian.");
    }
}

public class Main {
    public static void main(String[] args) {
        PegawaiTetap pt = new PegawaiTetap("Jodi", 30, "Admin IT");
        PegawaiKontrak pk = new PegawaiKontrak("Rama", 23, "Programmer");

        System.out.println("=== Data Pegawai Tetap ===");
        System.out.println("Nama: " + pt.getNama());
        System.out.println("Usia: " + pt.getUsia());
        System.out.println("Jabatan: " + pt.getJabatan());
        pt.deskripsiKerja();

        System.out.println("\n=== Data Pegawai Kontrak ===");
        System.out.println("Nama: " + pk.getNama());
        System.out.println("Usia: " + pk.getUsia());
        System.out.println("Jabatan: " + pk.getJabatan());
        pk.deskripsiKerja();
    }
}
