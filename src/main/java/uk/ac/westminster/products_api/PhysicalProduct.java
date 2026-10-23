package uk.ac.westminster.products_api;

//A PhysicalProduct IS-A Product because
public class PhysicalProduct extends Product{
    double weightKg;
    String dimensions;

    public PhysicalProduct(){}

    public PhysicalProduct(Long id,String name,double price,double weightKg,String dimensions){
        super(id,name,price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }
}
