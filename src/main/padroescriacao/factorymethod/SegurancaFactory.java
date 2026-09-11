package padroescriacao.factorymethod;

public class SegurancaFactory {

    public static IFerramentaSeguranca obterFerramenta(String tipo) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("padroescriacao.factorymethod.Ferramenta" + tipo);
            objeto = classe.newInstance();

        } catch (Exception ex) {
            throw new IllegalArgumentException("Ferramenta de segurança inexistente.");
        }
        if (!(objeto instanceof IFerramentaSeguranca)) {
            throw new IllegalArgumentException("Classe não é uma ferramenta de segurança válida.");
        }
        return (IFerramentaSeguranca) objeto;
    }
}