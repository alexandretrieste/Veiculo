package classes;

public class Motor {
    private int qtdePist;
    private int potencia;

    public Motor(int qtdePist, int potencia) {
        this.qtdePist = qtdePist;
        this.potencia = potencia;
    }

    public int getQtdePist() {
        return qtdePist;
    }

    public final void setQtdePist(int qtdePist) {
        this.qtdePist = qtdePist;
    }

    public int getPotencia() {
        return potencia;
    }

    public final void setPotencia(int potencia) {
        this.potencia = potencia;
    }
}