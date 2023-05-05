public class Gasto {
    private String tg;
    private String dg;
    private double vg;
    private String fp;
    public Gasto(String  tg, String dg, double vg, String fp) {
        this.tg = tg;
        this.dg = dg;
        this.vg= vg;
        this.fp = fp;
    }
    public String  getTipo(){
        return tg;
    }
    public String getData() {
        return dg;
    }
    public double getValor() {
        return vg;
    }
    public String getFormaPag() {
        return fp;
    }
}