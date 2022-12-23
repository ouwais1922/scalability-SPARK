package ma.aui.sse.paradigms.scalability.rating;

import java.util.Comparator;
import java.io.Serializable;

import scala.Tuple2;


public class TupleComparator implements 
   Comparator<Tuple2<String, Integer>>, Serializable {
   final static TupleComparator INSTANCE = new TupleComparator();

   public int compare(Tuple2<String, Integer> t1, 
                      Tuple2<String, Integer> t2) {
       return -t1._2.compareTo(t2._2);    // sort descending
   }
}