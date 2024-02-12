package cafeteria;

class Canela extends DecoradorBebida {
    public Canela(Bebida bebida) {
        super(bebida);
    }

    @Override
    public double calculaCusto() {
        return super.calculaCusto() + 0.3;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", com Canela";
    }
}
