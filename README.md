[![](https://jitpack.io/v/SeHwanOh/OpenSource_Android.svg)](https://jitpack.io/#SeHwanOh/OpenSource_Android)
# NoticeWorker
Provide URL Constant & Parser

# Introduction
Library to get notice information from website (usually college) for android developer


## Setup
Add the JitPack repository in your build.gradle (top level module):
```gradle
allprojects {
    repositories {
        jcenter()
        maven { url "https://jitpack.io" }
    }
}
```

And add next dependencies in the build.gradle of the module:
```gradle
dependencies {
    implementation 'com.github.13mile:{moduleName}:{tag}' //{moduleName},{tag}  입력
}
```
# Prerequisites
- Android SDK 16
- Thread to get Network result (use AsyncTask / RxJava / Coroutines ... ) 

# Sample
|Organization|
|:---|
|SSU|
|SNU

Chooser Sample Organization
```kt
val organization_ssu = Noticeworker.organization("숭실대학교")

val organization_snu = Noticeworker.organization("서울대학교")
```

Get Department, Notice information
```kt
val departmentList = organization_ssu.getDeptList()

val departmentURL = Noticeworker.getNoticeURL(dept, page, keyword)

val noticeContent = Noticeworker.getNoticeContent()
```



## Android Deployment Jitpack
*GitHub Deployment Repo URL : https://github.com/SeHwanOh/OpenSource_Android
*JitPack URL : https://jitpack.io/#SeHwanOh/OpenSource_Android
  
[![Version](https://img.shields.io/badge/version-v1.0.2-green.svg?style=flat)](https://jitpack.io/#SeHwanOh/OpenSource_Android)
[![Version](https://img.shields.io/badge/Android-11.0-blue.svg?style=flat)](https://jitpack.io/#SeHwanOh/OpenSource_Android)
[![Version](https://jitpack.io/v/SeHwanOh/OpenSource_Android.svg?style=flat)](https://jitpack.io/#SeHwanOh/OpenSource_Android)
[![License](https://img.shields.io/cocoapods/l/NoticeWorker.svg?style=flat)](https://jitpack.io/#SeHwanOh/OpenSource_Android)
[![Platform](https://img.shields.io/badge/Platform-Android-orange.svg?style=flat)](https://jitpack.io/#SeHwanOh/OpenSource_Android)

NoticeWorker (1.0.2)  
June 3rd, 17:40  
