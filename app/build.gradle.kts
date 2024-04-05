import com.android.builder.files.classpathToRelativeFileSet
import org.apache.tools.ant.util.JavaEnvUtils.VERSION_1_7
import org.apache.tools.ant.util.JavaEnvUtils.VERSION_1_8
import org.gradle.api.JavaVersion.VERSION_21

plugins {
    id("com.android.application")
}

android {
    namespace = "tiencuong.edu.projectmain01"
    compileSdk = 34

    defaultConfig {
        applicationId = "tiencuong.edu.projectmain01"
        minSdk = 34
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {

        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8

    }
//    buildToolsVersion = "34.0.0"
//    ndkVersion = "25.1.8937393"
//    dependenciesInfo {
//        includeInApk = false
//    }
//}

    dependencies {

        implementation("androidx.appcompat:appcompat:1.6.1")
        implementation("com.google.android.material:material:1.11.0")
        implementation("androidx.constraintlayout:constraintlayout:2.1.4")
        testImplementation("junit:junit:4.13.2")
        implementation("com.github.bumptech.glide:glide:4.12.0")
        implementation("com.google.code.gson:gson:2.10.1")
        androidTestImplementation("androidx.test.ext:junit:1.1.5")
        androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    }
}

//      implementation("androidx.appcompat:appcompat:1.6.1")
//      implementation("com.google.android.material:material:1.11.0")
//      implementation("androidx.constraintlayout:constraintlayout:2.1.4")
//      implementation("com.github.bumptech.glide:glide:4.12.0")
//      implementation("com.google.code.gson:gson:2.10.1")
//    implementation("com.google.firebase:firebase-firestore:24.11.0")
//    testImplementation("org.testng:testng:6.9.6")
//    testImplementation("junit:junit:4.13.2")
//    implementation("testng")
//    testImplementation("org.junit.jupiter:junit-jupiter:5.8.1")
//    testImplementation("junit:junit:4.13.2")
//    testImplementation("org.testng:testng:6.9.6")
//    testImplementation("org.testng:testng:6.9.6")
//    testImplementation("org.testng:testng:6.9.6")
//    testImplementation("org.testng:testng:6.9.6")
//
//
////    implementation("com.android.support:support-annotations:28.0.0")
////    implementation("androidx.annotation:annotation:1.7.1")
////    implementation("com.android.support:support-v4:28.0.0")
////    testImplementation("junit:junit:4.13.2")
//      androidTestImplementation("androidx.test.ext:junit:1.1.5")
//      androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    


