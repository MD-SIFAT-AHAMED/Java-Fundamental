
class Student {

    String name;
    int age;
}

public class array {

    public static void main(String[] args) {
        // 1D array
        int arr[] = new int[10];
        int aee[] = new int[38];

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // 2D array
        int nums[][] = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                nums[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int n[] : nums) {
            for (int r : n) {
                System.out.print(r + " ");
            }
            System.out.println();
        }
        System.out.println("Jagged array");
        // Jagged array
        int value[][] = new int[3][];
        value[0] = new int[3];
        value[1] = new int[5];
        value[2] = new int[2];

        for (int i = 0; i < value.length; i++) {
            for (int j = 0; j < value[i].length; j++) {
                value[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int n[] : value) {
            for (int r : n) {
                System.out.print(r + " ");
            }
            System.out.println();
        }

        System.out.println("Student object print");

        Student s1 = new Student();
        s1.name = "sifat";
        s1.age = 29;

        Student s2 = new Student();
        s2.name = "sifat ahamed";
        s2.age = 19;

        Student s3 = new Student();
        s3.name = "Md sifat";
        s3.age = 43;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // ForEach loop
        for (Student stud : students) {
            System.out.println(stud.name + " " + stud.age);
        }
    }
}
