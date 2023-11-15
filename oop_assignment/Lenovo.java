

public class Lenovo {
    
    public static Desktop[] getLenevoDesktops(){
        
        Desktop[] lenovoDesktop = new Desktop[10];
        
        lenovoDesktop[0] = new Desktop();
        lenovoDesktop[0].setBrandName("Lenovo");
        lenovoDesktop[0].setModel("E203MAH N500 Pentium");
        lenovoDesktop[0].setFeatures("\tWindows 10 Pro 64\n" +
                                 "\tAMD Ryzen™ 3 APU Processor\n" +
                                 "\t32 GB memory; 256 GB NVMe storage\n" +
                                 "\t13.3\" FHD (1920x1080) touch display\n" +
                                 "\tAMD Radeon™ UMA Graphics\n");
        lenovoDesktop[0].setOriginalPrice(76500);
        lenovoDesktop[0].setCurrentDiscount(5);
        
        
        lenovoDesktop[1] = new Desktop();
        lenovoDesktop[1].setBrandName("Lenovo");
        lenovoDesktop[1].setModel("E203MAH N500 Pentium");
        lenovoDesktop[1].setFeatures("\tWindows 8 Pro 64\n" +
                                 "\tAMD Ryzen™ 3 APU Processor\n" +
                                 "\t8 GB memory; 256 GB NVMe storage\n" +
                                 "\t13.3\" FHD (1920x1080) touch display\n" +
                                 "\tAMD Radeon™ UMA Graphics\n");
        
        lenovoDesktop[1].setOriginalPrice(71500);
        lenovoDesktop[1].setCurrentDiscount(10);
        
        
        lenovoDesktop[2] = new Desktop();
        lenovoDesktop[2].setBrandName("Lenovo");
        lenovoDesktop[2].setModel("ENVY Laptop - 17AMD");
        lenovoDesktop[2].setFeatures("\tWindows 8 Pro 64\n" +
                                 "\tAMD Ryzen™ 3 APU Processor\n" +
                                 "\t8 GB memory; 256 GB NVMe storage\n" +
                                 "\t13.3\" FHD (1920x1080) touch display\n" +
                                 "\tAMD Radeon™ UMA Graphics\n");
        
        lenovoDesktop[2].setOriginalPrice(90900);
        lenovoDesktop[2].setCurrentDiscount(15);
        
        
        lenovoDesktop[3] = new Desktop();
        lenovoDesktop[3].setBrandName("Lenovo");
        lenovoDesktop[3].setModel("ENVY Laptop 15 X512UA");
        lenovoDesktop[3].setFeatures("\tWindows 8 Pro 64\n" +
                                 "\tAMD Ryzen™ 3 APU Processor\n" +
                                 "\t8 GB memory; 256 GB NVMe storage\n" +
                                 "\t13.3\" FHD (1920x1080) touch display\n" +
                                 "\tAMD Radeon™ UMA Graphics\n");
        
        lenovoDesktop[3].setOriginalPrice(74600);
        lenovoDesktop[3].setCurrentDiscount(10);
        
        return lenovoDesktop;
            
        }
    
}
