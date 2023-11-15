
public class HP extends Laptop {
    
        public static Laptop[] getHpLaptops(){
        
        Laptop[] hpLaptop = new Laptop[10];
        
        hpLaptop[0] = new Laptop();
        hpLaptop[0].setBrandName("HP");
        hpLaptop[0].setModel("470 G7 Notebook PC");
        hpLaptop[0].setFeatures("\tWindows 10 Pro 64\n" +
                                 "\tAMD Ryzen™ 3 APU Processor\n" +
                                 "\t8 GB memory; 256 GB NVMe storage\n" +
                                 "\t13.3\" FHD (1920x1080) touch display\n" +
                                 "\tAMD Radeon™ UMA Graphics\n");
        hpLaptop[0].setOriginalPrice(80500);
        hpLaptop[0].setCurrentDiscount(7);
        
        
        hpLaptop[1] = new Laptop();
        hpLaptop[1].setBrandName("HP");
        hpLaptop[1].setModel("E203MAH N500 Pentium");
        hpLaptop[1].setFeatures("\tWindows 8 Pro 64\n" +
                                 "\tAMD Ryzen™ 3 APU Processor\n" +
                                 "\t8 GB memory; 256 GB NVMe storage\n" +
                                 "\t13.3\" FHD (1920x1080) touch display\n" +
                                 "\tAMD Radeon™ UMA Graphics\n");
        
        hpLaptop[1].setOriginalPrice(85500);
        hpLaptop[1].setCurrentDiscount(10);
        
        
        hpLaptop[2] = new Laptop();
        hpLaptop[2].setBrandName("HP");
        hpLaptop[2].setModel("ProBook x360435 Notebook");
        hpLaptop[2].setFeatures("\tWindows 8 Pro 64\n" +
                                 "\tAMD Ryzen™ 3 APU Processor\n" +
                                 "\t8 GB memory; 256 GB NVMe storage\n" +
                                 "\t13.3\" FHD (1920x1080) touch display\n" +
                                 "\tAMD Radeon™ UMA Graphics\n");
        
        hpLaptop[2].setOriginalPrice(90900);
        hpLaptop[2].setCurrentDiscount(5);
        
        
        hpLaptop[3] = new Laptop();
        hpLaptop[3].setBrandName("HP");
        hpLaptop[3].setModel("HP ENVY Laptop - 17t-cg000");
        hpLaptop[3].setFeatures("\tWindows 8 Pro 64\n" +
                                 "\tAMD Ryzen™ 3 APU Processor\n" +
                                 "\t8 GB memory; 256 GB NVMe storage\n" +
                                 "\t13.3\" FHD (1920x1080) touch display\n" +
                                 "\tAMD Radeon™ UMA Graphics\n");
        
        hpLaptop[3].setOriginalPrice(45600);
        hpLaptop[3].setCurrentDiscount(5);
        
        return hpLaptop;
            
        }
}
