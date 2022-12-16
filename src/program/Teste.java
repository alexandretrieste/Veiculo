package program;

import classes.Carga;
import classes.Motor;
import classes.Passeio;
import classes.Veiculo;

public class Teste {
    public static void main(String[] args) {
        Veiculo veiculo = new Passeio(5);
        veiculo.calcVel(8f);
        veiculo.setCor("Branca");
        veiculo.setPlaca("ABG-7879");
        veiculo.setQtdeRodas(4);
        veiculo.setMarca("Ford");
        veiculo.setModelo("Ranger");
        veiculo.setMotor(new Motor(2,1));


        System.out.println("\n"+"Cor: "+ veiculo.getCor()+"\n"+"\n"+"Marca: "+veiculo.getMarca()+"\n"+"\n"+"Modelo: "+veiculo.getModelo()+"\n"+"\n"+"Placa: "+veiculo.getPlaca()+"\n"
                +"\n"+"qtde rodas: "+ veiculo.getQtdeRodas()+"\n"+"\n"+"Veloc. máxima: "+veiculo.getVelocMax()+"\n"+"\n"+"Autonomia: "+veiculo.getMotor().getQtdePist()+"\n"
                +"\n"+"Potência: "+veiculo.getMotor().getPotencia()+"\n");
    }
}
