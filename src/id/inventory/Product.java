package inventory;

public class Product {

    private int number;
    private String name;
    private int qty;
    private double price;
    private boolean statusProduk;
    
    public Product() { 
        number = 0;
        name = "Name";
        qty = 0;
        price = 0;
        statusProduk = true;
    }

    public Product(int number,String name,int qty,double price) {
        this.number = number;
        this.name = name;
        this.qty = qty;
        this.price = price;

    }

    public void cetak() {
        System.out.println("No. Item : "+number+"\nNama produk : "+name+"\nStok : "+qty+"\nHarga : $"+price+"\n");
    }
    
    public String toString() {
        return "No. Item\t : "+number+"\nNama produk\t : "+name+"\nStok\t\t : "+qty+"\nHarga\t\t : $"+price+"\nNilai persediaan : $"+getInventoryValue()+"\nStatus produk\t : "+statusProduk+"\n";
    }

    public int getnumber(){
        return number;
    }

    public String getname(){
        return name;
    }

    public int getqty(){
        return qty;
    }

    public double getprice(){
        return price;
    }

    public void setnumber(int number){
        this.number = number;
    }

    public void setname(String name){
        this.name = name;
    }

    public void setqty(int qty){
        this.qty = qty;
    }

    public void setprice(double price){
        this.price = price;
    }

    public void setStatusProduk(boolean statusProduk) {
        this.statusProduk = statusProduk;
    }

    public boolean getStatusProduk(){
        return statusProduk;
    }
    public double getInventoryValue(){
        return price * qty;
    }

}