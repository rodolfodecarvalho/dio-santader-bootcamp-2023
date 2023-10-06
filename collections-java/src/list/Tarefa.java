package list;

public class Tarefa {

    private Integer id;
    private String description;

    public Tarefa(Integer id, String description) {
        this.id = id;
        this.description = description;
    }

    public Integer getId(){
        return id;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
