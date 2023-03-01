package inventory;

import java.util.Scanner;

public class ProductTester {
    public static void main(String[] args) {

        int maxSize = -1;

        Scanner in = new Scanner(System.in);
        int tempNumber;
        String tempName;
        int tempQty;
        double tempPrice;

        do {
            try {
                System.out.println("Masukkan jumlah barang yang ingin diinput : ");
                maxSize = in.nextInt();
                if (maxSize < 0){
                    System.out.println("Invalid data!");
                }
            } catch (Exception e){
                System.out.println("Invalid data!");
            }
            in.nextLine();
        }
        while (maxSize < 0);

        /*System.out.println("Masukkan nomor barang :");
        tempNumber = in.nextInt();
        System.out.println("Masukkan nama barang : ");
        tempName = in.next();
        System.out.println("Masukkan jumlah barang : ");
        tempQty = in.nextInt();
        System.out.println("Masukkan harga barang : ");
        tempPrice = in.nextDouble();

        Product p1 = new Product(tempNumber,tempName,tempQty,tempPrice);

        int tempNumber1;
        String tempName1;
        int tempQty1;
        double tempPrice1;

        System.out.println("\nMasukkan nomor barang :");
        tempNumber1 = in.nextInt();
        System.out.println("Masukkan nama barang : ");
        tempName1 = in.next();
        System.out.println("Masukkan jumlah barang : ");
        tempQty1 = in.nextInt();
        System.out.println("Masukkan harga barang : ");
        tempPrice1 = in.nextDouble();

        Product p2 = new Product(tempNumber1,tempName1,tempQty1,tempPrice1);

        System.out.println("\n=======================\n");
        p1.setStatusProduk(true);
        p2.setStatusProduk(false);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        
        Product produk1 = new Product();
        produk1.setnumber(001);
        produk1.setname("Greatest Hits");
        produk1.setqty(25);
        produk1.setprice(9.99);
        System.out.println(produk1.toString());

        Product produk2 = new Product();
        produk2.setnumber(002);
        produk2.setname("Kecap");
        produk2.setqty(20);
        produk2.setprice(0.99);
        System.out.println(produk2.toString());

        Product produk3 = new Product(003,"Saos",30,1.09);
        System.out.println(produk3.toString());

        Product produk4 = new Product(004,"Sambal",39,1.19);
        System.out.println(produk4.toString());

        Product produk5 = new Product(005,"Sarden",21,2.29);
        System.out.println(produk5.toString());

        Product produk6 = new Product(006,"Minyak Goreng",90,5.39);
        System.out.println(produk6.toString());*/
    }
}
