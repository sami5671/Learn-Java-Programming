import java.util.Scanner;

public class main {
    
    public static Scanner input = new Scanner(System.in);
    
    
  public static void main (String[] args) {
     mainPage();
  }
       

    
    
    public static void mainPage(){
        System.out.println();
        System.out.println("\t=======> Welcome to MACS(Mikel Arteta Computer Shop) <======= ");
        System.out.println("\t=*= Selete Anyone: ");
        System.out.println("\t1) Laptop\n\t2) Desktop\n\t3) Exit");
        System.out.print("\t=*= Enter your choice device: ");
        
        try{
            int choice = input.nextInt();
            switch (choice) {
            case 1:
                listOfLaptop();
            case 2:
                listOfDesktop();
            case 3:
                System.exit(0);
            default:
                System.out.println();
                System.out.println("\tSorry Sir, You Prass Invalid Choice! Try Again");
                mainPage();
            }
        }catch(Exception e){
            System.out.println(e);

        }
    }
    
    public static void listOfLaptop(){
        
        System.out.println();
        System.out.println("\t=*= Choose any one from the below brands: ");
        System.out.println("\t1) Asus\n\t2) HP\n\t3) Dell\n\t4) Acer\n\t5) Previous Manu");
        System.out.print("\t=*= Enter your choice brand: ");
        
        try{
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    listOfAsusModel();
                case 2:
                    listOfHPModel();
                case 3:
                    listOfDellModel();
                case 4:
                     listOfAcerModel();
                case 5:
                    mainPage();
                default:
                    System.out.println();
                    System.out.println("\tSorry Sir, You Prass Invalid Choice! Try Again");
                    listOfLaptop();
            }
        }catch(Exception e){
                System.out.println(e);
        }

    }
    
    public static void listOfDesktop(){
        
        System.out.println();
        System.out.println("\t=*= Choose any one from the below brands: ");
        System.out.println("\t1) Lenovo\n\t2) Intel\n\t3) Toshiba\n\t4) Apple\n\t5) Previous Manu");
        System.out.print("\t=*= Enter your choice brand: ");

        try{
            int choice = input.nextInt();
            switch (choice) {
            case 1:
                listOfLenovoModel();
            case 2:
                listOfIntelModel();
            case 3:
                listOfToshibaModel();
            case 4:
                 listOfAppleModel();
            case 5:
                mainPage();
            default:
                System.out.println();
                System.out.println("\tSorry Sir, You Prass Invalid Choice! Try Again");
                listOfLaptop();
                
            } 
        }catch(Exception e){
            System.out.println(e);
        }
        

    }
    
    
    public static void listOfAsusModel(){
        
        Laptop[] asusLaptops = Asus.getAsusLaptops();
        
        System.out.println();
        System.out.println("\t=*= Available laptops of Asus: ");
        
        System.out.println("\t1)" +asusLaptops[0].getModel()+
                           "\n\t2)"+ asusLaptops[1].getModel()+
                           "\n\t3)"+ asusLaptops[2].getModel()+
                           "\n\t4)"+ asusLaptops[3].getModel()+
                           "\n\t5) Previous Manu");
        
        System.out.print("\t=*= Enter your choice model: ");
        try{
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    showLaptopFeatures(asusLaptops[0].getModel(),asusLaptops[0].getFeatures());
                    System.out.println("\t|^|Original Price: " + asusLaptops[0].getOriginalPrice()+" BDT");
                    System.out.println("\t|^|Current Discount: " + asusLaptops[0].getCurrentDiscount()+"%");
                    System.out.println("\t|^|Discount Price: " + asusLaptops[0].calculation(asusLaptops[0].getOriginalPrice(), asusLaptops[0].getCurrentDiscount())+" BDT");
                    System.out.println();
                    listOfAsusModel();
                case 2:
                    showLaptopFeatures(asusLaptops[1].getModel(),asusLaptops[1].getFeatures());
                    System.out.println("\t|^|Original Price: " + asusLaptops[1].getOriginalPrice()+" BDT");
                    System.out.println("\t|^|Current Discount: " + asusLaptops[1].getCurrentDiscount()+"%");
                    System.out.println("\t|^|Discount Price: " + asusLaptops[1].calculation(asusLaptops[1].getOriginalPrice(), asusLaptops[1].getCurrentDiscount())+" BDT");
                    System.out.println();
                    listOfAsusModel();
                case 3:
                    showLaptopFeatures(asusLaptops[2].getModel(),asusLaptops[2].getFeatures());
                    System.out.println("\t|^|Original Price: " + asusLaptops[2].getOriginalPrice()+" BDT");
                    System.out.println("\t|^|Current Discount: " + asusLaptops[2].getCurrentDiscount()+"%");
                    System.out.println("\t|^|Discount Price: " + asusLaptops[2].calculation(asusLaptops[2].getOriginalPrice(), asusLaptops[2].getCurrentDiscount())+" BDT");
                    System.out.println();
                    listOfAsusModel();

               case 4:
                   showLaptopFeatures(asusLaptops[3].getModel(),asusLaptops[3].getFeatures());
                   System.out.println("\t|^|Original Price: " + asusLaptops[3].getOriginalPrice()+" BDT");
                   System.out.println("\t|^|Current Discount: " + asusLaptops[3].getCurrentDiscount()+"%");
                   System.out.println("\t|^|Discount Price: " + asusLaptops[3].calculation(asusLaptops[3].getOriginalPrice(), asusLaptops[3].getCurrentDiscount())+" BDT");
                   System.out.println();
                   listOfAsusModel();

               case 5:
                   listOfLaptop();

                default:
                    System.out.println();
                    System.out.println("\tSorry Sir, You Prass Invalid Choice! Try Again");
                    listOfAsusModel();

            }
        }catch(Exception e){
            System.out.println(e);
        }
        
        
    }
    
    
    
    public static void listOfHPModel(){
        
        Laptop[] hpLaptops = HP.getHpLaptops();
        
        System.out.println();
        System.out.println("\t=*= Available laptops of HP: ");
        
        System.out.println("\t1)" +hpLaptops[0].getModel()+
                           "\n\t2)"+ hpLaptops[1].getModel()+
                           "\n\t3)"+ hpLaptops[2].getModel()+
                           "\n\t4)"+ hpLaptops[3].getModel()+
                           "\n\t5) Previous Manu");
        
        System.out.print("\t=*= Enter your choice model: ");
        
        
        try{
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    showLaptopFeatures(hpLaptops[0].getModel(),hpLaptops[0].getFeatures());
                    System.out.println("\t|^|Original Price: " + hpLaptops[0].getOriginalPrice()+" BDT");
                    System.out.println("\t|^|Current Discount: " + hpLaptops[0].getCurrentDiscount()+"%");
                    System.out.println("\t|^|Discount Price: " + hpLaptops[0].calculation(hpLaptops[0].getOriginalPrice(), hpLaptops[0].getCurrentDiscount())+" BDT");
                    System.out.println();
                    listOfHPModel();
                case 2:
                    showLaptopFeatures(hpLaptops[1].getModel(),hpLaptops[1].getFeatures());
                    System.out.println("\t|^|Original Price: " + hpLaptops[1].getOriginalPrice()+" BDT");
                    System.out.println("\t|^|Current Discount: " + hpLaptops[1].getCurrentDiscount()+"%");
                    System.out.println("\t|^|Discount Price: " + hpLaptops[1].calculation(hpLaptops[1].getOriginalPrice(), hpLaptops[1].getCurrentDiscount())+" BDT");
                    System.out.println();
                    listOfHPModel();
                case 3:
                    showLaptopFeatures(hpLaptops[2].getModel(),hpLaptops[2].getFeatures());
                    System.out.println("\t|^|Original Price: " + hpLaptops[2].getOriginalPrice()+" BDT");
                    System.out.println("\t|^|Current Discount: " + hpLaptops[2].getCurrentDiscount()+"%");
                    System.out.println("\t|^|Discount Price: " + hpLaptops[2].calculation(hpLaptops[2].getOriginalPrice(), hpLaptops[2].getCurrentDiscount())+" BDT");
                    System.out.println();
                    listOfHPModel();

               case 4:
                   showLaptopFeatures(hpLaptops[3].getModel(),hpLaptops[3].getFeatures());
                   System.out.println("\t|^|Original Price: " + hpLaptops[3].getOriginalPrice()+" BDT");
                   System.out.println("\t|^|Current Discount: " + hpLaptops[3].getCurrentDiscount()+"%");
                   System.out.println("\t|^|Discount Price: " + hpLaptops[3].calculation(hpLaptops[3].getOriginalPrice(), hpLaptops[3].getCurrentDiscount())+" BDT");
                   System.out.println();
                   listOfHPModel();

               case 5:
                   listOfLaptop();

                default:
                    System.out.println();
                    System.out.println("\tSorry Sir, You Prass Invalid Choice! Try Again");
                    listOfHPModel();

            }
        }catch(Exception e){
            System.out.println(e);
        }
        
        
    }
    
    public static void listOfDellModel(){
        
        Laptop[] acerLaptops = Dell.getDellLaptops();
        
        System.out.println();
        System.out.println("\t=*= Available laptops of Dell: ");
        
        System.out.println("\t1)" +acerLaptops[0].getModel()+
                           "\n\t2)"+ acerLaptops[1].getModel()+
                           "\n\t3)"+ acerLaptops[2].getModel()+
                           "\n\t4)"+ acerLaptops[3].getModel()+
                           "\n\t5) Previous Manu");
        
        System.out.print("\t=*= Enter your choice model: ");
        
        
        try{
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    showLaptopFeatures(acerLaptops[0].getModel(),acerLaptops[0].getFeatures());
                    System.out.println("\t|^|Original Price: " + acerLaptops[0].getOriginalPrice()+" BDT");
                    System.out.println("\t|^|Current Discount: " + acerLaptops[0].getCurrentDiscount()+"%");
                    System.out.println("\t|^|Discount Price: " + acerLaptops[0].calculation(acerLaptops[0].getOriginalPrice(), acerLaptops[0].getCurrentDiscount())+" BDT");
                    System.out.println();
                    listOfDellModel();
                case 2:
                    showLaptopFeatures(acerLaptops[1].getModel(),acerLaptops[1].getFeatures());
                    System.out.println("\t|^|Original Price: " + acerLaptops[1].getOriginalPrice()+" BDT");
                    System.out.println("\t|^|Current Discount: " + acerLaptops[1].getCurrentDiscount()+"%");
                    System.out.println("\t|^|Discount Price: " + acerLaptops[1].calculation(acerLaptops[1].getOriginalPrice(), acerLaptops[1].getCurrentDiscount())+" BDT");
                    System.out.println();
                    listOfDellModel();
                case 3:
                    showLaptopFeatures(acerLaptops[2].getModel(),acerLaptops[2].getFeatures());
                    System.out.println("\t|^|Original Price: " + acerLaptops[2].getOriginalPrice()+" BDT");
                    System.out.println("\t|^|Current Discount: " + acerLaptops[2].getCurrentDiscount()+"%");
                    System.out.println("\t|^|Discount Price: " + acerLaptops[2].calculation(acerLaptops[2].getOriginalPrice(), acerLaptops[2].getCurrentDiscount())+" BDT");
                    System.out.println();
                    listOfDellModel();

               case 4:
                   showLaptopFeatures(acerLaptops[3].getModel(),acerLaptops[3].getFeatures());
                   System.out.println("\t|^|Original Price: " + acerLaptops[3].getOriginalPrice()+" BDT");
                   System.out.println("\t|^|Current Discount: " + acerLaptops[3].getCurrentDiscount()+"%");
                   System.out.println("\t|^|Discount Price: " + acerLaptops[3].calculation(acerLaptops[3].getOriginalPrice(), acerLaptops[3].getCurrentDiscount())+" BDT");
                   System.out.println();
                   listOfDellModel();

               case 5:
                   listOfLaptop();

                default:
                    System.out.println();
                    System.out.println("\tSorry Sir, You Prass Invalid Choice! Try Again");
                    listOfDellModel();

            }
        }catch(Exception e){
            System.out.println(e);
        }
        
        
    }
    
    
    public static void listOfAcerModel(){
        
        Laptop[] acerLaptops = ACER.getAcerLaptops();
        
        System.out.println();
        System.out.println("\t=*= Available laptops of Acer: ");
        
        System.out.println("\t1)" +acerLaptops[0].getModel()+
                           "\n\t2)"+ acerLaptops[1].getModel()+
                           "\n\t3)"+ acerLaptops[2].getModel()+
                           "\n\t4)"+ acerLaptops[3].getModel()+
                           "\n\t5) Previous Manu");
        
        System.out.print("\t=*= Enter your choice model: ");
        
        
        try{
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    showLaptopFeatures(acerLaptops[0].getModel(),acerLaptops[0].getFeatures());
                    System.out.println("\t|^|Original Price: " + acerLaptops[0].getOriginalPrice()+" BDT");
                    System.out.println("\t|^|Current Discount: " + acerLaptops[0].getCurrentDiscount()+"%");
                    System.out.println("\t|^|Discount Price: " + acerLaptops[0].calculation(acerLaptops[0].getOriginalPrice(), acerLaptops[0].getCurrentDiscount())+" BDT");
                    System.out.println();
                    listOfAcerModel();
                case 2:
                    showLaptopFeatures(acerLaptops[1].getModel(),acerLaptops[1].getFeatures());
                    System.out.println("\t|^|Original Price: " + acerLaptops[1].getOriginalPrice()+" BDT");
                    System.out.println("\t|^|Current Discount: " + acerLaptops[1].getCurrentDiscount()+"%");
                    System.out.println("\t|^|Discount Price: " + acerLaptops[1].calculation(acerLaptops[1].getOriginalPrice(), acerLaptops[1].getCurrentDiscount())+" BDT");
                    System.out.println();
                    listOfAcerModel();
                case 3:
                    showLaptopFeatures(acerLaptops[2].getModel(),acerLaptops[2].getFeatures());
                    System.out.println("\t|^|Original Price: " + acerLaptops[2].getOriginalPrice()+" BDT");
                    System.out.println("\t|^|Current Discount: " + acerLaptops[2].getCurrentDiscount()+"%");
                    System.out.println("\t|^|Discount Price: " + acerLaptops[2].calculation(acerLaptops[2].getOriginalPrice(), acerLaptops[2].getCurrentDiscount())+" BDT");
                    System.out.println();
                    listOfAcerModel();

               case 4:
                   showLaptopFeatures(acerLaptops[3].getModel(),acerLaptops[3].getFeatures());
                   System.out.println("\t|^|Original Price: " + acerLaptops[3].getOriginalPrice()+" BDT");
                   System.out.println("\t|^|Current Discount: " + acerLaptops[3].getCurrentDiscount()+"%");
                   System.out.println("\t|^|Discount Price: " + acerLaptops[3].calculation(acerLaptops[3].getOriginalPrice(), acerLaptops[3].getCurrentDiscount())+" BDT");
                   System.out.println();
                   listOfAcerModel();

               case 5:
                   listOfLaptop();

                default:
                    System.out.println();
                    System.out.println("\tSorry Sir, You Prass Invalid Choice! Try Again");
                    listOfAcerModel();

            }
        }catch(Exception e){
            System.out.println(e);
        }
        
        
    }
    
    
    public static void listOfLenovoModel(){
        
        Desktop[] appleDesktops = Lenovo.getLenevoDesktops();
        
        System.out.println();
        System.out.println("\t=*= Available laptops of Lenovo: ");
        
        System.out.println("\t1)" +appleDesktops[0].getModel()+
                           "\n\t2)"+ appleDesktops[1].getModel()+
                           "\n\t3)"+ appleDesktops[2].getModel()+
                           "\n\t4)"+ appleDesktops[3].getModel()+
                           "\n\t5) Previous Manu");
        
        System.out.print("\t=*= Enter your choice model: ");
        
        
        try{
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    showLaptopFeatures(appleDesktops[0].getModel(),appleDesktops[0].getFeatures());
                    System.out.println("\t|^|Original Price: " + appleDesktops[0].getOriginalPrice()+" BDT");
                    System.out.println("\t|^|Current Discount: " + appleDesktops[0].getCurrentDiscount()+"%");
                    System.out.println("\t|^|Discount Price: " + appleDesktops[0].calculation(appleDesktops[0].getOriginalPrice(), appleDesktops[0].getCurrentDiscount())+" BDT");
                    System.out.println();
                    listOfLenovoModel();
                case 2:
                    showLaptopFeatures(appleDesktops[1].getModel(),appleDesktops[1].getFeatures());
                    System.out.println("\t|^|Original Price: " + appleDesktops[1].getOriginalPrice()+" BDT");
                    System.out.println("\t|^|Current Discount: " + appleDesktops[1].getCurrentDiscount()+"%");
                    System.out.println("\t|^|Discount Price: " + appleDesktops[1].calculation(appleDesktops[1].getOriginalPrice(), appleDesktops[1].getCurrentDiscount())+" BDT");
                    System.out.println();
                    listOfLenovoModel();
                case 3:
                    showLaptopFeatures(appleDesktops[2].getModel(),appleDesktops[2].getFeatures());
                    System.out.println("\t|^|Original Price: " + appleDesktops[2].getOriginalPrice()+" BDT");
                    System.out.println("\t|^|Current Discount: " + appleDesktops[2].getCurrentDiscount()+"%");
                    System.out.println("\t|^|Discount Price: " + appleDesktops[2].calculation(appleDesktops[2].getOriginalPrice(), appleDesktops[2].getCurrentDiscount())+" BDT");
                    System.out.println();
                    listOfLenovoModel();

               case 4:
                   showLaptopFeatures(appleDesktops[3].getModel(),appleDesktops[3].getFeatures());
                   System.out.println("\t|^|Original Price: " + appleDesktops[3].getOriginalPrice()+" BDT");
                   System.out.println("\t|^|Current Discount: " + appleDesktops[3].getCurrentDiscount()+"%");
                   System.out.println("\t|^|Discount Price: " + appleDesktops[3].calculation(appleDesktops[3].getOriginalPrice(), appleDesktops[3].getCurrentDiscount())+" BDT");
                   System.out.println();
                   listOfLenovoModel();

               case 5:
                   listOfDesktop();

                default:
                    System.out.println();
                    System.out.println("\tSorry Sir, You Prass Invalid Choice! Try Again");
                    listOfLenovoModel();

            }
        }catch(Exception e){
            System.out.println(e);
        }

        
    }
    
    
    public static void listOfIntelModel(){
        
        Desktop[] appleDesktops = Intel.getIntelDesktops();
        
        System.out.println();
        System.out.println("\t=*= Available laptops of Intel: ");
        
        System.out.println("\t1)" +appleDesktops[0].getModel()+
                           "\n\t2)"+ appleDesktops[1].getModel()+
                           "\n\t3)"+ appleDesktops[2].getModel()+
                           "\n\t4)"+ appleDesktops[3].getModel()+
                           "\n\t5) Previous Manu");
        
        System.out.print("\t=*= Enter your choice model: ");
        
        
        try{
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    showLaptopFeatures(appleDesktops[0].getModel(),appleDesktops[0].getFeatures());
                    System.out.println("\t|^|Original Price: " + appleDesktops[0].getOriginalPrice()+" BDT");
                    System.out.println("\t|^|Current Discount: " + appleDesktops[0].getCurrentDiscount()+"%");
                    System.out.println("\t|^|Discount Price: " + appleDesktops[0].calculation(appleDesktops[0].getOriginalPrice(), appleDesktops[0].getCurrentDiscount())+" BDT");
                    System.out.println();
                    listOfIntelModel();
                case 2:
                    showLaptopFeatures(appleDesktops[1].getModel(),appleDesktops[1].getFeatures());
                    System.out.println("\t|^|Original Price: " + appleDesktops[1].getOriginalPrice()+" BDT");
                    System.out.println("\t|^|Current Discount: " + appleDesktops[1].getCurrentDiscount()+"%");
                    System.out.println("\t|^|Discount Price: " + appleDesktops[1].calculation(appleDesktops[1].getOriginalPrice(), appleDesktops[1].getCurrentDiscount())+" BDT");
                    System.out.println();
                    listOfIntelModel();
                case 3:
                    showLaptopFeatures(appleDesktops[2].getModel(),appleDesktops[2].getFeatures());
                    System.out.println("\t|^|Original Price: " + appleDesktops[2].getOriginalPrice()+" BDT");
                    System.out.println("\t|^|Current Discount: " + appleDesktops[2].getCurrentDiscount()+"%");
                    System.out.println("\t|^|Discount Price: " + appleDesktops[2].calculation(appleDesktops[2].getOriginalPrice(), appleDesktops[2].getCurrentDiscount())+" BDT");
                    System.out.println();
                    listOfIntelModel();

               case 4:
                   showLaptopFeatures(appleDesktops[3].getModel(),appleDesktops[3].getFeatures());
                   System.out.println("\t|^|Original Price: " + appleDesktops[3].getOriginalPrice()+" BDT");
                   System.out.println("\t|^|Current Discount: " + appleDesktops[3].getCurrentDiscount()+"%");
                   System.out.println("\t|^|Discount Price: " + appleDesktops[3].calculation(appleDesktops[3].getOriginalPrice(), appleDesktops[3].getCurrentDiscount())+" BDT");
                   System.out.println();
                   listOfIntelModel();

               case 5:
                   listOfDesktop();

                default:
                    System.out.println();
                    System.out.println("\tSorry Sir, You Prass Invalid Choice! Try Again");
                    listOfIntelModel();

            }
        }catch(Exception e){
            System.out.println(e);
        }
        
        
    }
    
    
    public static void listOfToshibaModel(){
        
        Desktop[] appleDesktops = Toshiba.getToshibaDesktops();
        
        System.out.println();
        System.out.println("\t=*= Available laptops of Toshiba: ");
        
        System.out.println("\t1)" +appleDesktops[0].getModel()+
                           "\n\t2)"+ appleDesktops[1].getModel()+
                           "\n\t3)"+ appleDesktops[2].getModel()+
                           "\n\t4)"+ appleDesktops[3].getModel()+
                           "\n\t5) Previous Manu");
        
        System.out.print("\t=*= Enter your choice model: ");
        
        
        try{
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    showLaptopFeatures(appleDesktops[0].getModel(),appleDesktops[0].getFeatures());
                    System.out.println("\t|^|Original Price: " + appleDesktops[0].getOriginalPrice()+" BDT");
                    System.out.println("\t|^|Current Discount: " + appleDesktops[0].getCurrentDiscount()+"%");
                    System.out.println("\t|^|Discount Price: " + appleDesktops[0].calculation(appleDesktops[0].getOriginalPrice(), appleDesktops[0].getCurrentDiscount())+" BDT");
                    System.out.println();
                    listOfToshibaModel();
                case 2:
                    showLaptopFeatures(appleDesktops[1].getModel(),appleDesktops[1].getFeatures());
                    System.out.println("\t|^|Original Price: " + appleDesktops[1].getOriginalPrice()+" BDT");
                    System.out.println("\t|^|Current Discount: " + appleDesktops[1].getCurrentDiscount()+"%");
                    System.out.println("\t|^|Discount Price: " + appleDesktops[1].calculation(appleDesktops[1].getOriginalPrice(), appleDesktops[1].getCurrentDiscount())+" BDT");
                    System.out.println();
                    listOfToshibaModel();
                case 3:
                    showLaptopFeatures(appleDesktops[2].getModel(),appleDesktops[2].getFeatures());
                    System.out.println("\t|^|Original Price: " + appleDesktops[2].getOriginalPrice()+" BDT");
                    System.out.println("\t|^|Current Discount: " + appleDesktops[2].getCurrentDiscount()+"%");
                    System.out.println("\t|^|Discount Price: " + appleDesktops[2].calculation(appleDesktops[2].getOriginalPrice(), appleDesktops[2].getCurrentDiscount())+" BDT");
                    System.out.println();
                    listOfToshibaModel();

               case 4:
                   showLaptopFeatures(appleDesktops[3].getModel(),appleDesktops[3].getFeatures());
                   System.out.println("\t|^|Original Price: " + appleDesktops[3].getOriginalPrice()+" BDT");
                   System.out.println("\t|^|Current Discount: " + appleDesktops[3].getCurrentDiscount()+"%");
                   System.out.println("\t|^|Discount Price: " + appleDesktops[3].calculation(appleDesktops[3].getOriginalPrice(), appleDesktops[3].getCurrentDiscount())+" BDT");
                   System.out.println();
                   listOfToshibaModel();

               case 5:
                   listOfDesktop();

                default:
                    System.out.println();
                    System.out.println("\tSorry Sir, You Prass Invalid Choice! Try Again");
                    listOfToshibaModel();

            }
        }catch(Exception e){
            System.out.println(e);
        }
        
        
    }
    
    
    public static void listOfAppleModel(){
        
        Desktop[] appleDesktops = Apple.getAppleDesktops();
        
        System.out.println();
        System.out.println("\t=*= Available laptops of Apple: ");
        
        System.out.println("\t1)" +appleDesktops[0].getModel()+
                           "\n\t2)"+ appleDesktops[1].getModel()+
                           "\n\t3)"+ appleDesktops[2].getModel()+
                           "\n\t4)"+ appleDesktops[3].getModel()+
                           "\n\t5) Previous Manu");
        
        System.out.print("\t=*= Enter your choice model: ");
        
        
        try{
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    showLaptopFeatures(appleDesktops[0].getModel(),appleDesktops[0].getFeatures());
                    System.out.println("\t|^|Original Price: " + appleDesktops[0].getOriginalPrice()+" BDT");
                    System.out.println("\t|^|Current Discount: " + appleDesktops[0].getCurrentDiscount()+"%");
                    System.out.println("\t|^|Discount Price: " + appleDesktops[0].calculation(appleDesktops[0].getOriginalPrice(), appleDesktops[0].getCurrentDiscount())+" BDT");
                    System.out.println();
                    listOfAppleModel();
                case 2:
                    showLaptopFeatures(appleDesktops[1].getModel(),appleDesktops[1].getFeatures());
                    System.out.println("\t|^|Original Price: " + appleDesktops[1].getOriginalPrice()+" BDT");
                    System.out.println("\t|^|Current Discount: " + appleDesktops[1].getCurrentDiscount()+"%");
                    System.out.println("\t|^|Discount Price: " + appleDesktops[1].calculation(appleDesktops[1].getOriginalPrice(), appleDesktops[1].getCurrentDiscount())+" BDT");
                    System.out.println();
                    listOfAppleModel();
                case 3:
                    showLaptopFeatures(appleDesktops[2].getModel(),appleDesktops[2].getFeatures());
                    System.out.println("\t|^|Original Price: " + appleDesktops[2].getOriginalPrice()+" BDT");
                    System.out.println("\t|^|Current Discount: " + appleDesktops[2].getCurrentDiscount()+"%");
                    System.out.println("\t|^|Discount Price: " + appleDesktops[2].calculation(appleDesktops[2].getOriginalPrice(), appleDesktops[2].getCurrentDiscount())+" BDT");
                    System.out.println();
                    listOfAppleModel();

               case 4:
                   showLaptopFeatures(appleDesktops[3].getModel(),appleDesktops[3].getFeatures());
                   System.out.println("\t|^|Original Price: " + appleDesktops[3].getOriginalPrice()+" BDT");
                   System.out.println("\t|^|Current Discount: " + appleDesktops[3].getCurrentDiscount()+"%");
                   System.out.println("\t|^|Discount Price: " + appleDesktops[3].calculation(appleDesktops[3].getOriginalPrice(), appleDesktops[3].getCurrentDiscount())+" BDT");
                   System.out.println();
                   listOfAppleModel();

               case 5:
                   listOfDesktop();

               default:
                    System.out.println();
                    System.out.println("\tSorry Sir, You Prass Invalid Choice! Try Again");
                    listOfAppleModel();

            }
        }catch(Exception e){
            System.out.println(e);
        }
        
        
    }

    public static void showLaptopFeatures(String model, String features){
        System.out.println();
        System.out.println("\tFeatures of "+model);
        System.out.println("\t=============================");
        System.out.println(features);
    }
    
}
