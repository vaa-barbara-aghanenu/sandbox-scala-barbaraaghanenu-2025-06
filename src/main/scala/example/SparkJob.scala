package example

import org.apache.spark.sql.{SparkSession, DataFrame}

object SparkJob {
  def wordCount(input: Seq[String])(implicit spark: SparkSession): DataFrame = {
    import spark.implicits._
    input.toDS()
      .flatMap(_.split("\\s+"))
      .filter(_.nonEmpty)
      .groupBy("value")
      .count()
  }

  def main(args: Array[String]): Unit = {
    implicit val spark: SparkSession = SparkSession.builder()
      .appName("SparkJob")
      .master("local[*]")
      .getOrCreate()

    val df = wordCount(Seq("hello world", "hello scala"))
    df.show(false)
    spark.stop()
  }
}
