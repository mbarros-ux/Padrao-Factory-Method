package padroescriacao.factorymethod;

public class FerramentaScanner implements IFerramentaSeguranca {
    public String executar() {

        return "Scanner de vulnerabilidades ativado.";
    }

    public String cancelar() {

        return "Varredura de segurança cancelada.";
    }
}
