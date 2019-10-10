interface Request {
    public void setReceivedData (double weight, double height, double width, double length, String originPostalCode, String destinationPostalCode);
    public boolean getReceivedData();
}

public class validateData implements Request{
    private double weight;
    private double height;
    private double width;
    private double length;
    private String originPostalCode;
    private String destinationPostalCode;
    private boolean validation;

    public void setReceivedData(double weight, double height, double width, double length, String originPostalCode, String destinationPostalCode) {
        if (weight > 0 && height > 0 && width > 0 && length > 0){
            if (originPostalCode.length() == 8 && destinationPostalCode.length() == 8 ) {
                this.validation = true;
            }
        } else {
            this.validation = false;
        }
    }

    public boolean getReceivedData() {
        return this.validation;
    }

    public static void main(String[] args){
        validateData validation = new validateData();
        validation.setReceivedData(2,1,10,10,Integer.toString(95600230), Integer.toString(95650124));
        System.out.println(validation.getReceivedData());
    }
}
