public class Director {
    private HamburguesaBuilder builder;

    public Director(HamburguesaBuilder builder) {
        this.builder = builder;
    }

    public Hamburguesa construirHamburguesa(String tipoCarne,boolean cebolla,boolean lechuga,boolean tomate,boolean queso){
        builder.buildTipoCarne(tipoCarne);
        builder.buildCebolla(cebolla);
        builder.buildLechuga(lechuga);
        builder.buildQueso(queso);
        builder.buildTomate(tomate);
        return builder.build();
    }
}
