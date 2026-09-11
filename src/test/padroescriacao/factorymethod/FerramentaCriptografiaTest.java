package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FerramentaCriptografiaTest {

    @Test
    void deveExecutarCriptografia() {
        IFerramentaSeguranca ferramenta = SegurancaFactory.obterFerramenta("Criptografia");
        assertEquals("Criptografia AES-256 aplicada com sucesso.", ferramenta.executar());
    }

    @Test
    void deveCancelarCriptografia() {
        IFerramentaSeguranca ferramenta = SegurancaFactory.obterFerramenta("Criptografia");
        assertEquals("Processo de criptografia abortado.", ferramenta.cancelar());
    }
}