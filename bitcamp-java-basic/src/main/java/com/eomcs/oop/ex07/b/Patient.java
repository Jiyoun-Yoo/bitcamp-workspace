package com.eomcs.oop.ex07.b;

public class Patient {
   private String name;
   private int age;
   private int weight;
   private int height;

   public void setName(String name) {
     if(name ==  null) {
       this.name = "이름 없음";
       return;
     }

     if(name.length() < 2) {
       this.name = "이름 없음";
       return;
     }

     if(name.length() > 5) {
       this.name = name.substring(0, 5);
     } else {
       this.name = name;
     }
   }

   // 인스턴스 변수 age에 유효한 값은 1~150이다.
   public void setAge(int age) {
     if (age < 1 || age > 120) {
       this.age = 0;
       return;
     }
     this.age = age;
   }
   // 인스턴스 변수 weight에 유효한 값은 1~200이다.
   public void setWeight() {
     if (weight < 1 || weight > 200) {
       this.weight = 0;
       return;
     }
     this.weight = weight;
   }

   // 인스턴스 변수 height에 유효한 값은 1~300이다.
   public void setHeight(int height) {
     if (height < 1 || height > 300) {
       this.height = 0;
       return;
     }
     this.height = height;
   }

   public String getName() {
     return this.name;
   }

   public int getAge() {
     return this.age;
   }

   public int getHeight() {
     return this.height;
   }

   public int getWeight() {
     return this.weight;
   }

}

