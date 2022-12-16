package classes;

public final class Carga extends Veiculo {
    private int cargaMax;
    private int tara;

    public float calcVel(float velocMax) {
        velocMax*=100000f;
        return velocMax;
    }

    public Carga() {
        super();
    }

    public Carga(int cargaMax, int tara) {
        this.cargaMax = cargaMax;
        this.tara = tara;
    }


    public int getCargaMax() {
        return cargaMax;
    }

    public final void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    public int getTara() {
        return tara;
    }

    public final void setTara(int tara) {
        this.tara = tara;
    }
}
