 <?php 
    $xml=simplexml_load_file("bookstore.xml");
    
    echo "<pre>";
    //echo"Hello";
    print_r($xml);
    echo "</pre>";
    
    foreach ($xml->book as $k) 
    {
        echo"Hello";
        echo "Book No : ".$k->bookno."<br>";
        echo "Book Name : ".$k->bookname."<br>";
        echo "Author Name: ".$k->authorname."<br>";
        echo "Price : ".$k->price."<br>";
        echo "Year : ".$k->year."<br>";
        echo "<hr>";
    }
?>
