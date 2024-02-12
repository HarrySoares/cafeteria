/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cafeteria;

public class Cafeteria {
    public static void main(String[] args) {
        // Preparando um Espresso com Leite e Canela
        Bebida bebida1 = new Canela(new Leite(new Espresso()));
        System.out.println("Bebida 1: " + bebida1.getDescricao() + " - Custo: R$ " + bebida1.calculaCusto());

        // Preparando um Decaf com Chocolate
        Bebida bebida2 = new Chocolate(new Decaf());
        System.out.println("Bebida 2: " + bebida2.getDescricao() + " - Custo: R$ " + bebida2.calculaCusto());
    }
}