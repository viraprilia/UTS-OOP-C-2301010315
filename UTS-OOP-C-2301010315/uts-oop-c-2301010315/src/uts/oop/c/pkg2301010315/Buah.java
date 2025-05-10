package uts.oop.c.pkg2301010315;

/**
 *
 * @author Wihelmina Aprilia
 * TGL: 10 Mei 2025
 */
public class Buah {
     private String nama;
    private String jenis;
    private double harga;

    // Constructor
    public Buah(String nama, String jenis, double harga) {
        this.nama = nama;
        this.jenis = jenis;
        this.harga = harga;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public String getJenis() {
        return jenis;
    }

    public double getHarga() {
        return harga;
    }

    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Method toString - Overriding
    @Override
    public String toString() {
        return "Nama Buah: " + nama + ", Jenis: " + jenis + ", Harga: " + harga;
    }
    
}
