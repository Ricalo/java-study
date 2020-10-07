java_library(
  name = "dabble",
  srcs = glob(["src/main/java/com/ricalo/dabble/*.java"]),
  deps = [
    "@maven//:org_apache_commons_commons_math3",
    "@maven//:com_google_guava_guava",
    "@maven//:com_google_flogger_flogger",
    "@maven//:com_google_flogger_flogger_system_backend",
    "@maven//:org_checkerframework_checker",
  ],
)

java_library(
  name = "tests",
  srcs = glob(["src/test/java/com/ricalo/dabble/*Test.java"]),
  deps = [
    "//:dabble",
    "@maven//:junit_junit",
  ],
)

java_test(
  name = "BubbleSortTests",
  size = "small",
  test_class = "com.ricalo.dabble.BubbleSortTest",
  runtime_deps = [
    ":tests",
  ],
)

java_test(
  name = "InsertionSortTests",
  size = "small",
  test_class = "com.ricalo.dabble.InsertionSortTest",
  runtime_deps = [
    ":tests",
  ],
)

java_test(
  name = "MathUtilTests",
  size = "small",
  test_class = "com.ricalo.dabble.MathUtilTest",
  runtime_deps = [
    ":tests",
  ],
)

java_test(
  name = "MergeSortTests",
  size = "small",
  test_class = "com.ricalo.dabble.MergeSortTest",
  runtime_deps = [
    ":tests",
  ],
)

java_test(
  name = "QuickSortTests",
  size = "small",
  test_class = "com.ricalo.dabble.QuickSortTest",
  runtime_deps = [
    ":tests",
  ],
)

java_test(
  name = "StackTests",
  size = "small",
  test_class = "com.ricalo.dabble.StackTest",
  runtime_deps = [
    ":tests",
  ],
)
