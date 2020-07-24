# 01.a - 프로젝트를 `이클립스 IDE`로 임포트하기

소프트웨어 개발의 핵심은 소스 코드를 작성하고 실행하는 것이다.
간단한 프로그램이라면 메모장과 같은 텍스트 편집기와 터미털 창으로 작업할 수 있다.
그러나 기업용 프로그램처럼 크고 복잡한 시스템을 개발할 때는
코드 작성 뿐만 아니라 단위 테스트, 디버깅, API 문서 생성, 아카이브 파일 생성 등도 해야 한다.
텍스트 편집기와 터미털 창만으로는 이런 작업을 하기에는 매우 불편하다.
이런 불편함을 덜어주기 위해 등장한 것이 **통합 개발 환경(IDE, Integrated Development Environment)** 이다.

통합개발환경은 소스 코드 편집에서 컴파일, 디버그, 테스트, 배포파일 생성 등 개발과 관련된 다양한 기능을 제공한다.
자바 쪽 IDE의 대표주자로 ItelliJ, Eclipse, NetBeans 등이 있다.

**IntelliJ** 는 기본 버전은 무료지만 웹 개발 기능을 포함한 버전은 유료이기 때문에
우리의 훈련과정에서는 무료 IDE로 유명한 **이클립스(Eclipse)** 를 사용하겠다.
우리가 준비한 자바 프로젝트를 이클립스에서 편집하려면 몇개의 설정 파일을 추가해야 한다.
Gradle 도구를 이용하여 이클립스 관련 설정 파일을 준비해 보자.

## 훈련 목표

- `그레이들`을 이용하여 `이클립스 IDE` 프로젝트로 전환하는 방법을 배운다.
- `이클립스` 워크스페이스로 프로젝트를 가져오는 것을 배운다.
- `이클립스`에서 프로젝트를 빌드하고 실행하는 방법을 배운다.

## 훈련 내용

- `그레이들`을 사용하여 이클립스 IDE 프로젝트를 위한 설정 파일을 생성한다.
- 이클립스 IDE로 프로젝트를 가져온다.
- 이클립스 IDE에서 애플리케이션을 실행한다.

## 실습

### 1단계 - 그레이들 빌드 스크립트에 이클립스 플러그인 추가한다

Gradle에서 이클립스 관련 명령을 다룰 수 있도록 플러그인을 추가한다.
다음과 같이 build.gradle 파일에 'eclispe' 플러그인을 추가한다.

```groovy
plugins {
    id 'java'
    id 'application'
    id 'eclipse'   <== 이 코드를 추가한다.
}
```

#### 작업 파일

- build.gradle (변경)

### 2단계 - 이클립스 IDE 용 설정 파일 생성한다

**그래이들** 빌드 도구를 이용하여 이클립스 IDE에서 사용할 설정 파일을 생성한다.
다음과 같이 터미널 창에서 명령을 실행한다.

```console
[~/mini-pms]$ gradle eclipse
```

### 3단계 - 이클립스 IDE로 프로젝트를 불러온다

다음 절차에 따라 이클립스 IDE의 워크스페이스로 프로젝트를 가져온다.

- Eclise IDE 메뉴 > `File > Import...` 클릭
- Import 대화창 > `General 노드 > Existing Projects into Workspace 선택` > Next 클릭
- `java-project` 프로젝트 폴더 선택 > Finish 클릭

### 4단계 - 이클립스 IDE에서 프로젝트를 실행한다

터미널 창에서 자바 애플리케이션을 실행하는 것 보다 더 편리하게 이클립스 IDE에서 실행할 수 있다. 다음 절차에 따라 실행한다.

- `src/main/java/com/eomcs/pms/App.java` 소스 파일을 열기
- Eclipse IDE 메뉴 > `Run > Run` 클릭
- `Console 뷰`에 출력된 결과 확인

## 실습 결과

- build.gradle (변경)



