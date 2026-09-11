package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FerramentaBackupTest {

    @Test
    void deveExecutarBackup() {
        IFerramentaSeguranca ferramenta = SegurancaFactory.obterFerramenta("Backup");
        assertEquals("Backup seguro dos dados executado.", ferramenta.executar());
    }

    @Test
    void deveCancelarBackup() {
        IFerramentaSeguranca ferramenta = SegurancaFactory.obterFerramenta("Backup");
        assertEquals("Rotina de backup cancelada.", ferramenta.cancelar());
    }
}
