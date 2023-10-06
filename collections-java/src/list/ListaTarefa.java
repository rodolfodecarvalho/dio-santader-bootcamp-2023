package list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListaTarefa {

    private final List<Tarefa> tarefaList = new ArrayList<>();

    public void addTarefa(Integer id, String description){
        tarefaList.add(new Tarefa(id, description));
    }

    public void removeTarefa(Integer id, String description){
        tarefaList.remove(new Tarefa(id, description));
    }

    public Integer sizeTarefa(){
        return tarefaList.size();
    }

    public void getDescriptionTarefa(){
        System.out.println(tarefaList);
    }
}
