public class Horse {
    private String name;
    private double speed;
    private double distance;

    public Horse(String name, double speed, double distance) {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
    
    public String getName() {
        return name;
    }

    public double getSpeed() {
        return speed;
    }

    public double getDistance() {
        return distance;
    }

    public void move() {
        distance += Math.random() * speed;
    }

    public void print() {
        int dotsAmount = (int) Math.floor(distance);
        StringBuilder sb = new StringBuilder();
        for (int i=0; i < dotsAmount; i++) {
            sb = sb.append('.');
        }

        System.out.println(sb + this.name);
    }

}
