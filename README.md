# Scala Spark Example

This repository provides a minimal Scala Spark project using sbt. It includes
unit tests with ScalaTest and a GitHub Actions workflow that runs formatting
checks and tests.

## Requirements

- Java 8 or later
- sbt
- (Optional) Python dependencies listed in `requirements.txt`

## Building and Running

```bash
sbt run
```

## Testing

```bash
sbt test
```

GitHub Actions will automatically run formatting checks using `scalafmt` and
execute the test suite on every push.
