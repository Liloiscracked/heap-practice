public class Patient implements Comparable<Patient>{
    private String name;
    private int emergencyLevel;
    private int arrivalOrder;

    public Patient(String name, int emergencyLevel, int arrivalOrder) {
        this.name = name;
        this.emergencyLevel = emergencyLevel;
        this.arrivalOrder = arrivalOrder;
    }

    @Override
    public int compareTo(Patient o) {
        if (o.getEmergencyLevel() > this.getEmergencyLevel())
            return 1;
        else if (o.getEmergencyLevel() < this.getEmergencyLevel())
            return -1;
        else
            if(o.getArrivalOrder() > this.getArrivalOrder())
                return -1;
            else
                return 1;

    }

    public String getName() {
        return name;
    }

    public int getEmergencyLevel() {
        return emergencyLevel;
    }

    public int getArrivalOrder() {
        return arrivalOrder;
    }
    public String toString(){
        return "Name: " + this.getName() + ", Emergency Level : " +this.getEmergencyLevel() + ", Arrival order: " + this.getArrivalOrder() + "\n";
    }
}
