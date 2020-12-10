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

> protected void service 과 public void service 의 차이점은 객체지향의 다형성 관점에서 보면  
> 왼쪽 service() 메소드는 HttpServlet 클래스 오른쪽 service() 메소드는 Servlet 클래스의 메소드들이다.  
> 그리고 HttpServlet 클래스는 Servlet 클래스의 자식 클래스이다.  
> 즉, 왼쪽 service() 메소드는 Servlet 클래스의 service() 메소드를 오버라이딩 한 것이다.

### Servlet을 실행시키는 방법  
<strong>어노테이션을 이용해 실행</strong>
```java
~ 생략 ~

@WebServlet("접근 시 사용할 URI")
public class 클래스이름 extends HttpServlet {
    ~ 생략 ~
}
```
<br/>

<strong>web.xml</strong>을 이용해 실행
```xml
<servlet>
    <servlet-name>서블릿 이름</servlet-name>
    <servlet-class>사용할 서블릿 클래스가 있는 디렉토리 주소</servlet-class>
</servlet>

<servlet-mapping>
    <servlet-name>서블릿 이름</servlet-name>
    <url-pattern>접근 시 사용할 URI</url-pattern>
</servlet-mapping>
```
