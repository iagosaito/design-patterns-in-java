package br.com.iagosaito.padroesdeprojeto.estruturais.adapter;

public class PatineteMotorizadoAdapter implements Bicicleta {

    private PatineteMotorizado patineteMotorizado;

    public PatineteMotorizadoAdapter() {
        this.patineteMotorizado = new PatineteMotorizado();
    }

    @Override
    public void pedalar() {
        patineteMotorizado.ligarMotor();
    }
}
