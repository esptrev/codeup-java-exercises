package notmain;

public class Fishingpole {
    public Fishingpole(int length, int power, int weight, String guides, double lureRating) {
        this.length = length;
        this.power = power;
        this.weight = weight;
        this.guides = guides;
        this.lureRating = lureRating;
    }

    protected int length;
    protected int power;
    protected int weight;
    protected String guides;
    protected double  lureRating;


    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getGuides() {
        return guides;
    }

    public void setGuides(String guides) {
        this.guides = guides;
    }

    public double getLureRating() {
        return lureRating;
    }

    public void setLureRating(double lureRating) {
        this.lureRating = lureRating;
    }

    public static void main(String[] args) {
        Fishingpole firstBuild = new Fishingpole(84,350,85,"Fuji Titanium",.5-.75);

        System.out.println(firstBuild.getLength());
    }
}
