class BookType
{
    public static void main(String Name, int Price, String Publisher, String Genre, 
    int NOP, String MainChar)
    {
        Books Book1= new Books();
        Book1.Name=Name;
        Book1.Price=Price;
        Book1.Publisher=Publisher;
        Book1.Genre=Genre;
        Book1.NOP=NOP;
        Book1.MainChar=MainChar;
        System.out.println(Book1.Name);
        System.out.println(Book1.Price);
        System.out.println(Book1.Publisher);
        System.out.println(Book1.Genre);
        System.out.println(Book1.NOP);
        System.out.println(Book1.MainChar);
    }
}