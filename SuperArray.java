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
    //return arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
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
  public String	add(int index, String element){
    if (index<0 || index>arr.length){
      return "Error: Index out of bounds";
    }
    else {
      String storage[] = new String[arr.length+1];
      for(int i=0; i<index; i++){
        storage[i]=arr[i];
      }
      for(int n=index; n<arr.length; n++){
        storage[n+1]=arr[n];
      }
      storage[index]=element;
      String[] arr = new String[storage.length];
      for(int z=0; z<storage.length; z++){
        arr[z]=storage[z];
      }
      arrSize+=1;
      return arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
    }
  }
  public int indexOf(String element){
    int output=-1;
    for (int i=arrSize; i>0; i--){
      if (arr[i]==element){
        output=i;
      }
    }
    return output;
  }
  public int lastIndexOf(String element){
    int output=-1;
    for (int i=0; i<arrSize; i++){
      if (arr[i]==element){
        output=i;
      }
    }
    return output;
  }
}
