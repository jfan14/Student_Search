import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String [] args) throws IOException {

        // Test student data
        Student[] arr = new Student[5];
        Student s1 = new Student(1,"Frank", "12 s union ave");
        Student s2 = new Student(2,"Sam", "34 s wallace ave");
        Student s3 = new Student(3,"Mark", "56 s lowe ave");
        Student s4 = new Student(4,"Tom", "78 s halsted ave");
        Student s5 = new Student(5,"Ellen", "90 s state ave");
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;
        arr[3] = s4;
        arr[4] = s5;


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please Enter the prn you want to search: ");
        int prn = Integer.parseInt(br.readLine());
        int counter = 0;
        for(Student s : arr) {
            if(s.getPrn() == prn) {
                System.out.println(s.toString());
                break;
            }else {
                counter++;
                continue;
            }

        }
        if(counter >= arr.length) {
            System.out.println("No data Found for prn: " + prn);
        }
    }
}
