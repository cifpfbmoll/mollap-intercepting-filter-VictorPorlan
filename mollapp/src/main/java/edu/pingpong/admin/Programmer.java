package edu.pingpong.admin;

import edu.pingpong.filter.Filter;
import edu.pingpong.target.Target;
public class Programmer {
    private Duties duties = null;

    public Programmer(Target target) {
        duties = new Duties();
        duties.setTarget(target);
    }

    public Duties getDuties() {
        return duties;
    }

    public void setDuties(Filter filter) {
        getDuties().addDuties(filter);
    }
    public void executeDuties(String id){
    duties.executeDuties(id);
    }
}
