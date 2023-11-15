
public class Intel {
    
     public static Desktop[] getIntelDesktops(){
        
        Desktop[] intelDesktop = new Desktop[10];
        
        intelDesktop[0] = new Desktop();
        intelDesktop[0].setBrandName("Intel");
        intelDesktop[0].setModel("E203MAH N500 Pentium");
        intelDesktop[0].setFeatures("\tWindows 10 Pro 64\n" +
                                 "\tAMD Ryzen™ 3 APU Processor\n" +
                                 "\t8 GB memory; 256 GB NVMe storage\n" +
                                 "\t13.3\" FHD (1920x1080) touch display\n" +
                                 "\tAMD Radeon™ UMA Graphics\n");
        intelDesktop[0].setOriginalPrice(50599);
        intelDesktop[0].setCurrentDiscount(5);
        
        
        intelDesktop[1] = new Desktop();
        intelDesktop[1].setBrandName("Intel");
        intelDesktop[1].setModel("E203MAH N500 Pentium");
        intelDesktop[1].setFeatures("\tWindows 8 Pro 64\n" +
                                 "\tAMD Ryzen™ 3 APU Processor\n" +
                                 "\t8 GB memory; 256 GB NVMe storage\n" +
                                 "\t13.3\" FHD (1920x1080) touch display\n" +
                                 "\tAMD Radeon™ UMA Graphics\n");
        
        intelDesktop[1].setOriginalPrice(70599);
        intelDesktop[1].setCurrentDiscount(10);
        
        
        intelDesktop[2] = new Desktop();
        intelDesktop[2].setBrandName("Intel");
        intelDesktop[2].setModel("ENVY Laptop - 17AMD");
        intelDesktop[2].setFeatures("\tWindows 8 Pro 64\n" +
                                 "\tAMD Ryzen™ 3 APU Processor\n" +
                                 "\t8 GB memory; 256 GB NVMe storage\n" +
                                 "\t13.3\" FHD (1920x1080) touch display\n" +
                                 "\tAMD Radeon™ UMA Graphics\n");
        
        intelDesktop[2].setOriginalPrice(90999);
        intelDesktop[2].setCurrentDiscount(10);
        
        
        intelDesktop[3] = new Desktop();
        intelDesktop[3].setBrandName("Intel");
        intelDesktop[3].setModel("ENVY Laptop 15 X512UA");
        intelDesktop[3].setFeatures("\tWindows 8 Pro 64\n" +
                                 "\tAMD Ryzen™ 3 APU Processor\n" +
                                 "\t8 GB memory; 256 GB NVMe storage\n" +
                                 "\t13.3\" FHD (1920x1080) touch display\n" +
                                 "\tAMD Radeon™ UMA Graphics\n");
        
        intelDesktop[3].setOriginalPrice(79699);
        intelDesktop[3].setCurrentDiscount(10);
        
        return intelDesktop;
            
        }
}
