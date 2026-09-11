package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FerramentaScannerTest {

    @Test
    void deveExecutarScanner() {
        IFerramentaSeguranca ferramenta = SegurancaFactory.obterFerramenta("Scanner");
        assertEquals("Scanner de vulnerabilidades ativado.", ferramenta.executar());
    }

    @Test
    void deveCancelarScanner() {
        IFerramentaSeguranca ferramenta = SegurancaFactory.obterFerramenta("Scanner");
        assertEquals("Varredura de segurança cancelada.", ferramenta.cancelar());
    }
}
