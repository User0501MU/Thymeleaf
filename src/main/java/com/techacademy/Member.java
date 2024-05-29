//DTOクラスの作成
//Memberクラスは「ID」「名前」「性別」「年齢」の4つの値を格納
package com.techacademy;

import lombok.AllArgsConstructor;//getterやsetterなどのコードをコンパイル時に自動生成してくれる
import lombok.Data;

@Data
@AllArgsConstructor
public class Member {
    private int id;
    private String name;
    private String gender;
    private int age;
}