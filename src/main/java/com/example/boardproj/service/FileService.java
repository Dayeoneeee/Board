package com.example.boardproj.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

//BoardimgService 보다 우선해서 만들기
@Component  //컴포넌트를 사용해서 bean등록을 해야 다른 패키지에서도 해당 서비스를 사용 가능.
public class FileService {

    @Value("${imgLocation}")
    private String imgLocation; //프로퍼티스의 실저장소 경로 가져오기

    public void register(MultipartFile multipartFile, String newImgName){   //multipartFile < 이미지 저장할 때 쓰는 타입
        //들어온 사진이름

        System.out.println(imgLocation+ "\\" +newImgName);


        //사진 경로 및 이름
        File file  = new File(imgLocation  + "\\" +newImgName);
        //사진저장

        try {
            multipartFile.transferTo(file); //multipartFile로 들어오는 이미지를 file경로로 transferTo(저장)합니다.

        }catch (IOException e){

        }

    }


    //물리 파일 삭제
    public void delFile(String filePath){

        File deleteFilekkk = new File(filePath);

        //if( 파일객체변수명 deleteFilekkk가 존재한다면~)
        if(deleteFilekkk.exists()){
            deleteFilekkk.delete(); //물리 파일 삭제
            System.out.println("파일 삭제 완료");


        }else {
            System.out.println("파일 삭제 불가");
            System.out.println("파일 삭제 불가");
            System.out.println("파일 삭제 불가");

        }
    }

}
