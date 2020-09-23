package com.eomcs.io.ex08;

import java.io.IOException;
import java.io.OutputStream;

public class BufferedOutputStream {
  OutputStream out;

  byte[] buf = new byte[8196];
  int cursor;

  public BufferedOutputStream(OutputStream out) {
    this.out = out;
  }

  public void write(int b) throws IOException {

    if (cursor == buf.length) { // 버퍼가 다차면
      out.write(buf); // 버퍼에 들어있는 데이터를 한 번에 출력한다.
      cursor = 0; // 다시 커서를 초기화시킨다.
    }

    // 1바이트 출력하라고 하면 일단 버퍼에 저장할 것이다.
    buf[cursor++] = (byte) b;
  }

  public void write(byte[] buf) throws IOException {
    for (byte b : buf) {
      this.write(b & 0x000000ff);
    }
  }


  public void close() throws IOException {
    this.flush();
    out.close();
  }

  // 파일을 다 읽었는데, 버퍼가 꽉 차지 않았다면?
  // 위의 read() 메서드에서는 잔류하는 데이터를 출력하지 않으므로
  // flush()라는 메서드를 정의하여 버퍼 남아 있는 데이터를 마무리로 출력한다.
  public void flush() throws IOException {
    if (cursor > 0) {
      out.write(buf, 0, cursor);
      cursor = 0;
    }
  }
}


