public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            LPAStudent s = new LPAStudent("S92300" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymouse";
                    },
                    "05/11/1985",
                    "Java Masterclass");

            System.out.println(s);
        }

        // Instantiate two student objects of type pojo and type record
        Student pojoStudent = new Student("S923006", "Ann",
                "05/11/1985", "Java Masterclass");
        LPAStudent recordStudent = new LPAStudent("S923007", "Bill",
                "05/11/1985", "Java Masterclass");

        // Output the two objects
        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        // Calling the setter method on object of type pojo only because type record does not have any setter methods
        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");

        // Calling getter methods on both objects of type pojo and type record
        System.out.println(pojoStudent.getName() + " is taking " +
                pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " +
                recordStudent.classList());
    }
}
