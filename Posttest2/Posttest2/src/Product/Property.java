package Product;

public class Property {
    private String Material_Properti, Nama_Properti;
    private int Harga_Properti, Kode_Properti;

    public Property(String Nama, int Harga, String material){
        this.Nama_Properti = Nama;
        this.Harga_Properti = Harga;
        this.Material_Properti = material;
    }

    //Untuk Bagian Read
    public void Lihat_Property(){
        System.out.println("Nama Property : " + getNamaProperty());
        System.out.println("Harga Property : " + getHargaProperty());
        System.out.println("Material Property : " + getMaterialProperty());
        System.out.println("\n");
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
