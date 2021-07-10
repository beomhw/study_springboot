# Spring

Spring boot 예습을 위해서 이렇게 글을 작성했습니다.

왜 Spring인지? Spring과 Spring boot의 차이점은 무엇인지? 개인적으로 궁금했습니다.

# Spring ?

자바 플랫폼을 위한 오픈 소스 어플리케이션 프레임워크

# Why Spring ?

### 초기 Spring 문서에 의한 Spring의 특징

- Spring은 어플리케이션을 구축하기 위한 경량화된 솔루션을 제공하여 효율적인 개발 환경을 제공
- Spring은 MVC 패턴, AOP, 잘 구조화된 예외계층구조를 제공한다.
- Spring은 많은 기능들을 모듈화되어 있어 필요한 모듈들을 선택적으로 사용 가능

### 최신 Spring 문서에 의한 Spring의 특징

- Spring은 자바 엔터프라이즈 어플리케이션 생성을 쉽게 해준다.
- groovy, kotlin 등 jvm 내의 대체 언어들까지 지원이 가능
- 만들고자 하는 어플리케이션의 목적에 따라 유연하게 아키텍쳐를 구성할 수 있다.
- Spring은 오픈 소스로서, 오랜 기간동안 성공적인 프레임워크로서 진화해 왔다.

# Spring Boot (조금 더 봄)

### Spring boot ?

쉽게 만들고 단독적이고 상용화된 수준의 스프링 기반 어플리케이션

**1) 간편한 설정**

- yml을 통해 간결하게 환경 설정하는 것이 가능 (가독성도 good)
- thymeleaf 코드를 간결하게 작성 가능

**2) 편리한 의존성 관리**

- dependency 권장 버전을 자동으로 설정해줌

**3) 내장 서버로 인한 간단한 배포 서버 구축**

- Spring boot에서는 tomcat 이 내장 서버이기에 서버 구동 시간이 절반이 된다.

**4) Spring Security, Data JPA 등의 다른 Spring 프레임워크 요소를 쉽게 사용**

### 프로젝트 생성

개발 환경

- spring boot version: 2.5.2
- project: maven
- language: java (11)
- dependency

```javascript
dependency
	spring-boot-starter
	spring-boot-devtools
	spring-boot-starter-test
	spring-boot-starter-web
	spring-boot-starter-thymeleaf
build
	spring-boot-maven-plugin
```
