package Com.QA.Cohort6;
public class Doggy {
    public String places(int d) {
        StringBuilder otherPlaces = new StringBuilder();
        for (int i = 1; i < 100; i++) {

            if (i == d)
                continue;

            otherPlaces.append(String.valueOf(i));


            if (i%10 == 1)
                otherPlaces.append("st");
            else if (i%10 == 2)
                otherPlaces.append("nd");
            else if (i%10 == 3)
                otherPlaces.append("rd");
            else
                otherPlaces.append("th");

            }
return otherPlaces.toString();
        }
    }
