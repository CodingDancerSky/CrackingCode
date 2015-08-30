package chapter7;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Code7_6 {

  /* Count lines within an array of lines which are "equivalent" (slope and y-intercept are within an epsilon value) to a given line */
  public static int countEquivalentLines(ArrayList<Line6> lines, Line6 line) {
    if (lines == null) {
      return 0;
    }
    
    int count = 0;
    for (Line6 parallelLine : lines) {
      if (parallelLine.isEquivalent(line)) {
        count++;
      }
    }
    return count;   
  }
  
  /* Check hashmap for lines that are equivalent. Note that we need to check one epsilon above and below the actual slope
   * since we're defining two lines as equivalent if they're within an epsilon of each other.
   */
  public static int countEquivalentLines(HashMap<Double, ArrayList<Line6>> linesBySlope, Line6 line) {
    double key = Line6.floorToNearestEpsilon(line.slope);
    int count = countEquivalentLines(linesBySlope.get(key), line);
    count += countEquivalentLines(linesBySlope.get(key - Line6.epsilon), line);
    count += countEquivalentLines(linesBySlope.get(key + Line6.epsilon), line);
    return count;
  } 
  
  /* insert line into hashmap */
  public static void insertLine(HashMap<Double, ArrayList<Line6>> linesBySlope, Line6 line) {
    ArrayList<Line6> lines = null;
    double key = Line6.floorToNearestEpsilon(line.slope);
    if (!linesBySlope.containsKey(key)) {
      lines = new ArrayList<Line6>();
      linesBySlope.put(key, lines);
    } else {
      lines = linesBySlope.get(key);
    }
    lines.add(line);
  }
  
  
  public static Line6 findBestLine(GraphPoint[] points) {
    Line6 bestLine = null;
    int bestCount = 0;
    HashMap<Double, ArrayList<Line6>> linesBySlope = new HashMap<Double, ArrayList<Line6>>();
    
    for (int i = 0; i < points.length; i++) {
      for (int j = i + 1; j < points.length; j++) {
        Line6 line = new Line6(points[i], points[j]);
        insertLine(linesBySlope, line);
        
        /* count lines that are equivalent to current line */
        int count = countEquivalentLines(linesBySlope, line);
        
        /* if better than current line, replace it */
        if (count > bestCount) {
          bestLine = line;
          bestCount = count;
        }
      }
    } 
    
    return bestLine;
  } 
  
  public static GraphPoint[] createPoints() {
    int n_points = 100;
    System.out.println("Points on Graph\n***************");
    GraphPoint[] points = new GraphPoint[n_points - 1];
    for (int i = 0; i < n_points / 2; i++) {
      GraphPoint p = new GraphPoint(i, 2.3 * ((double)i) + 20.0);
      points[i] = p;
      System.out.println(p.toString());
    }
    for (int i = 0; i < n_points / 2 - 1; i++) {
      GraphPoint p = new GraphPoint(i, 3.0 * ((double)i) + 1.0);
      points[n_points / 2 + i] = p;
      System.out.println(p.toString());
    }
    System.out.println("****************\n");
    return points;
  }
  
  public static void main(String[] args) {
    GraphPoint[] points = createPoints();
    Line6 line = findBestLine(points);
    line.Print();
  }
}
