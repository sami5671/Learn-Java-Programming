

public class Asus extends Laptop {

    public static Laptop[] getAsusLaptops(){
        
        Laptop[] asusLaptop = new Laptop[10];
        
        asusLaptop[0] = new Laptop();
        asusLaptop[0].setBrandName("ASUS");
        asusLaptop[0].setModel("VivoBook S S510U");
        asusLaptop[0].setFeatures("\tWindows 10 Pro 64\n" +
                                 "\tAMD Ryzen™ 3 APU Processor\n" +
                                 "\t8 GB memory; 256 GB NVMe storage\n" +
                                 "\t13.3\" FHD (1920x1080) touch display\n" +
                                 "\tAMD Radeon™ UMA Graphics\n");
        asusLaptop[0].setOriginalPrice(76500);
        asusLaptop[0].setCurrentDiscount(5);
        
        
        asusLaptop[1] = new Laptop();
        asusLaptop[1].setBrandName("ASUS");
        asusLaptop[1].setModel("E203MAH N500 Pentium");
        asusLaptop[1].setFeatures("\tWindows 8 Pro 64\n" +
                                 "\tAMD Ryzen™ 3 APU Processor\n" +
                                 "\t8 GB memory; 256 GB NVMe storage\n" +
                                 "\t13.3\" FHD (1920x1080) touch display\n" +
                                 "\tAMD Radeon™ UMA Graphics\n");
        
        asusLaptop[1].setOriginalPrice(71500);
        asusLaptop[1].setCurrentDiscount(10);
        
        
        asusLaptop[2] = new Laptop();
        asusLaptop[2].setBrandName("ASUS");
        asusLaptop[2].setModel("VivoBook X402YA AMD");
        asusLaptop[2].setFeatures("\tWindows 8 Pro 64\n" +
                                 "\tAMD Ryzen™ 3 APU Processor\n" +
                                 "\t8 GB memory; 256 GB NVMe storage\n" +
                                 "\t13.3\" FHD (1920x1080) touch display\n" +
                                 "\tAMD Radeon™ UMA Graphics\n");
        
        asusLaptop[2].setOriginalPrice(90900);
        asusLaptop[2].setCurrentDiscount(15);
        
        
        asusLaptop[3] = new Laptop();
        asusLaptop[3].setBrandName("ASUS");
        asusLaptop[3].setModel("VivoBook 15 X512UA");
        asusLaptop[3].setFeatures("\tWindows 8 Pro 64\n" +
                                 "\tAMD Ryzen™ 3 APU Processor\n" +
                                 "\t8 GB memory; 256 GB NVMe storage\n" +
                                 "\t13.3\" FHD (1920x1080) touch display\n" +
                                 "\tAMD Radeon™ UMA Graphics\n");
        
        asusLaptop[3].setOriginalPrice(74600);
        asusLaptop[3].setCurrentDiscount(10);
        
        return asusLaptop;
            
        }
}
