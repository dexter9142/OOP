package OOP;

class Main {
    public static void main(String[] args) {
        university1 utm = new university1();
        university2 utm1 = new university2();
        university3 utm2 = new university3();
        int i;
        System.out.println("UTM Foundation Year: 1975");
        for(i=0; i<3; i++) {
            utm.getNumArray(i);
        }
        System.out.println("\n Avg:");
        System.out.println(utm.Mean(2));

        System.out.println("\n");
        System.out.println("USM Foundation Year: 1995");
        for(i=0; i<3; i++) {
            utm1.getNumArray(i);
        }
        System.out.println("\nAvg: ");
        System.out.println(utm1.Mean(2));
        System.out.println("\n");
        System.out.println("ULIM Foundation Year: 1994");
        for(i=0; i<3; i++) {
            utm2.getNumArray(i);
        }
        System.out.println("\n Avg: ");
        System.out.println(utm2.Mean(2));
    }
}

class university1 {
    String[] studs =    {"Ion", "Alex", "Igor"};
    int[] age = {19, 18, 20};
    public float[] marks = {10.0f, 9.65f, 7.86f};

    public void getNumArray(int i) {
        System.out.println(studs[i] + "  " + age[i] + "  " + marks[i]);
    }

    public float Mean(int i) {
        int j;
        float sum = 0;
        for(j=0; j<=i; j++){
            sum += marks[j];
        }
        return sum/j;
    }

}

class university2 {
    String[] studs = {"Ion", "Alex", "Igor"};
    int[] age = {19, 18, 20};
    float[] marks = {9.0f, 9.65f, 7.86f};

    public void getNumArray(int i) {
        System.out.println(studs[i] + "  " + age[i] + "  " + marks[i]);

    }

    public float Mean(int i) {
        int j;
        float sum = 0;
        for(j=0; j<=i; j++){
            sum += marks[j];
        }
        return sum/j;
    }
}

class university3 {
    ;
    String[] studs = {"Ion", "Alex", "Igor"};
    int[] age = {18, 18, 20};
    float[] marks = {10.0f, 9.65f, 8.86f};

    public void getNumArray(int i) {
        System.out.println(studs[i] + "  " + age[i] + "  " + marks[i]);
        //  return 0;
    }

    public float Mean(int i) {
        int j;
        float sum = 0;
        for (j = 0; j <= i; j++) {
            sum += marks[j];
        }
        return sum / j;
    }

}


