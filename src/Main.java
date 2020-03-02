public class Main {

    public static void main(String[] args) {
        String firstName = "Ben";
        int age = 33;
        int dayOfBirth = 20;
        int monthOfBirth = 12;
        int yearOfBirth = 1986;
        double averageGrade = 2.1;
        boolean isMarried = false;
        boolean isMale = true;
        String gender = isMale ? "male" : "female";
        String pronoun = isMale ? "he" : "she";
        String married = isMarried ? "married" : "not married";


        System.out.println("This is " + firstName + ", " + age + " years of age, and born "
                + dayOfBirth + "." + monthOfBirth + "." + yearOfBirth + ".");
        System.out.println(firstName + "'s average grade is " + averageGrade + ", "
                + pronoun + " is " + gender + " and "+ married + ".");

    }
}