# 01.b - 프로젝트 버전 관리 시스템 Git을 적용하기

**github.com** 은 **깃(git)** 이라는 도구를 제공하는 웹호스팅 서비스이다. Git 은 소프트웨어 개발에서 생성되는 파일의 변경 사항을 추적 관리하는 도구다. 보통 소스 파일이나 설정 파일의 변경을 관리한다.

소프트웨어는 첫 번째 판(version)이 배포된 이후에도 끊임없이 기능이 추가되고 변경, 삭제되어 사용자에게 배포된다. 그래서 사용자 마다 사용하는 소프트웨어 버전이 다를 수 있다. 사용자 모두가 항상 최신 버전을 사용한다면 좋겠지만, 비용 문제라든가 하드웨어의 성능 문제 때문에 과거 버전을 계속 사용하는 경우가 많다. 이런 이유로 개발자는 각 소프트웨어 버전 마다 소스 파일을 구분해야 한다. 이것을 도와주는 도구가 **버전 관리 시스템** 이다.

버전 관리 시스템은 버전 관리 외에도 여러 개발자가 함께 파일을 공유하고 관리할 수 있는 기능을 제공해준다. 자신이 변경한 내용을 다른 이가 함부로 덮어쓰지 못하게 막아주고, 다른 이가 변경한 내용을 조회하여 자신이 변경한 내용과 합칠 수 있도록 도와준다.

우리가 이번 훈련에서 사용할 버전 관리 시스템은 **Git** 이다. Git 을 사용하여 프로젝트의 버전을 관리할 것이다. 그리고 **github.com** 을 통해 프로젝트를 공유해 보자.

## 훈련 목표

- 프로젝트 폴더를 로컬 Git 저장소로 만드는 방법을 배운다.
- 로컬 Git 저장소를 `github.com` 서버에 공유하는 방법을 배운다.

## 훈련 내용

- 프로젝트 폴더를 Git 저장소로 만든다.
- 버전 관리에서 제외할 파일이나 폴더를 설정한다.
- 로컬 Git 저장소에 파일을 백업한다.
- **github.com** 서버에 로컬 Git 저장소를 업로드 한다.

## 실습

### 1단계 - 프로젝트 폴더를 깃 저장소(git repository)로 만든다

git 클라이언트 프로그램을 이용하여 프로젝트 폴더를 Git 저장소로 설정한다.

```console
[~/mini-pms]$ git init
Initialized empty Git repository in /Users/eomjinyoung/mini-pms/.git/

[~/mini-pms]$ tree -ad   <== 옵션 a(숨겨진 파일 및 디렉토리 출력)와 d(디렉토리만 출력)를 추가한다.
.
├── .git      <== 로컬 Git 저장소
│   ├── branches
│   ├── hooks
│   ├── info
│   ├── objects
│   │   ├── info
│   │   └── pack
│   └── refs
│       ├── heads
│       └── tags
...

89 directories
```

### 2단계 - 버전 관리 대상에서 제외할 항목을 지정한다

로컬 깃 저장소에 보관하지 않을 파일이나 디렉토리는 `.gitignore` 파일에 등록한다.
`.gitignore`에 기록된 파일이나 디렉토리는 깃 버전 관리 대상에서 제외된다.

- 제외 대상 선정하기
  - **gitignore.io** 사이트에 접속한다.
  - 제외 대상 목록을 생성한다.
    - java,linux,macos,gradle,windows,eclipse,java-web,visualstudiocode 으로 검색.
- `.gitignore` 파일 변경
  - `~/mini-pms/.gitignore` 파일에 위에서 준비한 대상 목록을 복사한다.

### 3단계 - 버전 관리 대상(파일 및 폴더)을 깃 스테이지에 등록한다

현재 프로젝트에서 버전 관리 대상으로 등록할 대상(파일과 디렉토리)을 지정한다.
단, .gitignore 파일에 적어 놓은 파일과 디렉토리는 제외한다.

