public class array {
    public static void main(String[] args) {
        int[]angka1 = {1,2,3,4,5};
        int[]angka2 = {6,7,8,9,10};

        System.out.println("Array a :");

        for (int i = 0; i < angka1.length; i++){
            if ((angka1[i] & 1) == 0) {
                System.out.println(angka1[i] + " = ganjil");
            } else {
                System.out.println(angka1[i] + " = genap");
            }
        }

        System.out.println("Array b :");

        for (int i = 0; i < angka2.length; i++){
            if ((angka2[i] & 1) == 0) {
                System.out.println(angka2[i] + " = ganjil");
            } else {
                System.out.println(angka2[i] + " = genap");
            }
        }
    }
    
}