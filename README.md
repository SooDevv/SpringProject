# SpringProject

## #1. Simple_blog

Spring Boot를 이용한 web 응용 프로그램
- Spring Starter SpringProject
- Dependencies : Web, Thymeleaf, JPA, H2
- 내장 Tomcat 기동

### Thymeleaf

- 템플릿 엔진
- html 형식

### JPA

- Java의 객체와 DB의 관계를 연결하는 O/R 매퍼
- Entity, Repository, Service로 구현

### H2

- JDBC API
- in-memory databases
- 브라우저 기반 콘솔 어플리케이션



## #2. herokudemo

Heroku 클라우드에 node.js App 을 생성하여 앱 단위로 배포 및 운영

### Heroku

- PaaS(Platform as a Server)
- git 소스코드 관리 시스템을 사용하여 heroku의 코드 배포

#### 배포 방법

- 현재 source를 local repository 에 등록
- 배포할 App 의 파일로 가서 다음의 코드 실행

~~~
$ git init .
$ git add .
$ git commit -m "commit my app"
~~~

- Heroku repository 에 등록
~~~
$ heroku login

//heroku에 new app 생성
$ heroku apps:create herokudemosoojung

//기존의 app과 연결되어있을 수 있으니 현재 app 에 remote 해주는게 좋다
$ heroku git:remote - a herokudemosoojung

$ git push heroku master

//application 로그 확인
$ heroku logs --tail

//작동
$ heroku open
~~~
