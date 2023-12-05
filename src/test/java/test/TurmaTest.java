package test;

import org.example.Pessoa;
import org.example.Turma;

import org.junit.jupiter.api.*;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TurmaTest {

  @DisplayName("Deve retornar pessoas")
  @Test
  public void testGetPessoas() throws Exception {
    ArrayList<Pessoa> listaPessoas = new ArrayList<>();
    Turma turma = new Turma();
    Pessoa pessoa = new Pessoa(1, "teste");
    listaPessoas.add(pessoa);
    turma.adicionarPessoa(pessoa);

    ArrayList<Pessoa> pessoaListada = turma.getPessoas();

    assertEquals(pessoaListada, listaPessoas);
  }

  @DisplayName("Deve adicionar uma nova pessoa")
  @Test
  public void testAdicionarPessoa() throws Exception {
    ArrayList<Pessoa> listaPessoas = new ArrayList<>();
    Turma turma = new Turma();
    Pessoa pessoa = new Pessoa(1, "teste");
    turma.adicionarPessoa(pessoa);
    listaPessoas.add(pessoa);

    assertEquals(turma.getPessoas(), listaPessoas);
  }

  @DisplayName("Deve retonar uma exceção caso o nome seja inválido")
  @Test
  public void testAdicionarPessoaInvalidoNome() throws Exception {
    Turma turma = new Turma();
    Pessoa pessoa = new Pessoa(1, "");
    assertThrows(Exception.class, () -> turma.adicionarPessoa(pessoa));
  }

  @DisplayName("Deve retornar uma exceção caso o ID seja inválido")
  @Test
  public void testAdicionarPessoaInvalidoID() throws Exception {
    Turma turma = new Turma();
    Pessoa pessoa = new Pessoa(0, "nome");
    assertThrows(Exception.class, () -> turma.adicionarPessoa(pessoa));
  }

  @DisplayName("Deve retornar uma exceção caso o ID já exista")
  @Test
  public void testIDJaExiste() throws Exception {
    Turma turma = new Turma();
    Pessoa pessoa1 = new Pessoa(1, "pessoa1");
    Pessoa pessoa2 = new Pessoa(1, "pessoa2");

    turma.adicionarPessoa(pessoa1);

    assertThrows(Exception.class, () -> turma.adicionarPessoa(pessoa2));
  }

  @DisplayName("Deve remover todas as pessoas da lista")
  @Test
  public void testRemoverTodasPessoas() throws Exception {
    ArrayList<Pessoa> compara = new ArrayList<>();
    Turma turma = new Turma();
    Pessoa pessoa = new Pessoa(1, "teste");
    turma.adicionarPessoa(pessoa);

    turma.removerTodasPessoas();

    assertEquals(turma.getPessoas(), compara);
  }
}
