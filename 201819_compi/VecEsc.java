import java.util.ArrayList;

public class VecEsc {

    private ArrayList<Integer> vectors = new ArrayList<>();
    private double escalarVar;

    public VecEsc (ArrayList<Integer> vectors){
        this.vectors = vectors;
        this.escalarVar = 404;
    }

    public VecEsc (String vectors){
        this.vectors = new ArrayList<>();
        this.escalarVar = 404;
        String[] parts = vectors.substring(1, vectors.length()-1).split(",");
        for (String val : parts) {
            this.vectors.add(Integer.parseInt(val));
        }
    }

    public VecEsc (double escalarVar){
        this.escalarVar = escalarVar;
        this.vectors = new ArrayList<>();
    }

    public ArrayList<Integer> getVectors() {
        return vectors;
    }

    public double getEscalarVar() {
        return escalarVar;
    }

    public void ChangeSignaArray() {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < this.vectors.size(); i++) {
            temp.add(-1 * vectors.get(i));
        }
        this.vectors = temp;
    }

    public void ChangeSignaDouble() {
        this.escalarVar = -1*this.escalarVar;

    }

    @Override
    public String toString() {
        if (this.escalarVar != 404){
            return escalarVar + "";
        } else {
            return vectors + "";
        }
    }


}