package test;

import org.example.Pessoa;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PessoaTest {

  @DisplayName("Contrutor deve receber id e nome")
  @Test
  public void  testRecebeNomeID() throws Exception {
    Pessoa pessoa = new Pessoa(1, "teste");

    assertEquals(1, pessoa.getId());
    assertEquals("teste", pessoa.getNome());
  }

  @DisplayName("Construtor deve iniciar vázio")
  @Test
  public void testeContrutorVazio() throws Exception {
    Pessoa pessoa = new Pessoa();

    assertEquals(0, pessoa.getId());
    assertEquals(null, pessoa.getNome());
  }

  @DisplayName("Deve setar o id de pessoa")
  @Test
  public void testSetID() throws Exception {
    Pessoa pessoa = new Pessoa();
    pessoa.setId(1);

    assertEquals(1, pessoa.getId());
  }

  @DisplayName("Deve setar o nome de pessoa")
  @Test
  public void testSetNome() throws Exception {
    Pessoa pessoa = new Pessoa();
    pessoa.setNome("teste");

    assertEquals("teste", pessoa.getNome());
  }

  @DisplayName("Deve retornar o id de pessoa")
  @Test
  public void testGetId() throws Exception {
    Pessoa pessoa = new Pessoa(1, "teste");

    assertEquals(1, pessoa.getId());
  }

  @DisplayName("Deve retornar o nome de pessoa")
  @Test
  public void testGetNome() throws Exception {
    Pessoa pessoa = new Pessoa(1, "teste");

    assertEquals("teste", pessoa.getNome());
  }


  @DisplayName("Deve verficar se é um objeto válido")
  @Test
  public void testPessoaValido() throws Exception {
    Pessoa pessoa = new Pessoa(1, "teste");

    assertTrue(pessoa.valido());
  }

  @DisplayName("Deve verificar se o id é inválido")
  @Test
  public void testPessoaIDInvalido() throws Exception {
    Pessoa pessoa = new Pessoa(0, "teste");

    assertFalse(pessoa.valido());
  }

  @DisplayName("Deve verificar se o nome é inválido")
  @Test
  public void testPessoaNomeInvalido() throws Exception {
    Pessoa pessoa = new Pessoa(1, "");

    assertFalse(pessoa.valido());
  }
}
