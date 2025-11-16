package temp;

public class OSNameCheck {
    public static void main(String[] args) {

        /* Prints the name of the current OS the bytecode is run into */
        System.out.println(System.getProperty("os.name"));
        String FilePath = System.getProperty("os.name").equals("Linux") ? "/home/msvr/projects" : "C:\\Users\\msvr\\Projects";
        System.out.println(FilePath);
    }
}
