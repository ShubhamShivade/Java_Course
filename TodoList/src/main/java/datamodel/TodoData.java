package datamodel;

import javafx.collections.FXCollections;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.List;

public class TodoData {

    private  static  TodoData instance = new TodoData();
    private static String filename = "TodoListItems.txt";

    private List<TodoItem> todoItems;
    private DateTimeFormatter formatter;

    public static TodoData getInstance(){
        return instance;
    }
    private TodoData(){
        formatter = DateTimeFormatter.ofPattern("dd-MMM-YYYY");
    }

    public List<TodoItem> getTodoItems() {
        return todoItems;
    }

//    public void setTodoItems(List<TodoItem> todoItems) {
//        this.todoItems = todoItems;
//    }

    public void loadTodoItems() throws IOException {
        todoItems = FXCollections.observableArrayList();
        Path path = Paths.get(filename);
        BufferedReader br = Files.newBufferedReader(path);

        String input;

        try{
            while((input = br.readLine())!=null){
                String[] itemPieces = input.split("\t");

                String shortDescription = itemPieces[0];
                String details = itemPieces[1];
                String dateString = itemPieces[2];

                LocalDate date = LocalDate.parse(dateString, formatter);
                TodoItem todoItem = new TodoItem(shortDescription, details,date);
                todoItems.add(todoItem);
            }
        } finally {
            if(br!= null){
                br.close();
            }
        }

    }
    public void storeTodoItems() throws IOException {
        Path path =Paths.get(filename);
        BufferedWriter bw = Files.newBufferedWriter(path);
        try{
            Iterator<TodoItem> itr = todoItems.iterator();
            while (itr.hasNext()){
                TodoItem item = itr.next();
                bw.write(String.format("%s\t%s\t%s",
                        item.getShortDescription(),
                        item.getDetails(),
                        item.getDeadline().format(formatter)));
                bw.newLine();
            }

        }finally {
            if (bw!=null){
                bw.close();
            }
        }
    }
}

