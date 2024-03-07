public class tablapitagoricamia {
    public static void main(String[] args) {
        System.out.println("X   1   2   3   4   5   6   7   8   9   10");
        for (int i = 1; i <= 10; i++) {

            if (String.valueOf(i).length() == 1) {
                System.out.print(i + "  ");
            } else {
                System.out.print(i + " ");
            }
            
            for (int j = 1; j <= 10; j++) {
                if (String.valueOf(i * j).length() == 1) {
                    System.out.print("00" + (i * j) + " ");
                } else if (String.valueOf(i * j).length() == 2) {
                    System.out.print("0" + (i * j) + " ");
                } else {
                    System.out.print((i * j));
                }
                
            }

            System.out.println();
        }
    }
}
