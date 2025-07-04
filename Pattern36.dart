import "dart:io";

void main() {
  print("Enter rows");
  int rows = int.parse(stdin.readLineSync()!);

  for (int i = 1; i <= rows; i++) {
    for (int j = rows - i; j >= 1; j--) {
      stdout.write("*");
    }
    for (int j = 1; j <= i; j++) {
      stdout.write(j);
    }
    print("");
  }
}
