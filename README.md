## Демонстрационный проект по автоматизации мобильного тестирования
### Android приложение <a target="_blank" href="https://play.google.com/store/apps/details?id=com.wildberries.ru">wildberries</a>

<p align="center">
<img title="wildberries" src="images/screens/cover.jpg">
</p>

## :iphone: Содержание:

- Технологии и инструменты
- Список проверок, реализованных в тестах
- Запуск тестов (сборка в Jenkins)
- Allure-отчет
- Интеграция с Allure TestOps
- Уведомление в Telegram о результатах прогона тестов
- Видео локального прогона тестов в android studio
- Видео прогона тестов в сервисе Browserstack



## :iphone: Технологии и инструменты

<p align="center">
<a href="https://www.jetbrains.com/idea/"><img src="images/logo/Idea.svg" width="50" height="50"  alt="IDEA"/></a>
<a href="https://www.java.com/"><img src="images/logo/Java.svg" width="50" height="50"  alt="Java"/></a>
<a href="https://github.com/"><img src="images/logo/GitHub.svg" width="50" height="50"  alt="Github"/></a>
<a href="https://junit.org/junit5/"><img src="images/logo/Junit5.svg" width="50" height="50"  alt="JUnit 5"/></a>
<a href="https://gradle.org/"><img src="images/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>
<a href="https://selenide.org/"><img src="images/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="images/logo/Allure.svg" width="50" height="50"  alt="Allure"/></a>
<a href="https://qameta.io/"><img src="images/logo/Allure_TO.svg" width="50" height="50"  alt="Allure TestOps"/></a>
<a href="https://www.jenkins.io/"><img src="images/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>
<a href="https://www.browserstack.com/"><img src="images/logo/Browserstack.svg" width="50" height="50"  alt="Browserstack"/></a>
<a href="https://appium.io/"><img src="images/logo/Appium.svg" width="50" height="50"  alt="Appium"/></a>
<a href="https://developer.android.com/studio"><img src="images/logo/android.svg" width="50" height="50"  alt="Android Studio"/></a>
</p>

## :iphone:  Список проверок, реализованных в автотестах

- [x] Добавление нового пункта выдачи товара.
- [x] Изменение валюты 
- [x] Проверка функциональности поиска товаров

###  Запуск локально в android studio :
Пример командной строки:
```bash
gradle clean android -Denv=emulation
```

###  Запуск на удаленном сервере browserstack :
Пример командной строки:
```bash
gradle clean android -Denv=remote
```

Получение отчёта:
```bash
allure serve build/allure-results
```

###  :iphone: Удаленный запуск (в Jenkins):
1. Открыть <a target="_blank" href="https://jenkins.autotests.cloud/job/17-wb-mobile///">проект</a> и нажать **Собрать сейчас**

![This is an image](/images/screens/8.jpg)

## Allure report

![This is an image](/images/screens/13.jpg)
![This is an image](/images/screens/report2.jpg)

###  Тесты

<p align="center">
<img title="Allure Tests" src="images/screens/14.jpg">
</p>

## Интеграция с Allure TestOps

![This is an image](/images/screens/15.jpg)

![This is an image](/images/screens/10.jpg)


## Получение отчетов о прохождении тестов в telegram

![This is an image](/images/screens/1.jpg)

## Видео прогона тестов в сервисе browserstack

![This is an image](/images/screens/bs.gif)

## Видео прогона тестов в android studio

![This is an image](/images/screens/studio.gif)

