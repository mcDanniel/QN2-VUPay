import java.util.Scanner;
 
public class VUCourses {
 
    // ----- Variable declarations -----
    private String moduleName;
    private String moduleCode;
    private double tuition;
 
    // Constructor: sets up one course object
    public VUCourses(String moduleName, String moduleCode, double tuition) {
        this.moduleName = moduleName;
        this.moduleCode = moduleCode;
        this.tuition    = tuition;
    }
 
    // Getter methods
    public String getModuleName() { return moduleName; }
    public String getModuleCode() { return moduleCode; }
    public double getTuition()    { return tuition;    }
 
    // Prints the full details of this course
    public void displayDetails() {
        System.out.println("-------------------------------------------");
        System.out.println("Module Name : " + moduleName);
        System.out.println("Module Code : " + moduleCode);
        System.out.printf ("Tuition Fee : UGX %,.0f%n", tuition);
        System.out.println("-------------------------------------------");
    }
 
    public static void main(String[] args) {
 
        // Create one object per course using the table data
        VUCourses[] courses = {
            new VUCourses("BSc. Software Engineering",   "BSF", 900000),
            new VUCourses("BSc. Information Technology", "BIT", 750000),
            new VUCourses("BSc. Computer Science",       "BCS", 800000),
            new VUCourses("BSc. Computer Engineering",   "BCE", 950000)
        };
 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Module Code (BSF / BIT / BCS / BCE): ");
        String input = scanner.nextLine().trim().toUpperCase();
 
        boolean found = false;
        for (VUCourses c : courses) {
            if (c.getModuleCode().equalsIgnoreCase(input)) {
                c.displayDetails();
                found = true;
                break;
            }
        }
 
        if (!found) {
            System.out.println("Wrong Module Code details");
        }
 
        scanner.close();
    }
}