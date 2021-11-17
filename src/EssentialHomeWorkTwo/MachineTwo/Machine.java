package EssentialHomeWorkTwo.MachineTwo;

public class Machine {
    public int productionYear;
    public double speed;
    public int weight;
    public String colour;

    public Machine() {
    }

    public Machine(int productionYear) {
        this.productionYear = productionYear;
    }

    public Machine(int productionYear, double speed) {
        this.productionYear = productionYear;
        this.speed = speed;
    }

    public Machine(int productionYear, double speed, int weight) {
        this.productionYear = productionYear;
        this.speed = speed;
        this.weight = weight;
    }

    public Machine(int productionYear, double speed, int weight, String colour) {
        this.productionYear = productionYear;
        this.speed = speed;
        this.weight = weight;
        this.colour = colour;
    }
}
