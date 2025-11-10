package temp;

public class OSNameCheck {
    public static void main(String[] args) {
        System.out.println(System.getProperty("os.name"));
        String FilePath;
        if (System.getProperty("os.name").equals("Linux")) {
            FilePath = "/home/msvr/projects/";
        } else {
            FilePath = "C:\\Users\\msvr\\Projects";
        }
        System.out.println(FilePath);
    }
}
