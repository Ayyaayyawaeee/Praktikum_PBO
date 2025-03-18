package Product;

public class Property {
    String Material_Properti, Nama_Properti;
    int Harga_Properti, Kode_Properti;

    public Property(String Nama, int Harga, int kode_properti, String material){
        this.Kode_Properti = kode_properti
        this.Nama_Properti = Nama;
        this.Harga_Properti = Harga;
        this.Material_Properti = material;
    }

    //Untuk Bagian Read
    public void Lihat_Costume(){
        System.out.println();
        System.out.println("\n");
    }

    //Untuk Bagian Edit
    public void setNama_Properti(NamaP_Baru){
        this.Nama_Properti = NamaP_Baru;
    }

    public void setHarga_Properti(HargaP_Baru){
        this.Harga_Properti = HargaP_Baru;
    }

    public void setMaterial_Properti(Material_Baru){
        this.Material_Properti = Material_Baru;
    }
}
