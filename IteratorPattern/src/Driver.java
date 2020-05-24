/*
 * CST361-Java Design Patterns
 * Vien Nguyen
 * */
public class Driver {
    public static void main(String[] args) {
 
        MenuItems menu = new MenuItems();
        menu.addItem(new Item("CST101", "/C++"));
        menu.addItem(new Item("CST126", "/java"));
        menu.addItem(new Item("CST117", "/C#"));
 
        ItemIterator<Item> iterator = menu.iterator();
        while (iterator.hasNext()) {
            Item item = iterator.next();
            System.out.println(item);
        }
    }
}