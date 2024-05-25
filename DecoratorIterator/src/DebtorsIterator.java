import java.util.ArrayList;
import java.util.List;

public class DebtorsIterator implements ResidentIterator{
    private ResidentCollection collection;
    private List<Residente> debtors = new ArrayList<>();

    private int currentPosition = 0;

    public DebtorsIterator(ResidentCollection collection) {
        this.collection = collection;
    }

    private void initIterator(){
        if (this.debtors.size() == 0){
            this.debtors = collection.getDebtorsList();
        }
    }

    public Residente getNext(){
        if (hasMore()){
            Residente debtor = debtors.get(currentPosition);
            currentPosition++;
            return debtor;
        }
        else return null;
    }

    public boolean hasMore(){
        initIterator();
        return currentPosition < debtors.size();
    }

    public int getPosition(){
        return currentPosition;
    }

    public void reset(){
        currentPosition = 0;
    }


}
