public class Lampada {
    private double voltagem;
    private String temperatura;
    private String cor;
    private boolean estado;

    public double getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(double voltagem) {
        this.voltagem = voltagem;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void lampada(double voltagem, String temperatura, String cor, boolean estado){
        this.voltagem = voltagem;
        this.temperatura = temperatura;
        this.cor = cor;
        this.estado = estado;
    }
    void ligar(){
        estado = true;
    }

    void desligar(){
        estado = false;
    }

    void mostrarEstado(){
        if(estado){
            System.out.println("Lâmpada está ligada");
        }else{
            System.out.println("Lâmpada está desligada");
        }
    }

    void mudarEstado(){
        if(estado){
            desligar();
        }else{
            ligar();
        }
    }
}

