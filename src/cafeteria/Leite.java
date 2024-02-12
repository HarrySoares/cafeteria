package cafeteria;
class Leite extends DecoradorBebida {
    public Leite(Bebida bebida) {
        super(bebida);
    }

    @Override
    public double calculaCusto() {
        return super.calculaCusto() + 0.5;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", com Leite";
    }
}
