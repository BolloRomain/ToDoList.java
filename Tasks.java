public class Tasks {
    // ajout de deux propriete privées 
    // un pour le nom de la task et l'autre boolean pour son statut
    private String name;
    private Boolean complete;

    // le constructeur de la classe Tasks
    // initialisation du nom et du statut de la task a false
    public Tasks(String name, Boolean complete){
        this.name = name;
        this.complete = false;
    }

    // un Getter pour le nom de task qui nous renvoie son nom
    public String getName(){
        return name;
    }

    // un Getter pour la statut de la task qui nous renvoie si la task est faite ou non
    public Boolean getComplete(){
        return complete;
    }

    // un Setter pour marquer une task comme faite
    public void setComplete(){
        this.complete = true;
    }

    // un Setter pour marquer la task comme non-faite
    public void setIncomplete(){
        this.complete = false;
    }

    // on utilise la méthode toString() pour afficher la chaine de caracteres representant la task
    // puis nous renvoie donc une chaine de caracteres representant la task
    @Override
    public String toString(){
        return "Tâches {" +
        "Nom de la tâche='" + name + '\'' +
        ", Faite='" + (complete ? "oui" : "non") + '\'' +
        '}';
    }
}