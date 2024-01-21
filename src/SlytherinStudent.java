public class SlytherinStudent extends HogwartsStudent{
    int cunning;
    int decisiveness;
    int ambition;
    int resourcefulness;
    int lustForPower;

    public SlytherinStudent(String name, int magicPower, int transgressionDistance, int cunning, int decisiveness, int ambition, int resourcefulness, int lustForPower) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.decisiveness = decisiveness;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDecisiveness() {
        return decisiveness;
    }

    public void setDecisiveness(int decisiveness) {
        this.decisiveness = decisiveness;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }
    public void compare(SlytherinStudent second) {
        int firstSum = this.getAmbition() + this.getCunning() + this.getDecisiveness() + this.getLustForPower() + this.getResourcefulness();
        int secondSum = second.getAmbition() + second.getCunning() + second.getDecisiveness() + second.getLustForPower() + second.getResourcefulness();
        if (firstSum > secondSum) {
            System.out.println(this.getName() + " лучший студент Слизерин, чем " + second.getName());
        } else if (secondSum > firstSum) {
            System.out.println(second.getName() + " лучший студенет Слизерин, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + second.getName() + " равны ");
        }
    }

    @Override
    public String toString() {
        return getName()
                + "magicPower{" + getMagicPower() +
                ",transgressionDistance" + getTransgressionDistance() +
                "cunning=" + cunning +
                ", decisiveness=" + decisiveness +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower;
    }

}
