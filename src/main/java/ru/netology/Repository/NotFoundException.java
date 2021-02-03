package ru.netology.Repository;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String massage){
        super(massage);
    }

}
