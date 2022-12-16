package classes;

public final class Passeio extends Veiculo {
    private int qtdePassageiros;

    public final float calcVel(float velocMax) {
        velocMax*=1000f;
        return velocMax;
    }
    public Passeio() {
        super();
    }

    public Passeio(int qtdePassageiros) {
        this.qtdePassageiros = qtdePassageiros;
    }

    public int getQtdePassageiros() {
        return qtdePassageiros;
    }

    public final void setQtdePassageiros(int qtdePassageiros) {
        this.qtdePassageiros = qtdePassageiros;
    }

}