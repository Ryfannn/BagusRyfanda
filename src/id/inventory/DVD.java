package inventory;

public class DVD extends Product {
    private int Length,ageRating;
    private String filmStudio;

    public DVD(int number, String name, Double price, int qty, int length, int ageRating, String filmstudio){
        super(number,name,qty,price);
        this.Length = length;
        this.ageRating = ageRating;
        this.filmStudio = filmstudio;
    }

    public void setLength(int length) {
        Length = length;
    }

    public void setAgeRating(int ageRating) {
        this.ageRating = ageRating;
    }

    public void setFilmStudio(String filmStudio) {
        this.filmStudio = filmStudio;
    }

    public int getLength() {
        return Length;
    }

    public int getAgeRating() {
        return ageRating;
    }

    public String getFilmStudio() {
        return filmStudio;
    }

    @Override
    public double getInventoryValue(){
        return (getprice() * getqty()) + (getprice() * getqty() * 0.05) ;
    }

    public String toString() {
        return 
        "\nNo. Item\t : "+getnumber()+
        "\nNama produk\t : "+getname()+
        "\nDurasi Film\t : "+getLength()+
        "\nNilai Usia\t : "+getAgeRating()+
        "\nStudio Film\t : "+getFilmStudio()+
        "\nStok\t\t : "+getqty()+
        "\nHarga\t\t : $"+getprice()+
        "\nNilai persediaan : $"+getInventoryValue()+
         "\nStatus produk\t : "+(getStatusProduk() ? "Aktif" : "Tidak aktif");
    }
}
