package com.pluralsight;

public class Book {
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    public Book(int id, String isbn, String title) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = false ;
        this.checkedOutTo = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOutTo(boolean checkedOutTo) {
        isCheckedOut = checkedOutTo;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }
    public void checkOut(String userName){
        if (!isCheckedOut){
            this.isCheckedOut = true;
            this.checkedOutTo = userName;
            System.out.println(title + "reserved for " + userName);

        }else {
            System.out.println(title + "is not available ");
        }
    }
    public void checkin(){
        if (isCheckedOut){
            this.isCheckedOut = false;
            this.checkedOutTo = "";
            System.out.println(title + "has been checked in");

        }else {
            System.out.println(title + "is not check out");
        }
    }


}
