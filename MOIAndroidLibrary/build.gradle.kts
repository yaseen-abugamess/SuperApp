plugins {
    id("maven-publish")
    alias(libs.plugins.android.library) version "8.8.0"
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.abugamess.moiandroidlibrary"
    compileSdk = 35

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = "11"
    }
}

//publishing {
//    publications {
//        register<MavenPublication>("release") {
//            afterEvaluate{
//                from(components["release"])
//                groupId = "com.moilibaray"
//                artifactId = "moiLibaray"
//                version = "1.0.0"
//            }
//        }
//    }
//}

publishing {
    publications {
        register<MavenPublication>("release") {
            groupId = "com.moilibaray"
            artifactId = "moiLibaray"
            version = "1.0.0"

            afterEvaluate {
                from(components["release"])
            }
        }
    }
    repositories {
        mavenLocal()
    }
}
dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}