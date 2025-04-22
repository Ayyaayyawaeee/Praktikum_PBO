package Product;

public class Property {
    private String Material_Properti, Nama_Properti;
    private int Harga_Properti, Kode_Properti;

    public Property(String Nama, int Harga, String material){
        this.Nama_Properti = Nama;
        this.Harga_Properti = Harga;
        this.Material_Properti = material;
    }

    public Property(String Nama, int Harga) {
        this(Nama, Harga, "Kayu");
    }
    
    public Property(int Kode, String Nama) {
        this.Kode_Properti = Kode;
        this.Nama_Properti = Nama;
        this.Harga_Properti = 0;
        this.Material_Properti = "Belum ditentukan";
    }

    public void updateHarga(int hargaBaru) {
        this.Harga_Properti = hargaBaru;
        System.out.println("Harga property berhasil diupdate.");
    }

    //Untuk Bagian Read
    public void displayInfo() {
        System.out.println("Nama: " + Nama_Properti);
        System.out.println("Harga: " + Harga_Properti);
        System.out.println("Material: " + Material_Properti);
    }

    public String getNamaProperty() {
        return Nama_Properti;
    }

    public int getHargaProperty() {
        return Harga_Properti;
    }

    public String getMaterialProperty() {
        return Material_Properti;
    }

    //Untuk Bagian Edit
    public void setNamaProperti(String NamaP_Baru){
        this.Nama_Properti = NamaP_Baru;
    }

    public void setHargaProperti(int HargaP_Baru){
        this.Harga_Properti = HargaP_Baru;
    }

    public void setMaterialProperti(String Material_Baru){
        this.Material_Properti = Material_Baru;
    }
}
