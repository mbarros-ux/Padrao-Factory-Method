package padroescriacao.factorymethod;

public class FerramentaBackup implements padroescriacao.factorymethod.IFerramentaSeguranca {
    public String executar() {

        return "Backup seguro dos dados executado.";
    }
    public String cancelar() {

        return "Rotina de backup cancelada.";
    }
}
