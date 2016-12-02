# sel3sample

Selenium 3.0.1の各ブラウザでのサンプルです。

## 準備
各OSに合ったSelenium Driverをダウンロードし、PATHを通して下さい。

[Gecko Driver v0.11.1](https://github.com/mozilla/geckodriver/releases)  
[Chrome Driver 2.25](https://sites.google.com/a/chromium.org/chromedriver/downloads)  

## 実行方法

Chromeのテスト実行
```
./gradlew test --tests "*ChromeSample"  
```

FireFox(Gecko Driver)のテスト実行
```
./gradlew test --tests "*FireFoxGeckoSample"  
```

FireFox(古い FireFox Driver)のテスト実行
```
./gradlew test --tests "*LegacyFireFoxSample"  
```

Safariのテスト実行
```
./gradlew test --tests "*SafariSample"  
```
