package genericos.multiplos;

public class TestarGenericosMultiplos {

    public static void main(String[] args) {
        GenericosMultiplos<String, Integer, String, String> classeGenerica1 = new GenericosMultiplos<>("Matheus", 20, "Jogador de Amogus", "Stand User");
        System.out.println(classeGenerica1.apresentarNome());
        System.out.println(classeGenerica1.idadeEm10Anos());
        System.out.println(classeGenerica1.toString());

        GenericosMultiplos<String, Integer, Boolean, Double> classeGenerica2 = new GenericosMultiplos<>("João", 22, Boolean.TRUE, 1225.0);
        System.out.println(classeGenerica2.apresentarNome());
        System.out.println(classeGenerica2.idadeEm10Anos());
        System.out.println(classeGenerica2.toString());

    }

}
