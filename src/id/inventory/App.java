package inventory;

import java.util.Scanner;

public class App {
    /*public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String tempName;
        int tempQty,tempNumber;
        double tempPrice;

        int maxSize = -1;

        do {
            try {
                System.out.println("Enter the number of products you would like to add"
                +"\nEnter 0 (zero) if you do not wish to add products");
                maxSize = in.nextInt();
                Product products[] = new Product[maxSize];
                if (maxSize < 0){
                    System.out.println("Angka salah dek");
                } else {
                    for (int i = 0;i < maxSize;i++){
                        System.out.println("\nMasukkan nomor barang : ");
                        tempNumber = in.nextInt();
                        System.out.println("Masukkan nama barang : ");
                        tempName = in.next();
                        System.out.println("Masukkan jumlah barang : ");
                        tempQty = in.nextInt();
                        System.out.println("Masukkan harga barang : ");
                        tempPrice = in.nextDouble();
                        products[i] = new Product(tempNumber,tempName,tempQty,tempPrice);
                    }
                    for (int i = 0;i<maxSize;i++){
                        System.out.println(products[i].toString());
                    }
                }
            } catch (Exception e){
                System.out.println("Incorrect type data entered!");
                in.nextLine();
            }
        } while (maxSize < 0);

        if (maxSize == 0) {
            System.out.println("No product!");
        }

    }
    /*public static void main(String[] args) {
        DVD dvd = new DVD(1, "Daredevil", 8.99, 50, 99, 15, "20th Century Fox");
        System.out.println(dvd.toString());
        CD cd = new CD(2, "Dreams we never lost", 7.99, 50, "Tidelines", 14, "Tide Lines Music");
        System.out.println(cd.toString());
    }*/
    
    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = -1;
        do {
            try {
                a = in.nextInt();
            } catch (Exception e) {
                in.nextLine();
            }
        } while (a < 0);
    }*/
    public static void main(String[] args) {
        Product p = new Product(1,"1",1,1);
        System.out.println(p.toString());
        DVD dvd = new DVD(1, "Daredevil", 8.99, 50, 99, 15, "20th Century Fox");
        System.out.println(dvd.toString());
    }
}