# coupon-pop-core-module

CouponPop MSA 프로젝트의 모든 마이크로서비스에서 공통으로 사용되는 **DTO 객체를 위한 라이브러리**입니다.
이 모듈은 **GitHub Packages**를 통해 배포 및 관리됩니다.

---

## 1. 사전 준비 (Prerequisites)

이 라이브러리를 사용하기 위해서는 다음 항목들이 준비되어야 합니다.

- **GitHub PAT (Personal Access Token)**
    * GitHub Packages에서 라이브러리를 다운로드하기 위해 `read:packages` 권한이 있는 토큰이 필요합니다.

---

## 2. 설치 및 설정 (Installation & Configuration)

### 2-1. build.gradle 설정
프로젝트의 build.gradle 파일에 아래 내용을 추가하여 GitHub Packages 저장소를 등록하고 의존성을 주입합니다.

```Groovy
// 1. .env 파일 로드 함수 정의
def loadGithubCredentials() {
    def credentials = [:]
    def envFile = file('.env')
    def foundKeys = 0

    if (envFile.exists()) {
        envFile.eachLine { line ->
            if (foundKeys == 2) return
            if (!line.startsWith('#') && line.contains('=')) {
                def (key, value) = line.split('=', 2)*.trim()
                if (key in ['GITHUB_ACTOR', 'GITHUB_TOKEN']) {
                    if ((value.startsWith('"') && value.endsWith('"')) || (value.startsWith("'") && value.endsWith("'"))) {
                        value = value.substring(1, value.length() - 1)
                    }
                    credentials[key] = value
                    foundKeys++
                }
            }
        }
    }
    return credentials
}

repositories {
    mavenCentral()

    // 2. GitHub Packages 저장소 추가
    def githubCredentials = loadGithubCredentials()
    def githubUsername = System.getenv("GITHUB_ACTOR") ?: githubCredentials.GITHUB_ACTOR ?: "unknown"
    def githubToken = System.getenv("GITHUB_TOKEN") ?: githubCredentials.GITHUB_TOKEN ?: "unknown"

    maven {
        url = uri("[https://maven.pkg.github.com/CouponPop/couponpop-security-module](https://maven.pkg.github.com/CouponPop/couponpop-security-module)")
        credentials {
            username = githubUsername
            password = githubToken
        }
    }
    
    // (Core 모듈도 필요한 경우 함께 추가)
    maven {
        url = uri("[https://maven.pkg.github.com/CouponPop/couponpop-core-module](https://maven.pkg.github.com/CouponPop/couponpop-core-module)")
        credentials {
            username = githubUsername
            password = githubToken
        }
    }
}

dependencies {
    // 3. Security 모듈 의존성 추가 (최신 버전 확인 필요)
    implementation 'com.couponpop:couponpop-security:0.0.4-SNAPSHOT'
    // Core 모듈 (필요 시)
    implementation 'com.couponpop:couponpop-core:0.0.21-SNAPSHOT'
}
```


## 3. 기술 스택 (Tech Stack)
* Language: Java 17
* Library: Lombok, Jackson
* Build Tool: Gradle
* Registry: GitHub Packages
