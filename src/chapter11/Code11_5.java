package chapter11;

public class Code11_5 {
static int findString(String[] strings,String str,int start,int end){
  int mid=(start+end)/2;
  
  if (strings[mid].isEmpty()) { 
    int left = mid - 1;
    int right = mid + 1;
    while (true) {
      if (left < start && right > end) {
        return -1;
      } else if (right <= end && !strings[right].isEmpty()) {
        mid = right;
        break;
      } else if (left >= start && !strings[left].isEmpty()) {
        mid = left;
        break;
      }
      right++;
      left--;
    }
  }
//  while(strings[mid].isEmpty()){
//    if(mid==end) {
//      mid=(start+end)/2;
//      while(strings[mid].isEmpty()){
//        if(mid==start) {
//          System.out.println("Error:All are empty!");
//        }
//        mid--;
//        System.out.println("E2");
//      }
//    }
//    mid++;
//    System.out.println(mid);
//  }
  
  if(str.equals(strings[mid])) {
    return mid;
    }else if(strings[mid].compareTo(str)>0) {
    return findString(strings, str, start, mid-1);
  }else return findString(strings, str, mid+1, end); 
}

public static int findString(String[] strings, String str){
  if(strings==null||str==null||str==" "){
    return -1;
  }
  return findString(strings, str,0,strings.length-1);
}

public static void main(String[] args) {
  String[] stringList = {"apple", "", "", "banana", "", "", "", "carrot", "duck", "", "", "eel", "", "flower"};
  System.out.println(findString(stringList, "apple"));
  
//for (String s : stringList) {
//  String cloned = new String(s);
  //  System.out.println("<" + cloned + "> " + " appears at location " + search(stringList, cloned));
//}
}

}
