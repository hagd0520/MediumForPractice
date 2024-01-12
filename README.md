# MediumForPractice

#  할일

- [x] GET /member/join : 가입 폼
- [x] POST /member/join : 가입 폼 처리
- [x] GET /member/login : 로그인 폼
- [x] POST /member/login : 로그인 폼 처리
- 
## 글 작업

- [x] GET / : 홈
    - 최신글 30개 노출
- [ ] GET /post/list : 전체 글 리스트
    - 공개된 글만 노출
- [ ] GET /post/myList : 내 글 리스트
    - 내 글 목록 조회
- [ ] GET /post/1 : 1번 글 상세보기
- [ ] GET /post/write : 글 작성 폼
- [ ] POST /post/write : 글 작성 처리
- [ ] GET /post/1/modify : 1번 글 수정 폼
- [ ] PUT /post/1/modify : 1번 글 수정 폼 처리
- [ ] DELETE /post/1/delete : 1번 글 삭제

## 블로그 작업

- [ ] GET /b/user1 : 회원 user1 의 전체 글 리스트
    - 특정 회원의 글 모아보기
- [ ] GET /b/user1/3 : 회원 user1 의 글 중에서 3번글 상세보기

### Commit message
1. 제목과 본문을 한 줄 띄어 구분
2. 제목은 50자 이내
3. 제목 첫 글자는 대문자
4. 제목 끝에 마침표 X
5. 제목은 명령문으로, 과거형 X
6. 본문의 각 행은 72자 이내 (줄바꿈 사용)
7. 본문은 어떻게 보다 무엇을, 왜 에 대하여 설명

```
<type>: <subject>
<body>
<footer>
```
`'<type>: <subject>' 는 필수, <body>와 <footer>는 선택사항`

### Type
| 타입 이름    | 내용                                   |
|----------|--------------------------------------|
| feat     | 새로운 기능 추가, 기존의 기능을 요구 사항에 맞추어 수정     |
| fix      | 기능에 대한 버그 수정                         |
| build    | 빌드 관련 수정                             |
| chore    | 패키지 매니저 수정, 그 외 기타 수정 ex) .gitignore |
| ci       | CI 관련 설정 수정                          |
| docs     | 문서(주석) 수정                            |
| style    | 코드 스타일, 포맷팅에 대한 수정                   |
| refactor | 기능의 변화가 아닌 코드 리팩터링 ex) 변수 이름 변경      |
| test     | 테스트 코드 추가/수정                         |
| release  | 버전 릴리즈                               |

commit message:
- no entity 