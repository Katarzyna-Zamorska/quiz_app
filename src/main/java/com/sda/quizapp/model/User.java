package com.sda.quizapp.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "list_of_users")
public class User extends BaseEntity {

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

    @Column(name = "create_date_time")
    @CreationTimestamp
    @JsonFormat(pattern = "dd-MM-yyy@HH:mm")
    private LocalDateTime createDateTime;

    @OneToMany(mappedBy = "creator")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<Quiz> quizzes;

    @OneToMany(mappedBy = "creator")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<QuizResolved> quizResolveds;

}
