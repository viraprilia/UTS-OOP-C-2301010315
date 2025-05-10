package uts.oop.c.pkg2301010315;

import java.util.Scanner;

/**
 *
 * @author Wihelmina Aprilia
 * TGL: 10 Mei 2025
 */
public class AplikasiBuah {
    static Buah[] dataBuah = new Buah[100];
    static int count = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\n=== Menu Aplikasi Manajemen Buah ===");
            System.out.println("1. Tambah Buah");
            System.out.println("2. Tampilkan Data Buah");
            System.out.println("3. Ubah Data Buah");
            System.out.println("4. Hapus Data Buah");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilih = input.nextInt();
            input.nextLine(); // membersihkan buffer

            switch (pilih) {
                case 1:
                    tambahBuah(input);
                    break;
                case 2:
                    tampilBuah();
                    break;
                case 3:
                    ubahBuah(input);
                    break;
                case 4:
                    hapusBuah(input);
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan aplikasi.");
                    break;
                default:
                    System.out.println("Menu tidak tersedia.");
            }
        } while (pilih != 5);
    }

    // Method untuk menambah buah - Overloading
    static void tambahBuah(Scanner input) {
        System.out.print("Masukkan Nama Buah: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Jenis Buah: ");
        String jenis = input.nextLine();
        System.out.print("Masukkan Harga Buah: ");
        double harga = input.nextDouble();

        dataBuah[count] = new Buah(nama, jenis, harga);
        count++;
        System.out.println("Data buah berhasil ditambahkan.");
    }

    // Method untuk menampilkan data buah
    static void tampilBuah() {
        if (count == 0) {
            System.out.println("Belum ada data buah.");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println((i + 1) + ". " + dataBuah[i]);
            }
        }
    }

    // Method untuk mengubah data buah
    static void ubahBuah(Scanner input) {
        tampilBuah();
        System.out.print("Pilih nomor data buah yang akan diubah: ");
        int idx = input.nextInt();
        input.nextLine(); // buffer

        if (idx >= 1 && idx <= count) {
            System.out.print("Masukkan Nama Buah baru: ");
            String nama = input.nextLine();
            System.out.print("Masukkan Jenis Buah baru: ");
            String jenis = input.nextLine();
            System.out.print("Masukkan Harga Buah baru: ");
            double harga = input.nextDouble();

            dataBuah[idx - 1].setNama(nama);
            dataBuah[idx - 1].setJenis(jenis);
            dataBuah[idx - 1].setHarga(harga);

            System.out.println("Data buah berhasil diubah.");
        } else {
            System.out.println("Nomor data tidak valid.");
        }
    }

    // Method untuk menghapus data buah
    static void hapusBuah(Scanner input) {
        tampilBuah();
        System.out.print("Pilih nomor data buah yang akan dihapus: ");
        int idx = input.nextInt();

        if (idx >= 1 && idx <= count) {
            for (int i = idx - 1; i < count - 1; i++) {
                dataBuah[i] = dataBuah[i + 1];
            }
            dataBuah[count - 1] = null;
            count--;
            System.out.println("Data buah berhasil dihapus.");
        } else {
            System.out.println("Nomor data tidak valid.");
        }
    }
    
}
