import list.ListaTarefa;
import list.Tarefa;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ListaTarefa list = new ListaTarefa();

        System.out.println("total: " + list.sizeTarefa());

        list.addTarefa(1,"cantar");

        System.out.println("total: " + list.sizeTarefa());

        list.addTarefa(2,"cantar1");

        System.out.println("total: " + list.sizeTarefa());

        list.removeTarefa(1,"cantar");

        System.out.println("total: " + list.sizeTarefa());

        list.getDescriptionTarefa();
    }
}