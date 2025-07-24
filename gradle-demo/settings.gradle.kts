rootProject.name = "gradle-demo"

pluginManagement {
    repositories {
        mavenCentral()
        maven { url = uri("https://maven.aliyun.com/repository/public") }
    }
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        maven { setUrl("https://maven.aliyun.com/repository/public") }
    }
}