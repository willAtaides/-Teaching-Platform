package com.projectwill.teachingplatform.entities;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_topic")
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;

    @Column(columnDefinition = "TEXT")
    private String body;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant moment;

    @ManyToOne
    @JoinColumn(name = "lesson_id")
    private Lesson lesson;

    @ManyToOne
    @JoinColumn(name = "reply_id")
    private Reply answer;

    @ManyToOne
    @JoinColumn(name = "offer_id")
    private Offer offer;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private User author;

    @OneToMany(mappedBy = "topic")
    private List<Reply> replies = new ArrayList<>();


    @ManyToMany
    @JoinTable(name = "tb_topic_likes",
    joinColumns = @JoinColumn(name = "topic_id"),
    inverseJoinColumns = @JoinColumn(name = "user_id"))
    private List<User> likes = new ArrayList<>();

    public Topic(){

    }

    public Topic(Long id, String title, String body, Instant moment, Lesson lesson, Offer offer, User author) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.moment = moment;
        this.lesson = lesson;
        this.offer = offer;
        this.author = author;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    public Offer getOffer() {
        return offer;
    }

    public void setOffer(Offer offer) {
        this.offer = offer;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public List<User> getLikes() {
        return likes;
    }


    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Topic topic)) return false;

        return id.equals(topic.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
