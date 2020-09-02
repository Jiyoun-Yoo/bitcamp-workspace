package com.eomcs.algorithm.data_structure.linkedlist;

public class MyLinkedListTest3 {
  public static void main(String[] args) {
    MyLinkedList<String> list = new MyLinkedList<>();

    list.add("aaa");
    list.add("bbb");
    list.add("ccc");
    list.add("ddd");

    System.out.println(list.get(0));
    System.out.println(list.get(1));
    System.out.println(list.get(2));
    System.out.println(list.get(3));
    //System.out.println(list.get(-1));
    //System.out.println(list.get(4));

    System.out.println("----------------------------------");

    print(list); // aaa,bbb,ccc,ddd,

    System.out.println("----------------------------------");

    list.add(2, "eee"); // aaa,bbb,eee,ccc,ddd,
    list.add(0, "fff"); // fff,aaa,bbb,eee,ccc,ddd,
    list.add(6, "ggg"); // fff,aaa,bbb,eee,ccc,ddd,ggg,
    list.add("hhh");
    print(list);

    System.out.println("----------------------------------");

    System.out.println(list.remove(4)); // fff, aaa, bbb, eee, ddd, ggg, hhh
    print(list);

    System.out.println(list.remove(0)); // aaa, bbb, eee, ddd, ggg, hhh
    print(list);

    System.out.println(list.remove(5)); // aaa, bbb, eee, ddd, ggg
    print(list);

    System.out.println("----------------------------------");

    System.out.println(list.set(1, "xxx")); // aaa, xxx, eee, ddd, ggg
    print(list);

    System.out.println(list.set(0, "yyy")); // aaa, xxx, eee, ddd, ggg
    print(list);

    System.out.println(list.set(4, "zzz")); // aaa, xxx, eee, ddd, ggg
    print(list);

    System.out.println("----------------------------------");

    print2(list.toArray());

  }

  static void print(MyLinkedList<String> list) {
    for(int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i) + ",");
    }
    System.out.println();
  }

  static void print2(Object[] arr) {
    for(Object obj : arr) {
      System.out.print(obj + ",");
    }
    System.out.println();
  }

  static void print3(MyLinkedList<String> list) {

    // 사이즈가 동일하게 배열을 만든다.
    // 복사할 항목의 개수만큼 배열을 만들어 전달하면
    // ArrayList는 새 배열을 만들지 않고 우리가 준 배열에 값을 담아준다.
    //String[] arr = new String[list.size()];
    //String[] arr2 = list.toArray(arr);

    // 사이즈가 더 작은 배열을 만들어 새 배열을 리턴값으로 받는다.
    // 복사할 항목의 개수보다 작은 크기의 배열을 주면
    // ArrayList는 새 배열을 만들어 값을 복사한 다음 리턴한다.
    //String[] arr = new String[2];
    //String[] arr2 = list.toArray(arr);

    // 보통 다음 방식이 실무에서 많이 사용된다.
    // 빈 배열을 만들고 리턴값을 받아서 쓴다. 빈 배열은 가비지가 된다.
    String[] arr2 = list.toArray(new String[] {});

    for(Object obj : arr2) {
      System.out.print(obj + ",");
    }
    System.out.println();
  }

}
