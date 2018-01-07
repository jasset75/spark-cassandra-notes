name := "dataset-join-02"

version := "1.0"

scalaVersion := "2.11.6"

val sparkVersion = "2.2.1"

unmanagedJars in Compile += file("lib/spark-cassandra-connector-assembly-2.0.5-86-ge36c048.jar")

resolvers ++= Seq(
  "apache-snapshots" at "http://repository.apache.org/snapshots/"
)

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "org.apache.spark" %% "spark-mllib" % sparkVersion,
  "org.apache.spark" %% "spark-streaming" % sparkVersion,
  "org.apache.spark" %% "spark-hive" % sparkVersion
)