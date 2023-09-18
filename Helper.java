public class Helper {
    
    public static void print(String toPrint) {
        for (int i = 0; i < toPrint.length(); i++) {
            System.out.print(toPrint.charAt(i));
            try {
                Thread.sleep(40);
            } catch (InterruptedException ex) {}
        }
        System.out.println();
    }
}
