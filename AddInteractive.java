import javax.swing.*;

public class AddInteractive {

    public Student addStudentInteractive() throws AdditionalException {

        try {
            String name;
            for (; ; ) {
                name = String.valueOf(JOptionPane.showInputDialog("Input name: "));
                if (name.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Incorrect value. Can't be empty. Try again.");
                } else {
                    break;
                }
            }
            String surname;
            for (; ; ) {
                surname = String.valueOf(JOptionPane.showInputDialog("Input surname: "));
                if (surname.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Incorrect value. Can't be empty. Try again.");
                } else {
                    break;
                }
            }
            int age;
            for (; ; ) {
                age = Integer.valueOf(JOptionPane.showInputDialog("Input age as number of full years: "));
                if (age < 16) {
                    JOptionPane.showMessageDialog(null, "Incorrect value. The age value is too small. Try again.");
                } else {
                    break;
                }
            }
            String sex;
            for (; ; ) {
                sex = String.valueOf(JOptionPane.showInputDialog("Input sex (male or female): "));
                if (sex.equals("male") || sex.equals("female")) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect value. The sex value can be male or female. Try again.");
                }
            }
            int growth;
            for (; ; ) {
                growth = Integer.valueOf(JOptionPane.showInputDialog("Input growth in sm: "));
                if (growth < 80 && growth > 250) {
                    JOptionPane.showMessageDialog(null, "Incorrect value. The growth value available between 80 and 250 sm. Try again.");
                } else {
                    break;
                }
            }
            int weight;
            for (; ; ) {
                weight = Integer.valueOf(JOptionPane.showInputDialog("Input weight in kg (use \".\" as separator if needed): "));
                if (weight < 20) {
                    JOptionPane.showMessageDialog(null, "Incorrect value. The value must be more than 20 kg. Try again.");
                } else {
                    break;
                }
            }
            String faculty;
            for (; ; ) {
                faculty = String.valueOf(JOptionPane.showInputDialog("Input faculty: "));
                if (faculty.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Incorrect value. Can't be empty. Try again.");
                } else {
                    break;
                }
            }
            int course;
            for (; ; ) {
                course = Integer.valueOf(JOptionPane.showInputDialog("Input course: "));
                if ((course < 1) || (course > 5)) {
                    JOptionPane.showMessageDialog(null, "Incorrect value. The value must be between 1 and 5. Try again.");
                } else {
                    break;
                }
            }
            Student student = new Student(name, surname, age, sex, growth, weight, faculty, course);
            return student;

        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "You've pressed cancel");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error number format"); //Microsoft style
        }
        return null;
    }
}
