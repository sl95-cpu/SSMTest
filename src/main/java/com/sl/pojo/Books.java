package com.sl.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Books {
  private long bookId;
  private String bookName;
  private long bookCounts;
  private String detail;
}
