package org.apache.spark.sql

import org.apache.spark.SparkConf
import org.apache.spark.sql.streaming.DataStreamReader

/**
 * 11/21/16 WilliamZhu(allwefantasy@gmail.com)
 */
class SparkSessionAdaptor(conf: SparkConf) {


  def readStream: DataStreamReader = null

  def sqlContext: SQLContext = null;
}
