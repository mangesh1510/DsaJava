import "dart:core";
import 'dart:io';

void main() {
  print("enter rows");
  int rows = int.parse(stdin.readLineSync()!);

  for (int i = 1; i <= rows; i++) {
    for (int j = 1; j <= 2 * rows - 2 * i; j++) {
      stdout.write(" ");
    }
    for (int j = 1; j <= i; j++) {
      stdout.write("* ");
    }

    print("");
  }
  for (int i = rows - 1; i >= 1; i--) {
    for (int j = 1; j <= 2 * (rows - i); j++) {
      stdout.write(" ");
    }
    for (int j = i; j >= 1; j--) {
      stdout.write("* ");
    }
    print("");
  }
}
