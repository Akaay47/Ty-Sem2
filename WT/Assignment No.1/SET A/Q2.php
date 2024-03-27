<?php

   $a=$_GET['fs'];
   $b=$_GET['fz'];
   $c=$_GET['fc'];
   $d=$_GET['bc'];


 
   setcookie("s1",$a);
   setcookie("s2",$b);
   setcookie("s3",$c);
   setcookie("s4",$d);


?>

<?php
    echo "<h3> SELECTED OPTION </h2> ";
    echo "<br>";
    echo "Font-style : ".$_COOKIE['s1'];
    echo "<br>";
    echo "Font-size : ".$_COOKIE['s2'];
    echo "<br>";
    echo "Font-color : ".$_COOKIE['s3'];
    echo "<br>";
    echo "Background-cilor : ".$_COOKIE['s4'];
    //echo "<br>";
?>

<html>
   
    <body>
        <form action="Q2.1.php">
          CLICK HERE TO SEE ACTUAL IMPLEMENTATION : <input type="submit">
        </form>
     </body>
</html>
