

public class Dell extends Laptop{
    
    public static Laptop[] getDellLaptops(){
        
        Laptop[] dellLaptop = new Laptop[10];
        
        dellLaptop[0] = new Laptop();
        dellLaptop[0].setBrandName("DELL");
        dellLaptop[0].setModel("470 G7 Notebook PC");
        dellLaptop[0].setFeatures("\tWindows 10 Pro 64\n" +
                                 "\tAMD Ryzen™ 3 APU Processor\n" +
                                 "\t8 GB memory; 256 GB NVMe storage\n" +
                                 "\t13.3\" FHD (1920x1080) touch display\n" +
                                 "\tAMD Radeon™ UMA Graphics\n");
        dellLaptop[0].setOriginalPrice(80500);
        dellLaptop[0].setCurrentDiscount(7);
        
        
        dellLaptop[1] = new Laptop();
        dellLaptop[1].setBrandName("DELL");
        dellLaptop[1].setModel("E203MAH N500 Pentium");
        dellLaptop[1].setFeatures("\tWindows 8 Pro 64\n" +
                                 "\tAMD Ryzen™ 3 APU Processor\n" +
                                 "\t8 GB memory; 256 GB NVMe storage\n" +
                                 "\t13.3\" FHD (1920x1080) touch display\n" +
                                 "\tAMD Radeon™ UMA Graphics\n");
        
        dellLaptop[1].setOriginalPrice(85500);
        dellLaptop[1].setCurrentDiscount(10);
        
        
        dellLaptop[2] = new Laptop();
        dellLaptop[2].setBrandName("DELL");
        dellLaptop[2].setModel("ProBook x360435 Notebook");
        dellLaptop[2].setFeatures("\tWindows 8 Pro 64\n" +
                                 "\tAMD Ryzen™ 3 APU Processor\n" +
                                 "\t8 GB memory; 256 GB NVMe storage\n" +
                                 "\t13.3\" FHD (1920x1080) touch display\n" +
                                 "\tAMD Radeon™ UMA Graphics\n");
        
        dellLaptop[2].setOriginalPrice(90900);
        dellLaptop[2].setCurrentDiscount(5);
        
        
        dellLaptop[3] = new Laptop();
        dellLaptop[3].setBrandName("DELL");
        dellLaptop[3].setModel("DELL ENVY Laptop - 17t-cg000");
        dellLaptop[3].setFeatures("\tWindows 8 Pro 64\n" +
                                 "\tAMD Ryzen™ 3 APU Processor\n" +
                                 "\t8 GB memory; 256 GB NVMe storage\n" +
                                 "\t13.3\" FHD (1920x1080) touch display\n" +
                                 "\tAMD Radeon™ UMA Graphics\n");
        
        dellLaptop[3].setOriginalPrice(45600);
        dellLaptop[3].setCurrentDiscount(5);
        
        return dellLaptop;
            
        }
}
