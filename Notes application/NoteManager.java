import java.util.ArrayList;

public class NoteManager{
    private ArrayList<Note>notes;

    //Constructor
    public NoteManager(){
        notes=new ArrayList<>();
    }

    //Add note
    public void addNote(Note note){
      notes.add(note);
    }

    //Remove note by title
    public String removeNote(String title){
      for(int i=0;i<notes.size();i++){
        if(notes.get(i).getTitle().equals(title)){
          notes.remove(i);
          return "Note removed successfully.";
        }
      }
      return "Note not found.";
    }

    //Update note by title
    public String updateNote(String title,String newContent){
        for(Note note:notes){
          if(note.getTitle().equals(title)){
            note.setContent(newContent);
            return "Note updated successfully.";
          }
        }
        return "Note not found.";
    }

    //Found note by title 
    public Note findNoteByTitle(String title){
        for(Note note:notes){
          if(note.getTitle().equals(title)){
            return note;
          }
        }
        return null; //Note not found
    }

    //List all notes
    public void listAllNotes(){
        for(Note note:notes){
          System.out.println(note);
        }
    }


  


    

}