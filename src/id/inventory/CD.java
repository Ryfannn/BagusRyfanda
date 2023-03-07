package inventory;

public class CD extends Product {
    private String Artist,label;
    private int numberOfSongs;

    public CD(int number, String name, Double price, int qty,String artist, int numOfSongs, String label){
        super(number,name,qty,price);
        this.Artist = artist;
        this.numberOfSongs = numOfSongs;
        this.label = label;
    }

    public void setArtist(String artist) {
        Artist = artist;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setNumberOfSongs(int numberOfSongs) {
        this.numberOfSongs = numberOfSongs;
    }

    public String getArtist() {
        return Artist;
    }

    public String getLabel() {
        return label;
    }

    public int getNumberOfSongs() {
        return numberOfSongs;
    }

    @Override
    public double getInventoryValue(){
        return getprice() * getqty() ;
    }

    public String toString() {
        return 
        "\nNo. Item\t : "+getnumber()+
        "\nNama produk\t : "+getname()+
        "\nArtis\t\t : "+getArtist()+
        "\nLagu di Album\t : "+getNumberOfSongs()+
        "\nLabel\t\t : "+getLabel()+
        "\nStok\t\t : "+getqty()+
        "\nHarga\t\t : $"+getprice()+
        "\nNilai persediaan : $"+getInventoryValue()+
         "\nStatus produk\t : "+(getStatusProduk() ? "Aktif" : "Tidak aktif");
    }
}
