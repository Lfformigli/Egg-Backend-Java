package EstructurasDeControl;

public class Extra12 {

    public static void main(String[] args) {

        String a, b, c;

        for (int i = 0; i < 10; i++) {

            if (String.valueOf(i).equals("3")) {
                a = "E";
            } else {
                a = String.valueOf(i);
            }

            for (int j = 0; j < 10; j++) {

                if (String.valueOf(j).equals("3")) {
                    b = "E";
                } else {
                    b = String.valueOf(j);
                }

                for (int k = 0; k < 10; k++) {

                    if (String.valueOf(k).equals("3")) {
                        c = "E";
                    } else {
                        c = String.valueOf(k);
                    }

                    System.out.println(a + " - " + b + " - " + c);
                    System.out.println("");
                }
            }
        }
    }
}
