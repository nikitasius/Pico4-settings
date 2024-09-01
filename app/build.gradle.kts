plugins {
  id("com.android.application")
}

android {
  namespace = "com.pico4.settings"
  compileSdk = 32

  defaultConfig {
    applicationId = "com.pico4.settings"
    minSdk = 29
    targetSdk = 29
    versionCode = 1001
    versionName = "1.0.1"
  }

  signingConfigs {
    create("release") {
      storeFile = file("../fuckthesystem")
      storePassword = "fuckthesystem"
      keyAlias = "fuckthesystem"
      keyPassword = "fuckthesystem"
    }
  }

  buildTypes {
    release {
      isMinifyEnabled = false
      signingConfig = signingConfigs.get("release")
      proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
    }
  }

  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
  }
}

dependencies {
  implementation("androidx.appcompat:appcompat:1.5.1")
  implementation("com.google.android.material:material:1.7.0")
  implementation("androidx.constraintlayout:constraintlayout:2.1.4")
  androidTestImplementation("androidx.test.ext:junit:1.1.4")
  androidTestImplementation("androidx.test.espresso:espresso-core:3.5.0")
}