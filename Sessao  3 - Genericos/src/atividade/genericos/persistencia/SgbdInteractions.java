package atividade.genericos.persistencia;

import app.rh.Administrativo;
import app.rh.Diretor;
import app.rh.Professor;

public class SgbdInteractions {
    public static void main(String[] args) {
        GenericoIDAO<Administrativo> crudADM = new GenericoIDAO<>();
        crudADM.create(new Administrativo());

        GenericoIDAO<Diretor> crudDiretor = new GenericoIDAO<>();
        crudDiretor.create(new Diretor());

        GenericoIDAO<Professor> crudProfessor = new GenericoIDAO<>();
        crudProfessor.create(new Professor());
    }
}
