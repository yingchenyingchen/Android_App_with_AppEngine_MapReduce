import com.google.appengine.tools.mapreduce.KeyValue;
import com.google.appengine.tools.mapreduce.Reducer;
import com.google.appengine.tools.mapreduce.ReducerInput;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;

/**
 * Sums a list of numbers. The key identifies the counter, the output value is the sum of all input
 * values for the given key.
 *
 * Created by Ying Chen on 6/10/16.
 */
class MyReducer extends Reducer<String, String, ByteBuffer> {

  private static final long serialVersionUID = 1316637485625852869L;

  @Override
  public void reduce(String key, ReducerInput<String> values) {
  /*
    double total = 0;
    double temp = 0;

    while (values.hasNext()) {

         try {
           temp = Double.parseDouble(values.next());
         } catch(Exception e){
           temp = 0;
         }

         total += temp;
     }
    String result = key + "::" + total;
    char[] arr = result.toCharArray();


    ByteBuffer buf = ByteBuffer.allocate(arr.length*2);
    CharBuffer cbuf = buf.asCharBuffer();

    cbuf.put(result);

      emit(buf);
      buf.clear();
      cbuf.clear();

      */

      ByteBuffer buf = ByteBuffer.allocate(1024*2);
      CharBuffer cbuf = buf.asCharBuffer();

      cbuf.put("test");

      emit(buf);
      buf.clear();
      cbuf.clear();

  }

}
