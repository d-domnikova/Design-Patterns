package edu.patterns.Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class ObservationCenter {
    private CatastropheData data;

    private List<CatastropheObserver> observers = new ArrayList<>();
    public void addObserver(CatastropheObserver observer) {
        observers.add(observer);
    }
    public void removeObserver(CatastropheObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers(){
        observers.forEach(observer -> observer.Update(data));
    }
    public void obtainData(CatastropheData data) {
        this.data = data;
        notifyObservers();
    }
}
