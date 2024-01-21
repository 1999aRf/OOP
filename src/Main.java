public class Main {
    public static void main(String[] args) {
        GryffindorStudent harryPotter = new GryffindorStudent(
                "HarryPotter",
                70,
                85,
                82,
                85,
                90
        );

        GryffindorStudent hermioneGranger = new GryffindorStudent(
                "Hermione Granger",
                80,
                80,
                90,
                86,
                95
        );

        SlytherinStudent drakoMalfoy = new SlytherinStudent(
                "Drako Malfoy",
                70,
                60,
                54,
                50,
                95,
                90,
                63
        );

        SlytherinStudent grahamMontegu = new SlytherinStudent(
                "Graham Montegu",
                50,
                45,
                50,
                57,
                80,
                50,
                60
        );

        harryPotter.compare(hermioneGranger);
        drakoMalfoy.compare(grahamMontegu);
        harryPotter.compareAnyStudents(drakoMalfoy);
        hermioneGranger.compareAnyStudents(grahamMontegu);
    }
}