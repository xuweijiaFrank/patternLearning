package patternDesign.iteratorPattern;

public class DinerMenu {
    static final int MX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public Iterator createIterator(){
        return new DinnerMenuIterator(menuItems);
    }
}
