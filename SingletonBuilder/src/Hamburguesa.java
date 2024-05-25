public class Hamburguesa {
    private String tipoCarne;
    private boolean lechuga;
    private boolean tomate;
    private boolean queso;
    private boolean cebolla;


    public String getTipoCarne() {
        return tipoCarne;
    }

    public void setTipoCarne(String tipoCarne) {
        this.tipoCarne = tipoCarne;
    }

    public boolean isLechuga() {
        return lechuga;
    }

    public void setLechuga(boolean lechuga) {
        this.lechuga = lechuga;
    }

    public boolean isTomate() {
        return tomate;
    }

    public void setTomate(boolean tomate) {
        this.tomate = tomate;
    }

    public boolean isQueso() {
        return queso;
    }

    public void setQueso(boolean queso) {
        this.queso = queso;
    }

    public boolean isCebolla() {
        return cebolla;
    }

    public void setCebolla(boolean cebolla) {
        this.cebolla = cebolla;
    }

    public String YesNo(boolean n){
        if (n == true ){
            return "Si";
        }
        else{
            return "No";
        }
    }

    public String verHamburguesa(){
        return "Tipo de carne: " + tipoCarne + "\t" + "Contiene cebolla: " + YesNo(cebolla) + "\t" + "Contiene queso: " + YesNo(queso) + "\t" + "Contiene lechuga: " + YesNo(lechuga) + "\t" + "Contiene tomate: " + YesNo(tomate);
    }


}
