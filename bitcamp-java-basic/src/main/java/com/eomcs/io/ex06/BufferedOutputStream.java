package com.eomcs.io.ex06;

import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStream extends FileOutputStream {
  byte[] buf = new byte[8192];
  int cursor;

  public BufferedOutputStream(String filename) throws Exception {
    super(filename);
  }

  // 1 바이트를 파일로 바로 출력하지 않고 버퍼에 담아두었다가
  // 버퍼가 꽉 차면 그 때 파일로 출력한다.
  @Override
  public void write(int b) throws IOException {
    if (cursor == buf.length) { // 버퍼가 꽉 찼다면
      this.write(buf); // 버퍼에 들어있는 데이터를 한 번에 출력한다.
      cursor = 0; // 다시 커서를 초기화시킨다.
    }

    // 1바이트 출력하라고 하면 일단 버퍼에 저장할 것이다.
    buf[cursor++] = (byte) b;
  }

  @Override
  public void write(byte[] buf) throws IOException {
    for (byte b : buf) {
      this.write(b & 0x000000ff);
    }
  }

  @Override
  public void close() throws IOException {
    this.flush();
    super.close();
  }

  // 버퍼에 남아있는 데이터를 파일에 출력한다.
  @Override
  public void flush() throws IOException {
    if (cursor > 0) {
      this.write(buf, 0, cursor);
    cursor = 0;
    }
  }

}


