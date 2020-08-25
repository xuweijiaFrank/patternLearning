package patternDesign.observerPattern.training;

public interface Subject {
    public void notification();
    public void register(Observer observer);
}
