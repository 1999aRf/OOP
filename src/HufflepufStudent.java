public class HufflepufStudent extends HogwartsStudent {
    private int hardWork;
    private int loyalty;
    private int honesty;

    public HufflepufStudent(String name, int magicPower, int transgressionDistance, int hardWork, int loyalty, int honesty) {
        super(name, magicPower, transgressionDistance);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
    public void compare(HufflepufStudent second) {
        int firstSum = this.getHonesty() + this.getHardWork() + this.getLoyalty();
        int secondSum = second.getHonesty() + second.getHardWork() + second.getLoyalty();
        if (firstSum > secondSum) {
            System.out.println(this.getName() + " лучший Пуффиндуец, чем " + second.getName());
        } else if (secondSum > firstSum) {
            System.out.println(second.getName() + " лучший Пуффиндуец, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + second.getName() + " равны ");
        }
    }

    @Override
    public String toString() {
        return getName() + " "
                + "magicPower{" + getMagicPower() +
                ",transgressionDistance" + getTransgressionDistance() +
                "hardWork=" + hardWork +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty;
    }
}

