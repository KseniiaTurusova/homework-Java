public class homework_2 {
    public static void main(String[] args) {
        Reader reader = new Reader("Ivan", "Ivanov", 345, "history", 25, 54683, 3, 5);
        reader.status();
        
        int allBooks =  reader.takeBook(2, 1);
        System.out.println("Количество книг" + allBooks);

        int allBooksRet =  reader.returnBook(3, 8);
        System.out.println("Количество книг" + allBooksRet);
        
    }
}    

class Reader {
    String name;
    String last_name;
    int number_ticket;
    String department;
    int data_birthday;
    int phone;
    int count_books;
    int count_return_books;
    


    public Reader(String name, String last_name, int number_ticket, String department, int data_birthday, int phone, int count_books, int count_return_books) {
        this.name = name;
        this.last_name = last_name;
        this.number_ticket = number_ticket;
        this.department = department;
        this.data_birthday = data_birthday;
        this.phone = phone;
        this.count_books = count_books;
        this.count_return_books = count_return_books;
    }


    int takeBook(int a, int count_books) {
        int allBooks = count_books + a;
        return allBooks;
        
        
    }

    public static int returnBook(int b, int count_return_books) {
        int allBooksRet = count_return_books - b;
        return allBooksRet;
    }

    public void status() {
        System.out.println("Reader: "+ this.name + " " + this.last_name + " " + this.data_birthday + " " + this.phone + " " + "Ticket" + this.number_ticket + " " + "Stadies at" + " " + this.department + " " + "books" + " " + this.count_books + " " + this.count_return_books + " ");
        }
    }


