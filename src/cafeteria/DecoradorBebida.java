package cafeteria;

abstract class DecoradorBebida implements Bebida {
    protected Bebida bebida;

    public DecoradorBebida(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public double calculaCusto() {
        return bebida.calculaCusto();
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao();
    }
}