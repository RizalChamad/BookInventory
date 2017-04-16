package id.co.visionet.bookinventory.database;

public class Reusable {
    public static final String DATABASE_NAME = "BooksCatalog";
    public static final int DATABASE_VERSION = 2;
    public static final String TABLE_BOOK = "Book";
    public static final String TABLE_CATEGORY = "Category";

    public static final String COL_DB_ID = "idx";
    //field baru
    public static final String COL_BOOK_ID = "book_id";
    public static final String COL_ISBN = "ISBN";
    public static final String COL_TITLE = "BookTitle";
    public static final String COL_AUTHOR = "BookAuthor";
    public static final String COL_YEAR = "PublishedYear";
    public static final String COL_CATEGORY = "BookCategory";
    public static final String COL_SYNOPSIS = "BookSynopsis";
    public static final String COL_IMG_COVER = "BookCover";

    public static final String COL_CATEGORY_ID = "CategoryId";
    public static final String COL_CATEGORY_NAME = "CategoryName";
    public static final String COL_CATEGORY_DESC = "CategoryDesc";

    //penambahan COL_BOOK_ID
    public static final String DATABASE_CREATE_BOOK =
            "CREATE TABLE " + TABLE_BOOK + "("
                    + COL_DB_ID + " INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT" + ","
                    + COL_BOOK_ID + " INTEGER " + ","
                    + COL_ISBN + " TEXT NOT NULL UNIQUE" + ","
                    + COL_TITLE + " TEXT NOT NULL " + ","
                    + COL_AUTHOR + " TEXT NOT NULL " + ","
                    + COL_YEAR + " INTEGER " + ","
                    + COL_CATEGORY + " INTEGER " + ","
                    + COL_SYNOPSIS + " TEXT " + ","
                    + COL_IMG_COVER + " TEXT);";
    public static final String DATABASE_CREATE_CATEGORY =
            "CREATE TABLE " + TABLE_CATEGORY + "("
                    + COL_CATEGORY_ID + " INTEGER NOT NULL PRIMARY KEY,"
                    + COL_CATEGORY_NAME + " TEXT NOT NULL " + ","
                    + COL_CATEGORY_DESC + " TEXT);";
    // penambahan kolom kedua untuk book_id
    public static final String DATABASE_INSERT_BOOK =
            "INSERT INTO " + TABLE_BOOK + " SELECT NULL, NULL, '9780439064873' AS ISBN, 'Laskar Pelangi' AS BookTitle, 'Andrea Hirata' AS BookAuthor,"
                    + " 2008 as PublishedYear, 1 as BookGenre, 'This is some synopsis' as BookSynopsis, 'http://images.gr-assets.com/books/1340608588l/15721346.jpg' as BookCover"
                    + " UNION SELECT NULL, NULL, '9780316015844','Sang Pemimpi','Andrea Hirata', 2009, 3, 'This is some synopsis', 'http://1.bp.blogspot.com/-WYDV2CkOO_s/VCTGHzKqA0I/AAAAAAAABG8/Fb8DfDPp-zE/s1600/Sang_Pemimpi_sampul.jpg'"
                    + " UNION SELECT NUll, NULL, '9781484724989','Edensor','Andrea Hirata', 2007, 2, 'This is some synopsis', 'http://images.gr-assets.com/books/1410558958l/23206070.jpg'"
                    + " UNION SELECT NUll, NULL, '9781689789432','Maryamah Karpov','Andrea Hirata', 2008, 4, 'This is some synopsis', 'http://images.gr-assets.com/books/1358321490l/17253354.jpg'";


    public static final String DATABASE_INSERT_CATEGORY =
            "INSERT INTO " + TABLE_CATEGORY + " SELECT 1 AS CategoryId, 'Fantasy' AS CategoryName, '-' AS CategoryDesc"
                    + " UNION SELECT 2 AS CategoryId, 'Science Fiction' AS CategoryName, '-' AS CategoryDesc"
                    + " UNION SELECT 3 AS CategoryId, 'Romance' AS CategoryName, '-' AS CategoryDesc";
}