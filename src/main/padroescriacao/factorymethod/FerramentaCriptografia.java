package padroescriacao.factorymethod;

public class FerramentaCriptografia implements IFerramentaSeguranca {
  public String executar() {

      return "Criptografia AES-256 aplicada com sucesso.";
    }

  public String cancelar() {

      return "Processo de criptografia abortado.";
  }
}
