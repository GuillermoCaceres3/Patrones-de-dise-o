public interface HamburguesaBuilder {
    void buildTipoCarne(String tipoCarne);
    void buildQueso(boolean queso);
    void buildLechuga(boolean lechuga);
    void buildCebolla(boolean cebolla);
    void buildTomate(boolean tomate);
    Hamburguesa build();

}
