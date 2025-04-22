package Product;

public abstract  class Product {
    protected String Nama;
    protected int Harga;

        // Constructor untuk Product
    public Product(String nama, int harga) {
        this.Nama = nama;
        this.Harga = harga;
    }

    public abstract void displayInfo();

    public String getNama() {
        return Nama;
    }

    public int getHarga() {
        return Harga;
    }
}
