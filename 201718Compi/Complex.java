public class Complex {

    private int real;
    private int imaginary;
    private String op = "";

    
    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;

    }

    public Complex(String val){
        if (val.contains("+")){
            String[] parts = val.split("+");

            if (parts.length == 2) {
                this.op = "+";
                this.real = Integer.parseInt(parts[0]);
                this.imaginary =Integer.parseInt(parts[1].substring(0, parts[1].length()-1));
            }
        } else if (val.contains("-")){
            String[] parts = val.split("-");

            if (parts.length == 2) {
                this.op = "-";
                this.real = Integer.parseInt(parts[0]);
                this.imaginary =Integer.parseInt(parts[1].substring(0, parts[1].length()-1));
            }
        } else {
            if (val.contains("i")) {
                this.imaginary = Integer.parseInt(val.substring(0, val.length()-1));
                this.real = 0;
            } else {
                this.imaginary = 0;
                this.real = Integer.parseInt(val);
            }
        }
        
        
    }

    public void setReal(String real) {
        this.real = Integer.parseInt(real);
    }

    public void setImaginary(String imaginary) {
        this.imaginary = Integer.parseInt(imaginary);
    }

    public void setOp(String op) {
        this.op = op;
    }

    @Override
    public String toString() {
        if(this.real == 0){
            if (this.imaginary == 1){
                return "i";
            }
            return "" + this.imaginary + "i";
        } else if (this.imaginary == 0){
            return "" + this.real;
        } else {
            if (this.imaginary == 1){
                return "" + this.real + " " + this.op + " i";
            }
            return "" + this.real + " " + this.op + " " + this.imaginary + "i";   
        }
    }

}