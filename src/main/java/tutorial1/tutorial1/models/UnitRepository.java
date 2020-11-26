package tutorial1.tutorial1.models;


import java.util.ArrayList;



public class UnitRepository {
    
    private static ArrayList<Unit> unit = new ArrayList<Unit>();
    public static void populate() {
   
    unit.add(new Unit(16,"AC",11));
    unit.add(new Unit(15,"AB",10));
    }
   
    public static ArrayList<Unit> getUnits() { return unit; }
    
    public static Unit getUnit(int id) {
        for (Unit units: unit)
            if (units.getId() == id)
                return units;
        return null;
        }
        


    



}
