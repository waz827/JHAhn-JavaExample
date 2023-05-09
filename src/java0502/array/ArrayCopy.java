package java0502.array;

public class ArrayCopy {
    public static void main(String[] args) {
        Book[] bookArray1 = new Book[3];
        Book[] bookArray2 = new Book[3];

        bookArray1[0] = new Book("태백산맥", "조정래");
        bookArray1[1] = new Book("데미안", "헤르만 헤세");
        bookArray1[2] = new Book("어떻게 살 것인가", "유시민");

        // 복사할 배열 | 복사할 첫 위치 | 대상배열 | 대상배열 첫 위치 | 길이/복사갯수
        System.arraycopy(bookArray1, 0, bookArray2, 0, 3);

        for (int i = 0; i < bookArray2.length; i++) {
            bookArray2[i].showBookInfo();
        }

        bookArray1[0].setBookName("동물농장");
        bookArray1[0].setAuthor("조지 오웰");

        System.out.println("========== Array1 ==========");

        for (int i = 0; i < bookArray1.length; i++) {
            bookArray1[i].showBookInfo();
        }

        System.out.println("========== Array2 ==========");

        for (int i = 0; i < bookArray2.length; i++) {
            bookArray2[i].showBookInfo();
        }
    }
}

