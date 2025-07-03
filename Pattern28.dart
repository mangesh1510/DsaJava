import "dart:io";

void main() {
  print("Enter number of rows:");
  int rows = int.parse(stdin.readLineSync()!);
  for (int i = 1; i <= rows; i++) {
    for (int j = rows; j > i; j--) {
      stdout.write("1");
    }
    for (int j = i; j >= 1; j--) {
      stdout.write(i);
    }
    print("");
  }
}
