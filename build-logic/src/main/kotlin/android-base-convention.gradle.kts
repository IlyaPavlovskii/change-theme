import com.android.build.gradle.BaseExtension

@Suppress("MagicNumber")
configure<BaseExtension> {
    compileSdkVersion(34)

    defaultConfig {
        minSdk = 24
        targetSdk = 34
    }
}
