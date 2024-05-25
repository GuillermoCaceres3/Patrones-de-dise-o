import java.util.ArrayList;
import java.util.List;

public class SolventesIterator implements ResidentIterator{

    private int currentPosition = 0;
    private ResidentCollection collection;
    private List<Residente> solventes = new ArrayList<>();

    public SolventesIterator(ResidentCollection collection) {
        this.collection = collection;
    }

    private void initIterator(){
        if (this.solventes.size() == 0){
            this.solventes = collection.getDebtorsList();
        }
    }

    public Residente getNext(){
        if (hasMore()){
            Residente solvent = solventes.get(currentPosition);
            currentPosition++;
            return solvent;
        }
        else return null;
    }

    public boolean hasMore(){
        initIterator();
        return currentPosition < solventes.size();
    }

    public int getPosition(){
        return currentPosition;
    }

    public void reset(){
        currentPosition = 0;
    }


}
