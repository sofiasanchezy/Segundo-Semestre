public class Libro{

   //Atributos
    private String isbn;
    private String titulo;
    private String autor;
    private int aniopublicacion;
    private boolean disponible;

    //Constructor
    public Libro(String isbn, String titulo, String autor, int aniopublicacion, boolean disponible){
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.aniopublicacion = aniopublicacion;
        this.disponible = disponible;
    }

    //getter y setter
    public String getIsbn(){
        return isbn;
    }

    public void setIsbn(String isbn){
        this.isbn =isbn;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public int getAniopublicacion(){
        return aniopublicacion;
    }

    public void setAniopublicacion(int aniopublicacion){
        this.aniopublicacion = aniopublicacion;
    }

    public boolean getDisponible(){
        return disponible;
    }

    public void setDisponible(boolean disponible){
        this.disponible = disponible;
    }

    public void prestar(){
        disponible = false;
        }

    public void devolver (){
        disponible = true;  
    }

    public boolean estaDisponible(){
        return disponible;
    }

    public String toString(){
        return "Libro [ isbn: " + isbn + " titulo: " + titulo + " autor: " + " aniopublicacion: " + aniopublicacion + " disponible: " + disponible + " ]";
    }

} 