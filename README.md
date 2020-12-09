# blog

서블릿 파일을 여는 `web.xml` 과 `@WebServlet` 의 차이점
> `web.xml` 은 xml 파일 읽어들이는 방식 / `@WebServlet` 은 자바 소스를 컴파일  

<br/>

언뜻 보면 둘 다 같은 service() 메소드로 실행될 것 같지만 서로 다른 메소드이다.  
```java
protected void service(HttpServletRequest req, HttpServletResponse resp)

public void service(ServletRequest req, ServletResponse res)
```

`protected void service` 는 클라이언트로부터 온 HTTP 요청에 따라 각 요청의 유형에 맞는 
메서드를 호출한다.  

1. doGet()
2. doPost()
3. doHead()
4. doDelete()  

등이 있고, <strong>반면</strong>  

`public void service` 는 클라이언트로부터 온 HTTP 요청을 `protected void service` 로 보낸다.  
또한, 클라이언트로부터의 요청이 올 때마다 다른 쓰레드가 뜨면서 이 메소드를 실행 시킨다. 그래서 이 메소드는 필요하다면 synchronized 구현하여야 한다.  





