import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Contato implements Serializable {
    private static final long serialVersionUID = 1L;
    String nome;
    String telefone;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }
}

public class ExemploSerializacao {

    // Método para serializar os contatos

    private static void serializarContatos(List<Contato> listaContatos) throws IOException {
        try (ObjectOutputStream outputStream =
                     new ObjectOutputStream(new FileOutputStream("agenda.ser"))) {
            outputStream.writeObject(listaContatos);
            System.out.println("Contatos serializados e salvos com sucesso!");
        }
    }

    // Método para deserializar os contatos e exibir
    @SuppressWarnings("unchecked")
    private static void deserializarContatos() throws IOException, ClassNotFoundException {
        try (ObjectInputStream inputStream =
                     new ObjectInputStream(new FileInputStream("agenda.ser"))) {

            List<Contato> contatosLidos = (List<Contato>) inputStream.readObject();

            for (Contato contato : contatosLidos) {
                System.out.println("Nome: " + contato.nome + ", Telefone: " + contato.telefone);
            }
        }
    }

    public static void main(String[] args) {
        Contato contato1 = new Contato("Everton", "(87) 91283-9122");
        Contato contato2 = new Contato("Maria", "(11) 91222-9122");

        List<Contato> listaContatos = new ArrayList<>();
        listaContatos.add(contato1);
        listaContatos.add(contato2);

        try {
            serializarContatos(listaContatos);
            deserializarContatos(); // corrigido, não recebe parâmetros
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erro ao manipular contatos: " + e.getMessage());
        }
    }
}
