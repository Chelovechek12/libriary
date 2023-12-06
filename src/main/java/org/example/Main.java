//Импорт файлов с папки LibraryEntity;
package org.example;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {
    public static void main(String[] args)  {
        int a;
        Scanner scanner = new Scanner(System.in);
        org.example.libraryEntity.LibraryAllBooks books = new org.example.libraryEntity.LibraryAllBooks();
        Gson gson = new Gson();
        try
        {
            FileReader reader = new FileReader("./fileForJson.txt");
        }

        catch (IOException ex){
            System.out.println(ex.getMessage());
        }


        do {
            Menu.mainMenu();
            a = scanner.nextInt();
            switch (a) {
                case 1: System.out.println("Библиотека в которой можно создать книгу найти книгу и возможно если звезды сойдутся то удалить её");break;
                case 2:
                    if (books.getData()== null) {
                        System.out.println("Библиотека пуста, заполните же её!");
                    }
                    else books.getData().forEach(System.out::println);break;
                case 3:

                   org.example.AuthorEntity author = new org.example.AuthorEntity();
                    scanner.nextLine(); //Штука, которая не позволяет сканнеру перепрыгивать на другое поле, которое надо заполнить
                    System.out.printf("Введите ИМЯ автора: ");
                    author.setName(scanner.nextLine());
                    System.out.printf("Введите ФАМИЛИЮ автора: ");
                    author.setLastname(scanner.nextLine());
                    System.out.printf("Введите ОТЧЕСТВО автора: ");
                    author.setSurname(scanner.nextLine());
                    org.example.libraryEntity.PublisherEntity publisher = new org.example.libraryEntity.PublisherEntity();
                    System.out.printf("Введите НАЗВАНИЕ издательства: ");
                    publisher.setNamePublisher(scanner.nextLine());
                    System.out.printf("Введите ГОРОД издательства: ");
                    publisher.setCityPublisher(scanner.nextLine());
                    BookEntity book = new BookEntity();
                    book.setAuthors(author);
                    book.setPublsihers(publisher);
                    System.out.printf("Введите НАЗВАНИЕ книги: ");
                    book.setTittle(scanner.nextLine());
                    System.out.println(gson.toJson(book));

                    if (books.getData()==null) {
                        List<BookEntity> temp = new ArrayList<>();
                        temp.add(book);
                        books.setData(temp);
                        System.out.printf("Книга успешно добавлена в библиотеку!\n");
                    }

                    else {
                        boolean add = books.getData().add(book);
                        System.out.printf("Книга успешно добавлена в библиотеку!\n");
                    }
                    break;
                case 4: System.out.println("Зачем вам это нужно? С книгами так нельзя!");break;
                case 5: System.out.println("Не найдёте она спрятана в надёжном месте");break;




                case 6:try{ File fileForJson = new File("D:\\fileForJson.txt");
                    if (!fileForJson.exists())
                        fileForJson.createNewFile();
                    FileWriter fw;
                    fw = new FileWriter(fileForJson);

                    fw.write(gson.toJson(books));
                    fw.close();
                    System.out.println("Запись завершена.");
                } catch (IOException e) {
                    e.printStackTrace();
                };break;
                case 7: System.out.println("До свидания, хорошего дня!");
            }
        }
        while (a!=7);
    }
}






