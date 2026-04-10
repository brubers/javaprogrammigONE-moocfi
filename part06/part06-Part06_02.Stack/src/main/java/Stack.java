
import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stacks;

    public Stack(){
        this.stacks = new ArrayList<>();
    }

    public boolean isEmpty(){
        return this.stacks.size() == 0;
    }

    public void add(String value){
        this.stacks.add(value);
    }

    public ArrayList<String> values(){
        return this.stacks;
    }

    public String take(){
        return stacks.remove(stacks.size() - 1);
    }

}
