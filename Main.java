// ajout de l'import Scanner pour nous permettre de lire ce que l'utilisateur tape sur son clavier
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        GestionnaireDeTasks gestionnaireDeTasks = new GestionnaireDeTasks();
        try (Scanner scanner = new Scanner(System.in)) {
            String choix;
            do {
                System.out.println("\n---Menu---");
                System.out.println("1. Ajouter un tâche");
                System.out.println("2. Afficher les tâches");
                System.out.println("3. Selectionner une tâche");
                System.out.println("4. Quitter");
                System.out.print("Votre choix: ");
                choix = scanner.nextLine();

                switch (choix) {
                    case "1":
                        System.out.print("Entrez le nom de votre tâche: ");
                        String nom = scanner.nextLine();
                        Boolean complete = false;
                        Tasks tasks = new Tasks(nom, complete);
                        gestionnaireDeTasks.addTask(tasks);
                        break;

                    case "2":
                        gestionnaireDeTasks.getTasks();
                        break;

                    case "3":
                        System.out.print("Entrez le nom de la tâche à chercher: ");
                        nom = scanner.nextLine();
                        tasks = gestionnaireDeTasks.getTaskByName(nom);
                        if (tasks != null) {
                            System.out.println(tasks);
                            System.out.println("1. Marquer la tâche comme faite");
                            System.out.println("2. Marquer la tâche comme non-faite");
                            System.out.println("3. Revenir sur votre liste");
                            String subChoix = scanner.nextLine();
                            
                            if(subChoix.equals("1")){
                                gestionnaireDeTasks.TaskAsComplete(tasks);
                                System.out.println("Tâche marquée comme faite.");
                            }
                            else if(subChoix.equals("2")){
                                gestionnaireDeTasks.TaskASIncomplete(tasks);
                                System.out.println("Tâche marquée comme non-faite.");
                            }
                            else if(subChoix.equals("3")){
                                // retour à la liste, ne rien faire ici, le programme retournera automatiquement au menu principal
                            }
                            else {
                                System.out.println("Choix invalide.");
                            }
                            
                        } else {
                            System.out.println("Tâche non trouvée.");
                        }
                        break;

                    default: 
                        System.out.println("Choix invalide. Veuillez réessayer.");
                }
            } while (!choix.equals("4"));
        }catch (NumberFormatException e){
            e.printStackTrace();
        }
    }
}
