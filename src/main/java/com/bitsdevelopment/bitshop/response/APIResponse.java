package com.bitsdevelopment.bitshop.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class APIResponse {
  private String message;
  private Object data;
}
