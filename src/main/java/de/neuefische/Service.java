package de.neuefische;

public class Service {

    private Repo repo = new Repo();

    public int getStringById(String id){
        if (repo.getStringById(id).isPresent()){
            return repo.getStringById(id).get().length();
        }
        return 0;
    }

    public int getStringById2(String id){
        return repo.getStringById(id).orElse("").length();
    }
}
