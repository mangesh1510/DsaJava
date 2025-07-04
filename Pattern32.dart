import "dart:io";

void main() {
  print("Enter rows:");
  int rows = int.parse(stdin.readLineSync()!);
  int count = 1;
  for (int i = 1; i <= rows; i++) {
    for (int j = rows; j >= i; j--) {
      stdout.write(count++);
      stdout.write(" ");
    }
    print("");
  }
}
