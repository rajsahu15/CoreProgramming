public class Third {
    public static void main(String[] args) {
      Second.Run();
      Second.STOP();
      execute();
    }
    public static void execute() {
        System.out.println("Executing Third class method.");
    }
}
