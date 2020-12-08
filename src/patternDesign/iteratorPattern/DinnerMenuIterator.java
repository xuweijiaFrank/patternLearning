package patternDesign.iteratorPattern;

public class DinnerMenuIterator implements Iterator{
    MenuItem[] items;
    int position = 0;


    public DinnerMenuIterator(MenuItem[] items){
        this.items = items;
    }


    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }

    @Override
    public boolean doHasNext() {
        if(position >= items.length || items[position] == null){
            return false;
        }else{
            return true;
        }

    }

    

}
