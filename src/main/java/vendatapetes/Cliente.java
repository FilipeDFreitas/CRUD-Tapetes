package vendatapetes;

/**
 *
 * @author Filipe de Freitas Martins da Silva - GRR20193884
 */
public class Cliente {
    private String nome, sobrenome, CPF;
    
    public Cliente() {
    }

    public Cliente(String nome, String sobrenome, String CPF) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.CPF = CPF;
    }
    public void Alterar(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getCPF() {
        return CPF;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }
    public String[] Mostrar() {
        String[] s = new String[3];
        s[0]=nome;
        s[1]=sobrenome;
        s[2]=CPF;
        return s;
    }
}
