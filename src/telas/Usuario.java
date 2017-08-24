
package telas;

public class Usuario {
    protected String nome;
    protected int a, b, c;
    public static FormUsuario formUsu;

    public Usuario(String nome, int a, int b, int c) {
        this.nome = nome;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    
}
