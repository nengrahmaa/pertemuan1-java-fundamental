import java.util.*;


public class latihankuis {
    public static void main(String[] args) {
        System.out.println("soal 1");
        int[] angkaGanjil = { 1, 3, 5, 7, 9, 11, 13 };
        for (int i = 0; i < angkaGanjil.length; i++) {
            System.out.println(angkaGanjil[i]);
        }

        System.out.println("Soal 2");
        int[] nilai = { 80, 85, 90, 88, 92 };
        int total = 0;
        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];
        }
        double rataRata = total / (double) nilai.length;
        System.out.println("Rata-rata nilai: " + rataRata);

        System.out.println("Soal 3");
        int[] angka = new int[10];
        Random rand = new Random();
        for (int i = 0; i < angka.length; i++) {
            angka[i] = rand.nextInt(100) + 1;
        }
        int max = angka[0];
        int min = angka[0];
        for (int i = 1; i < angka.length; i++) {
            if (angka[i] > max) {
                max = angka[i];
            }
            if (angka[i] < min) {
                min = angka[i];
            }
        }
        System.out.println("Nilai maksimum: " + max);
        System.out.println("Nilai minimum: " + min);

        System.out.println("Soal 4");
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
        Scanner inputan = new Scanner(System.in); 
        System.out.print("Masukkan angka 1-7 : ");   
        int hasilInp = inputan.nextInt();
        if(hasilInp>=1 && hasilInp<=7){
            System.out.println("Hari ini adalah hari "+hari[hasilInp-1]);
        }else{
            System.out.println("invalid!!");
        }
        inputan.close();

        System.out.println("Soal 5");
        String[] namaDepan = {"Dimas", "Sari"};
        String[] namaBelakang = {"Firmansyah", "Putri"};
        for (int i = 0; i < namaDepan.length; i++) {
            String namaLengkap = namaDepan[i].concat(" " +namaBelakang[i]);
            System.out.println(namaLengkap);
        }

        System.out.println("Soal 6");
        String[] kota = {"Jakarta", "Surabaya", "Yogyakarta", "Bandung", "Malang"};
        String kotaTerpanjang = kota[0];
        for (int i = 1; i < kota.length; i++) {
            if (kota[i].length() > kotaTerpanjang.length()) {
                kotaTerpanjang = kota[i];
            }
        }
        System.out.println("Kota dengan nama terpanjang: " + kotaTerpanjang);

        System.out.println("Soal arraylist");

        ArrayList<String> kalimat = new ArrayList<>();
        Scanner kala = new Scanner(System.in);
        
    }

}
