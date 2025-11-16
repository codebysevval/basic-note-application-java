public class Note{
  //Değişkenler private tanımladığı için get ve set metotları ile erişilebilir.
    private String title;
    private String content;
    private String dateCreated;
    private String dateModifed;
    
    //Constructor
    public Note( String title,String content,String dateCreated,String dateModifed){
      this.title=title;
      this.content=content;
      this.dateCreated=dateCreated;
        this.dateModifed=dateModifed;
      }
     

    //Getters
    public String getTitle(){
      return title;
    }
    public String getContent(){
      return content;
    }

    public String getDateCreated(){
      return dateCreated;
    }

    public String getDateModifed(){
      return dateModifed;
    }

    //Setters
    public void setTitle(String title){
      this.title=title;
    }
    public void setContent(String content){
      this.content=content;
    }
    public void setDateCreated(String dateCreated){
      this.dateCreated=dateCreated;
    }
    public void setDateModifed(String dateModifed){
      this.dateModifed=dateModifed;
    }

    //toString metodu
    @Override
    public String toString() {
      return "Note{" +
              "title='" + title + '\'' +
              ", content='" + content + '\'' +
              ", dateCreated='" + dateCreated + '\'' +
              ", dateModifed='" + dateModifed + '\'' +
              '}';
    }

    //equals metodu
    @Override
    public boolean equals(Object o) { //equals metodu  karşılaştırmak için kullanılır.
        if (this == o) return true; 
        if (!(o instanceof Note)) return false;  //intenceof terimi ile o nesnesinin Note sınıfından olup olmadığını kontrol eder.

        Note note = (Note) o; //o nesnesini note nesnesine dönüştürür.

        if (!title.equals(note.title)) return false;
        if (!content.equals(note.content)) return false; 
        if (!dateCreated.equals(note.dateCreated)) return false;
        return dateModifed.equals(note.dateModifed);//Tüm alanlar eşitse true döner.
    }

}
