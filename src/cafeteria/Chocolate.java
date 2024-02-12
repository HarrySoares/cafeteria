package cafeteria;

class Chocolate extends DecoradorBebida {
    public Chocolate(Bebida bebida) {
        super(bebida);
    }

    @Override
    public double calculaCusto() {
        return super.calculaCusto() + 0.7;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", com Chocolate";
    }
}
