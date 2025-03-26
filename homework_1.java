public class homework_1 {
        public static void main(String[] args) {
          
            int [] mass = new int[] {5,8,2,10,7,3};
            int sum = 0;
            for (int i = 0; i < mass.length; i++) {
                sum = sum + mass[i];
            }
            System.out.println(sum);

            int [] mass2 = new int[] {5,8,2,10,7,3};
            int max = mass2[0];
            for (int i = 0; i < mass2.length; i++) {
                if (mass2[i] > max) {
                    max = mass2[i];
                }
            }
            System.out.println(max);

            int [] mass3 = new int[] {5,8,2,10,7,3};
            int min = mass3[0];
            for (int i = 0; i < mass2.length; i++) {
                if (mass3[i] < min) {
                    min = mass3[i];
                }
            }
            System.out.println(min);
        }
    
}



