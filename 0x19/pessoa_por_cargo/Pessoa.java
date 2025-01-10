import java.util.*;
import java.util.stream.Collectors;

class Pessoa {
    private int codigo;
    private String nome;
    private String cargo;
    private int idade;
    private double salario;

    public Pessoa(int codigo, String nome, String cargo, int idade, double salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "[" + codigo + "] " + nome + " " + cargo + " " + idade + " R$ " + String.format("%.2f", salario);
    }

    public String getCargo() {
        return cargo;
    }
}
