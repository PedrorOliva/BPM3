package test;

import org.example.Main;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
  @DisplayName("Deve retornar 3 objetos")
  @Test
  public void testMain() throws Exception {
    PrintStream saida = System.out;

    try{
      ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
      PrintStream printStream = new PrintStream(outputStream);

      System.setOut(printStream);

      Main.main(new String[0]);

      String output = outputStream.toString().trim();

      assertEquals("3", output);
    } finally {
      System.setOut(saida);
    }
  }
}
