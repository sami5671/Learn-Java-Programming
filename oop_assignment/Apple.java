
public class Apple {
    
    public static Desktop[] getAppleDesktops(){
        
        Desktop[] appleDesktop = new Desktop[10];
        
        appleDesktop[0] = new Desktop();
        appleDesktop[0].setBrandName("Apple");
        appleDesktop[0].setModel("Apple iMac 21.5\" MNDY2");
        appleDesktop[0].setFeatures("\tWindows 10 Pro 64\n" +
                                 "\tAMD Ryzen™ 3 APU Processor\n" +
                                 "\t8 GB memory; 256 GB NVMe storage\n" +
                                 "\t13.3\" FHD (1920x1080) touch display\n" +
                                 "\tAMD Radeon™ UMA Graphics\n");
        appleDesktop[0].setOriginalPrice(176500);
        appleDesktop[0].setCurrentDiscount(5);
        
        
        appleDesktop[1] = new Desktop();
        appleDesktop[1].setBrandName("Apple");
        appleDesktop[1].setModel("Apple iMac 5K 27\" (MNED2)");
        appleDesktop[1].setFeatures("\tWindows 8 Pro 64\n" +
                                 "\tAMD Ryzen™ 3 APU Processor\n" +
                                 "\t8 GB memory; 256 GB NVMe storage\n" +
                                 "\t13.3\" FHD (1920x1080) touch display\n" +
                                 "\tAMD Radeon™ UMA Graphics\n");
        
        appleDesktop[1].setOriginalPrice(100500);
        appleDesktop[1].setCurrentDiscount(10);
        
        
        appleDesktop[2] = new Desktop();
        appleDesktop[2].setBrandName("Apple");
        appleDesktop[2].setModel("Apple iMac 21.5 Inch 4K Retina");
        appleDesktop[2].setFeatures("\tWindows 8 Pro 64\n" +
                                 "\tAMD Ryzen™ 3 APU Processor\n" +
                                 "\t8 GB memory; 256 GB NVMe storage\n" +
                                 "\t13.3\" FHD (1920x1080) touch display\n" +
                                 "\tAMD Radeon™ UMA Graphics\n");
        
        appleDesktop[2].setOriginalPrice(90900);
        appleDesktop[2].setCurrentDiscount(15);
        
        
        appleDesktop[3] = new Desktop();
        appleDesktop[3].setBrandName("Apple");
        appleDesktop[3].setModel("Apple iMac 4K 21\" X512UA");
        appleDesktop[3].setFeatures("\tWindows 8 Pro 64\n" +
                                 "\tAMD Ryzen™ 3 APU Processor\n" +
                                 "\t8 GB memory; 256 GB NVMe storage\n" +
                                 "\t13.3\" FHD (1920x1080) touch display\n" +
                                 "\tAMD Radeon™ UMA Graphics\n");
        
        appleDesktop[3].setOriginalPrice(150600);
        appleDesktop[3].setCurrentDiscount(10);
        
        return appleDesktop;
            
        }
}
