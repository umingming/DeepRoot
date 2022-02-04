![main1](https://user-images.githubusercontent.com/87955005/152378256-07006206-0e16-44eb-bf73-a42f2f3f988d.png)

>  **뿌리 깊은 국사**는 자바 콘솔 기반의 한국사 학습 프로그램입니다. <br />
>  한능검을 위해 정리한 내용을 다른 사람들과 **공유**하면 좋겠다는 생각에서 출발한 **개인** 프로젝트입니다.

<br />

# 📌 Table Of Contents
* [📖 Introduction](#-introduction)
* [💻 Result](#-result)
* [🔎 Detail](#-detail)
* [✔ TO DO](#-to-do)

<br />
<br />
<br />



# 📖 Introduction
### 1. 프로젝트 개요
* 회원 가입을 통해 선사시대부터 근현대까지 한국사의 모든 문제들을 제공 받을 수 있습니다.
* 회원의 학습량에 따라 아이콘이 변하여 한국사 학습에 동기를 부여합니다.
<br />

### 2. 개발 환경
* Windows 10
* Java(JDK 1.8) 
* Eclipse IDE for Enterprise Java Developers 
<br />

### 3. 프로젝트 내용
#### 3-1. 비회원
* 회원가입 및 로그인
* ID/PW 찾기

#### 3-2. 회원
* 회원 정보 수정 및 탈퇴
* 한국사 학습

<br />
<br />
<br />

# 💻 Result
### 1. 시작하기
![main](https://user-images.githubusercontent.com/87955005/152524912-8f1bdd62-de20-4448-a1f6-9300285fa7a5.gif)

#### 1-1. 메인 화면
* 엔터를 누르면 메인에서 메뉴 화면으로 전환합니다.
* 명언이 무작위로 출력됩니다.
* 메뉴 번호를 입력해 원하는 페이지로 입력할 수 있습니다.

#### 1-2. 로그인
* 계정과 비밀번호를 차례대로 입력 받습니다.
* 로그인에 성공하면 회원 화면으로 이동됩니다.

<br />
<br />

### 2. 계정 관리
![user](https://user-images.githubusercontent.com/87955005/152528912-17ca241c-7f9b-4295-880b-ea3ffa282744.gif)

#### 2-1. 회원 화면
* 회원의 학습량이 높을 수록 아이콘이 흰 색에 가까워집니다.
* 번호를 입력해 원하는 페이지로 이동할 수 있으며, B 또는 X 입력시 메인으로 이동합니다.

#### 2-2. 비밀번호 변경
* 회원의 현재 비밀번호를 입력 받습니다.
* 새로운 비밀번호 확인이 끝나면 성공적으로 변경됩니다.
* 비밀번호가 일치하지 않을 경우 안내합니다.

<br />
<br />

### 3. 한국사 학습
![study](https://user-images.githubusercontent.com/87955005/152544423-1d5f68db-6c8b-4c81-98b9-8ef111b79eb8.gif)

#### 3-1. 시대 선택
* 선사시대부터 현대까지 한국사 시대가 출력됩니다.
* 공부를 희망하는 시대를 선택합니다.

#### 3-2. 문제 풀기
* 정답을 맞춰야 다음 문제로 넘어갈 수 있습니다.
* 오답과 정답 모두, 올바른 답에 대해 안내합니다.

<br />
<br />
<br />

# 🔎 Detail
### 1. 로그인
* stream을 사용해 id가 존재하는지 확인하고, 비밀번호가 일치할 경우만 true를 반환합니다.
    ```java
    if(list.stream().anyMatch(u -> u.getId().equals(id))) {
      if(list.stream().filter(u -> u.getId().equals(id))
          .allMatch(u -> u.getPw().equals(pw))) {
        return true;
      }
    }
    ```
* 패스워드를 마스킹하기 위해 for문 내 String 배열 요소에 '*'를 누적했습니다.
    ```java
    pw = form.input();
    for(int i=0; i<pw.length(); i++) {
      str[5] += "*";
    }
    ```
* 작성한 **코드**를 설명합니다.
    ```javascript
    console.log('설명에 부합하는 코드만 기입합니다.');
    ```
    
<br />
<br />

### 2. 회원 성취도
* ArrayList에 QuestionDAO().load()를 사용해 초기화합니다.
    ```java
    ArrayList<QuestionDTO> questionList = new QuestionDAO().load();
    ```
* 문제의 최대값을 total에 저장합니다.
    ```java
    questionList.stream()
			.filter(q -> q.getCategorySeq().equals(i))
			.forEach(q -> total = Math.max(total, Integer.parseInt(q.getNum())));
    ```
    
<br />
<br />

### 3. 문제의 정답
* blank 변수를 선언 후 answer의 길이만큼 'ㅇ'로 초기화합니다.
    ```java
    String blank = "";
    for (int i=0; i<answer.length(); i++) {
      blank += "ㅇ";
    }
    ```
* replace 메소드로 blank를 answer로 치환합니다.
    ```java
    question = question.replace(blank, answer);
    ```
    
<br />
<br />
<br />

# ✔ TO DO

<br />
<br />
<br />
