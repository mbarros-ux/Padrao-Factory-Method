package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FerramentaLoggerTest {

    @Test
    void deveExecutarLogger() {
        IFerramentaSeguranca ferramenta = SegurancaFactory.obterFerramenta("Logger");
        assertEquals("Registro de logs de segurança iniciado.", ferramenta.executar());
    }

    @Test
    void deveCancelarLogger() {
        IFerramentaSeguranca ferramenta = SegurancaFactory.obterFerramenta("Logger");
        assertEquals("Registro de logs interrompido.", ferramenta.cancelar());
    }
}