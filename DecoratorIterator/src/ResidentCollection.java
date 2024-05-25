import java.util.ArrayList;
import java.util.List;

public class ResidentCollection implements IterableCollection{
    private List<Residente> residentes;

    public ResidentCollection(List<Residente> residentes) {
        this.residentes = residentes;
    }

    @Override
    public ResidentIterator createDebtorsIterator() {
            return new DebtorsIterator(this);
    }

    @Override
    public ResidentIterator createSolventsIterator() {
        return new SolventesIterator(this);
    }

    public List<Residente> getDebtorsList(){
        List<Residente> debtors = new ArrayList<>();
        for (Residente residente : this.residentes){
           if (residente.getSaldoDeuda() > 0){
               debtors.add(residente);
           }
        }
        return debtors;
    }

    public List<Residente> getSolventsList(){
        List<Residente> solvents = new ArrayList<>();
        for (Residente residente : this.residentes){
            if (residente.getSaldoDeuda() == 0){
                solvents.add(residente);
            }
        }
        return solvents;
    }
}
