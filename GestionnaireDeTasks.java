import java.util.ArrayList;
import java.util.List;

public class GestionnaireDeTasks {
    // ajout d'une liste de tasks en privée
    private List<Tasks> tasks;

    // constructeur de la classe GestionnaireDeTasks
    // initialisation d'une nouvelle liste de task vide
    public GestionnaireDeTasks() {
        tasks = new ArrayList<>();
    }

    // ajouter une task
    public void addTask(Tasks task) {
        tasks.add(task);
    }

    // choisir un task
    public Tasks getTaskByName(String name) {
        for (Tasks task : tasks) {
            if (task.getName().equals(name)) {
                return task;
            }
        }
        return null;
    }

    // supprimer une tasks
    public void removeTask(Tasks task) {
        tasks.remove(task);
    }

    // task faite
    public void TaskAsComplete(Tasks task) {
        task.setComplete();
    }

    // task non-faite
    public void TaskASIncomplete(Tasks task) {
        task.setIncomplete();
    }

    // afficher les tasks
    public void getTasks() {
        for (Tasks task : tasks) {
            System.out.println(task);
        }
    }
}
