import "dart:io";

void main() {
  print("Enter number of rows");
  int rows = int.parse(stdin.readLineSync()!);
  for (int i = 1; i <= rows; i++) {
    for (int j = i; j <= rows; j++) {
      stdout.write(j);
      stdout.write(" ");
    }
    for (int j = 1; j < i; j++) {
      stdout.write(j);
      stdout.write(" ");
    }
    print("");
  }
}
