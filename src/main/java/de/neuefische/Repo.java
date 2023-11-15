package de.neuefische;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Repo {

    Map<String, String> stringMap = new HashMap<>();

    public Optional<String> getStringById(String id){
        return Optional.ofNullable(stringMap.get(id));
    }
}
