object Version {
    val MinSDK = 21
    val CompileSDK = 30
    val TargetSDK = 30
    val VersionCode = 1
    val VersionName = "1.0"
    val Kotlin = "1.4.10"
    val Retrofit = "2.6.2"
    val Dagger = "2.21"
}

object Dependencies {
    val Rx = "io.reactivex.rxjava3:rxjava:3.0.0"
    val Material = "com.google.android.material:material:1.2.1"
}

object AndroidX {
    val Core = "androidx.core:core-ktx:1.3.2"
    val AppCompat = "androidx.appcompat:appcompat:1.2.0"
    val ConstraintLayout = "androidx.constraintlayout:constraintlayout:2.0.4"
}

object Kotlin {
    val STDLib = "org.jetbrains.kotlin:kotlin-stdlib:${Version.Kotlin}"
}

object Retrofit {
    val Lib = "com.squareup.retrofit2:retrofit:${Version.Retrofit}"
    val Converter = "com.squareup.retrofit2:converter-moshi:${Version.Retrofit}"
    val Adapter = "com.squareup.retrofit2:adapter-rxjava2:${Version.Retrofit}"
}
object Dagger{
    val Lib = "com.google.dagger:dagger:${Version.Dagger}"
    val AnnotationProcessor = "com.google.dagger:dagger-compiler:${Version.Dagger}"
    val AndroidSupport = "com.google.dagger:dagger-android-support:${Version.Dagger}"
    val DaggerAndroid = "com.google.dagger:dagger-android:${Version.Dagger}"
    val DaggerAndroidAnnotationProcessor = "com.google.dagger:dagger-android-processor:${Version.Dagger}"

}


