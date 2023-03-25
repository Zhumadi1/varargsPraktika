public class Main {
    public static void main(String[] args) {
//        String[] array1 = new String[]{"men", "sen", "al"};
//        int[] arr = new int[]{1, 2, 3};
//        method(arr, array1);
        String soz = "  I like Java!!!";
        System.out.println(soz.charAt(soz.length()-1));
        System.out.println(soz.endsWith("!!!"));
        System.out.println(soz.startsWith("I like"));
        System.out.println(soz.contains("Java"));
        System.out.println(soz.replace("a","o"));
        System.out.println(soz.substring(8,13).toUpperCase());
        System.out.println(soz.substring(8,13).toLowerCase());
        System.out.println(soz.length());
        System.out.println(soz.trim());



    }



    static void method(int[] array, String... names) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(names[i] + " " + array[i] + "лет");

        }
    }
}