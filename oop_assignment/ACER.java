
public class ACER {
    
        public static Laptop[] getAcerLaptops(){
        
        Laptop[] acerLaptop = new Laptop[10];
        
        acerLaptop[0] = new Laptop();
        acerLaptop[0].setBrandName("ACER");
        acerLaptop[0].setModel("470 G7 Notebook PC");
        acerLaptop[0].setFeatures("\tWindows 10 Pro 64\n" +
                                 "\tAMD Ryzen™ 3 APU Processor\n" +
                                 "\t8 GB memory; 256 GB NVMe storage\n" +
                                 "\t13.3\" FHD (1920x1080) touch display\n" +
                                 "\tAMD Radeon™ UMA Graphics\n");
        acerLaptop[0].setOriginalPrice(80500);
        acerLaptop[0].setCurrentDiscount(7);
        
        
        acerLaptop[1] = new Laptop();
        acerLaptop[1].setBrandName("ACER");
        acerLaptop[1].setModel("E203MAH N500 Pentium");
        acerLaptop[1].setFeatures("\tWindows 8 Pro 64\n" +
                                 "\tAMD Ryzen™ 3 APU Processor\n" +
                                 "\t8 GB memory; 256 GB NVMe storage\n" +
                                 "\t13.3\" FHD (1920x1080) touch display\n" +
                                 "\tAMD Radeon™ UMA Graphics\n");
        
        acerLaptop[1].setOriginalPrice(85500);
        acerLaptop[1].setCurrentDiscount(10);
        
        
        acerLaptop[2] = new Laptop();
        acerLaptop[2].setBrandName("ACER");
        acerLaptop[2].setModel("ProBook x360435 Notebook");
        acerLaptop[2].setFeatures("\tWindows 8 Pro 64\n" +
                                 "\tAMD Ryzen™ 3 APU Processor\n" +
                                 "\t8 GB memory; 256 GB NVMe storage\n" +
                                 "\t13.3\" FHD (1920x1080) touch display\n" +
                                 "\tAMD Radeon™ UMA Graphics\n");
        
        acerLaptop[2].setOriginalPrice(90900);
        acerLaptop[2].setCurrentDiscount(5);
        
        
        acerLaptop[3] = new Laptop();
        acerLaptop[3].setBrandName("ACER");
        acerLaptop[3].setModel("ACER ENVY Laptop - 17t-cg");
        acerLaptop[3].setFeatures("\tWindows 8 Pro 64\n" +
                                 "\tAMD Ryzen™ 3 APU Processor\n" +
                                 "\t8 GB memory; 256 GB NVMe storage\n" +
                                 "\t13.3\" FHD (1920x1080) touch display\n" +
                                 "\tAMD Radeon™ UMA Graphics\n");
        
        acerLaptop[3].setOriginalPrice(45600);
        acerLaptop[3].setCurrentDiscount(5);
        
        return acerLaptop;
            
        }
}
