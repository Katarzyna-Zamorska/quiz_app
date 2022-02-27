package com.sda.quizapp.model;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.Set;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "list_of_users")
public class User extends TimestampedEntity {

    @NotNull
    @NotBlank(message = "Login is mandatory")
    @Size(min = 5, max = 9, message = "Login should has min 5 and max 9 sign")
    private String login;

    @NotNull
    @NotBlank(message = "Password is mandatory")
    @Size(min = 7, message = "Password should has min 7 sign")
    private String password;

    @Embedded
    private Person person;

    @OneToMany(mappedBy = "creator")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<Quiz> quizzes;

    @OneToMany(mappedBy = "creator")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<QuizResolved> quizResolveds;

}
