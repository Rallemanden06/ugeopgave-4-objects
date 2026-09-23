import java.util.ArrayList;

public class main {
    // Opgave 1
    public static Student findOldest(Student[] students){
        Student oldest = students[0];
        for (Student s : students){
            if (s.age > oldest.age){
                oldest = s;
            }
        }
        return oldest;
    }


    // Opgave 2
    public static Products findMostExpensiveItem(Products[] items){
        Products expensive = items[0];
        for (Products i : items){
            if (i.price > expensive.price){
                expensive = i;
            }
        }
        return expensive;
    }


    public static void main(String[] args) {
        // Opgave 1
        Student student1 = new Student("BOB1", 20);
        Student student2 = new Student("BOB2", 21);
        Student student3 = new Student("BOB3", 22);

        Student[] students = {student1, student2, student3};

        for (Student s : students) {
            s.printInfo();
        }

        findOldest(students).printInfo();


        // Opgave 2
        Products item1 = new Products("item1", 25,new String[]{"sale"});
        Products item2 = new Products("item2", 100,new String[]{"new"});
        Products item3 = new Products("item3", 50,new String[]{"new"});
        Products item4 = new Products("item4", 75,new String[]{"sale"});

        Products[] items = {item1, item2, item3, item4};

        for(Products item : items){
            if (item.hasTag("sale")){
                item.printInfo();
            }
        }

        findMostExpensiveItem(items).printInfo();


        // Opgave 3
        BankAccount me = new BankAccount("Rasmus",1000);

        me.deposit(1000);
        me.deposit(1000);
        me.withdraw(1000);
        System.out.println();
        me.printTransactionList();
        System.out.println(me.getBalance());


        // Opgave 4
        Team team1 = new Team("TEAM1!",new ArrayList<>());
        Team team2 = new Team("TEAM2!",new ArrayList<>());

        team1.addPlayer(new Player("RASMUS1",100));
        team1.addPlayer(new Player("RASMUS2",50));
        team1.addPlayer(new Player("RASMUS3",100));
        team1.addPlayer(new Player("RASMUS4",50));

        team2.addPlayer(new Player("BOB1",115));
        team2.addPlayer(new Player("BOB2",100));
        team2.addPlayer(new Player("BOB3",75));

        System.out.println();
        team1.printTeam();
        System.out.println();
        team2.printTeam();
        System.out.println();
        team1.compete(team2);


        //  Opgave 5
        Library library = new Library("LIBRARY");

        library.addBook(new Book("TITEL1","AUTHOR1",true));
        library.addBook(new Book("TITEL2","AUTHOR2",true));
        library.addBook(new Book("TITEL3","AUTHOR3",true));
        library.addBook(new Book("TITEL4","AUTHOR4",true));
        library.addBook(new Book("TITEL5","AUTHOR5",true));

        Book book1 = library.findBookByTitel("TITEL1");
        book1.borrow();

        Book book2 = library.findBookByTitel("TITEL2");
        book2.borrow();

        ArrayList<Book> available = library.findAvailableBooks();
        for(Book book: available){
            System.out.println("Available:" + book);
        }

        book2.returnBook();

        library.printAllBooks();


        // Opgave 6
        Inventory p1 = new Inventory("player1",10);
        Inventory p2 = new Inventory("player2",5);

        p1.addItem(new Item("ITEM1",120,"Something"));
        p1.addItem(new Item("ITEM2",80,"Something"));

        p2.addItem(new Item("ITEM1",10,"Something"));
        p2.addItem(new Item("ITEM2",150,"Something"));
        p2.addItem(new Item("ITEM3",140,"Something"));
        System.out.println();

        p1.printInventory();
        System.out.println();
        p2.printInventory();
        System.out.println();
        Item.getTotalItemsCreated();
        System.out.println();
        p1.getTotalValue();
        System.out.println();
        p2.getTotalValue();

    }
}