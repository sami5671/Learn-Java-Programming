
public class Toshiba {
    
    public static Desktop[] getToshibaDesktops(){
        
        Desktop[] toshibaDesktop = new Desktop[10];
        
        toshibaDesktop[0] = new Desktop();
        toshibaDesktop[0].setBrandName("Lenovo");
        toshibaDesktop[0].setModel("E203MAH N500 Pentium");
        toshibaDesktop[0].setFeatures("\tWindows 10 Pro 64\n" +
                                 "\tAMD Ryzen™ 3 APU Processor\n" +
                                 "\t8 GB memory; 256 GB NVMe storage\n" +
                                 "\t13.3\" FHD (1920x1080) touch display\n" +
                                 "\tAMD Radeon™ UMA Graphics\n");
        toshibaDesktop[0].setOriginalPrice(55500);
        toshibaDesktop[0].setCurrentDiscount(5);
        
        
        toshibaDesktop[1] = new Desktop();
        toshibaDesktop[1].setBrandName("Lenovo");
        toshibaDesktop[1].setModel("E203MAH N500 Pentium");
        toshibaDesktop[1].setFeatures("\tWindows 8 Pro 64\n" +
                                 "\tAMD Ryzen™ 3 APU Processor\n" +
                                 "\t8 GB memory; 256 GB NVMe storage\n" +
                                 "\t13.3\" FHD (1920x1080) touch display\n" +
                                 "\tAMD Radeon™ UMA Graphics\n");
        
        toshibaDesktop[1].setOriginalPrice(45500);
        toshibaDesktop[1].setCurrentDiscount(10);
        
        
        toshibaDesktop[2] = new Desktop();
        toshibaDesktop[2].setBrandName("Lenovo");
        toshibaDesktop[2].setModel("ENVY Laptop - 17AMD");
        toshibaDesktop[2].setFeatures("\tWindows 8 Pro 64\n" +
                                 "\tAMD Ryzen™ 3 APU Processor\n" +
                                 "\t8 GB memory; 256 GB NVMe storage\n" +
                                 "\t13.3\" FHD (1920x1080) touch display\n" +
                                 "\tAMD Radeon™ UMA Graphics\n");
        
        toshibaDesktop[2].setOriginalPrice(30900);
        toshibaDesktop[2].setCurrentDiscount(5);
        
        
        toshibaDesktop[3] = new Desktop();
        toshibaDesktop[3].setBrandName("Lenovo");
        toshibaDesktop[3].setModel("ENVY Laptop 15 X512UA");
        toshibaDesktop[3].setFeatures("\tWindows 8 Pro 64\n" +
                                 "\tAMD Ryzen™ 3 APU Processor\n" +
                                 "\t8 GB memory; 256 GB NVMe storage\n" +
                                 "\t13.3\" FHD (1920x1080) touch display\n" +
                                 "\tAMD Radeon™ UMA Graphics\n");
        
        toshibaDesktop[3].setOriginalPrice(35600);
        toshibaDesktop[3].setCurrentDiscount(5);
        
        return toshibaDesktop;
            
        }
}
