

function validateform()
{  
  var name=document.myform.name.value;  
  var password=document.myform.password.value; 
  var email = document.myform.mail.value;
  var phone = document.myform.number.value; 

if (name==null || name=="")
{  
  alert("Name can't be blank");  
  return false;  
}
else if(password.length<6)
{  
  alert("Password must be at least 6 characters long.");  
  return false;  
  }
    else if (!filter.test(email.value)) 
    {
    alert("Please   enter primary email address");
    email.focus;
    return false;
 }
else
alert("enter details");
}


