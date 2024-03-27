<?php
    session_start();
?>

<?php
   
    if(isset($_SESSION['cn']))
        $_SESSION['cn']+=1;
    else
        $_SESSION['cn']=1;
        
   echo "Page Visited " ,$_SESSION['cn']," Times";  
?>            
