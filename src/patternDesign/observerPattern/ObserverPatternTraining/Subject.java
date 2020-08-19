package patternDesign.observerPattern.ObserverPatternTraining;

public interface Subject {
    public void registerObersver(Observer o);
    public void removeObserver(Observer o);
    public void notifiyObserver();

}
