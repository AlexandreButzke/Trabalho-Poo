public class Ganho {
    private String tipoGanho;
    private String dataGanho;
    private double valorGanho;

    public Ganho(String tipoGanho, String dataGanho, double valorGanho){
        this.tipoGanho = tipoGanho;
        this.dataGanho = dataGanho;
        this.valorGanho= valorGanho;
    }
    public String getTipo() {
        return tipoGanho;
    }

    public String getData() {
        return dataGanho;
    }


    public double getValor() {
        return valorGanho;
    }

}