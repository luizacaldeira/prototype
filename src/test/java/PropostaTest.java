import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropostaTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Proposta proposta = new Proposta(123, "Cliente Original", new Endereco("Rua A", 1), "Fibra 300MB");

        Proposta propostaClone = proposta.clone();
        propostaClone.setNumero(456);
        propostaClone.setNomeCliente("Cliente Clonado");
        propostaClone.getEndereco().setNumero(2);

        assertEquals("Proposta{numero=123, nomeCliente='Cliente Original', endereco=Endereco{logradouro='Rua A', numero=1}, plano='Fibra 300MB'}", proposta.toString());
        assertEquals("Proposta{numero=456, nomeCliente='Cliente Clonado', endereco=Endereco{logradouro='Rua A', numero=2}, plano='Fibra 300MB'}", propostaClone.toString());
    }
}