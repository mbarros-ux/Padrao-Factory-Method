package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SegurancaFactoryTest {

    @Test
    void deveRetornarExcecaoParaFerramentaInexistente() {
        try {
            IFerramentaSeguranca ferramenta = SegurancaFactory.obterFerramenta("Firewall");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Ferramenta de segurança inexistente.", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaFerramentaInvalida () {
        try {
            IFerramentaSeguranca ferramenta = SegurancaFactory.obterFerramenta("Invalida");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Classe não é uma ferramenta de segurança válida.", e.getMessage());
        }
    }
}