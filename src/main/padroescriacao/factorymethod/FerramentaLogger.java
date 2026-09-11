package padroescriacao.factorymethod;

public class FerramentaLogger implements IFerramentaSeguranca {
    public String executar() {

        return "Registro de logs de segurança iniciado.";
    }

    public String cancelar() {

        return "Registro de logs interrompido.";
    }
}
