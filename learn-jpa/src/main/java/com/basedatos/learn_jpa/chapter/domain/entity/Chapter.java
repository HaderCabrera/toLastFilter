package com.basedatos.learn_jpa.chapter.domain.entity;

import com.basedatos.learn_jpa.survey.domain.entity.Survey;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "chapters")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Chapter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "surveyId", nullable = false)
    private Survey survey;

    @Column(columnDefinition = "varchar(50)", nullable = false)
    private String chapterNumber;

    @Column(columnDefinition = "varchar(50)", nullable = false)
    private String chapterTitle;
}
