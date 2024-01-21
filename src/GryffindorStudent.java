public class GryffindorStudent extends HogwartsStudent {
    private int nobility;
    private int honor;
    private int courage;

    public GryffindorStudent(String name, int magicPower, int transgressionDistance, int nobility, int honor, int courage) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    public void compare(GryffindorStudent second) {
        int firstSum = this.getCourage() + this.getHonor() + this.getNobility();
        int secondSum = second.getCourage() + second.getHonor() + second.getNobility();
        if (firstSum > secondSum) {
            System.out.println(this.getName() + " лучший Гриффиндорец, чем " + second.getName());
        } else if (secondSum > firstSum) {
            System.out.println(second.getName() + " лучший Гриффиндорец, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + second.getName() + " равны ");
        }
    }

    @Override
    public String toString() {
        return getName()
                + "magicPower{" + getMagicPower() +
                ",transgressionDistance" + getTransgressionDistance() +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", courage=" + courage;
    }
}
