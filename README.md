# 장바구니
장바구니 미션 저장소



## 기능 목록 🛠

### 회원 기능

- [x] 회원 가입
  - [x] 회원의 로그인 아이디는 중복될 수 없다.
  - [x] 회원의 로그인 아이디는 이메일 형식이다.
  - [x] 회원의 비밀번호는 
    - [x] 대문자 최소 1개 
    - [x] 소문자 최소 1개 
    - [x] 숫자 최소 1개 
    - [x] 특수문자 최소 1개
    - [x] 길이는 8자에서 15자사이
- [x] 회원 정보 조회
  - [x] 로그인한 회원의 정보를 볼 수 있다.
- [x] 회원 정보 수정
  - [x] 아이디와 비밀번호는 변경할 수 없다.
  - [x] 이름을 변경할 수 있다.
- [x] 회원 탈퇴
  - [x] 비밀번호가 다르면 삭제할 수 없다.

### 인증 & 인가
- [x] 로그인
  - [x] JWT 라이브러리를 사용하여 액세스 토큰 발급
- [x] 사용자 인가
  - [x] 클라이언트에서 Request 된 액세스 토큰의 유효성 확인
    - [x] 토큰의 만료기간
    - [x] 토큰에 등록된 아이디의 유효성
  - [x] 권한에 따라 볼 수 있는 내용을 구분




## 페어 규칙 🧨

- 하나의 노트북으로 진행하며, 교대 시간은 자율적으로 한다.
- 100분 단위로 20분씩 쉬는 시간을 가진다.
- 일일회고를 진행한다.
- 페어 종료 후 리뷰 받은 정보를 공유한다.
- `드라이버`가 TDD를 하지 않았을 경우 해당 코드를 전부 삭제하고, `네비게이터`가 다시 작성한다.
- 일일회고를 하기전에 깨지는 테스트를 하나 만든다.



## 미션 목표 🎯

- TDD를 엄격하게 지키자
- Classist 방식과 Mockist 방식을 적절히 섞어서 사용해본다.
  - Acceptance Test로 전체 시나리오를 작성하고
  - Domain을 TDD로 구현하고, DaoTest를 만든다. 
  - ServiceTest에서는 로직의 실행여부를 확인한다.
  - Controller Test는 입력값에 대한 검증을 한다.



## 일일 회고 😉

2022.05.27

### 느낀점

`아서`: 뭔가 간단할 것 같은 기능인데, 인증이 들어가니까 부담감이 크고 갑자기 프론트가 겹쳐서 일이 커지는 것 같은 느낌?

`페퍼`: 앞으로를 생각하면 막막하지만, 오늘 미션은 나름 순조롭게 흘러가서 앞으로도 이대로 마무리 되었으면..

### 페어에게 좋았던 점

`아서`: 페퍼는 깃을 너무 잘 다루고, 뭔가 AWS에 접근하는 것도 예사롭지 않다... 앞으로가 기대된다.

`페퍼`: 지금까지의 미션을 매우 성실하게 진행한거 같아서 기본기가 탄탄해서 좋았다. 배울점이 많아.

### 아쉬웠던 점

`아서`: 프론트의 요구사항을 수용하려다 보니까 뭔가 보안관련 공부할 내용이 너무 많아진 느낌..?? 뭔가 내가 프로젝트에 대한 이해가 모자라서 그랬던거 아닐까 하는 생각이 들었다.

`페퍼`: 프론트 분들이랑 처음 보는건데 온라인으로 해서 더더욱 소통이 안되었던 점이 제일 아쉬웠다.



2022.05.28

### 느낀점

`아서`: 생각보다 구현할 사항이 쉽다? 암호화를 하는 라이브러리를 찾아봐야겠다.

`페퍼`: 2일차인데 TDD 지키기 벌써 힘들었다... 앞으로는 네비게이터일 때 더 정신차려야겠다.

### 페어에게 좋았던 점

`아서`: TDD를 엄격하게 하자는 규칙을 지키려고 해줘서 좋았다. 나도 TDD를 잘 못지키는데 이번에는 잘 지킬 수 있을 것 같다.

`페퍼`: 테스트 라이브러리에 대한 이해가 깊어서 좋았다. 단축키도 많이 안다.

### 아쉬웠던 점

`아서`: 시간이 조금 짧아서, 굳이 일일회고를 해야하나 라는 조금 귀찮은 감이 없지않아 있었다.

`페퍼`:아쉬울 새도 없었다... 월요일에 지켜봐야지..



2022.05.30

### 느낀점

`아서`: 인증과 인가가 끝이 없다. 정말 제대로 보안을 지켜보려하면 너무 과제가 어려워지는 것 같아서 차근차근하는게 중요한 것 같다. 

`페퍼`: 오늘 일단 최소한의 인증을 구현해서 다행이다. PR 전까지 깊게 고민할 수 있는 시간이 있었으면 좋겠다.

### 페어에게 좋았던 점

`아서`: 여러 미션이 겹쳐서 시간이 촉박한데도 불구하고 미션을 그냥 후다닥 구현하려는게 아니라 제대로 해보려고해서 좋았다.

`페퍼`: 바쁜 하루를 이해해줘서 감사합니다🙏🏻

### 아쉬웠던 점

`아서`: 테스트 픽스쳐를 한글로 쓰니까 자동완성이 잘 되지 않는다. MockMVC를 능숙하게 다루지 못해서 공부를 좀 해야겠다.

`페퍼`:PR 마감 기준으로 생각하면 촉박한 시간이 아닌데, 주변 크루들의 진도랑 비교해서 자꾸 급한 마음이 든다. 멘탈 관리 잘해야지.



2022.05.31

### 느낀점

`아서`: 인증 인가를 막상 구현하고 보니 그렇게 어렵지는 않았다. 하지만 비밀번호가 암호화를 안한게 거슬린다...이것도 해야하나😅 

`페퍼`: 스프링 동작 방식 어렵다.

### 페어에게 좋았던 점

`아서`: 되게 쓸데없는 나만의 고민(?)이 많은편인데 잘 수용해주고 같이 고민해줘서 고마웠다

`페퍼`: 아서가 아는 부분(스프링 동작 원리)을 친절하게 설명해줘서 너무 고마웠다. 

### 아쉬웠던 점

`아서`: 프론트와 팀 회의를 했는데 이해하고 있는 API 명세가 서로 다르고, 소통이 원할하게 되지 않았다. 협업을 위한 장치가 더 필요하다.

`페퍼`: 분명히 씻었는데 자꾸 나한테 냄새가 나는거 같다. 그래서 기분이 살짝 구렸다.







## ✏️ Code Review Process
[텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

