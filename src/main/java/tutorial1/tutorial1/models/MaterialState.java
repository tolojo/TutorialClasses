package tutorial1.tutorial1.models;

public enum MaterialState {
ok(true), lent(false),repair(false), broken(false), blocked(false);
private boolean usable;
private MaterialState(boolean usable){
    this.usable=usable;
}
public boolean isUsable(){
    return usable;
}
}
