# xcresults

A command line tool to extract test summaries & screenshots from Xcode 11 XCResult files.

## Installation

Build binary with command

`./gradlew clean nativeImage`

## Usage

put file named excludeRules.json near the binary

example of excludeRules.json:

```
[
   "Get all elements",
   "Some attachments were deleted",
   "Some screenshots were deleted ",
   "Added attachment ",
   "Get all elements bound by index for:",
   "Checking `",
   "Find the ",
   "Tap \"",
   "Check for interrupting",
   "Waiting ",
   "Swipe down \"",
   "Press \"",
   "Checking existence of "
]
```

`xcresults <command> <options>`

Below are a few examples of common commands. For further assistance, use the --help option on any command

### Export to Allure2 results

`xcresults export /path/to/Test.xcresult /path/to/outputDirectory`

After that you can generate Allure report by following command:

`allure serve /path/to/outputDirectory`
