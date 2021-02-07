
plugins {
    id("org.jetbrains.kotlin.jvm") version "1.4.20" // <1>

    application // <2>
}

repositories {
    jcenter() // <3>
}

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom")) // <4>

    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8") // <5>

    implementation("com.google.guava:guava:29.0-jre") // <6>

    implementation("org.apache.logging.log4j:log4j-core:2.14.0")
    implementation("com.vlkan.log4j2:log4j2-logstash-layout:1.0.5")

    testImplementation("org.jetbrains.kotlin:kotlin-test") // <7>

    testImplementation("org.jetbrains.kotlin:kotlin-test-junit") // <8>
}

application {
    mainClass.set("demo.AppKt") // <9>
}
