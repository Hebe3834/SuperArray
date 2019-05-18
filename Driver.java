class Driver{
  public static void main(String[]args){
    SuperArray A = new SuperArray();
//    A.SuperArray();
    A.clear();
    System.out.println(A.size());
    System.out.println(A.isEmpty());
    System.out.println(A.add("test"));
    System.out.println(A.add("B"));
    System.out.println(A.add("FISH"));
    System.out.println(A.add("cat"));
    System.out.println(A.add("Dog"));
    System.out.println(A.get(0));
    System.out.println(A.set(0,"A"));
    System.out.println(A.toString());
    System.out.println(A.contains("Dog"));
  }
}
