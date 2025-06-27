package example

import org.scalatest.funsuite.AnyFunSuite
import org.apache.spark.sql.SparkSession

class SparkJobSpec extends AnyFunSuite {
  implicit val spark: SparkSession = SparkSession.builder()
    .appName("test")
    .master("local[*]")
    .getOrCreate()

  test("wordCount computes counts") {
    val data = Seq("hello world", "hello spark")
    val result = SparkJob.wordCount(data).collect().map(r => r.getString(0) -> r.getLong(1)).toMap
    assert(result("hello") == 2)
    assert(result("world") == 1)
    assert(result("spark") == 1)
  }
}
