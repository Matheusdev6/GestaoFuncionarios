package ProjetosMatheus.Gestao;

import jakarta.persistence.*;

//Entity = classe -> entidade no DB
@Entity
@Table(name = "tb_cadastro")
public class FuncionarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // "INTEGER AUTOINCREMENT"
    private Long id;
    private String nome;
    private String email;
    private String cpf;
    private double salario;
    private int idade;
    public FuncionarioModel() {
    }
    public FuncionarioModel(String nome, String email, String cpf, double salario, int idade) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.salario = salario;
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
