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
        //        inisialisasi harga cd
       // int h1 = 20000, h2 = 25000, h3 = 30000, h4 = 40000, h5 = 35000;
        

        ArrayList hari = new ArrayList<>();
        // ArrayList uang = new ArrayList<>();
        ArrayList namacd = new ArrayList<>();
        ArrayList total = new ArrayList<>();
        ArrayList kembalian = new ArrayList<>();
        ArrayList nama = new ArrayList<>();
        ArrayList tglkembali = new ArrayList<>();

        int menu = 0;
        System.out.println("==========================================");
        System.out.println("             Rental CD Gamezone           ");
        System.out.println("==========================================");
        System.out.println(" ____________________________________");
        System.out.println("|            MENU MAKANAN            |");
        System.out.println("|____________________________________|");
        System.out.println("|o Nama            |  Harga          |");
        System.out.println("|1. Nasi Goreng    |   Rp 10000,00   |");
        System.out.println("|2. Nasi Campur    |   Rp 8000,00    |");
        System.out.println("|3. Ayam Goreng    |   Rp 15000,00   |");
        System.out.println("|4. Es Teh         |   Rp 4000,00    |");
        System.out.println("|5. Es Kelapa Muda |   Rp 5000,00    |");
        System.out.println("|__________________|_________________|");
        System.out.println("==========================================");
         System.out.println("| 1.Call Of Duty    = Rp. 20.000,- /Hari |");
        System.out.println("| 2.Resident Evil 6 = Rp. 25.000,- /Hari |");
        System.out.println("| 3.Prototype 2     = Rp. 30.000,- /Hari |");
        System.out.println("| 4.Hero 4          = Rp. 40.000,- /Hari |");
        System.out.println("| 5.Dead By Dylight = Rp. 35.000,- /Hari |");
        System.out.println("==========================================");

        System.out.print("Masukkan Nama Penyewa:  ");
        String sewa = inputan.next();
        nama.add(sewa);
        System.out.println();

        System.out.print("Berapa banyak CD yang ingin anda sewa:  ");
        int banyak = inputan.nextInt();

         for (int ulang = 1; ulang <= banyak; ulang++) {
            System.out.print("Masukkan No CD: ");
            String pilih = inputan.next();
            System.out.println("================");

            if (pilih.equals("1")) {
                   
                System.out.println("Nama CD yang dipinjam : Call Of Duty");
                namacd.add("Call Of Duty");

                System.out.println("Harga CD Call Of Duty : Rp. 20.000" +pilih + menu);
                harga = harga + 20000;

                System.out.println("================");
            } else if (pilih.equals("2")) {
                System.out.println("Nama CD yang dipinjam : Resident Evil 6" );
                namacd.add("Resident Evil 6");

                System.out.println("Harga CD Resident Evil 6 : 25.000" +pilih + menu);
                harga = harga + 25000;

                System.out.println("================");
            } else if (pilih.equals("3")) {
                System.out.println("Nama CD yang dipinjam : Prototype 2");
                namacd.add("Prototype 2");

                System.out.println("Harga CD Prototype 2 : 30.000" +pilih + menu);
                harga = harga + 30000;

                System.out.println("================");
            } else if (pilih.equals("4")) {
                System.out.println("Nama CD yang dipinjam : Hero 4");
                namacd.add("Hero 4");

                System.out.println("Harga CD Hero 4 : 40.000" +pilih + menu);
                harga = harga + 40000;

                System.out.println("================");
            } else if (pilih.equals("5")) {
                System.out.println("Nama CD yang dipinjam : Dead By Dylight");
                namacd.add("Dead By Dylight");

                System.out.println("Harga CD Dead By Dylight : 35.000" +pilih + menu);
                harga = harga + 35000;

                System.out.println("================");
            }
         }
                
                System.out.print("Berapa Lama Anda ingin meminjam : ");
                int lama = inputan.nextInt();
                hari.add(lama);

                System.out.print("Tanggal pengembalian :");
                cal.add(Calendar.DAY_OF_MONTH, lama);
                System.out.println(sdf.format(cal.getTime()));

                int tot = harga * lama;

                System.out.println("Total pembayaran sebesar " +tot+".");
                System.out.println();

                System.out.print("Masukkan Uang Anda : ");
                int bayar = inputan.nextInt();

                int kembali1 = bayar - tot;
                if (tot > bayar) {
                    while (tot > bayar) {
                        System.out.print("Maaf Uang Anda Kurang,Tolong Masukkan dengan benar :");
                        bayar = inputan.nextInt();
                    }

                    kembalian.add(kembali1);
                    System.out.println(kembalian.get(0));
                } else {
                    System.out.println("Kembalian Anda = " + kembali1);
                    kembalian.add(kembali1);
                }
        System.out.println("==========================================");
        System.out.println("              STRUK PEMBAYARAN            ");
        System.out.println("==========================================");

            System.out.println("Nama Penyewa: " + sewa);
            System.out.println("Nama CD yang disewa: " + namacd+".");
            System.out.print("Tanggal pengembalian :"); 
            System.out.println(sdf.format(cal.getTime()));
            System.out.println("Total pembayaran sebesar " +tot+".");
            System.out.println("Kembalian Anda: " +kembalian+".");
            System.out.println("Terimakasih atas kunjungannya.");
            
    }
}