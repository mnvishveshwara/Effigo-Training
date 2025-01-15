import java.util.Arrays;

public class UpdatingArray {
    public static void main(String[] args) {
        String[] menu = { "Espresso", "Iced Coffee", "Macchiato" };
        menu[2] = "latte";
        String menuString = Arrays.toString(menu);
        System.out.println(menuString);

        String[] newMenu = new String[5];
        for (int i = 0; i < menu.length; i++) {
            newMenu[i] = menu[i];
        }
        newMenu[3]="House Blend";
        newMenu[4]="French Roast";
        System.out.println(Arrays.toString(newMenu));
    }
}
