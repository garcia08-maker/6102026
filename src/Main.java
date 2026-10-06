public class Main {

    public static int contarbumeranes(int[] array) {
        int contador = 0;

        for (int i = 0; i < array.length - 2; i++) {
            if (array[i] == array[i + 2] && array[i] != array[i + 1]) {
                contador++;
                System.out.println("bumeran: [" + array[i] + ", "
                        + array[i + 1] + ", " + array[i + 2] + "]");
            }
        }

        return contador;
    }

    public static void main(String[] args) {
        int[] array = {2, 1, 2, 3, 3, 4, 2, 4};

        int total = contarbumeranes(array);

        System.out.println("Total de bumeranes: " + total);
    }
}
