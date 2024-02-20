class student  {
    public String course[] = { "C#", "Applied statistics", "JAVA" };
    public int marks[] = { 70, 100, 30 };

    public void Display() {
        String name = "Sanju";
        String program = "BCA";
        String department = "BCA";
        System.out.println("Name of the student" + name);
        System.out.println("Program" + program);
        System.out.println("Department" + department);
        for (int i = 0; i < 3; i++) {
            System.out.println("Course:" + course[i] + " marks:" + marks[i]);
        }
    }

    public static void main(String[] args) {
        student s = new student();
        s.Display();
        s.read();
    }
}