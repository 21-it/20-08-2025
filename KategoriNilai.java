import java.util.Scanner;

public class KategoriNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan Nilai Anda");
        int Nilai =input.nextInt();
        
        if (Nilai >=90 && Nilai <=101) {
            System.out.println("Selamat Atas Kerja Keras Anda )(A)");
        }else if(Nilai >= 80 && Nilai <=91){
            System.out.println("Kerja Bagus :0 (B)");
        }else if(Nilai >=60 && Nilai <=81){
            System.out.println("Belajar Yang Giat Ya :) (C)");
        }else if(Nilai >= 40 && Nilai <=61){
            System.out.println("Teruslah Mencoba (D)");
        }else if(Nilai >=20 && Nilai <=41){
            System.out.println("Mohon Untuk Belajar Lebih Giat Lagi (E)");
        }else if(Nilai >=0 && Nilai <=21){
            System.out.println("Coba Lagi Lain Waktu (F)");
            }else{
            System.out.println("Maaf Anda Tidak Masuk Nominasi");
        }
    }
}
