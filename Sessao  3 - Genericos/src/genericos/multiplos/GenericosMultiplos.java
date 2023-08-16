package genericos.multiplos;

public class GenericosMultiplos<A extends String,B extends Number, C, D> {
    A nome;
    B idade;
    C parametroC;
    D parametroD;

    public GenericosMultiplos(A nome, B idade, C parametroC, D parametroD) {
        super();
        this.nome = nome;
        this.idade = idade;
        this.parametroC = parametroC;
        this.parametroD = parametroD;
    }

    public String apresentarNome(){
        return "Bem vindo ao sistema senhor(a): " + nome;
    }

    public Integer idadeEm10Anos(){
        int i = idade.intValue() + 10;
        return i;
    }
    @Override
    public String toString() {
        return "GenericosMultiplos{" +
                    "nome='" + nome + "\n" +
                    ", idade=" + idade + "\n" +
                    ", parametroC=" + parametroC + "\n" +
                    ", parametroD=" + parametroD + "\n" +
                '}';
    }
}
