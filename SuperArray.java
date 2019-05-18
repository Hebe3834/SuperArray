public class SuperArray{
  String[] arr;
  int arrSize = 0;
  public SuperArray(){
    arr = new String[10];
  }
  public void clear(){
    arrSize=0;
    arr = new String[10];
  }
  public int size(){
    return arrSize;
  }
  public boolean isEmpty(){
    if (arrSize==0){
      return true;
    }
    else{
      return false;
    }
  }
  public boolean add(String element){
    if (arrSize<arr.length){
      arr[arrSize]=element;
      arrSize+=1;
    }
    else{
      String storage[] = new String[arr.length+1];
      storage[arrSize]=element;
      arrSize+=1;
      String arr[] = new String[storage.length];
      for(int i=0; i<storage.length; i++){
        arr[i] = storage[i];
      }
    }
    return true;
  }

  public String get(int index){
    if (index<0 || index>arrSize-1){
      return "Error: Index out of bounds";
    }
    else{
      return arr[index];
    }
  }
  public String	set(int index, String element){
    if (index<0 || index>arr.length-1){
      return "Error: Index out of bounds";
    }
    else {
      String oldString = arr[index];
      arr[index]=element;
      return oldString;
    }
  }
  public String toString(){
    String output="";
    for (int i=0; i<arrSize; i++){
      output = output.concat(arr[i] + ", ");
    }
    return "[" + output + "]";
  }
  public boolean contains(String element){
    boolean output=false;
    for (int i=0; i<arrSize; i++){
      if (arr[i]==element){
        output=true;
      }
    }
    return output;
  }
}
