package org.example;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AuthorEntityes {
    private String name;
    private String surname;
    private String lastname;

    @Override
    public String toString() {
        return name + " " + surname + " " + lastname;
    }



    }






