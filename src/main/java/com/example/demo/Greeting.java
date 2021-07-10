package com.example.demo;

// GET에 대한 요청을 처리
// JSON 형태로 응답을 다음과 같이 출력
// {
//     "id": 1,
//     "content": "Hello, world!"
// }

// 리소스 표현 클래스 생성
// id 및 content 데이터에 대한 필드, 생성자 및 접근자
public class Greeting {
    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getid() {
        return id;
    }

    public String getContent() {
        return content;
    }
}

// Jackson JSON 라이브러리 사용(web starter에 기본 내장)