/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package featurefilm;

/**
 *
 * @author Familia
 */
public class FeatureFilm {
static  FeatureFilm fm=new FeatureFilm();    
    String title, topic, category, theater;
    Actor actor1 = new Actor("Charles");
    Actor actor2 = new Actor("Claude");

    public void update(Actor a, String title) {
        actor1 = a;
        this.title = title;
    }

    public void update(Actor a, Actor b, String title) {
        actor1 = a;
        actor2 = b;
        this.title = title;
    }

    public void update(String topic, String title) {
        this.title = title;
        this.topic = topic;
    }
    public String getActorName()
    {
    return actor1.getActorName();
    }
     public String getActor2Name()
    {
    return actor2.getActorName();
    }
    public boolean update(String title, Actor a) {
        return true;
    }
      public void printAll(){
      System.out.println("Nombre Actor Principal :"+fm.getActorName()+"\nNombre Actor Secundario: "
              +fm.getActor2Name()+"\nTitulo Pelicula: "+title+"\nGenero Pelicula :"+topic);
      }
    public static void main(String[] args) {
  
   fm.update("Accion", "Mewvie");
  
   fm.printAll();
    }

}
