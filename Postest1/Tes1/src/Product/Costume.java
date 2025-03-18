package Product;

public class Costume extends Product {
    String Size_Costume, Nama_Costume, Bagian_Costume;
    int Harga_Costume;
    

    //Untuk Bagian Create
    public Costume(String Nama, int Harga, String size_costume, String bagian_costume){
        this.Nama_Costume = Nama;
        this.Harga_Costume = Harga;
        this.Size_Costume = size_costume;
        this.Bagian_Costume = bagian_costume;
    }

    //Untuk Bagian Read
    public void Lihat_Costume(){
        System.out.println("Nama Kostum : " + Nama_Costume);
        System.out.println("Harga Kostum : " + Harga_Costume);
        System.out.println("Size Kostum : " + Size_Costume);
        System.out.println("Bagian Kostum : " + Bagian_Costume);
        System.out.println("\n");
    }

    //Untuk Bagian Edit
    public void setNama_Costume(String Nama_Baru){
        this.Nama_Costume = Nama_Baru;
    }

    public void setHarga_Costume(int Harga_Baru){
        this.Harga_Costume = Harga_Baru;
    }

    public void setSize_Costume(String Size_Baru){
        this.Size_Costume = Size_Baru;
    }

    public void setBagian_Costume(String Bagian_Baru){
        this.Bagian_Costume = Bagian_Baru;
    }
}
