import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee(); 

        System.out.print("Name: ");
        emp.name = sc.nextLine();
        System.out.print("Gross salary: ");
        emp.grossSalary = sc.nextDouble();
        System.out.print("tax: ");
        emp.tax = sc.nextDouble();
}
