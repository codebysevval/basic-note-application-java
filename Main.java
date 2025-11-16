import java.util.Scanner;

public class Main{
  public static void main(String[]args){
    Note note1=new Note("Meeting","Discuss project status","2024-10-01","2024-10-01");
    Note note2=new Note("Shopping","Buy groceries","2024-10-02","2024-10-02");
    Note note3=new Note("Workout","Gym session at 6 PM","2024-10-03","2024-10-03");
    Note note4=new Note("Birthday","Mom's birthday celebration","2024-10-04","2024-10-04");
    NoteManager notes=new NoteManager();
    notes.addNote(note1);
    notes.listAllNotes();
    notes.updateNote("Meeting","Discuss project status and deadlines");
    notes.removeNote("Shopping");
    notes.listAllNotes();

    System.out.println("-----------MENU-----------\n 1. Add Note\n 2. Remove Note\n 3. Update Note\n 4. List All Notes\n 5. Exit");
    Scanner scanner=new Scanner(System.in);
    int choice=scanner.nextInt();
    while(choice!=5){
      switch(choice){
        case 1:
          System.out.println("Enter title:");
          String title=scanner.next();
          System.out.println("Enter content:");
          String content=scanner.next();
          System.out.println("Enter date created (YYYY-MM-DD):");
          String dateCreated=scanner.next();
          Note newNote=new Note(title,content,dateCreated,dateCreated);
          notes.addNote(newNote);
          System.out.println("Note added successfully.");
          break;

          case 2:
          System.out.println("Enter title of the note to remove:");
          String removeTitle=new Scanner(System.in).nextLine();
          String removeResult=notes.removeNote(removeTitle);
          System.out.println(removeResult);
          break;
          
          case 3:
          System.out.println("Enter title of the note to update:");
          String updateTitle=new Scanner(System.in).nextLine();
          System.out.println("enter new content");
          String newContent=new Scanner(System.in).nextLine();
          String updateResult=notes.updateNote(updateTitle,newContent);
          System.out.println(updateResult);
          break;

          case 4:
          notes.listAllNotes();
          break;
          default:
          System.out.println("Invalid choice. Please try again.");
      }
      choice=scanner.nextInt();
    }
    
  }
}