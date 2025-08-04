import java.util.*;

public class Main { 
    public static void main(String[] args) { 
    
        // perkenalan 
        System.out.println("Hello, World!"); 
        System.out.println("Hello Universe!"); 

        // penggunaan print
        int age = 20; 
        System.out.println("Umur saya "+age +" tahun ");

        // TIPE DATA PRIMITIF
        char golonganDarah = 'A'; 
        int umur = 20; 
        double tinggi = 1.74; 
        boolean menikah = true;
        System.out.println("Golongan darah saya adalah "+golonganDarah);

        // TIPE DATA KOMPOSIT
        // string
        String nama = "Neng";
        String namaBelakang = "Rahmawati";
        System.out.println("nama saya adalah : "+nama);

        // charAt
        char hurufDepan = nama.charAt(0);
        char hurufBelakang = nama.charAt(3);
        System.out.println("Huruf depan adalah "+hurufDepan +" dan huruf belakang adalah "+hurufBelakang) ;
        
        // length
        int panjangNama = nama.length();
        System.out.println("panjang nama : "+panjangNama);

        // concat
        String namaGabungan = nama.concat(" ").concat(namaBelakang);
        System.out.println("Nama lengkap : "+namaGabungan);

        // equals Ignore Case dan equals= untuk validasi
        String password = "rahma123";
        String passwordInput = "Rahma123";

        if(password.equals(passwordInput)){
            System.out.println("Anda berhasil login");
        } else {
            System.out.println("Gagal login");
        }

        // ARRAY
        int[] arr = { 1, 2, 3, 4, 5 }; 
        int[] number = new int[5]; 
        number[0] = 10; 
        number[1] = 20; 
        number[2] = 30; 
        number[4] = 40;

        System.out.println(arr[1]);
        System.out.println(number[0]);
        
        System.out.println(number[4]);

        Arrays.sort(arr);       
        System.out.println(Arrays.toString(arr));

        // Sort Array
        int [] angka = {5, 2, 1, 8, 10};
        Arrays.sort(angka);
        for (int value : angka){
            System.out.print(value + ", ");
        }

        // membuat ArrayList 
        ArrayList<String> listName = new ArrayList<>();
        // menambahkan nilai ke elemen ArrayList 
        listName.add("Dilan"); 
        listName.add("Milea"); 
        // mengambil nilai ArrayList 
        System.out.println(listName.get(0)); 
        System.out.println(listName.get(1)); 

        // SCANNER
        Scanner input = new Scanner(System.in); 
        System.out.print("Nama : "); 
        String name = input.nextLine(); 
        System.out.println("Selamat Datang " + name); 
    } 
} 
