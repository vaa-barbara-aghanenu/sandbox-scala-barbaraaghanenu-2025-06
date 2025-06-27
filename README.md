# Scala Spark Example

This repository contains a small example Spark application written in Scala.
The project is built with **sbt** and comes with unit tests and continuous
integration.

## Requirements

- Java 17 or later
- sbt 1.9+
- (Optional) Python dependencies from `requirements.txt` if you want a PySpark
  environment.

## Project layout

- `build.sbt` - sbt build definition and library dependencies
- `src/main/scala` - application source code
- `src/test/scala` - unit tests using ScalaTest
- `.scalafmt.conf` - formatting configuration (Scala 2.13 dialect)

## Setup

Install Java and sbt. On macOS you can use Homebrew and on Ubuntu you can use
`apt`:

```bash
brew install sbt   # macOS
# or
sudo apt-get install sbt   # Ubuntu
```

(Optional) install Python dependencies:

```bash
pip install -r requirements.txt
```

## Building and Running

```bash
sbt run
```

## Testing

```bash
sbt test
```

A GitHub Actions workflow installs sbt, checks formatting with `scalafmt`, and
runs the test suite on every push or pull request.
