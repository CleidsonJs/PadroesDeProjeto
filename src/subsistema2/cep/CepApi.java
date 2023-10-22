package subsistema2.cep;

import one.digitalinnovation.gof.singleton.SingletonEager;

public class CepApi {
    public CepApi() {
        super();
    }
    private static CepApi instancia = new CepApi();

    public static CepApi getInstancia(){
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "São Paulo";
    }
    public String recuperarEstado(String cep) {
        return "SP";
    }
}
