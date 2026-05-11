package padraoconstrucao.builder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteUnitarioHamburguer {

    @Test
    public void testHamburguerCompletoComSucesso() {
        Hamburguer hamburguer = new HamburguerBuilder()
                .setNome("X-Tudo")
                .setPreco(25.0f)
                .setTamanho("Grande")
                .setTipoPao("Gergelim")
                .setTipoCarne("Picanha")
                .setQueijo(true)
                .setBacon(true)
                .setAlface(true)
                .setTomate(true)
                .setCebola(true)
                .setPickles(true)
                .setMolhoEspecial("Barbecue")
                .setObservacoes("Sem cebola crua")
                .build();

        assertEquals("X-Tudo", hamburguer.getNome());
        assertEquals(25.0f, hamburguer.getPreco());
        assertTrue(hamburguer.isQueijo());
        assertTrue(hamburguer.isBacon());
    }

    @Test
    public void testHamburgerSimples() {
        Hamburguer hamburguer = new HamburguerBuilder()
                .setNome("X-Salada")
                .setPreco(15.0f)
                .setTipoPao("Tradicional")
                .setAlface(true)
                .setTomate(true)
                .build();

        assertEquals("X-Salada", hamburguer.getNome());
        assertFalse(hamburguer.isBacon());
        assertTrue(hamburguer.isAlface());
    }

    @Test
    public void testHamburguerSemNome() {
        assertThrows(IllegalArgumentException.class, () -> {
            new HamburguerBuilder()
                    .setPreco(20.0f)
                    .build();
        });
    }

    @Test
    public void testHamburguerSemPreco() {
        assertThrows(IllegalArgumentException.class, () -> {
            new HamburguerBuilder()
                    .setNome("X-Bacon")
                    .build();
        });
    }

    @Test
    public void testEncadeamentoMetodos() {
        Hamburguer hamburguer = new HamburguerBuilder()
                .setNome("X-Bacon")
                .setPreco(18.0f)
                .setBacon(true)
                .setQueijo(true)
                .build();

        assertTrue(hamburguer.isBacon());
        assertTrue(hamburguer.isQueijo());
    }
}