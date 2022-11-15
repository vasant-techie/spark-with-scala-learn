import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.{broadcast, col, count}

object Main {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder.master("local[*]").appName("main").getOrCreate()
    val data = spark.read.options(Map("inferSchema" -> "true", "header" -> "true")).csv("src/main/resources/data.csv").toDF()
    val range = spark.read.options(Map("inferSchema" -> "true", "header" -> "true")).csv("src/main/resources/range.csv").toDF()

    val output = data.join(broadcast(range), col("countx") >= range("from") && col("countx") <= range("to")).groupBy(range("from"), range("to")).agg(count("countx")).orderBy(col("from"))
    output.show(10000)
  }
}
