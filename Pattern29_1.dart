import "dart:io";

void main() {
  print("enter rows:");
  int rows = int.parse(stdin.readLineSync()!);

  for (int i = 0; i < rows; i++) {
    for (int j = 0; j < rows; j++) {
      if (i == j) {
        stdout.write(i);
      } else {
        stdout.write(0);
      }
    }
    print("");
  }
}
