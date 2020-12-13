package tutorial1.tutorial1.models;

public class Material {
    private String name;
    private MaterialState state;
    public Material(String name){
        this.name=name;
        state=MaterialState.ok;
    }
    public String getName(){return name;}
    
    public MaterialState getState(){return state;}
    
    public void setState(MaterialState state){this.state=state;}

}
