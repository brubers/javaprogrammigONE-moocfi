public class Items {
    private String id;
    private String name;


    public Items(String id, String name){
        this.id = id;
        this.name = name;
    }

    public boolean equals(Object compared){
        Items itemCompared = (Items) compared;
        return this.id.equals(itemCompared.id);
    }

    @Override
    public String toString() {
        
        return id+": "+name;
    }


}
