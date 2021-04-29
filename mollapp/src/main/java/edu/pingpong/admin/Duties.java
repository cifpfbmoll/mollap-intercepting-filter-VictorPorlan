package edu.pingpong.admin;

import edu.pingpong.filter.Filter;
import edu.pingpong.target.Target;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Duties {
    public Duties() {
    }
    private List<Filter> filters = new ArrayList<>();
    private Optional<Target> targets;

    public List<Filter> getFilters() {
        return filters;
    }
/*No creo un getTargets porque no me deja usarlo aqui, asi que es inutil*/
    public void setTarget(Target target){
        this.targets = Optional.ofNullable(target);
    }

    public void addDuties(Filter filter){
        getFilters().add(filter);
    }

    public String executeDuties(String id){
        System.out.println("Probando");
        return "Hola";
    }

}
