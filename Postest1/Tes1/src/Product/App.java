package Product;
import java.io.*;
import java.util.*;

public class App {
    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(isr);
    static ArrayList<Costume> Data_Costume = new ArrayList<>();
    static ArrayList<Property> Data_Property = new ArrayList<>();

    public static void main(String[] args) throws IOException{
        while (true){
            System.out.println("Selamat Datang, Min!! Hari ini mau manajemen data apa?");
            System.out.println("1. Data Costume");
            System.out.println("2. Data Property");
            System.out.println("\n");
            System.out.print("Pilih Menu : ");
            int pilih = cek_int();
            if (pilih == 1){
                System.out.println("1. Lihat Data Costume");
                System.out.println("2. Tambah Data Costume");
                System.out.println("3. Edit Data Costume");
                System.out.println("4. Hapus Data Costume");
                System.out.println("5. Keluar");
                int pilih2 = cek_int();
                if (pilih2 == 1){
                    Lihat_Data();
                }else if(pilih2 == 2){
                    Tambah_Data_Costume();
                }else if(pilih2 == 3){
                    Edit_Data();
                }else if(pilih2 == 4){
                    Hapus_Data();
                }else if(pilih2 == 5){
                    System.exit(0);
                }
            }
            else if (pilih == 2){
                System.out.println("1. Lihat Data Property");
                System.out.println("2. Tambah Data Property");
                System.out.println("3. Edit Data Property");
                System.out.println("4. Hapus Data Property");
                System.out.println("5. Keluar");
                int pilih3 = cek_int();
            }
        }
    }

    public static int cek_int() throws IOException{
    int cek = 0;
    while (true){
        try{
        cek = Integer.parseInt(br.readLine());
        break;
        }catch (NumberFormatException e){
            System.out.println("Masukkan Nilai Integer!");
        }
    }
        return cek;
    }

    public static void Tambah_Data_Costume() throws IOException{
        System.out.print("Masukkan Nama Costume : ");
        String Nama = br.readLine();
        System.out.print("Masukkan Harga Costume : ");
        int Harga = cek_int();
        System.out.print("Masukkan Size Costume: ");
        String size_costume = br.readLine();
        System.out.print("Masukkan Bagian-Bagian Costume: ");
        String bagian_costume = br.readLine();
        Costume Data_Baru = new Costume(Nama, Harga, size_costume, bagian_costume);
        Data_Costume.add(Data_Baru);
        System.out.print("Data Berhasil Ditambahkan.");
    }

    public static void Lihat_Data() throws IOException{
        for(int i = 0; i < Data_Costume.size(); i++){
            System.out.println("Data Kostum ke-" + (i+1));
            Data_Costume.get(i).Lihat_Costume();
        }
    }

    public static void Edit_Data() throws IOException {
        Lihat_Data();
        while (true) { 
            System.out.println("Pilih Data yang Ingin Diedit");
            int Nomor = cek_int() - 1;
            System.out.println("Masukkan Nama Costume yang Baru:");
            Data_Costume.get(Nomor).setNama_Costume(br.readLine());
            System.out.println("Masukkan Harga Costume yang Baru:");
            Data_Costume.get(Nomor).setHarga_Costume(cek_int());
            System.out.println("Masukkan Size Costume yang Baru:");
            Data_Costume.get(Nomor).setSize_Costume(br.readLine());
            System.out.println("Masukkan Bagian-Bagian Costume yang Baru:");
            Data_Costume.get(Nomor).setBagian_Costume(br.readLine());
            System.out.println("Data Berhasil Diupdate.");
        }
    }
    public static void Hapus_Data() throws IOException {
        Lihat_Data();
        System.out.println("Pilih Data yang Ingin Dihapus");
        int nomor = cek_int() - 1;
        Data_Costume.remove(nomor);
        System.out.println("=============================");
        System.out.println("Data Berhasil Di Delete . . .");
        System.out.println("=============================");
    }


}