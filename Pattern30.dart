import "dart:io";

void main() {
  print("enter rows:");
  int rows = int.parse(stdin.readLineSync()!);
  for (int i = 1; i <= rows; i++) {
    int num = i;
    for (int j = 1; j <= i; j++) {
      stdout.write(num);
      stdout.write(" ");
      num = num + rows - j;
    }
    print("");
  }
}
