package cafeteria;

class Decaf implements Bebida {
    @Override
    public double calculaCusto() {
        return 1.5;
    }

    @Override
    public String getDescricao() {
        return "Decaf";
    }
}