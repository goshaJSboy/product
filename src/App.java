import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        String[] names = { "Vova", "Gosga", "Vladimir", "VAnya" };
        for (int i = 0; i < names.length; i++) {
            if (names[i].startsWith("V")) {
                System.out.println(names[i]);
            }
        }
        for ( String name : names ){
            if(!name.startsWith("G")){
                System.out.println(name);
            }
        }
        Arrays.sort(names); // сортирует
        System.out.println(Arrays.toString(names));
    }
}
