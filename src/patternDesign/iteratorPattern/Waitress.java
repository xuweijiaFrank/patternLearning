package patternDesign.iteratorPattern;

public class Waitress {
    DinerMenu dinerMenu;

    public Waitress(DinerMenu dinerMenu){
        this.dinerMenu = dinerMenu;
    }

    public void printMenu(){
        Iterator dinerIterator = dinerMenu.createIterator();
        System.out.println("Menu----------------------");
        printMenu(dinerIterator);
    }

    public void printMenu(Iterator iterator){
        while(iterator.doHasNext()){
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.println(menuItem.getName());
            System.out.println(menuItem.getPrice());
            System.out.println(menuItem.getDescription());
        }
    }
}
