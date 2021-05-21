 import org.apache.spark.sql._
 import org.apache.spark._
object SparkApp {
 def main(args: Array[String]): Unit = {
  sessionSpark()
 }
 def sessionSpark() : Unit = {
  System.setProperty("hadoop.home.dir","C:\\Hadoop")
   val ss = SparkSession.builder()
     .master(master = "local[*]")
     .appName(name = "Ma premiere") /* identifier l'application*/
     //.enableHiveSupport() / attirer le support de hive*/
     .getOrCreate()
   val rdd1 = ss.sparkContext.parallelize(Seq("firts apps spark.je suis une etudiante de l'IDSI"))
   rdd1.foreach(l => println(l))

  val df_l = ss.read
    .format(source = "CSV")
    .option("interSchema", "true")
    .option("header","true")
    .option("delimiter",";")
    .csv(path = "D:\\orders_csv.csv")

  df_l.show(numRows = 10)
  df_l.createOrReplaceTempView(viewName = "orders")
  ss.sql(sqlText = "SELECT * FROM orders WHERE city = 'Newton' ").show()



 }

}