```console
[~/mini-pms]$ git add .    <== 현재 폴더 및 하위 폴더의 모든 파일 추가
```

### 4단계 - 로컬 깃 저장소에 백업한다

Git 스테이지에 등록된 파일 및 디렉토리를 로컬 Git 저장소에 보관한다

```console
[~/mini-pms]$ git commit -m "프로젝트 준비"
[master (root-commit) 379b10d] 프로젝트 준비
 12 files changed, 575 insertions(+)
 create mode 100644 .gitattributes
 create mode 100644 .gitignore
 create mode 100644 build.gradle
 create mode 100644 gradle/wrapper/gradle-wrapper.jar
 create mode 100644 gradle/wrapper/gradle-wrapper.properties
 create mode 100755 gradlew
 create mode 100644 gradlew.bat
 create mode 100644 settings.gradle
 create mode 100644 src/main/java/com/eomcs/pms/App.java
 create mode 100644 src/main/resources/README.md
 create mode 100644 src/test/java/com/eomcs/pms/AppTest.java
 create mode 100644 src/test/resources/README.md
```

### 5단계 - **github.com** 에 원격 깃 저장소를 만든다

github.com 사이트에 로그인하여 mini-pms를 보관할 원격 저장소를 만든다.

- github.com 에 원격 저장소 생성
  - github.com 사이트에 로그인 한다.
  - 저장소(repository)를 생성한다.
  - 저장소의 URL을 복사해둔다.

### 6단계 - 원격 깃 저장소(github.com)의 URL을 지정한다

로컬 깃 저장소의 내용을 어느 깃 서버에 업로드 할 것인지, 원격 깃 저장소의 URL을 지정한다.
`git remote add [원격저장소를 가리키는 이름] [원격저장소 URL]` 명령을 사용하여
로컬 저장소를 원격 저장소와 연결한다.
원격 저장소 이름은 보통 `origin`으로 한다.

```console
[~/mini-pms]$ git remote add origin https://github.com/eomjinyoung/mini-pms.git   <== 5단계에서 만든 원격 깃 저장소의 URL을 등록

[~/mini-pms]$ git remote   <== 등록한 원격 저장소의 이름 확인
origin

[~/mini-pms]$ git remote -v   <=== 등록한 원격 저장소의 URL 확인
origin	https://github.com/eomjinyoung/mini-pms.git (fetch)
origin	https://github.com/eomjinyoung/mini-pms.git (push)
```

### 7단계 - 로컬 깃 저장소의 내용을 원격 깃 저장소에 업로드 한다

로컬 깃 저장소의 내용을 github.com에 생성한 원격 깃 저장소로 업로드 한다.
`git push --set-upstream [원격저장소이름] [로컬브랜치]:[원격브랜치]`
또는 `git push -u [원격저장소이름] [로컬브랜치]:[원격브랜치]`명령을 실행한다.
`[원격저장소이름]`은 6단계에서 등록한 이름(`origin`) 이다.

**브랜치** 는 특정 버전의 내용물을 가리키는 이름이다.
`[로컬브랜치]`는 로컬 깃 저장소의 현재 버전을 가리키는 브랜치 이름이다.
프로젝트 내용물을 로컬 깃 저장소에 백업하기 위해서 `git commit` 명령을 처음 실행할 때
`master`라는 이름의 로컬 브랜치가 자동 생성된다.

```console
[~/mini-pms]$ git push -u origin master:master
Counting objects: 29, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (18/18), done.
Writing objects: 100% (29/29), 59.11 KiB | 6.57 MiB/s, done.
Total 29 (delta 0), reused 0 (delta 0)
To https://github.com/eomjinyoung/mini-pms.git
 * [new branch]      master -> master
Branch 'master' set up to track remote branch 'master' from 'origin'.

```

## 실습 결과

- `github.com` 저장소에 업로드된 것을 확인한다.
