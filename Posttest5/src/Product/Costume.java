package Product;

public final class Costume extends Product {
    private final String Nama_Costume;
    private String Size_Costume, Bagian_Costume;
    private int Harga_Costume, Stok;
    

    //Untuk Bagian Create
    public Costume(String Nama, int Harga, String size_costume, String bagian_costume){
        super(Nama, Harga);
        this.Nama_Costume = Nama;
        this.Harga_Costume = Harga;
        this.Size_Costume = size_costume;
        this.Bagian_Costume = bagian_costume;
    }

    //Untuk Bagian Read
    @Override
    public final void displayInfo() {
        System.out.println("=== Informasi Kostum ===");
        System.out.println("Nama Kostum : " + getNamaCostume());
        System.out.println("Harga Kostum : " + getHargaCostume());
        System.out.println("Size Kostum : " + getSizeCostume());
        System.out.println("Bagian Kostum : " + getBagianCostume());
        System.out.println("Stok : " + getStok());
        System.out.println("\n");
    }

    public final void displayCostumeInfo() {
        displayInfo();
    }

    public String getSizeCostume() {
        return Size_Costume;
    }

    public String getNamaCostume() {
        return Nama_Costume;
    }

    public String getBagianCostume() {
        return Bagian_Costume;
    }

    public int getHargaCostume() {
        return Harga_Costume;
    }

    public int getStok() {
        return Stok;
    }

    //Untuk Bagian Edit

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
