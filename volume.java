interface PostRules {
    public void setVolume(double height, double lenght, double width);
    public double getVolume();

    public void setCubicWeight();
    public double getCubicWeight();

}

public class Product implements PostRules {
    private double Volume;
    private double CubicWeight;
    private static final int Constant =6000;

    public void setVolume(double height, double lenght, double width){
        this.Volume = height *lenght *width;
    }
    public double getVolume(){
        return this.Volume;
    }

    public void setCubicWeight(){
        this.CubicWeight = Volume / Constant;
    }
    public double getCubicWeight(){
        return this.CubicWeight;
    }

    public static void main(String[] args) {
        Product newProduct = new Product();
        newProduct.setVolume(30, 30, 30);
        newProduct.setCubicWeight();

        System.out.println("Volume:");
        System.out.println(newProduct.getVolume());
        System.out.println("Peso Cubico:");
        System.out.println(newProduct.getCubicWeight());
    }
}
