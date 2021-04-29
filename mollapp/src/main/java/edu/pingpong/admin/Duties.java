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

    public Optional<Target> getTargets() {
        return targets;
    }

    public void setTarget(Target target){
        this.targets = Optional.ofNullable(target);
    }

    public void addDuties(Filter filter){
        getFilters().add(filter);
    }

    public void executeDuties(String id){
        for (int i = 0; i < filters.size(); i++){
            getFilters().get(i).execute(id);
        };
        if(getTargets().isPresent()){
            getTargets().get().execute(id);
        }
        else{
            System.out.println("No target avalible");
        }

    }

}
