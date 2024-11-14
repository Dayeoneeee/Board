package com.example.boardproj.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BoardImg {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ino;

    private String imgPath; //이미지 경로

    private String imgName; //이미지 원본 이름

    //uuid사용시
    private String newImgName;  //저장되는 파일 이름(중복X)

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bno")
    private Board board;            //pk값으로 객체를 가져와서 담을 객체타입으로 작성하여 참조한다.
    //Board를 참조하도록 join 하기 << 중요




}
