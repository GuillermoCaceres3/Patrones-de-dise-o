public class Cocina implements HamburguesaBuilder{
    private static Cocina instance;
    private Hamburguesa hamburguesa = new Hamburguesa();


    private Cocina() {
    }

    public static Cocina getInstance(){
        if (instance == null){
            instance = new Cocina();
        }
        return instance;
    }


    @Override
    public void buildTipoCarne(String tipoCarne) {
        hamburguesa.setTipoCarne(tipoCarne);
    }

    @Override
    public void buildCebolla(boolean cebolla) {
        hamburguesa.setCebolla(cebolla);
    }

    @Override
    public void buildLechuga(boolean lechuga) {
        hamburguesa.setLechuga(lechuga);
    }

    @Override
    public void buildTomate(boolean tomate) {
        hamburguesa.setTomate(tomate);
    }

    @Override
    public void buildQueso(boolean queso) {
        hamburguesa.setQueso(queso);
    }

    @Override
    public Hamburguesa build() {
        return hamburguesa;
    }




}
