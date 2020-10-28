package local;

public class Boot {
    public static void main(String[] args) {
        try {
            new VirtualMachine("PATH").run("local","main");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
