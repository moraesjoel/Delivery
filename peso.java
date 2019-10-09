interface PostRules {
    public void setFinalWeight(double regular, double cubic);
    public double getFinalWeight();
}

public class Package implements PostRules{
    private double FinalWeight;

    public void setFinalWeight(double regular, double cubic) {
        if (cubic <= 5.00) {
            this.FinalWeight = regular;
        } else {
            if (cubic > regular){
                this.FinalWeight = cubic;
            }
            else {
                this.FinalWeight = regular; 
            }
        }
    }

    public double getFinalWeight() {
        return this.FinalWeight;
    }

    public static void main(String[] args) {
        Package newPackage = new Package();
        newPackage.setFinalWeight(12.00, 4.00);
        System.out.println(newPackage.getFinalWeight());
    }
}       