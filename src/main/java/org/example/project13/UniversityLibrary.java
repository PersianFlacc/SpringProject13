package org.example.project13;

import org.springframework.stereotype.Component;

@Component
public class UniversityLibrary extends AbstractLibrary{

    @Override
    public void getBook() {
        System.out.println("Мы берем книгу из UniversityLibrary");
    }

    public void getMagazine() {
        System.out.println("Мы берем журнал из UniversityLibrary");
    }

    public void returnBook() {
        System.out.println("Мы возвращаем книгу в UniversityLibrary");
    }
}
