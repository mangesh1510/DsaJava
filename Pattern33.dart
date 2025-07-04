import "dart:io";

void main() {
  print("Enter rows");
  int rows = int.parse(stdin.readLineSync()!);

  int count = 1;
  for (int i = 1; i <= rows; i++) {
    if (i % 2 == 0) {
      int c = count + i - 1;
      int j = 1;
      while (j <= i) {
        stdout.write(c--);
        stdout.write(" ");
        j++;
      }
    } else {
      int j = 1;
      count = count + i - 1;
      while (j <= i) {
        stdout.write(count++);
        stdout.write(" ");
        j++;
      }
    }

    print("");
  }
}
