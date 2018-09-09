/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbeans;

import entities.Actor;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import session.ActorManager;

/**
 *
 * @author andresgonzalez
 */
@Named(value = "actorMBean")
@SessionScoped
public class ActorMBean implements Serializable {

    @EJB
    private ActorManager actorManager;
    
    private Actor actor;
    private List<Actor> actors;

    /**
     * Creates a new instance of ActorMBean
     */
    public ActorMBean() {
    }
    
    public List<Actor> getActors() {
        if ((actors == null) || (actors.isEmpty()))
            refresh();
        return actors;
    }
    
    public void refresh() {
       // tousLesComptes = compteBancaireFacade.findAll();
    }
    
    public Actor getDetails() {
        return actor;
    }
    
    public String showDetails(Actor actor) {
        this.actor = actor;
        return "ActorDetails";
    }
    
    public String update() {
        System.out.println("###UPDATE###");
        actor = actorManager.updateActor(actor);
        return "ActorList";
    }
    
    public String list() {
        System.err.println("###LIST###");
        return "ActorList";
    }
    
}
