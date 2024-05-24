## 코틀린-스프링부트
### Book API
```HTTP
GET /api/books/1 HTTP/1.1
Host: localhost:8080

GET /api/books HTTP/1.1
Host: localhost:8080

PUT /api/books/1 HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Content-Length: 54

{
    "title":"코틀린 완벽 가이드",
    "author":"알렉세이 세두노프"
}

DELETE /api/books/1 HTTP/1.1
Host: localhost:8080
```
