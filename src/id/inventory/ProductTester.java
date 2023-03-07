package inventory;

import java.util.Scanner;

public class ProductTester {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int menuChoice,maxSize;
        maxSize = getNumProduct(in);

        
        if (maxSize == 0){
            System.out.println("No Product Required");
        } else {
            Product products[] = new Product[maxSize];
            addToInventory(products,in);
            do {
                menuChoice = getMenuOption(in);
                executeMenuChoice(menuChoice, products, in);
            } while (menuChoice!=0);
        }
    }
    
    public static void displayInventory(Product[] parameter){
        System.out.println("\n\t=Daftar Produk=");
        for (int i = 0;i<parameter.length;i++){
            System.out.println(parameter[i].toString());
        }
    }
    
    /*public static void addToInventory(Product[] products, Scanner in){
        String tempName;
        int tempQty;
        double tempPrice;
        
        for (int i = 0;i < products.length;i++){
            System.out.println("\n\t=Barang nomor "+ (i+1)+"=");
            System.out.println("Masukkan nama barang : ");
            tempName = in.next();
            System.out.println("Masukkan jumlah barang : ");
            tempQty = in.nextInt();
            System.out.println("Masukkan harga barang : ");
            tempPrice = in.nextDouble();
            products[i] = new Product(i+1,tempName,tempQty,tempPrice);
        }
    }*/

    public static void addToInventory(Product[] products, Scanner in){
        int stockChoice = -1;

        do{
            try{
                if (stockChoice == 0){
                    System.out.println("");
                } else if (stockChoice == 1){
                    
                } else {

                }
            } catch (Exception e) {
                System.out.println();
                in.nextLine();
            }
        } while (stockChoice == 0);
    }

    public static void addCDToInventory(CD[] products, Scanner in){
        String tempName,tempArtist,tempAgeRating;
        int tempQty,tempLenght;
        double tempPrice;
        
        for (int i = 0;i < products.length;i++){
            System.out.println("\n\t=Barang nomor "+ (i+1)+"=");
            System.out.println("Masukkan nama CD : ");
            tempName = in.next();
            System.out.println("Masukkan nama artis : ");
            tempArtist = in.next();
            System.out.println("Masukkan nama label rekaman : ");
            tempAgeRating = in.next();
            System.out.println("Masukkan jumlah lagu : ");
            tempLenght = in.nextInt();
            System.out.println("Masukkan jumlah barang : ");
            tempQty = in.nextInt();
            System.out.println("Masukkan harga barang : ");
            tempPrice = in.nextDouble();
            products[i] = new CD(i+1,tempName,tempPrice,tempQty,tempArtist,tempLenght,tempAgeRating);
        }
    }
    public static void addDVDToInventory(DVD[] products, Scanner in){
        String tempName,tempFilmStudio;
        int tempQty,tempLenght,tempAgeRating;
        double tempPrice;
        
        for (int i = 0;i < products.length;i++){
            System.out.println("\n\t=Barang nomor "+ (i+1)+"=");
            System.out.println("Masukkan nama DVD : ");
            tempName = in.next();
            System.out.println("Masukkan nama studio film : ");
            tempFilmStudio = in.next();
            System.out.println("Masukkan nilai usia : ");
            tempAgeRating = in.nextInt();
            System.out.println("Masukkan durasi film (menit) : ");
            tempLenght = in.nextInt();
            System.out.println("Masukkan jumlah barang : ");
            tempQty = in.nextInt();
            System.out.println("Masukkan harga barang : ");
            tempPrice = in.nextDouble();
            products[i] = new DVD(i+1,tempName,tempPrice,tempQty,tempLenght,tempAgeRating,tempFilmStudio);
        }
    }
    
    public static int getNumProduct(Scanner in){
        int maxSize = -1;
        
        do {
            try {
                System.out.println("Masukkan jumlah barang yang ingin diinput : ");
                maxSize = in.nextInt();
                if (maxSize < 0){
                    System.out.println("Incorrect number entered!");
                }
            } catch (Exception e){
                System.out.println("Incorrect type data entered!");
                in.nextLine();
            }
        } while (maxSize < 0);
        return maxSize;
    }

    public static int getMenuOption(Scanner in){
        System.out.println("\n\t=Menu=\n\n1. Lihat Inventaris\n2. Tambah Persediaan\n3. Kurangi Persediaan\n4. Hentikan Produk\n0. Keluar");
        int pilih = 0;
        do {
            try {
                System.out.println("Masukkan opsi menu: ");
                pilih = in.nextInt();
                if (pilih < 0 || pilih > 4) {
                    System.out.println("Incorrect value entered!");
                }
            } catch (Exception e) {
                System.out.println("Incorrect data type entered!");
                in.nextLine();
            }
        } while (pilih < 0 || pilih > 4);
        return pilih;
    }

    public static int getCDProductNumber(CD[] products, Scanner in){
        int productChoice = -1;
        for (int i = 0;i < products.length;i++) {
            System.out.println((i+1)+". "+products[i].getname());
        }
        do {
            try {
                System.out.println("Masukkan nomor produk : ");
                productChoice = in.nextInt();
                if (productChoice < 0 || productChoice > products.length) {
                    System.out.println("Incorrect number entered!");
                }
            } catch (Exception e) {
                System.out.println("Incorrect type data entered!");
                in.nextLine();
            }
        } while (productChoice < 0 || productChoice > products.length);
        return productChoice - 1;
    }
    public static int getDVDProductNumber(DVD[] products, Scanner in){
        int productChoice = -1;
        for (int i = 0;i < products.length;i++) {
            System.out.println((i+1)+". "+products[i].getname());
        }
        do {
            try {
                System.out.println("Masukkan nomor produk : ");
                productChoice = in.nextInt();
                if (productChoice < 0 || productChoice > products.length) {
                    System.out.println("Incorrect number entered!");
                }
            } catch (Exception e) {
                System.out.println("Incorrect type data entered!");
                in.nextLine();
            }
        } while (productChoice < 0 || productChoice > products.length);
        return productChoice - 1;
    }
    public static int getProductNumber(Product[] products, Scanner in){
        int productChoice = -1;
        for (int i = 0;i < products.length;i++) {
            System.out.println((i+1)+". "+products[i].getname());
        }
        do {
            try {
                System.out.println("Masukkan nomor produk : ");
                productChoice = in.nextInt();
                if (productChoice < 0 || productChoice > products.length) {
                    System.out.println("Incorrect number entered!");
                }
            } catch (Exception e) {
                System.out.println("Incorrect type data entered!");
                in.nextLine();
            }
        } while (productChoice < 0 || productChoice > products.length);
        return productChoice - 1;
    }

    public static void addInventory(Product[] products, Scanner in){
        int productChoice;
        int updateValue = -1;
        productChoice = getProductNumber(products, in);
        do {
            try {
                System.out.println("Masukkan jumlah barang yang ingin diinput :");
                updateValue = in.nextInt();
                if (updateValue < 0){
                    System.out.println("Incorrect number entered!");
                }
            }catch (Exception e) {
                System.out.println("Incorrect type data entered!");
                in.nextLine();
            }
        } while (updateValue < 0);
        products[productChoice].addToInventory(updateValue);
    }

    public static void deductInventory(Product[] products, Scanner in){
        int productChoice,jumlah;
        int updateValue = -1;
        productChoice = getProductNumber(products, in);
        jumlah = products[productChoice].getqty();
        do {
            try {
                System.out.println("Masukkan jumlah barang yang ingin dideduct :");
                updateValue = in.nextInt();
                if (updateValue < 0 || updateValue > jumlah){
                    System.out.println("Incorrect number entered!");
                }
            }catch (Exception e) {
                System.out.println("Incorrect type data entered!");
                in.nextLine();
            }
        } while (updateValue < 0 || updateValue > jumlah);
        products[productChoice].deductFromInventory(updateValue);
    }

    public static void discontinueInventory(Product[] products, Scanner in){
        int productChoice;
        productChoice = getProductNumber(products, in);
        products[productChoice].setAktif(false);
    }

    public static void executeMenuChoice(int menuChoice, Product[] products, Scanner in){
        switch (menuChoice) {
            case 1:
            System.out.println("\nLihat daftar produk");
            displayInventory(products);break;
            case 2:
            System.out.println("\nTambah Persediaan");
            addInventory(products, in);break;
            case 3:
            System.out.println("\nKurangi Persediaan");
            deductInventory(products, in);break;
            case 4:
            System.out.println("\nHentikan Persediaan");
            discontinueInventory(products, in);break;
        }
    }
}
