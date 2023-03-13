package Homework;

import java.util.ArrayList;
import java.util.List;

public class NameValidator {
    public List<String> getTakenLogIns() {
        return takenLogIns;
    }
    protected int defaultIndex = 0;
    public int getDefaultIndex() {
        defaultIndex++;
        return defaultIndex;
    }
    public void addTakenLogin (String username){
        takenLogIns.add(username);
    }



    protected List<String> takenLogIns = new ArrayList<>();


}
