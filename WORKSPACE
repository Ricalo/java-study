load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

RULES_JVM_EXTERNAL_TAG = "3.3"
RULES_JVM_EXTERNAL_SHA = "d85951a92c0908c80bd8551002d66cb23c3434409c814179c0ff026b53544dab"

http_archive(
    name = "rules_jvm_external",
    strip_prefix = "rules_jvm_external-%s" % RULES_JVM_EXTERNAL_TAG,
    sha256 = RULES_JVM_EXTERNAL_SHA,
    url = "https://github.com/bazelbuild/rules_jvm_external/archive/%s.zip" % RULES_JVM_EXTERNAL_TAG,
)

load("@rules_jvm_external//:defs.bzl", "maven_install")

maven_install(
  artifacts = [
    "com.google.guava:guava:29.0-jre",
    "com.google.flogger:flogger:0.5.1",
    "com.google.flogger:flogger-system-backend:0.5.1",
    "com.google.truth:truth:1.1",
    "junit:junit:4.13",
    "org.apache.commons:commons-math3:3.6.1",
    "org.checkerframework:checker:3.7.0",
    "org.jacoco:org.jacoco.core:0.8.6",
    "org.jacoco:org.jacoco.report:0.8.6",
  ],
  repositories = [
    "https://jcenter.bintray.com",
    "https://maven.google.com",
  ]
)
