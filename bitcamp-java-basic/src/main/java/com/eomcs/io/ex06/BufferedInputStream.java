package com.eomcs.io.ex06;

import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStream extends FileInputStream {
  byte[] buf = new byte[8192];
  int size; // 배열에 저장되어 있는 바이트의 수
  int cursor; // 바이트 읽은 배열의 위치

  public BufferedInputStream(String filename) throws Exception {
    super(filename);
  }

  // 기존의 read() 메서드를 재정의하였다.
  //  => read()를 호출하면
  //    - 일단 파일에서 8192 바이트를 읽어온다.
  //    - 그 후 1바이트를 리턴한다.
  //    - 버퍼에 받아놓은 바이트가 다 떨어질 때까지 반복한다.
  //    - 버퍼에 받아놓은 바이트가 다 떨어지면 다시 파일에서 8191 바이트를 읽어온다.
  @Override
  public int read() throws IOException {
    if (cursor == size) { // 버퍼에 데이터가 없거나 버퍼의 데이터를 모두 읽었으면,
      // 파일에서 데이터를 읽어 버퍼에 채운다.
      this.size = this.read(buf);
      if (this.size == -1) { // 파일을 다 읽었으면 -1을 리턴한다.
        return -1;
      }
      cursor = 0;
    }
    return buf[cursor++] & 0x000000ff; // 마지막 1바이트의 값만 꺼내기 위해 & 연산을 한다.
  }

  @Override
  public int read(byte[] buf) throws IOException {
    int i = 0;
    for (; i < buf.length; i++) {
      // 1바이트를 읽어서 파라미터로 받은 바이트 배열에 채운다.
      int b = this.read(); // 읽은 데이터의 개수를 리턴한다. (읽을 데이터가 없으면 -1을 리턴)
      if (b == -1) {
        // 바이트 배열을 다 채우기도 전에 읽을 데이터가 없다면 읽기를 멈춘다.
        break;
      }
      buf[i] = (byte) b;
    }
    return i; // 지금까지 읽은 데이터의 수를 리턴한다.
  }
}


