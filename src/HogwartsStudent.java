public class HogwartsStudent {
     private String name;
     private int magicPower;
     private int transgressionDistance;

     public HogwartsStudent(String name, int magicPower, int transgressionDistance) {
          this.name = name;
          this.magicPower = magicPower;
          this.transgressionDistance = transgressionDistance;
     }

     public String getName() {
          return name;
     }

     public int getMagicPower() {
          return magicPower;
     }

     public int getTransgressionDistance() {
          return transgressionDistance;
     }

     public void setName(String name) {
          this.name = name;
     }

     public void setMagicPower(int magicPower) {
          this.magicPower = magicPower;
     }

     public void setTransgressionDistance(int transgressionDistance) {
          this.transgressionDistance = transgressionDistance;
     }

     public void compareAnyStudents(HogwartsStudent second) {
          if (this.getMagicPower() > second.getMagicPower()) {
               System.out.println(this.getName() + " обладает большей силой магии, чем " + second.getName());
          } else if (this.getMagicPower() < second.getMagicPower()) {
               System.out.println(second.getName() + " обладает большей силой магии, чем " + this.getName());
          } else {
               System.out.println(second.getName() + " и " + this.getName() + " равны по силе магии");
          }
     }

     public void compareAnyStudent(HogwartsStudent second) {
          if (this.getTransgressionDistance() > second.getTransgressionDistance()) {
               System.out.println(this.getName() + " обладает большей трансгресией, чем " + second.getName());
          } else if (this.getTransgressionDistance() < second.getTransgressionDistance()) {
               System.out.println(second.getName() + " обладает большей трансгресией, чем " + this.getName());
          } else {
               System.out.println(second.getName() + " и " + this.getName() + " равны по расстоянию трансгресии");
          }
     }

     @Override
     public String toString() {
          return "HogwartsStudent{" +
                  "name='" + name + '\'' +
                  ", magicPower=" + magicPower +
                  ", transgressionDistance=" + transgressionDistance +
                  '}';
     }
}
