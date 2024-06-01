package edu.patterns.Behavioral.Observer;

public class CatastropheMessenger implements CatastropheObserver{
    @Override
    public void Update(CatastropheData data) {
        System.out.println("Catastrophe Messengers observe the catastrophe data. \n" + data.toString());
    }
}