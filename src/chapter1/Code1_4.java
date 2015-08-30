package chapter1;

public class Code1_4 {
public static void main(String[] arg){
  String check="ab cd ef g";
  System.out.println("The original one is:"+check);
  reString(check);
}

static void reString(String str){
  char[] array1=str.toCharArray();
  int count=0;
  for(int i=0;i<str.length();i++){
    //System.out.println(array[i]);
    if(array1[i]==' ') count++;
  }
  
  int j=0;
  int leg=str.length()+3*(count-1);
  System.out.println(leg);

  char[] array2=new char[leg];
  
  for(int i=0;i<str.length();i++){
    if(array1[i]==' '){
      array2[j++]='%';
      array2[j++]='2';
      array2[j++]='0';
    }
    else array2[j++]=array1[i];
  }
  
  String result="";
  for(int i=0;i<leg;i++){
    result+=array2[i];
}
  System.out.println(result);
}
}
