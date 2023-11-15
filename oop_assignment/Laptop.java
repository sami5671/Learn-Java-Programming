

public class Laptop extends Computer{
    
    private String model;
    private int originalPrice;
    private int currentDiscount;

    
    @Override
    int calculation(int originalPrice, int discount){
        try{
            int a = (originalPrice*discount)/100;
            int b = originalPrice - a ;
            return b;
        }catch(ArithmeticException e){
            System.out.println(e);
        }
        return 0;  
    }


    public int getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(int originalPrice) {
        this.originalPrice = originalPrice;
    }

    public int getCurrentDiscount() {
        return currentDiscount;
    }

    public void setCurrentDiscount(int currentDiscount) {
        this.currentDiscount = currentDiscount;
    }
    
    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    
}
