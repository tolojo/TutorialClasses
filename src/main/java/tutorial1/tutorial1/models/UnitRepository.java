package tutorial1.tutorial1.models;


import java.util.ArrayList;



public class UnitRepository {
    
    private static ArrayList<UnitRepository> unit = new ArrayList<UnitRepository>();
    public static void populate() {
    Unit u; // auxiliary variable
    u = new Unit(15,"AB",10);
    unit.add(u);
    }
   
    public static ArrayList<UnitRepository> getUnits() { return unit; }
    
    public static Unit getUnit(int id) {
        for (Unit units: unit)
            if (unit.getId() == id)
                return units;
        return null;
        }
        


    



}
