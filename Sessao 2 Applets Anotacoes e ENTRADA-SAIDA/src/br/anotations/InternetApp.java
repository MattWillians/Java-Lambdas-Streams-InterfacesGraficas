package br.anotations;

@Copyright(
        autor = "Matheus",
        data = "29/09/2000",
        versao = "1.0.09"
)
public class InternetApp implements Internet{

    @Deprecated
    public void conectarSSL() {}

    @Override
    public void conectar() {

    }
}
