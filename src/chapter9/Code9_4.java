package chapter9;

import java.util.ArrayList;

public class Code9_4 {
public static void main(String[] args){
  ArrayList<Integer> set=new ArrayList<Integer>();
  for(int i=0;i<3;i++){
    set.add(i);
    }
  //System.out.println(set.toString());
  
  System.out.println("------------------------");
  ArrayList<ArrayList<Integer>> subsets1=findSubsets1(set);
  System.out.println(subsets1.toString());
  
  System.out.println("------------------------");
  ArrayList<ArrayList<Integer>> subsets2=findSubsets2(set);
  System.out.println(subsets2.toString());

}

 static ArrayList<ArrayList<Integer>> findSubsets2(ArrayList<Integer> set) {
  // TODO Auto-generated method stub
   ArrayList<ArrayList<Integer>> subsets=new ArrayList<ArrayList<Integer>>();
   int max=1<<set.size();
   for(int i=0;i<max;i++){
     ArrayList<Integer> subset=getSubset(i,set);
     subsets.add(subset);
   }
   return subsets;
}

 static ArrayList<Integer> getSubset(int i, ArrayList<Integer> set) {
  // TODO Auto-generated method stub
   ArrayList<Integer> subset=new ArrayList<Integer>();
   int index=0;
   for(int k=i;k>0;k>>=1){
     if((k&1)==1) 
       subset.add(set.get(index));
   index++;
   }
 return subset;
}
 

static ArrayList<ArrayList<Integer>> findSubsets1(ArrayList<Integer> set) {
  // TODO Auto-generated method stub
  if(set==null) {
    return null;
  }else {
  int index=0;
  return findSubsets1(set,index);       
}
}
  static ArrayList<ArrayList<Integer>> findSubsets1(ArrayList<Integer> set,int index) {
  ArrayList<ArrayList<Integer>> subsets=new ArrayList<ArrayList<Integer>>();
  if(set.size()==index){
    subsets.add(new ArrayList<Integer>());
  }else {
    subsets=findSubsets1(set,index+1);
    int item=set.get(index);
    ArrayList<ArrayList<Integer>> moresubsets= new ArrayList<ArrayList<Integer>>();
    for(ArrayList<Integer> tempset:subsets){
      ArrayList<Integer> newsubset=new ArrayList<Integer>();
      newsubset.addAll(tempset);
      newsubset.add(item);
      moresubsets.add(newsubset);
    }
    subsets.addAll(moresubsets);
  }
return subsets;
  }
}
