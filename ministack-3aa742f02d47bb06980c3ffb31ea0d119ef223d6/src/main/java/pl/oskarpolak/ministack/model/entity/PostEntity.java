package pl.oskarpolak.ministack.model.entity;

import lombok.Data;
import pl.oskarpolak.ministack.model.form.PostForm;
import pl.oskarpolak.ministack.model.form.RegisterForm;

import javax.persistence.*;

@Entity
@Table(name = "post")
@Data
public class PostEntity {
    @Id
    @GeneratedValue
    private int id;
    private int user_id;
    private String title;
    private String content;

    //@Column(name = "password_user")
    private String password;

    public PostEntity() { }

    public PostEntity(PostForm postForm){

    }
}
