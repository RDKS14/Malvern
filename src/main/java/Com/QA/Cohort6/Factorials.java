package Com.QA.Cohort6;

public class Factorials {
    public String factoral(int factorial) {

        for (int i = 2; i < Integer.MAX_VALUE; i++) {
            factorial /= i;
            if (factorial == 1) {
                return String.valueOf(i);
            }

        }

    return "None ";
    }
}
