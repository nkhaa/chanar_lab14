# Lab14 – Maven-д суурилсан Java төсөл, Git workflow, GitHub Actions CI

Энэ репозитори нь `Lab14` даалгаврын жишээ төсөл юм. Maven-д суурилсан энгийн
тооцоолуурын үйлдлүүд бүхий Java код, JUnit 5 тест, Checkstyle шалгалт,
JaCoCo 100% branch coverage, GitHub Actions CI workflow агуулна.

## Төслийн бүтэц

```text
.
├─ pom.xml
├─ checkstyle.xml
├─ .gitignore
├─ README.md
├─ conflict_resolution.md
├─ .github/
│   └─ workflows/
│        └─ ci.yml
└─ src/
    ├─ main/java/lab14/sict/must/edu/mn/
    │      ├─ Multiplication.java
    │      └─ Division.java
    └─ test/java/lab14/sict/must/edu/mn/
           ├─ MultiplicationTest.java
           └─ DivisionTest.java
```

## Ашиглах командууд

```bash
# Тест ажиллуулах
mvn test

# Checkstyle загвар шалгах
mvn checkstyle:check

# JaCoCo coverage тайлан гаргах
mvn jacoco:report

# 100% branch coverage шалгах
mvn jacoco:check
```

Coverage тайланг `target/site/jacoco/index.html` файлаас нээнэ.

## Git workflow товч

* `main` – тогтвортой хувилбарууд.
* `develop` – идэвхтэй хөгжүүлэлт.
* `feature/*` – шинэ боломжууд (жишээ нь, `feature/add-multiplication`).
* `release/*` – хувилбар гаргах салбар (жишээ нь, `release/v1.0.0`).
* `hotfix/*` – яаралтай алдааны засвар (жишээ нь, `hotfix/v1.0.1`).

## GitHub Actions CI

`.github/workflows/ci.yml` файл нь дараах шалгалтыг автоматжуулна:

* `mvn checkstyle:check`
* `mvn test jacoco:check`
* `mvn jacoco:report`

CI нь `develop` болон `release/*` салбар руу хийсэн push, мөн эдгээр рүү чиглэсэн
pull request дээр автоматаар ажиллана.
