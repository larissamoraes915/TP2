import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class ListaDeTarefasTest {

    @Test
    public void testAdicionarTarefa() {
        // Arrange
        ListaDeTarefas lista = new ListaDeTarefas();
        String novaTarefa = "Completar projeto de teste";

        // Act
        lista.adicionarTarefa(novaTarefa);

        // Assert
        assertTrue(lista.contemTarefa(novaTarefa));
    }

    @Test
    public void testContemTarefa() {
        // Arrange
        ListaDeTarefas lista = new ListaDeTarefas();
        String tarefaExistente = "Estudar para prova";

        // Act
        lista.adicionarTarefa(tarefaExistente);

        // Assert
        assertTrue(lista.contemTarefa(tarefaExistente));
    }

    @Test
    public void testContemTarefaTarefaInexistente() {
        // Arrange
        ListaDeTarefas lista = new ListaDeTarefas();
        String tarefaInexistente = "Fazer compras";

        // Act & Assert
        assertTrue(!lista.contemTarefa(tarefaInexistente));
    }
}
