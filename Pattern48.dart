import "dart:core";
import 'dart:io';

void main() {
  print("enter rows");
  int rows = int.parse(stdin.readLineSync()!);

  for (int i = 1; i <= rows; i++) {
    for (int j = 1; j <= i; j++) {
      stdout.write("* ");
    }
    print("");
  }

  for (int j = rows - 1; j >= 1; j--) {
    for (int i = j; i >= 1; i--) {
      stdout.write("* ");
    }
    print("");
  }
}
