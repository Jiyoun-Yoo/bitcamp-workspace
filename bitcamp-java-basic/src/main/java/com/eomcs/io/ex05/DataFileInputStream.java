package com.eomcs.io.ex05;

import java.io.FileInputStream;
import java.io.IOException;

public class DataFileInputStream extends FileInputStream {

  // 생성자
  public DataFileInputStream(String filename) throws Exception {
    super(filename);
  }

  public String readUTF() throws IOException {
    // 상속 받은 read() 메서드를 사용하여 문자열 출력
    int size = this.read(); // 문자열의 바이트 배열 수
    byte[] bytes = new byte[size];
    this.read(bytes); // 바이트 배열 개수 만큼 바이트를 읽어 배열에 저장한다.
    return new String(bytes, "UTF-8");
  }

  public int readInt() throws IOException {
    // 상속 받은 read() 메서드를 사용하여 int 값 출력
    int value = 0;

    value = this.read() << 24;
    value += this.read() << 16;
    value += this.read() << 8;
    value += this.read();
    return value;
  }

  public long readLong() throws Exception {
    // 상속 받은 read() 메서드를 사용하여 long 값 출력
    long value = 0;
    value += (long) this.read() << 56;
    value += (long) this.read() << 48;
    value += (long) this.read() << 40;
    value += (long) this.read() << 32;
    value += (long) this.read() << 24;
    value += (long) this.read() << 16;
    value += (long) this.read() << 8;
    value += this.read();
    return value;
  }

  public boolean readBoolean() throws Exception {
    // 상속 받은 read() 메서드를 사용하여 boolean 값 출력
    return this.read() == 1;
  }

}

