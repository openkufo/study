> 출처
[mdn HTTP]

### Resource 정의
- HTTP 요청 대상
- 문서, 사진, HTTP 문서 등 어떤 것이든 될 수 있음

### HTTP(HyperText Transfer Protocol)
- 웹에서 이루어지는 모든 데이터 교환의 기초
- HTML 문서와 같은 Resource를 fetch 할 수 있도록 해주는 프로토콜
    - 1개의 문서는 fetched된 하위 문서들로 재구성
- [클라이언트 - 서버] 프로토콜 모델
- Stateless protocol(무상태)
- Application Layer(응용 계층)

### Request(요청) / Response(응답)
- Request
    - 클라이언트가 서버로 데이터를 전달하여 서버에서 액션하게끔 하는 메세지
- Response
    - Request에 대한 서버의 Answer(답변)
- 모든 요청과 응답 사이에는 많은 컴퓨터들이 존재
    - Gateway 또는 Cache 역할을 하는 Proxy
    - Network Layer에 의해 숨겨진 Router, Modem

### HTTP Messages(HTTP 메시지)
- 서버와 클라이언트간에 데이터가 교환되는 방식
- ASCII로 인코딩된 텍스트 정보
- |HTTP 버전|내용|
  |:-:|:-|
  |`HTTP/0.9`|✅ 한 줄 프로토콜로써 HTML 파일로만 구성<br/>✅ `GET /test.html`<br/>✅ 버전 번호가 없었고 1.0 버전 개발 이후 구별하기위해 0.9라고 표기|
  |`HTTP/1.0`|✅ 각 요청 내 버전 정보 전송<br/>✅ 응답 시작시 상태 코드 줄 전송(성공 또는 실패 인식 가능)<br/>✅ Request/Response 모두 HTTP Header 개념 도입(Content-Type의 가능성 확장)|
  |`HTTP/1.1`|✅ 이전 버전들에 비해 모호성을 명확히 하고 많은 개선사항 도입(표준화)<br/>✅ 연결 재사용으로 시간 절약<br/> ✅ Pipelining 추가(다중 요청 처리)<br/>✅ 청크 응답 추가<br/>✅ 추가적인 캐시 제어 매커니즘<br>✅ Host Header 덕분에 동일 IP주소에 다른 도메인을 호스트하는 기능이 가능|
  |`HTTP/2`|✅ 사람이 읽을 수 있는 텍스트가 아닌 이진 프로토콜<br>✅ 전송된 데이터의 중복과 불필요한 오버헤드는 제거하면서 유사한 연속된 요청 사이의 헤더들을 압축<br>✅ 병렬 요청 가능한 다중화 프로토콜<br>✅ Alt-Svc 지원으로 CDN 매커니즘을 따라서 신분(identification) 증명과 자원의 위치를 분리<br>✅ Client Hints 도입으로 클라이언트 요구사항과 서버의 하드웨어 제약사항에 관한 정보를 사전에 주고 받기 가능<br>✅ Cookie 내 보안 관련 접두사 도입으로 쿠키가 변경되지 않았다는 것을 보장|
  |`HTTP/3`|✅ Transfer Layer의 TCP/TLS 대신 QUIC 사용됨|

### HTTP Request Method(HTTP Verbs)
|HTTP Method|내용|
|:-:|:-|
|`GET`|`GET` 을 사용하는 요청은 데이터를 받기만 함|
|`HEAD`|`GET` 요청과 동일한 응답을 요구하지만 응답 본문을 포함하지 않음|
|`POST`|특정 리소스에 엔티티를 제출할 때(서버에 데이터를 전달할 때) 사용됨|
|`PUT`|대상 리소스의 모든 표현을 request payload로 변경|
|`DELETE`|특정 리소스 삭제|
|`CONNECT`|리소스로 식별되는 서버로의 연결을 시작|
|`OPTIONS`|대상 리소스에 대한 통신 옵션 설명|
|`TRACE`|대상 리소스에 대한 경로를 따라 메세지 루프백 테스트 수행|
|`PATCH`|리소스에 부분 수정을 적용|

##### 마무리...
무작정 form 태그로 데이터를 주고받기만 하다보니 GET(가져오다), POST(보내다)의 뜻을 생각하려고도 하지 않았다.

이번기회에 메세지와 통신 방법에대해 좀 더 배운것 같다.

[mdn HTTP]:https://developer.mozilla.org/ko/docs/Web/HTTP