package responsi2;

import java.text.*; // memangil library date untuk menampilkan tanggal dan waktu sekarang 
import java.util.*; // memanggil library inputan

public class Responsi2 { // nama kelas program untuk eksekusi

    private String getTanggal() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyy");
        Date date = new Date();
        return dateFormat.format(date);
    } // membuat method getTanggal untuk memanggil data tanggal yang akan ditampilkan pada console

    private String getWaktu() {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    } // membuat method getTanggal untuk memanggil data tanggal yang akan ditampilkan pada console

    public static void main(String[] args) {
        Responsi2 tgl = new Responsi2();
        System.out.println(tgl.getTanggal());
        System.out.println(tgl.getWaktu());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        // Tanggal hari ini
        Calendar cal = Calendar.getInstance();
        System.out.println("Hari ini tanggal : " + sdf.format(cal.getTime()));

        //Memanggil kedua method getTanggal dan getWaktu untuk ditampilkan pada console
        Scanner inputan = new Scanner(System.in);
        //        inisialisasi pembayaran awal
        int harga = 0;

        Integer[] hari = new Integer[1];
        String[] namacd = new String[10];
        Integer[] kembalian = new Integer[1];
        String nama[] = new String[1];
        String tglkembali[] = new String[1];

        System.out.println("==========================================");
        System.out.println("             Rental CD Gamezone           ");
        System.out.println("==========================================");
        System.out.println("==========================================");
        System.out.println("| 1.Call Of Duty    = Rp. 20.000,- /Hari |");
        System.out.println("| 2.Resident Evil 6 = Rp. 25.000,- /Hari |");
        System.out.println("| 3.Prototype 2     = Rp. 30.000,- /Hari |");
        System.out.println("| 4.Hero 4          = Rp. 40.000,- /Hari |");
        System.out.println("| 5.Dead By Dylight = Rp. 35.000,- /Hari |");
        System.out.println("==========================================");

        System.out.print("Masukkan Nama Penyewa:  ");
        String sewa = inputan.next();
        nama[0] = inputan.nextLine();
        System.out.println();

        System.out.print("Berapa banyak CD yang ingin anda sewa:  ");
        int banyak = inputan.nextInt();

        for (int ulang = 1; ulang <= banyak; ulang++) {
            System.out.print("Masukkan No CD: ");
            String pilih = inputan.next();
            System.out.println("================");

            if (pilih.equals("1")) {

                System.out.println("Nama CD yang dipinjam : Call Of Duty");
                namacd[ulang] = ("Call Of Duty");

                System.out.println("Harga CD Call Of Duty : Rp. 20.000/Hari");
                harga = harga + 20000;

                System.out.println("================");
            } else if (pilih.equals("2")) {
                System.out.println("Nama CD yang dipinjam : Resident Evil 6");
                namacd[ulang] = ("Resident Evil 6");

                System.out.println("Harga CD Resident Evil 6 : 25.000/Hari");
                harga = harga + 25000;

                System.out.println("================");
            } else if (pilih.equals("3")) {
                System.out.println("Nama CD yang dipinjam : Prototype 2");
                namacd[ulang] = ("Prototype 2");

                System.out.println("Harga CD Prototype 2 : 30.000/Hari");
                harga = harga + 30000;

                System.out.println("================");
            } else if (pilih.equals("4")) {
                System.out.println("Nama CD yang dipinjam : Hero 4");
                namacd[ulang] = ("Hero 4");

                System.out.println("Harga CD Hero 4 : 40.000/Hari");
                harga = harga + 40000;

                System.out.println("================");
            } else if (pilih.equals("5")) {
                System.out.println("Nama CD yang dipinjam : Dead By Dylight");
                namacd[ulang] = ("Dead By Dylight");

                System.out.println("Harga CD Dead By Dylight : 35.000/Hari");
                harga = harga + 35000;

                System.out.println("================");
            }
        }

        System.out.print("Berapa Lama Anda ingin meminjam : ");
        hari[0] = inputan.nextInt();

        System.out.print("Tanggal pengembalian :");
        cal.add(Calendar.DAY_OF_MONTH, hari[0]);
        System.out.println(sdf.format(cal.getTime()));

        int total = harga * hari[0];

        System.out.println("Total pembayaran sebesar " + total + ".");
        System.out.println();

        System.out.print("Masukkan Uang Anda : ");
        int bayar = inputan.nextInt();

        int kembali1 = 0;
        int x = 1;
        while (x != 0) {
            if (total > bayar) {
                System.out.print("Maaf Uang Anda Kurang,Tolong Masukkan dengan benar :");
                bayar = inputan.nextInt();

            } else {
                kembali1 = bayar - total;
                System.out.println("Kembalian Anda = " + kembali1);
                kembalian[0] = kembali1;
                x = 0;
            }
        }
        kembalian[0] = kembali1;

        System.out.println("==========================================");
        System.out.println("              STRUK PEMBAYARAN            ");
        System.out.println("==========================================");

        System.out.println("Nama Penyewa: " + sewa);
        System.out.println("Nama CD yang disewa: ");
        for (int cd = 1; cd <= banyak; cd++) {
            System.out.println(" -" + namacd[cd]);
        }
        System.out.print("Tanggal pengembalian :");
        System.out.println(sdf.format(cal.getTime()));
        System.out.println("Total pembayaran sebesar :" + total);
        System.out.println("Kembalian Anda: " + kembalian[0]);
        System.out.println("Terimakasih atas kunjungannya.");
    }
}
