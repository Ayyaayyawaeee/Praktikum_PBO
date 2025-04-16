package Product;
import java.io.*;
import java.util.*;

public class App {
    private static final String Password = "admin123"; // Password admin
    private static boolean IniAdmin = false;
    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(isr);
    static ArrayList<Costume> Data_Costume = new ArrayList<>();
    static ArrayList<Property> Data_Property = new ArrayList<>();
    
    public static void main(String[] args) throws IOException {
        while (true) {
            System.out.println("Selamat Datang!");
            System.out.println("1. Guest Mode");
            System.out.println("2. Admin Mode");
            System.out.print("Pilih Mode: ");
            int mode = cek_int();
            
            if (mode == 1) {
                MenuGuest();
            } else if (mode == 2) {
                if (CekAdmin()) {
                    MenuAdmin();
                }
            }
        }
}

private static boolean CekAdmin() throws IOException {
    System.out.print("Masukkan Password Admin: ");
    String input = br.readLine();
    if (input.equals(Password)) {
        IniAdmin = true;
        return true;
    }
    System.out.println("Password salah!");
    return false;
}

private  static void MenuGuest() throws IOException{
    while (true) {
        System.out.println("1. Lihat Data Costume");
        System.out.println("2. Lihat Data Property");
        System.out.println("3. Kembali ke Menu Utama");
        System.out.print("Pilih: ");
        int pilih = cek_int();
        
        if (pilih == 1) {
            LihatCostume();
        } 
        else if (pilih == 2) {
            LihatProperty();
        }
        else {
            break;
        }
    }
}

    private  static void MenuAdmin() throws IOException{
        while (true){
            System.out.println("Selamat Datang, Min!! Hari ini mau manajemen data apa?");
            System.out.println("1. Data Costume");
            System.out.println("2. Data Property");
            System.out.println("\n");
            System.out.print("Pilih Menu : ");
            int pilih = cek_int();
            if (pilih == 1){
                ManajemenCostume();
            }
            else if (pilih == 2){
                ManajemenProperty();
            }
        }
    }

    private static void  ManajemenCostume() throws IOException{
        System.out.println("1. Lihat Data Costume");
        System.out.println("2. Tambah Data Costume");
        System.out.println("3. Edit Data Costume");
        System.out.println("4. Hapus Data Costume");
        System.out.println("5. Keluar");
        int pilih2 = cek_int();
        if (pilih2 == 1){
            LihatCostume();
        }else if(pilih2 == 2){
            TambahCostume();
        }else if(pilih2 == 3){
            EditCostume();
        }else if(pilih2 == 4){
            HapusCostume();
        }else if(pilih2 == 5){
            System.exit(0);
        }
    }

    private static void  ManajemenProperty() throws IOException{
        System.out.println("1. Lihat Data Property");
        System.out.println("2. Tambah Data Property");
        System.out.println("3. Edit Data Property");
        System.out.println("4. Hapus Data Property");
        System.out.println("5. Keluar");
        int pilih3 = cek_int();
        if (pilih3 == 1){
            LihatProperty();
        }else if(pilih3 == 2){
            TambahProperty();
        }else if(pilih3 == 3){
            EditProperty();
        }else if(pilih3 == 4){
            HapusProperty();
        }else if(pilih3 == 5){
            System.exit(0);
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

    public static void LihatCostume() throws IOException{
        if (Data_Costume.size() == 0){
            System.out.println("Costume masih kosong.");
            System.out.println("");
        } 
        else {
            for(int i = 0; i < Data_Costume.size(); i++){
                System.out.println("Data Kostum ke-" + (i+1));
                Data_Costume.get(i).displayInfo();
                System.out.println("");
            }
        }
    }

    public static void LihatProperty() throws IOException{
        if (Data_Property.size() == 0){
            System.out.println("Property masih kosong.");
            System.out.println("");
        } 
        else {
            for(int i = 0; i < Data_Property.size(); i++){
                System.out.println("Data Property ke-" + (i+1));
                Data_Property.get(i).displayInfo();
                System.out.println("");
            }
        }
    }

    private static void TambahCostume() throws IOException{
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

    private static void TambahProperty() throws IOException{
        System.out.print("Masukkan Nama Property : ");
        String Nama = br.readLine();
        System.out.print("Masukkan Harga Property : ");
        int Harga = cek_int();
        System.out.print("Masukkan Material Property: ");
        String material = br.readLine();
        Property Data_Baru = new Property(Nama, Harga, material);
        Data_Property.add(Data_Baru);
        System.out.print("Data Berhasil Ditambahkan.");
    }

    private static void EditCostume() throws IOException {
        LihatCostume();
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

    private static void EditProperty() throws IOException {
        LihatProperty();
        while (true) { 
            System.out.println("Pilih Data yang Ingin Diedit");
            int Nomor = cek_int() - 1;
            System.out.println("Masukkan Nama Property yang Baru:");
            Data_Property.get(Nomor).setNamaProperti(br.readLine());
            System.out.println("Masukkan Harga Property yang Baru:");
            Data_Property.get(Nomor).setHargaProperti(cek_int());
            System.out.println("Masukkan Material Property yang Baru:");
            Data_Property.get(Nomor).setMaterialProperti(br.readLine());
            System.out.println("Data Berhasil Diupdate.");
        }
    }

    public static void HapusCostume() throws IOException {
        LihatCostume();
        System.out.println("Pilih Data yang Ingin Dihapus");
        int nomor = cek_int() - 1;
        Data_Costume.remove(nomor);
        System.out.println("=============================");
        System.out.println("Data Berhasil Di Delete . . .");
        System.out.println("=============================");
    }

    public static void HapusProperty() throws IOException {
        LihatProperty();
        System.out.println("Pilih Data yang Ingin Dihapus");
        int nomor = cek_int() - 1;
        Data_Property.remove(nomor);
        System.out.println("=============================");
        System.out.println("Data Berhasil Di Delete . . .");
        System.out.println("=============================");
    }

}