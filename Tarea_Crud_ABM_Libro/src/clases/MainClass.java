/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainClass {

    private static final String DATABASE_PATH = "C:/base/Practica.odb"; 
    private EntityManagerFactory emf;
    private EntityManager em;
    
     public MainClass() {
        emf = Persistence.createEntityManagerFactory(DATABASE_PATH);
        em = emf.createEntityManager();
    }
   public void cerrarConexion() {
        em.close();
        emf.close();
    }
    public void crearLibro(String titulo, String autor) {
        em.getTransaction().begin();

        LibroClass libro = new LibroClass();
        libro.setTitulo(titulo);
        libro.setAutor(autor);

        em.persist(libro);
        em.getTransaction().commit();
    }

    public void crearGenero(String nombre) {
        em.getTransaction().begin();

        GeneroClass genero = new GeneroClass();
        genero.setNombre(nombre);

        em.persist(genero);
        em.getTransaction().commit();
    }   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MainClass main = new MainClass();
    
    }
    
}
